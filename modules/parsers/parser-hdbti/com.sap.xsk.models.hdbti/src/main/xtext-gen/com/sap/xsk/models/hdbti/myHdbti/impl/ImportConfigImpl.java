/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbti.myHdbti.impl;

import com.sap.xsk.models.hdbti.myHdbti.GroupType;
import com.sap.xsk.models.hdbti.myHdbti.ImportConfig;
import com.sap.xsk.models.hdbti.myHdbti.MyHdbtiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#isTable <em>Table</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#getTableValue <em>Table Value</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#isSchema <em>Schema</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#getSchemaValue <em>Schema Value</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#isFile <em>File</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#getFileValue <em>File Value</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#isDelimField <em>Delim Field</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#getDelimFieldValue <em>Delim Field Value</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#isHeader <em>Header</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#getHeaderValue <em>Header Value</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#isKeys <em>Keys</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#getHeaderValues <em>Header Values</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#isDelimEnclosing <em>Delim Enclosing</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#getDelimEnclosingValue <em>Delim Enclosing Value</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#isDistinguishEmptyFromNull <em>Distinguish Empty From Null</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#getDistinguishEmptyFromNullValue <em>Distinguish Empty From Null Value</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#isUseHeaderNames <em>Use Header Names</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl#getUseHeaderNamesValue <em>Use Header Names Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportConfigImpl extends MinimalEObjectImpl.Container implements ImportConfig
{
  /**
   * The default value of the '{@link #isTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTable()
   * @generated
   * @ordered
   */
  protected static final boolean TABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTable()
   * @generated
   * @ordered
   */
  protected boolean table = TABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getTableValue() <em>Table Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableValue()
   * @generated
   * @ordered
   */
  protected static final String TABLE_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTableValue() <em>Table Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableValue()
   * @generated
   * @ordered
   */
  protected String tableValue = TABLE_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isSchema() <em>Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSchema()
   * @generated
   * @ordered
   */
  protected static final boolean SCHEMA_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSchema() <em>Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSchema()
   * @generated
   * @ordered
   */
  protected boolean schema = SCHEMA_EDEFAULT;

  /**
   * The default value of the '{@link #getSchemaValue() <em>Schema Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemaValue()
   * @generated
   * @ordered
   */
  protected static final String SCHEMA_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSchemaValue() <em>Schema Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemaValue()
   * @generated
   * @ordered
   */
  protected String schemaValue = SCHEMA_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isFile() <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFile()
   * @generated
   * @ordered
   */
  protected static final boolean FILE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFile() <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFile()
   * @generated
   * @ordered
   */
  protected boolean file = FILE_EDEFAULT;

  /**
   * The default value of the '{@link #getFileValue() <em>File Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileValue()
   * @generated
   * @ordered
   */
  protected static final String FILE_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFileValue() <em>File Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileValue()
   * @generated
   * @ordered
   */
  protected String fileValue = FILE_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isDelimField() <em>Delim Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDelimField()
   * @generated
   * @ordered
   */
  protected static final boolean DELIM_FIELD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDelimField() <em>Delim Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDelimField()
   * @generated
   * @ordered
   */
  protected boolean delimField = DELIM_FIELD_EDEFAULT;

  /**
   * The default value of the '{@link #getDelimFieldValue() <em>Delim Field Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimFieldValue()
   * @generated
   * @ordered
   */
  protected static final String DELIM_FIELD_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelimFieldValue() <em>Delim Field Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimFieldValue()
   * @generated
   * @ordered
   */
  protected String delimFieldValue = DELIM_FIELD_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeader()
   * @generated
   * @ordered
   */
  protected static final boolean HEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeader()
   * @generated
   * @ordered
   */
  protected boolean header = HEADER_EDEFAULT;

  /**
   * The default value of the '{@link #getHeaderValue() <em>Header Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaderValue()
   * @generated
   * @ordered
   */
  protected static final String HEADER_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHeaderValue() <em>Header Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaderValue()
   * @generated
   * @ordered
   */
  protected String headerValue = HEADER_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isKeys() <em>Keys</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKeys()
   * @generated
   * @ordered
   */
  protected static final boolean KEYS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isKeys() <em>Keys</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKeys()
   * @generated
   * @ordered
   */
  protected boolean keys = KEYS_EDEFAULT;

  /**
   * The cached value of the '{@link #getHeaderValues() <em>Header Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaderValues()
   * @generated
   * @ordered
   */
  protected EList<GroupType> headerValues;

  /**
   * The default value of the '{@link #isDelimEnclosing() <em>Delim Enclosing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDelimEnclosing()
   * @generated
   * @ordered
   */
  protected static final boolean DELIM_ENCLOSING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDelimEnclosing() <em>Delim Enclosing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDelimEnclosing()
   * @generated
   * @ordered
   */
  protected boolean delimEnclosing = DELIM_ENCLOSING_EDEFAULT;

  /**
   * The default value of the '{@link #getDelimEnclosingValue() <em>Delim Enclosing Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimEnclosingValue()
   * @generated
   * @ordered
   */
  protected static final String DELIM_ENCLOSING_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelimEnclosingValue() <em>Delim Enclosing Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimEnclosingValue()
   * @generated
   * @ordered
   */
  protected String delimEnclosingValue = DELIM_ENCLOSING_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isDistinguishEmptyFromNull() <em>Distinguish Empty From Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistinguishEmptyFromNull()
   * @generated
   * @ordered
   */
  protected static final boolean DISTINGUISH_EMPTY_FROM_NULL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDistinguishEmptyFromNull() <em>Distinguish Empty From Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistinguishEmptyFromNull()
   * @generated
   * @ordered
   */
  protected boolean distinguishEmptyFromNull = DISTINGUISH_EMPTY_FROM_NULL_EDEFAULT;

  /**
   * The default value of the '{@link #getDistinguishEmptyFromNullValue() <em>Distinguish Empty From Null Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistinguishEmptyFromNullValue()
   * @generated
   * @ordered
   */
  protected static final String DISTINGUISH_EMPTY_FROM_NULL_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDistinguishEmptyFromNullValue() <em>Distinguish Empty From Null Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistinguishEmptyFromNullValue()
   * @generated
   * @ordered
   */
  protected String distinguishEmptyFromNullValue = DISTINGUISH_EMPTY_FROM_NULL_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isUseHeaderNames() <em>Use Header Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUseHeaderNames()
   * @generated
   * @ordered
   */
  protected static final boolean USE_HEADER_NAMES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUseHeaderNames() <em>Use Header Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUseHeaderNames()
   * @generated
   * @ordered
   */
  protected boolean useHeaderNames = USE_HEADER_NAMES_EDEFAULT;

  /**
   * The default value of the '{@link #getUseHeaderNamesValue() <em>Use Header Names Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseHeaderNamesValue()
   * @generated
   * @ordered
   */
  protected static final String USE_HEADER_NAMES_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUseHeaderNamesValue() <em>Use Header Names Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseHeaderNamesValue()
   * @generated
   * @ordered
   */
  protected String useHeaderNamesValue = USE_HEADER_NAMES_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportConfigImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyHdbtiPackage.Literals.IMPORT_CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTable()
  {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(boolean newTable)
  {
    boolean oldTable = table;
    table = newTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTableValue()
  {
    return tableValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTableValue(String newTableValue)
  {
    String oldTableValue = tableValue;
    tableValue = newTableValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__TABLE_VALUE, oldTableValue, tableValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSchema()
  {
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchema(boolean newSchema)
  {
    boolean oldSchema = schema;
    schema = newSchema;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__SCHEMA, oldSchema, schema));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSchemaValue()
  {
    return schemaValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchemaValue(String newSchemaValue)
  {
    String oldSchemaValue = schemaValue;
    schemaValue = newSchemaValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__SCHEMA_VALUE, oldSchemaValue, schemaValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFile()
  {
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFile(boolean newFile)
  {
    boolean oldFile = file;
    file = newFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__FILE, oldFile, file));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFileValue()
  {
    return fileValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileValue(String newFileValue)
  {
    String oldFileValue = fileValue;
    fileValue = newFileValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__FILE_VALUE, oldFileValue, fileValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDelimField()
  {
    return delimField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelimField(boolean newDelimField)
  {
    boolean oldDelimField = delimField;
    delimField = newDelimField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__DELIM_FIELD, oldDelimField, delimField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDelimFieldValue()
  {
    return delimFieldValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelimFieldValue(String newDelimFieldValue)
  {
    String oldDelimFieldValue = delimFieldValue;
    delimFieldValue = newDelimFieldValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__DELIM_FIELD_VALUE, oldDelimFieldValue, delimFieldValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeader(boolean newHeader)
  {
    boolean oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__HEADER, oldHeader, header));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHeaderValue()
  {
    return headerValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeaderValue(String newHeaderValue)
  {
    String oldHeaderValue = headerValue;
    headerValue = newHeaderValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__HEADER_VALUE, oldHeaderValue, headerValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isKeys()
  {
    return keys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeys(boolean newKeys)
  {
    boolean oldKeys = keys;
    keys = newKeys;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__KEYS, oldKeys, keys));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupType> getHeaderValues()
  {
    if (headerValues == null)
    {
      headerValues = new EObjectContainmentEList<GroupType>(GroupType.class, this, MyHdbtiPackage.IMPORT_CONFIG__HEADER_VALUES);
    }
    return headerValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDelimEnclosing()
  {
    return delimEnclosing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelimEnclosing(boolean newDelimEnclosing)
  {
    boolean oldDelimEnclosing = delimEnclosing;
    delimEnclosing = newDelimEnclosing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__DELIM_ENCLOSING, oldDelimEnclosing, delimEnclosing));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDelimEnclosingValue()
  {
    return delimEnclosingValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelimEnclosingValue(String newDelimEnclosingValue)
  {
    String oldDelimEnclosingValue = delimEnclosingValue;
    delimEnclosingValue = newDelimEnclosingValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__DELIM_ENCLOSING_VALUE, oldDelimEnclosingValue, delimEnclosingValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDistinguishEmptyFromNull()
  {
    return distinguishEmptyFromNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistinguishEmptyFromNull(boolean newDistinguishEmptyFromNull)
  {
    boolean oldDistinguishEmptyFromNull = distinguishEmptyFromNull;
    distinguishEmptyFromNull = newDistinguishEmptyFromNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL, oldDistinguishEmptyFromNull, distinguishEmptyFromNull));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDistinguishEmptyFromNullValue()
  {
    return distinguishEmptyFromNullValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistinguishEmptyFromNullValue(String newDistinguishEmptyFromNullValue)
  {
    String oldDistinguishEmptyFromNullValue = distinguishEmptyFromNullValue;
    distinguishEmptyFromNullValue = newDistinguishEmptyFromNullValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL_VALUE, oldDistinguishEmptyFromNullValue, distinguishEmptyFromNullValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUseHeaderNames()
  {
    return useHeaderNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUseHeaderNames(boolean newUseHeaderNames)
  {
    boolean oldUseHeaderNames = useHeaderNames;
    useHeaderNames = newUseHeaderNames;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__USE_HEADER_NAMES, oldUseHeaderNames, useHeaderNames));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUseHeaderNamesValue()
  {
    return useHeaderNamesValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUseHeaderNamesValue(String newUseHeaderNamesValue)
  {
    String oldUseHeaderNamesValue = useHeaderNamesValue;
    useHeaderNamesValue = newUseHeaderNamesValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyHdbtiPackage.IMPORT_CONFIG__USE_HEADER_NAMES_VALUE, oldUseHeaderNamesValue, useHeaderNamesValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyHdbtiPackage.IMPORT_CONFIG__HEADER_VALUES:
        return ((InternalEList<?>)getHeaderValues()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyHdbtiPackage.IMPORT_CONFIG__TABLE:
        return isTable();
      case MyHdbtiPackage.IMPORT_CONFIG__TABLE_VALUE:
        return getTableValue();
      case MyHdbtiPackage.IMPORT_CONFIG__SCHEMA:
        return isSchema();
      case MyHdbtiPackage.IMPORT_CONFIG__SCHEMA_VALUE:
        return getSchemaValue();
      case MyHdbtiPackage.IMPORT_CONFIG__FILE:
        return isFile();
      case MyHdbtiPackage.IMPORT_CONFIG__FILE_VALUE:
        return getFileValue();
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_FIELD:
        return isDelimField();
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_FIELD_VALUE:
        return getDelimFieldValue();
      case MyHdbtiPackage.IMPORT_CONFIG__HEADER:
        return isHeader();
      case MyHdbtiPackage.IMPORT_CONFIG__HEADER_VALUE:
        return getHeaderValue();
      case MyHdbtiPackage.IMPORT_CONFIG__KEYS:
        return isKeys();
      case MyHdbtiPackage.IMPORT_CONFIG__HEADER_VALUES:
        return getHeaderValues();
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_ENCLOSING:
        return isDelimEnclosing();
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_ENCLOSING_VALUE:
        return getDelimEnclosingValue();
      case MyHdbtiPackage.IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL:
        return isDistinguishEmptyFromNull();
      case MyHdbtiPackage.IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL_VALUE:
        return getDistinguishEmptyFromNullValue();
      case MyHdbtiPackage.IMPORT_CONFIG__USE_HEADER_NAMES:
        return isUseHeaderNames();
      case MyHdbtiPackage.IMPORT_CONFIG__USE_HEADER_NAMES_VALUE:
        return getUseHeaderNamesValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyHdbtiPackage.IMPORT_CONFIG__TABLE:
        setTable((Boolean)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__TABLE_VALUE:
        setTableValue((String)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__SCHEMA:
        setSchema((Boolean)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__SCHEMA_VALUE:
        setSchemaValue((String)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__FILE:
        setFile((Boolean)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__FILE_VALUE:
        setFileValue((String)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_FIELD:
        setDelimField((Boolean)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_FIELD_VALUE:
        setDelimFieldValue((String)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__HEADER:
        setHeader((Boolean)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__HEADER_VALUE:
        setHeaderValue((String)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__KEYS:
        setKeys((Boolean)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__HEADER_VALUES:
        getHeaderValues().clear();
        getHeaderValues().addAll((Collection<? extends GroupType>)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_ENCLOSING:
        setDelimEnclosing((Boolean)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_ENCLOSING_VALUE:
        setDelimEnclosingValue((String)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL:
        setDistinguishEmptyFromNull((Boolean)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL_VALUE:
        setDistinguishEmptyFromNullValue((String)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__USE_HEADER_NAMES:
        setUseHeaderNames((Boolean)newValue);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__USE_HEADER_NAMES_VALUE:
        setUseHeaderNamesValue((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyHdbtiPackage.IMPORT_CONFIG__TABLE:
        setTable(TABLE_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__TABLE_VALUE:
        setTableValue(TABLE_VALUE_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__SCHEMA:
        setSchema(SCHEMA_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__SCHEMA_VALUE:
        setSchemaValue(SCHEMA_VALUE_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__FILE:
        setFile(FILE_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__FILE_VALUE:
        setFileValue(FILE_VALUE_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_FIELD:
        setDelimField(DELIM_FIELD_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_FIELD_VALUE:
        setDelimFieldValue(DELIM_FIELD_VALUE_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__HEADER:
        setHeader(HEADER_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__HEADER_VALUE:
        setHeaderValue(HEADER_VALUE_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__KEYS:
        setKeys(KEYS_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__HEADER_VALUES:
        getHeaderValues().clear();
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_ENCLOSING:
        setDelimEnclosing(DELIM_ENCLOSING_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_ENCLOSING_VALUE:
        setDelimEnclosingValue(DELIM_ENCLOSING_VALUE_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL:
        setDistinguishEmptyFromNull(DISTINGUISH_EMPTY_FROM_NULL_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL_VALUE:
        setDistinguishEmptyFromNullValue(DISTINGUISH_EMPTY_FROM_NULL_VALUE_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__USE_HEADER_NAMES:
        setUseHeaderNames(USE_HEADER_NAMES_EDEFAULT);
        return;
      case MyHdbtiPackage.IMPORT_CONFIG__USE_HEADER_NAMES_VALUE:
        setUseHeaderNamesValue(USE_HEADER_NAMES_VALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyHdbtiPackage.IMPORT_CONFIG__TABLE:
        return table != TABLE_EDEFAULT;
      case MyHdbtiPackage.IMPORT_CONFIG__TABLE_VALUE:
        return TABLE_VALUE_EDEFAULT == null ? tableValue != null : !TABLE_VALUE_EDEFAULT.equals(tableValue);
      case MyHdbtiPackage.IMPORT_CONFIG__SCHEMA:
        return schema != SCHEMA_EDEFAULT;
      case MyHdbtiPackage.IMPORT_CONFIG__SCHEMA_VALUE:
        return SCHEMA_VALUE_EDEFAULT == null ? schemaValue != null : !SCHEMA_VALUE_EDEFAULT.equals(schemaValue);
      case MyHdbtiPackage.IMPORT_CONFIG__FILE:
        return file != FILE_EDEFAULT;
      case MyHdbtiPackage.IMPORT_CONFIG__FILE_VALUE:
        return FILE_VALUE_EDEFAULT == null ? fileValue != null : !FILE_VALUE_EDEFAULT.equals(fileValue);
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_FIELD:
        return delimField != DELIM_FIELD_EDEFAULT;
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_FIELD_VALUE:
        return DELIM_FIELD_VALUE_EDEFAULT == null ? delimFieldValue != null : !DELIM_FIELD_VALUE_EDEFAULT.equals(delimFieldValue);
      case MyHdbtiPackage.IMPORT_CONFIG__HEADER:
        return header != HEADER_EDEFAULT;
      case MyHdbtiPackage.IMPORT_CONFIG__HEADER_VALUE:
        return HEADER_VALUE_EDEFAULT == null ? headerValue != null : !HEADER_VALUE_EDEFAULT.equals(headerValue);
      case MyHdbtiPackage.IMPORT_CONFIG__KEYS:
        return keys != KEYS_EDEFAULT;
      case MyHdbtiPackage.IMPORT_CONFIG__HEADER_VALUES:
        return headerValues != null && !headerValues.isEmpty();
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_ENCLOSING:
        return delimEnclosing != DELIM_ENCLOSING_EDEFAULT;
      case MyHdbtiPackage.IMPORT_CONFIG__DELIM_ENCLOSING_VALUE:
        return DELIM_ENCLOSING_VALUE_EDEFAULT == null ? delimEnclosingValue != null : !DELIM_ENCLOSING_VALUE_EDEFAULT.equals(delimEnclosingValue);
      case MyHdbtiPackage.IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL:
        return distinguishEmptyFromNull != DISTINGUISH_EMPTY_FROM_NULL_EDEFAULT;
      case MyHdbtiPackage.IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL_VALUE:
        return DISTINGUISH_EMPTY_FROM_NULL_VALUE_EDEFAULT == null ? distinguishEmptyFromNullValue != null : !DISTINGUISH_EMPTY_FROM_NULL_VALUE_EDEFAULT.equals(distinguishEmptyFromNullValue);
      case MyHdbtiPackage.IMPORT_CONFIG__USE_HEADER_NAMES:
        return useHeaderNames != USE_HEADER_NAMES_EDEFAULT;
      case MyHdbtiPackage.IMPORT_CONFIG__USE_HEADER_NAMES_VALUE:
        return USE_HEADER_NAMES_VALUE_EDEFAULT == null ? useHeaderNamesValue != null : !USE_HEADER_NAMES_VALUE_EDEFAULT.equals(useHeaderNamesValue);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (table: ");
    result.append(table);
    result.append(", tableValue: ");
    result.append(tableValue);
    result.append(", schema: ");
    result.append(schema);
    result.append(", schemaValue: ");
    result.append(schemaValue);
    result.append(", file: ");
    result.append(file);
    result.append(", fileValue: ");
    result.append(fileValue);
    result.append(", delimField: ");
    result.append(delimField);
    result.append(", delimFieldValue: ");
    result.append(delimFieldValue);
    result.append(", header: ");
    result.append(header);
    result.append(", headerValue: ");
    result.append(headerValue);
    result.append(", keys: ");
    result.append(keys);
    result.append(", delimEnclosing: ");
    result.append(delimEnclosing);
    result.append(", delimEnclosingValue: ");
    result.append(delimEnclosingValue);
    result.append(", distinguishEmptyFromNull: ");
    result.append(distinguishEmptyFromNull);
    result.append(", distinguishEmptyFromNullValue: ");
    result.append(distinguishEmptyFromNullValue);
    result.append(", useHeaderNames: ");
    result.append(useHeaderNames);
    result.append(", useHeaderNamesValue: ");
    result.append(useHeaderNamesValue);
    result.append(')');
    return result.toString();
  }

} //ImportConfigImpl
