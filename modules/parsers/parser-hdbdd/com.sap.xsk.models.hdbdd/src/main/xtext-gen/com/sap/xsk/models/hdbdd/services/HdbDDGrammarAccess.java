/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbdd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class HdbDDGrammarAccess extends AbstractGrammarElementFinder {
	
	public class HdbDDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.hdbdd.HdbDD.HdbDD");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsTypeParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//HdbDD:
		//	elements+=Type*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Type*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Type
		public RuleCall getElementsTypeParserRuleCall_0() { return cElementsTypeParserRuleCall_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.hdbdd.HdbDD.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNamespaceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSchemaParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cContextParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Type:
		//	Namespace | Schema | Context;
		@Override public ParserRule getRule() { return rule; }
		
		//Namespace | Schema | Context
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Namespace
		public RuleCall getNamespaceParserRuleCall_0() { return cNamespaceParserRuleCall_0; }
		
		//Schema
		public RuleCall getSchemaParserRuleCall_1() { return cSchemaParserRuleCall_1; }
		
		//Context
		public RuleCall getContextParserRuleCall_2() { return cContextParserRuleCall_2; }
	}
	public class NamespaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.hdbdd.HdbDD.Namespace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNamespaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Namespace:
		//	'namespace' name=QualifiedName ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'namespace' name=QualifiedName ';'
		public Group getGroup() { return cGroup; }
		
		//'namespace'
		public Keyword getNamespaceKeyword_0() { return cNamespaceKeyword_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.hdbdd.HdbDD.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class SchemaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.hdbdd.HdbDD.Schema");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSchemaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Schema:
		//	'@Schema' ':' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'@Schema' ':' name=ID
		public Group getGroup() { return cGroup; }
		
		//'@Schema'
		public Keyword getSchemaKeyword_0() { return cSchemaKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	public class ContextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.hdbdd.HdbDD.Context");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypesTypeDefinitionParserRuleCall_3_0 = (RuleCall)cTypesAssignment_3.eContents().get(0);
		private final Assignment cEntitiesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEntitiesEntityParserRuleCall_4_0 = (RuleCall)cEntitiesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Context:
		//	'context' name=ID '{'
		//	types+=TypeDefinition*
		//	entities+=Entity*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'context' name=ID '{' types+=TypeDefinition* entities+=Entity* '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'context'
		public Keyword getContextKeyword_0() { return cContextKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//types+=TypeDefinition*
		public Assignment getTypesAssignment_3() { return cTypesAssignment_3; }
		
		//TypeDefinition
		public RuleCall getTypesTypeDefinitionParserRuleCall_3_0() { return cTypesTypeDefinitionParserRuleCall_3_0; }
		
		//entities+=Entity*
		public Assignment getEntitiesAssignment_4() { return cEntitiesAssignment_4; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_4_0() { return cEntitiesEntityParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class TypeDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.hdbdd.HdbDD.TypeDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFieldTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFieldTypeIDTerminalRuleCall_3_0 = (RuleCall)cFieldTypeAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLeftParenthesisKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cFieldLengthAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cFieldLengthINTTerminalRuleCall_4_1_0 = (RuleCall)cFieldLengthAssignment_4_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//TypeDefinition:
		//	'type' name=ID ':' fieldType=ID ('(' fieldLength=INT ')')? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'type' name=ID ':' fieldType=ID ('(' fieldLength=INT ')')? ';'
		public Group getGroup() { return cGroup; }
		
		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//fieldType=ID
		public Assignment getFieldTypeAssignment_3() { return cFieldTypeAssignment_3; }
		
		//ID
		public RuleCall getFieldTypeIDTerminalRuleCall_3_0() { return cFieldTypeIDTerminalRuleCall_3_0; }
		
		//('(' fieldLength=INT ')')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4_0() { return cLeftParenthesisKeyword_4_0; }
		
		//fieldLength=INT
		public Assignment getFieldLengthAssignment_4_1() { return cFieldLengthAssignment_4_1; }
		
		//INT
		public RuleCall getFieldLengthINTTerminalRuleCall_4_1_0() { return cFieldLengthINTTerminalRuleCall_4_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4_2() { return cRightParenthesisKeyword_4_2; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.hdbdd.HdbDD.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFieldsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFieldsFieldParserRuleCall_3_0 = (RuleCall)cFieldsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity:
		//	'entity' name=ID '{'
		//	fields+=Field*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID '{' fields+=Field* '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//fields+=Field*
		public Assignment getFieldsAssignment_3() { return cFieldsAssignment_3; }
		
		//Field
		public RuleCall getFieldsFieldParserRuleCall_3_0() { return cFieldsFieldParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.hdbdd.HdbDD.Field");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFieldPrimitiveParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFieldReferenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cFieldTypeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Field:
		//	FieldPrimitive | FieldReference | FieldType;
		@Override public ParserRule getRule() { return rule; }
		
		//FieldPrimitive | FieldReference | FieldType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FieldPrimitive
		public RuleCall getFieldPrimitiveParserRuleCall_0() { return cFieldPrimitiveParserRuleCall_0; }
		
		//FieldReference
		public RuleCall getFieldReferenceParserRuleCall_1() { return cFieldReferenceParserRuleCall_1; }
		
		//FieldType
		public RuleCall getFieldTypeParserRuleCall_2() { return cFieldTypeParserRuleCall_2; }
	}
	public class FieldPrimitiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.hdbdd.HdbDD.FieldPrimitive");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cKeyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cKeyKeyKeyword_0_0 = (Keyword)cKeyAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFieldTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFieldTypeIDTerminalRuleCall_3_0 = (RuleCall)cFieldTypeAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLeftParenthesisKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cFieldLengthAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cFieldLengthINTTerminalRuleCall_4_1_0 = (RuleCall)cFieldLengthAssignment_4_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Assignment cFieldPredefinedTypeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cFieldPredefinedTypeSTRINGTerminalRuleCall_5_0 = (RuleCall)cFieldPredefinedTypeAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//FieldPrimitive:
		//	key?='key'? name=ID ':' fieldType=ID ('(' fieldLength=INT ')')? fieldPredefinedType=STRING? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//key?='key'? name=ID ':' fieldType=ID ('(' fieldLength=INT ')')? fieldPredefinedType=STRING? ';'
		public Group getGroup() { return cGroup; }
		
		//key?='key'?
		public Assignment getKeyAssignment_0() { return cKeyAssignment_0; }
		
		//'key'
		public Keyword getKeyKeyKeyword_0_0() { return cKeyKeyKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//fieldType=ID
		public Assignment getFieldTypeAssignment_3() { return cFieldTypeAssignment_3; }
		
		//ID
		public RuleCall getFieldTypeIDTerminalRuleCall_3_0() { return cFieldTypeIDTerminalRuleCall_3_0; }
		
		//('(' fieldLength=INT ')')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4_0() { return cLeftParenthesisKeyword_4_0; }
		
		//fieldLength=INT
		public Assignment getFieldLengthAssignment_4_1() { return cFieldLengthAssignment_4_1; }
		
		//INT
		public RuleCall getFieldLengthINTTerminalRuleCall_4_1_0() { return cFieldLengthINTTerminalRuleCall_4_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4_2() { return cRightParenthesisKeyword_4_2; }
		
		//fieldPredefinedType=STRING?
		public Assignment getFieldPredefinedTypeAssignment_5() { return cFieldPredefinedTypeAssignment_5; }
		
		//STRING
		public RuleCall getFieldPredefinedTypeSTRINGTerminalRuleCall_5_0() { return cFieldPredefinedTypeSTRINGTerminalRuleCall_5_0; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class FieldTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.hdbdd.HdbDD.FieldType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cKeyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cKeyKeyKeyword_0_0 = (Keyword)cKeyAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFieldPredefinedTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFieldPredefinedTypeSTRINGTerminalRuleCall_3_0 = (RuleCall)cFieldPredefinedTypeAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//FieldType:
		//	key?='key'? name=ID ':' fieldPredefinedType=STRING? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//key?='key'? name=ID ':' fieldPredefinedType=STRING? ';'
		public Group getGroup() { return cGroup; }
		
		//key?='key'?
		public Assignment getKeyAssignment_0() { return cKeyAssignment_0; }
		
		//'key'
		public Keyword getKeyKeyKeyword_0_0() { return cKeyKeyKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//fieldPredefinedType=STRING?
		public Assignment getFieldPredefinedTypeAssignment_3() { return cFieldPredefinedTypeAssignment_3; }
		
		//STRING
		public RuleCall getFieldPredefinedTypeSTRINGTerminalRuleCall_3_0() { return cFieldPredefinedTypeSTRINGTerminalRuleCall_3_0; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class FieldReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.hdbdd.HdbDD.FieldReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cReferenceTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cReferenceTypeIDTerminalRuleCall_2_0 = (RuleCall)cReferenceTypeAssignment_2.eContents().get(0);
		private final Keyword cLeftSquareBracketAsteriskRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cFieldReferenceEntityAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cFieldReferenceEntityIDTerminalRuleCall_5_0 = (RuleCall)cFieldReferenceEntityAssignment_5.eContents().get(0);
		private final Keyword cOnKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cFieldReferenceEntityLocalIdAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cFieldReferenceEntityLocalIdQualifiedNameParserRuleCall_7_0 = (RuleCall)cFieldReferenceEntityLocalIdAssignment_7.eContents().get(0);
		private final Keyword cEqualsSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cFieldReferenceEntityForeignIdAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cFieldReferenceEntityForeignIdIDTerminalRuleCall_9_0 = (RuleCall)cFieldReferenceEntityForeignIdAssignment_9.eContents().get(0);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//FieldReference:
		//	name=ID ':' referenceType=ID '[*]' 'to' fieldReferenceEntity=ID 'on' fieldReferenceEntityLocalId=QualifiedName '='
		//	fieldReferenceEntityForeignId=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' referenceType=ID '[*]' 'to' fieldReferenceEntity=ID 'on' fieldReferenceEntityLocalId=QualifiedName '='
		//fieldReferenceEntityForeignId=ID ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//referenceType=ID
		public Assignment getReferenceTypeAssignment_2() { return cReferenceTypeAssignment_2; }
		
		//ID
		public RuleCall getReferenceTypeIDTerminalRuleCall_2_0() { return cReferenceTypeIDTerminalRuleCall_2_0; }
		
		//'[*]'
		public Keyword getLeftSquareBracketAsteriskRightSquareBracketKeyword_3() { return cLeftSquareBracketAsteriskRightSquareBracketKeyword_3; }
		
		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }
		
		//fieldReferenceEntity=ID
		public Assignment getFieldReferenceEntityAssignment_5() { return cFieldReferenceEntityAssignment_5; }
		
		//ID
		public RuleCall getFieldReferenceEntityIDTerminalRuleCall_5_0() { return cFieldReferenceEntityIDTerminalRuleCall_5_0; }
		
		//'on'
		public Keyword getOnKeyword_6() { return cOnKeyword_6; }
		
		//fieldReferenceEntityLocalId=QualifiedName
		public Assignment getFieldReferenceEntityLocalIdAssignment_7() { return cFieldReferenceEntityLocalIdAssignment_7; }
		
		//QualifiedName
		public RuleCall getFieldReferenceEntityLocalIdQualifiedNameParserRuleCall_7_0() { return cFieldReferenceEntityLocalIdQualifiedNameParserRuleCall_7_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_8() { return cEqualsSignKeyword_8; }
		
		//fieldReferenceEntityForeignId=ID
		public Assignment getFieldReferenceEntityForeignIdAssignment_9() { return cFieldReferenceEntityForeignIdAssignment_9; }
		
		//ID
		public RuleCall getFieldReferenceEntityForeignIdIDTerminalRuleCall_9_0() { return cFieldReferenceEntityForeignIdIDTerminalRuleCall_9_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}
	
	
	private final HdbDDElements pHdbDD;
	private final TypeElements pType;
	private final NamespaceElements pNamespace;
	private final QualifiedNameElements pQualifiedName;
	private final SchemaElements pSchema;
	private final ContextElements pContext;
	private final TypeDefinitionElements pTypeDefinition;
	private final EntityElements pEntity;
	private final FieldElements pField;
	private final FieldPrimitiveElements pFieldPrimitive;
	private final FieldTypeElements pFieldType;
	private final FieldReferenceElements pFieldReference;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public HdbDDGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pHdbDD = new HdbDDElements();
		this.pType = new TypeElements();
		this.pNamespace = new NamespaceElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pSchema = new SchemaElements();
		this.pContext = new ContextElements();
		this.pTypeDefinition = new TypeDefinitionElements();
		this.pEntity = new EntityElements();
		this.pField = new FieldElements();
		this.pFieldPrimitive = new FieldPrimitiveElements();
		this.pFieldType = new FieldTypeElements();
		this.pFieldReference = new FieldReferenceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.sap.xsk.models.hdbdd.HdbDD".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//HdbDD:
	//	elements+=Type*;
	public HdbDDElements getHdbDDAccess() {
		return pHdbDD;
	}
	
	public ParserRule getHdbDDRule() {
		return getHdbDDAccess().getRule();
	}
	
	//Type:
	//	Namespace | Schema | Context;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Namespace:
	//	'namespace' name=QualifiedName ';';
	public NamespaceElements getNamespaceAccess() {
		return pNamespace;
	}
	
	public ParserRule getNamespaceRule() {
		return getNamespaceAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Schema:
	//	'@Schema' ':' name=ID;
	public SchemaElements getSchemaAccess() {
		return pSchema;
	}
	
	public ParserRule getSchemaRule() {
		return getSchemaAccess().getRule();
	}
	
	//Context:
	//	'context' name=ID '{'
	//	types+=TypeDefinition*
	//	entities+=Entity*
	//	'}' ';';
	public ContextElements getContextAccess() {
		return pContext;
	}
	
	public ParserRule getContextRule() {
		return getContextAccess().getRule();
	}
	
	//TypeDefinition:
	//	'type' name=ID ':' fieldType=ID ('(' fieldLength=INT ')')? ';';
	public TypeDefinitionElements getTypeDefinitionAccess() {
		return pTypeDefinition;
	}
	
	public ParserRule getTypeDefinitionRule() {
		return getTypeDefinitionAccess().getRule();
	}
	
	//Entity:
	//	'entity' name=ID '{'
	//	fields+=Field*
	//	'}' ';';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Field:
	//	FieldPrimitive | FieldReference | FieldType;
	public FieldElements getFieldAccess() {
		return pField;
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}
	
	//FieldPrimitive:
	//	key?='key'? name=ID ':' fieldType=ID ('(' fieldLength=INT ')')? fieldPredefinedType=STRING? ';';
	public FieldPrimitiveElements getFieldPrimitiveAccess() {
		return pFieldPrimitive;
	}
	
	public ParserRule getFieldPrimitiveRule() {
		return getFieldPrimitiveAccess().getRule();
	}
	
	//FieldType:
	//	key?='key'? name=ID ':' fieldPredefinedType=STRING? ';';
	public FieldTypeElements getFieldTypeAccess() {
		return pFieldType;
	}
	
	public ParserRule getFieldTypeRule() {
		return getFieldTypeAccess().getRule();
	}
	
	//FieldReference:
	//	name=ID ':' referenceType=ID '[*]' 'to' fieldReferenceEntity=ID 'on' fieldReferenceEntityLocalId=QualifiedName '='
	//	fieldReferenceEntityForeignId=ID ';';
	public FieldReferenceElements getFieldReferenceAccess() {
		return pFieldReference;
	}
	
	public ParserRule getFieldReferenceRule() {
		return getFieldReferenceAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
