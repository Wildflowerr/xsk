/*
 * Copyright (c) 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.xsk.hdb.ds.processors;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sap.xsk.hdb.ds.model.XSKDataStructureModel;
import org.eclipse.dirigible.commons.config.Configuration;
import org.eclipse.dirigible.database.ds.model.IDataStructureModel;
import org.eclipse.dirigible.database.sql.DataType;
import org.eclipse.dirigible.database.sql.DataTypeUtils;
import org.eclipse.dirigible.database.sql.ISqlKeywords;
import org.eclipse.dirigible.database.sql.SqlFactory;
import org.eclipse.dirigible.database.sql.builders.table.AlterTableBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.xsk.hdb.ds.model.hdbdd.XSKDataStructureEntityModel;
import com.sap.xsk.hdb.ds.model.hdbtable.XSKDataStructureHDBTableColumnModel;
import com.sap.xsk.utils.XSKUtils;

/**
 * The Entity Alter Processor.
 */
public class XSKEntityAlterProcessor {

	private static final Logger logger = LoggerFactory.getLogger(XSKEntityAlterProcessor.class);
	
	private static final String INCOMPATIBLE_CHANGE_OF_ENTITY = "Incompatible change of entity [%s] by adding a column [%s] which is [%s]"; //$NON-NLS-1$

	/**
	 * Execute the corresponding statement.
	 *
	 * @param connection the connection
	 * @param entityModel the entity model
	 * @throws SQLException the SQL exception
	 */
	public void execute(Connection connection, XSKDataStructureEntityModel entityModel) throws SQLException {
		boolean caseSensitive = Boolean.parseBoolean(Configuration.get(IDataStructureModel.DIRIGIBLE_DATABASE_NAMES_CASE_SENSITIVE, "false"));
		String tableName = XSKUtils.getTableName(entityModel);
		logger.info("Processing Alter Entity: {}", tableName);
		
		String entityName = tableName;
		
//		ISqlDialect nativeDialect = SqlFactory.deriveDialect(connection);
		
		Map<String, String> columnDefinitions = new HashMap<String, String>();
		DatabaseMetaData dmd = connection.getMetaData();
		ResultSet rsColumns = dmd.getColumns(null, null, entityName, null);
		while (rsColumns.next()) {
//			String typeName = nativeDialect.getDataTypeName(DataTypeUtils.getDatabaseType(rsColumns.getInt(5)));
			String typeName = DataTypeUtils.getDatabaseTypeName(rsColumns.getInt(5));
			columnDefinitions.put(rsColumns.getString(4).toUpperCase(), typeName);
		}
		
		List<String> modelColumnNames = new ArrayList<String>();
		
		// ADD iteration
		for (XSKDataStructureHDBTableColumnModel columnModel : entityModel.getColumns()) {
			String name = columnModel.getName();
			if (caseSensitive) {
				name = "\"" + name + "\"";
			}
			DataType type = DataType.valueOf(columnModel.getType());
			String length = columnModel.getLength();
			boolean isNullable = columnModel.isNullable();
			boolean isPrimaryKey = columnModel.isPrimaryKey();
			boolean isUnique = columnModel.isUnique();
			String defaultValue = columnModel.getDefaultValue();
			String precision = columnModel.getPrecision();
			String scale = columnModel.getScale();
			String args = "";
			if (length != null) {
				if (type.equals(DataType.VARCHAR) || type.equals(DataType.CHAR)
						|| columnModel.getType().equalsIgnoreCase("NVARCHAR")
						|| columnModel.getType().equalsIgnoreCase("ALPHANUM")
						|| columnModel.getType().equalsIgnoreCase("SHORTTEXT")) {
					args = ISqlKeywords.OPEN + length + ISqlKeywords.CLOSE;
				}
			} else if ((precision != null) && (scale != null)) {
				if (type.equals(DataType.DECIMAL)) {
					args = ISqlKeywords.OPEN + precision + "," + scale + ISqlKeywords.CLOSE;
				}
			}
			if (defaultValue != null) {
				if ("".equals(defaultValue)) {
					if ((type.equals(DataType.VARCHAR) || type.equals(DataType.CHAR))) {
						args += " DEFAULT '" + defaultValue + "' ";
					}
				} else {
					args += " DEFAULT " + defaultValue + " ";
				}

			}
			
			modelColumnNames.add(name.toUpperCase());

			if (!columnDefinitions.containsKey(name.toUpperCase())) {
				
				AlterTableBuilder alterTableBuilder = SqlFactory.getNative(connection).alter().table(tableName);
				
				alterTableBuilder.add().column(name, type, isPrimaryKey, isNullable, isUnique, args);

				if (!isNullable) {
					throw new SQLException(String.format(INCOMPATIBLE_CHANGE_OF_ENTITY, entityName, name, "NOT NULL"));
				}
				if (isPrimaryKey) {
					throw new SQLException(String.format(INCOMPATIBLE_CHANGE_OF_ENTITY, entityName, name, "PRIMARY KEY"));
				}
				
				executeAlterBuilder(connection, alterTableBuilder);

			} else if (!columnDefinitions.get(name.toUpperCase()).equals(type.toString())) {
				throw new SQLException(String.format(INCOMPATIBLE_CHANGE_OF_ENTITY, entityName, name, "of type " + columnDefinitions.get(name) + " to be changed to" + type));
			}
		}
		
		// DROP iteration
		
		for (String columnName : columnDefinitions.keySet()) {
			if (!modelColumnNames.contains(columnName.toUpperCase())) {
				AlterTableBuilder alterTableBuilder = SqlFactory.getNative(connection).alter().table(tableName);
				alterTableBuilder.drop().column(columnName, DataType.BOOLEAN);
				executeAlterBuilder(connection, alterTableBuilder);
			}
		}
		
	}

	private void executeAlterBuilder(Connection connection, AlterTableBuilder alterTableBuilder)
			throws SQLException {
		final String sql = alterTableBuilder.build();
		try(PreparedStatement statement = connection.prepareStatement(sql);) {
			logger.info(sql);
			statement.executeUpdate();
		} catch (SQLException e) {
			logger.error(sql);
			logger.error(e.getMessage(), e);
			throw new SQLException(e.getMessage(), e);
		}
	}
}
