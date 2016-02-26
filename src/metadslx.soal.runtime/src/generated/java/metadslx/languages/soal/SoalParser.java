// Generated from SoalParser.g4 by ANTLR 4.5.1
package metadslx.languages.soal;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SoalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KNamespace=1, KEnum=2, KException=3, KStruct=4, KInterface=5, KThrows=6, 
		KOneway=7, KReturn=8, KBinding=9, KTransport=10, KEncoding=11, KProtocol=12, 
		KEndpoint=13, KAddress=14, KDatabase=15, KEntity=16, KAbstract=17, KComponent=18, 
		KComposite=19, KReference=20, KService=21, KWire=22, KTo=23, KImplementation=24, 
		KLanguage=25, KAssembly=26, KDeployment=27, KEnvironment=28, KRuntime=29, 
		KNull=30, KTrue=31, KFalse=32, KObject=33, KString=34, KInt=35, KLong=36, 
		KFloat=37, KDouble=38, KByte=39, KBool=40, KAny=41, KVoid=42, KTypeof=43, 
		TSemicolon=44, TColon=45, TDot=46, TComma=47, TAssign=48, TOpenParen=49, 
		TCloseParen=50, TOpenBracket=51, TCloseBracket=52, TOpenBrace=53, TCloseBrace=54, 
		TLessThan=55, TGreaterThan=56, TQuestion=57, TQuestionQuestion=58, TAmpersand=59, 
		THat=60, TBar=61, TAndAlso=62, TOrElse=63, TPlusPlus=64, TMinusMinus=65, 
		TPlus=66, TMinus=67, TTilde=68, TExclamation=69, TSlash=70, TAsterisk=71, 
		TPercent=72, TLessThanOrEqual=73, TGreaterThanOrEqual=74, TEqual=75, TNotEqual=76, 
		TAsteriskAssign=77, TSlashAssign=78, TPercentAssign=79, TPlusAssign=80, 
		TMinusAssign=81, TLeftShiftAssign=82, TRightShiftAssign=83, TAmpersandAssign=84, 
		THatAssign=85, TBarAssign=86, IDate=87, ITime=88, IDateTime=89, ITimeSpan=90, 
		IVersion=91, IStyle=92, IMTOM=93, ISSL=94, IHTTP=95, IREST=96, IWebSocket=97, 
		ISOAP=98, IXML=99, IJSON=100, IClientAuthentication=101, IdentifierNormal=102, 
		IdentifierVerbatim=103, IntegerLiteral=104, DecimalLiteral=105, ScientificLiteral=106, 
		DateTimeOffsetLiteral=107, DateTimeLiteral=108, DateLiteral=109, TimeLiteral=110, 
		RegularStringLiteral=111, GuidLiteral=112, UTF8BOM=113, WHITESPACE=114, 
		CRLF=115, LINEBREAK=116, LINE_COMMENT=117, COMMENT=118, DoubleQuoteVerbatimStringLiteral=119, 
		SingleQuoteVerbatimStringLiteral=120, DoubleQuoteVerbatimStringLiteralStart=121;
	public static final int
		RULE_main = 0, RULE_qualifiedName = 1, RULE_identifierList = 2, RULE_qualifiedNameList = 3, 
		RULE_annotationList = 4, RULE_returnAnnotationList = 5, RULE_annotation = 6, 
		RULE_returnAnnotation = 7, RULE_annotationBody = 8, RULE_annotationProperties = 9, 
		RULE_annotationPropertyList = 10, RULE_annotationProperty = 11, RULE_annotationPropertyValue = 12, 
		RULE_namespaceDeclaration = 13, RULE_declaration = 14, RULE_enumDeclaration = 15, 
		RULE_enumLiterals = 16, RULE_enumLiteral = 17, RULE_structDeclaration = 18, 
		RULE_propertyDeclaration = 19, RULE_databaseDeclaration = 20, RULE_entityReference = 21, 
		RULE_interfaceDeclaration = 22, RULE_operationDeclaration = 23, RULE_parameterList = 24, 
		RULE_parameter = 25, RULE_operationResult = 26, RULE_componentDeclaration = 27, 
		RULE_componentElements = 28, RULE_componentElement = 29, RULE_componentService = 30, 
		RULE_componentReference = 31, RULE_componentServiceOrReferenceBody = 32, 
		RULE_componentServiceOrReferenceElement = 33, RULE_componentProperty = 34, 
		RULE_componentImplementation = 35, RULE_componentLanguage = 36, RULE_compositeDeclaration = 37, 
		RULE_assemblyDeclaration = 38, RULE_compositeElements = 39, RULE_compositeElement = 40, 
		RULE_compositeComponent = 41, RULE_compositeWire = 42, RULE_wireSource = 43, 
		RULE_wireTarget = 44, RULE_deploymentDeclaration = 45, RULE_deploymentElements = 46, 
		RULE_deploymentElement = 47, RULE_environmentDeclaration = 48, RULE_runtimeDeclaration = 49, 
		RULE_runtimeReference = 50, RULE_assemblyReference = 51, RULE_databaseReference = 52, 
		RULE_bindingDeclaration = 53, RULE_bindingLayers = 54, RULE_transportLayer = 55, 
		RULE_httpTransportLayer = 56, RULE_restTransportLayer = 57, RULE_webSocketTransportLayer = 58, 
		RULE_httpTransportLayerProperties = 59, RULE_httpSslProperty = 60, RULE_httpClientAuthenticationProperty = 61, 
		RULE_encodingLayer = 62, RULE_soapEncodingLayer = 63, RULE_xmlEncodingLayer = 64, 
		RULE_jsonEncodingLayer = 65, RULE_soapEncodingProperties = 66, RULE_soapVersionProperty = 67, 
		RULE_soapMtomProperty = 68, RULE_soapStyleProperty = 69, RULE_protocolLayer = 70, 
		RULE_protocolLayerKind = 71, RULE_endpointDeclaration = 72, RULE_endpointProperties = 73, 
		RULE_endpointProperty = 74, RULE_endpointBindingProperty = 75, RULE_endpointAddressProperty = 76, 
		RULE_returnType = 77, RULE_typeReference = 78, RULE_simpleType = 79, RULE_nulledType = 80, 
		RULE_referenceType = 81, RULE_objectType = 82, RULE_valueType = 83, RULE_voidType = 84, 
		RULE_onewayType = 85, RULE_nullableType = 86, RULE_nonNullableType = 87, 
		RULE_nonNullableArrayType = 88, RULE_arrayType = 89, RULE_simpleArrayType = 90, 
		RULE_nulledArrayType = 91, RULE_constantValue = 92, RULE_typeofValue = 93, 
		RULE_identifier = 94, RULE_literal = 95, RULE_nullLiteral = 96, RULE_booleanLiteral = 97, 
		RULE_integerLiteral = 98, RULE_decimalLiteral = 99, RULE_scientificLiteral = 100, 
		RULE_stringLiteral = 101, RULE_contextualKeywords = 102;
	public static final String[] ruleNames = {
		"main", "qualifiedName", "identifierList", "qualifiedNameList", "annotationList", 
		"returnAnnotationList", "annotation", "returnAnnotation", "annotationBody", 
		"annotationProperties", "annotationPropertyList", "annotationProperty", 
		"annotationPropertyValue", "namespaceDeclaration", "declaration", "enumDeclaration", 
		"enumLiterals", "enumLiteral", "structDeclaration", "propertyDeclaration", 
		"databaseDeclaration", "entityReference", "interfaceDeclaration", "operationDeclaration", 
		"parameterList", "parameter", "operationResult", "componentDeclaration", 
		"componentElements", "componentElement", "componentService", "componentReference", 
		"componentServiceOrReferenceBody", "componentServiceOrReferenceElement", 
		"componentProperty", "componentImplementation", "componentLanguage", "compositeDeclaration", 
		"assemblyDeclaration", "compositeElements", "compositeElement", "compositeComponent", 
		"compositeWire", "wireSource", "wireTarget", "deploymentDeclaration", 
		"deploymentElements", "deploymentElement", "environmentDeclaration", "runtimeDeclaration", 
		"runtimeReference", "assemblyReference", "databaseReference", "bindingDeclaration", 
		"bindingLayers", "transportLayer", "httpTransportLayer", "restTransportLayer", 
		"webSocketTransportLayer", "httpTransportLayerProperties", "httpSslProperty", 
		"httpClientAuthenticationProperty", "encodingLayer", "soapEncodingLayer", 
		"xmlEncodingLayer", "jsonEncodingLayer", "soapEncodingProperties", "soapVersionProperty", 
		"soapMtomProperty", "soapStyleProperty", "protocolLayer", "protocolLayerKind", 
		"endpointDeclaration", "endpointProperties", "endpointProperty", "endpointBindingProperty", 
		"endpointAddressProperty", "returnType", "typeReference", "simpleType", 
		"nulledType", "referenceType", "objectType", "valueType", "voidType", 
		"onewayType", "nullableType", "nonNullableType", "nonNullableArrayType", 
		"arrayType", "simpleArrayType", "nulledArrayType", "constantValue", "typeofValue", 
		"identifier", "literal", "nullLiteral", "booleanLiteral", "integerLiteral", 
		"decimalLiteral", "scientificLiteral", "stringLiteral", "contextualKeywords"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'namespace'", "'enum'", "'exception'", "'struct'", "'interface'", 
		"'throws'", "'oneway'", "'return'", "'binding'", "'transport'", "'encoding'", 
		"'protocol'", "'endpoint'", "'address'", "'database'", "'entity'", "'abstract'", 
		"'component'", "'composite'", "'reference'", "'service'", "'wire'", "'to'", 
		"'implementation'", "'language'", "'assembly'", "'deployment'", "'environment'", 
		"'runtime'", "'null'", "'true'", "'false'", "'object'", "'string'", "'int'", 
		"'long'", "'float'", "'double'", "'byte'", "'bool'", "'any'", "'void'", 
		"'typeof'", "';'", "':'", "'.'", "','", "'='", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'<'", "'>'", "'?'", "'??'", "'&'", "'^'", "'|'", "'&&'", 
		"'||'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'/'", null, "'%'", 
		"'<='", "'>='", "'=='", "'!='", "'*='", "'/='", "'%='", "'+='", "'-='", 
		"'<<='", "'>>='", "'&='", "'^='", "'|='", "'Date'", "'Time'", "'DateTime'", 
		"'TimeSpan'", "'Version'", "'Style'", "'MTOM'", "'SSL'", "'HTTP'", "'REST'", 
		"'WebSocket'", "'SOAP'", "'XML'", "'JSON'", "'ClientAuthentication'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'@\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KNamespace", "KEnum", "KException", "KStruct", "KInterface", "KThrows", 
		"KOneway", "KReturn", "KBinding", "KTransport", "KEncoding", "KProtocol", 
		"KEndpoint", "KAddress", "KDatabase", "KEntity", "KAbstract", "KComponent", 
		"KComposite", "KReference", "KService", "KWire", "KTo", "KImplementation", 
		"KLanguage", "KAssembly", "KDeployment", "KEnvironment", "KRuntime", "KNull", 
		"KTrue", "KFalse", "KObject", "KString", "KInt", "KLong", "KFloat", "KDouble", 
		"KByte", "KBool", "KAny", "KVoid", "KTypeof", "TSemicolon", "TColon", 
		"TDot", "TComma", "TAssign", "TOpenParen", "TCloseParen", "TOpenBracket", 
		"TCloseBracket", "TOpenBrace", "TCloseBrace", "TLessThan", "TGreaterThan", 
		"TQuestion", "TQuestionQuestion", "TAmpersand", "THat", "TBar", "TAndAlso", 
		"TOrElse", "TPlusPlus", "TMinusMinus", "TPlus", "TMinus", "TTilde", "TExclamation", 
		"TSlash", "TAsterisk", "TPercent", "TLessThanOrEqual", "TGreaterThanOrEqual", 
		"TEqual", "TNotEqual", "TAsteriskAssign", "TSlashAssign", "TPercentAssign", 
		"TPlusAssign", "TMinusAssign", "TLeftShiftAssign", "TRightShiftAssign", 
		"TAmpersandAssign", "THatAssign", "TBarAssign", "IDate", "ITime", "IDateTime", 
		"ITimeSpan", "IVersion", "IStyle", "IMTOM", "ISSL", "IHTTP", "IREST", 
		"IWebSocket", "ISOAP", "IXML", "IJSON", "IClientAuthentication", "IdentifierNormal", 
		"IdentifierVerbatim", "IntegerLiteral", "DecimalLiteral", "ScientificLiteral", 
		"DateTimeOffsetLiteral", "DateTimeLiteral", "DateLiteral", "TimeLiteral", 
		"RegularStringLiteral", "GuidLiteral", "UTF8BOM", "WHITESPACE", "CRLF", 
		"LINEBREAK", "LINE_COMMENT", "COMMENT", "DoubleQuoteVerbatimStringLiteral", 
		"SingleQuoteVerbatimStringLiteral", "DoubleQuoteVerbatimStringLiteralStart"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SoalParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SoalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public List<NamespaceDeclarationContext> namespaceDeclaration() {
			return getRuleContexts(NamespaceDeclarationContext.class);
		}
		public NamespaceDeclarationContext namespaceDeclaration(int i) {
			return getRuleContext(NamespaceDeclarationContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KNamespace || _la==TOpenBracket) {
				{
				{
				setState(206);
				namespaceDeclaration();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> TDot() { return getTokens(SoalParser.TDot); }
		public TerminalNode TDot(int i) {
			return getToken(SoalParser.TDot, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			identifier();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TDot) {
				{
				{
				setState(213);
				match(TDot);
				setState(214);
				identifier();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(SoalParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(SoalParser.TComma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			identifier();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(221);
				match(TComma);
				setState(222);
				identifier();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(SoalParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(SoalParser.TComma, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			qualifiedName();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(229);
				match(TComma);
				setState(230);
				qualifiedName();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationListContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterAnnotationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitAnnotationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitAnnotationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationListContext annotationList() throws RecognitionException {
		AnnotationListContext _localctx = new AnnotationListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_annotationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(236);
					annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(239); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnAnnotationListContext extends ParserRuleContext {
		public List<ReturnAnnotationContext> returnAnnotation() {
			return getRuleContexts(ReturnAnnotationContext.class);
		}
		public ReturnAnnotationContext returnAnnotation(int i) {
			return getRuleContext(ReturnAnnotationContext.class,i);
		}
		public ReturnAnnotationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnAnnotationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterReturnAnnotationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitReturnAnnotationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitReturnAnnotationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnAnnotationListContext returnAnnotationList() throws RecognitionException {
		ReturnAnnotationListContext _localctx = new ReturnAnnotationListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnAnnotationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241);
				returnAnnotation();
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOpenBracket );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode TOpenBracket() { return getToken(SoalParser.TOpenBracket, 0); }
		public AnnotationBodyContext annotationBody() {
			return getRuleContext(AnnotationBodyContext.class,0);
		}
		public TerminalNode TCloseBracket() { return getToken(SoalParser.TCloseBracket, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(TOpenBracket);
			setState(247);
			annotationBody();
			setState(248);
			match(TCloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnAnnotationContext extends ParserRuleContext {
		public TerminalNode TOpenBracket() { return getToken(SoalParser.TOpenBracket, 0); }
		public TerminalNode KReturn() { return getToken(SoalParser.KReturn, 0); }
		public TerminalNode TColon() { return getToken(SoalParser.TColon, 0); }
		public AnnotationBodyContext annotationBody() {
			return getRuleContext(AnnotationBodyContext.class,0);
		}
		public TerminalNode TCloseBracket() { return getToken(SoalParser.TCloseBracket, 0); }
		public ReturnAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterReturnAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitReturnAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitReturnAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnAnnotationContext returnAnnotation() throws RecognitionException {
		ReturnAnnotationContext _localctx = new ReturnAnnotationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(TOpenBracket);
			setState(251);
			match(KReturn);
			setState(252);
			match(TColon);
			setState(253);
			annotationBody();
			setState(254);
			match(TCloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationBodyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnnotationPropertiesContext annotationProperties() {
			return getRuleContext(AnnotationPropertiesContext.class,0);
		}
		public AnnotationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterAnnotationBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitAnnotationBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitAnnotationBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationBodyContext annotationBody() throws RecognitionException {
		AnnotationBodyContext _localctx = new AnnotationBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_annotationBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			identifier();
			setState(258);
			_la = _input.LA(1);
			if (_la==TOpenParen) {
				{
				setState(257);
				annotationProperties();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationPropertiesContext extends ParserRuleContext {
		public TerminalNode TOpenParen() { return getToken(SoalParser.TOpenParen, 0); }
		public TerminalNode TCloseParen() { return getToken(SoalParser.TCloseParen, 0); }
		public AnnotationPropertyListContext annotationPropertyList() {
			return getRuleContext(AnnotationPropertyListContext.class,0);
		}
		public AnnotationPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterAnnotationProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitAnnotationProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitAnnotationProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationPropertiesContext annotationProperties() throws RecognitionException {
		AnnotationPropertiesContext _localctx = new AnnotationPropertiesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_annotationProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(TOpenParen);
			setState(262);
			_la = _input.LA(1);
			if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)) | (1L << (IdentifierNormal - 87)) | (1L << (IdentifierVerbatim - 87)))) != 0)) {
				{
				setState(261);
				annotationPropertyList();
				}
			}

			setState(264);
			match(TCloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationPropertyListContext extends ParserRuleContext {
		public List<AnnotationPropertyContext> annotationProperty() {
			return getRuleContexts(AnnotationPropertyContext.class);
		}
		public AnnotationPropertyContext annotationProperty(int i) {
			return getRuleContext(AnnotationPropertyContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(SoalParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(SoalParser.TComma, i);
		}
		public AnnotationPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationPropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterAnnotationPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitAnnotationPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitAnnotationPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationPropertyListContext annotationPropertyList() throws RecognitionException {
		AnnotationPropertyListContext _localctx = new AnnotationPropertyListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_annotationPropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			annotationProperty();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(267);
				match(TComma);
				setState(268);
				annotationProperty();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationPropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TAssign() { return getToken(SoalParser.TAssign, 0); }
		public AnnotationPropertyValueContext annotationPropertyValue() {
			return getRuleContext(AnnotationPropertyValueContext.class,0);
		}
		public AnnotationPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterAnnotationProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitAnnotationProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitAnnotationProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationPropertyContext annotationProperty() throws RecognitionException {
		AnnotationPropertyContext _localctx = new AnnotationPropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_annotationProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			identifier();
			setState(275);
			match(TAssign);
			setState(276);
			annotationPropertyValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationPropertyValueContext extends ParserRuleContext {
		public ConstantValueContext constantValue() {
			return getRuleContext(ConstantValueContext.class,0);
		}
		public TypeofValueContext typeofValue() {
			return getRuleContext(TypeofValueContext.class,0);
		}
		public AnnotationPropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationPropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterAnnotationPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitAnnotationPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitAnnotationPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationPropertyValueContext annotationPropertyValue() throws RecognitionException {
		AnnotationPropertyValueContext _localctx = new AnnotationPropertyValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_annotationPropertyValue);
		try {
			setState(280);
			switch (_input.LA(1)) {
			case KNull:
			case KTrue:
			case KFalse:
			case IDate:
			case ITime:
			case IDateTime:
			case ITimeSpan:
			case IVersion:
			case IStyle:
			case IMTOM:
			case ISSL:
			case IHTTP:
			case IREST:
			case IWebSocket:
			case ISOAP:
			case IXML:
			case IJSON:
			case IClientAuthentication:
			case IdentifierNormal:
			case IdentifierVerbatim:
			case IntegerLiteral:
			case DecimalLiteral:
			case ScientificLiteral:
			case RegularStringLiteral:
			case DoubleQuoteVerbatimStringLiteral:
			case SingleQuoteVerbatimStringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				constantValue();
				}
				break;
			case KTypeof:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				typeofValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode KNamespace() { return getToken(SoalParser.KNamespace, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TAssign() { return getToken(SoalParser.TAssign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TColon() { return getToken(SoalParser.TColon, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitNamespaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitNamespaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_namespaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if (_la==TOpenBracket) {
				{
				setState(282);
				annotationList();
				}
			}

			setState(285);
			match(KNamespace);
			setState(286);
			qualifiedName();
			setState(287);
			match(TAssign);
			setState(291);
			_la = _input.LA(1);
			if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)) | (1L << (IdentifierNormal - 87)) | (1L << (IdentifierVerbatim - 87)))) != 0)) {
				{
				setState(288);
				identifier();
				setState(289);
				match(TColon);
				}
			}

			setState(293);
			stringLiteral();
			setState(294);
			match(TOpenBrace);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEnum) | (1L << KStruct) | (1L << KInterface) | (1L << KBinding) | (1L << KEndpoint) | (1L << KDatabase) | (1L << KAbstract) | (1L << KComponent) | (1L << KComposite) | (1L << KAssembly) | (1L << KDeployment) | (1L << TOpenBracket))) != 0)) {
				{
				{
				setState(295);
				declaration();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public DatabaseDeclarationContext databaseDeclaration() {
			return getRuleContext(DatabaseDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public CompositeDeclarationContext compositeDeclaration() {
			return getRuleContext(CompositeDeclarationContext.class,0);
		}
		public AssemblyDeclarationContext assemblyDeclaration() {
			return getRuleContext(AssemblyDeclarationContext.class,0);
		}
		public BindingDeclarationContext bindingDeclaration() {
			return getRuleContext(BindingDeclarationContext.class,0);
		}
		public EndpointDeclarationContext endpointDeclaration() {
			return getRuleContext(EndpointDeclarationContext.class,0);
		}
		public DeploymentDeclarationContext deploymentDeclaration() {
			return getRuleContext(DeploymentDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaration);
		try {
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				enumDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				structDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				databaseDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				componentDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(308);
				compositeDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(309);
				assemblyDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(310);
				bindingDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(311);
				endpointDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(312);
				deploymentDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode KEnum() { return getToken(SoalParser.KEnum, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public TerminalNode TColon() { return getToken(SoalParser.TColon, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public EnumLiteralsContext enumLiterals() {
			return getRuleContext(EnumLiteralsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if (_la==TOpenBracket) {
				{
				setState(315);
				annotationList();
				}
			}

			setState(318);
			match(KEnum);
			setState(319);
			identifier();
			setState(322);
			_la = _input.LA(1);
			if (_la==TColon) {
				{
				setState(320);
				match(TColon);
				setState(321);
				qualifiedName();
				}
			}

			setState(324);
			match(TOpenBrace);
			setState(326);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (TOpenBracket - 51)) | (1L << (IDate - 51)) | (1L << (ITime - 51)) | (1L << (IDateTime - 51)) | (1L << (ITimeSpan - 51)) | (1L << (IVersion - 51)) | (1L << (IStyle - 51)) | (1L << (IMTOM - 51)) | (1L << (ISSL - 51)) | (1L << (IHTTP - 51)) | (1L << (IREST - 51)) | (1L << (IWebSocket - 51)) | (1L << (ISOAP - 51)) | (1L << (IXML - 51)) | (1L << (IJSON - 51)) | (1L << (IClientAuthentication - 51)) | (1L << (IdentifierNormal - 51)) | (1L << (IdentifierVerbatim - 51)))) != 0)) {
				{
				setState(325);
				enumLiterals();
				}
			}

			setState(328);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumLiteralsContext extends ParserRuleContext {
		public List<EnumLiteralContext> enumLiteral() {
			return getRuleContexts(EnumLiteralContext.class);
		}
		public EnumLiteralContext enumLiteral(int i) {
			return getRuleContext(EnumLiteralContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(SoalParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(SoalParser.TComma, i);
		}
		public EnumLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterEnumLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitEnumLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitEnumLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumLiteralsContext enumLiterals() throws RecognitionException {
		EnumLiteralsContext _localctx = new EnumLiteralsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enumLiterals);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			enumLiteral();
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(331);
					match(TComma);
					setState(332);
					enumLiteral();
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(339);
			_la = _input.LA(1);
			if (_la==TComma) {
				{
				setState(338);
				match(TComma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumLiteralContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public EnumLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterEnumLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitEnumLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitEnumLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumLiteralContext enumLiteral() throws RecognitionException {
		EnumLiteralContext _localctx = new EnumLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if (_la==TOpenBracket) {
				{
				setState(341);
				annotationList();
				}
			}

			setState(344);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode KStruct() { return getToken(SoalParser.KStruct, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public TerminalNode TColon() { return getToken(SoalParser.TColon, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if (_la==TOpenBracket) {
				{
				setState(346);
				annotationList();
				}
			}

			setState(349);
			match(KStruct);
			setState(350);
			identifier();
			setState(353);
			_la = _input.LA(1);
			if (_la==TColon) {
				{
				setState(351);
				match(TColon);
				setState(352);
				qualifiedName();
				}
			}

			setState(355);
			match(TOpenBrace);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KObject) | (1L << KString) | (1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool) | (1L << TOpenBracket))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)) | (1L << (IdentifierNormal - 87)) | (1L << (IdentifierVerbatim - 87)))) != 0)) {
				{
				{
				setState(356);
				propertyDeclaration();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if (_la==TOpenBracket) {
				{
				setState(364);
				annotationList();
				}
			}

			setState(367);
			typeReference();
			setState(368);
			identifier();
			setState(369);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseDeclarationContext extends ParserRuleContext {
		public TerminalNode KDatabase() { return getToken(SoalParser.KDatabase, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public List<EntityReferenceContext> entityReference() {
			return getRuleContexts(EntityReferenceContext.class);
		}
		public EntityReferenceContext entityReference(int i) {
			return getRuleContext(EntityReferenceContext.class,i);
		}
		public List<OperationDeclarationContext> operationDeclaration() {
			return getRuleContexts(OperationDeclarationContext.class);
		}
		public OperationDeclarationContext operationDeclaration(int i) {
			return getRuleContext(OperationDeclarationContext.class,i);
		}
		public DatabaseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterDatabaseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitDatabaseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitDatabaseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseDeclarationContext databaseDeclaration() throws RecognitionException {
		DatabaseDeclarationContext _localctx = new DatabaseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_databaseDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if (_la==TOpenBracket) {
				{
				setState(371);
				annotationList();
				}
			}

			setState(374);
			match(KDatabase);
			setState(375);
			identifier();
			setState(376);
			match(TOpenBrace);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEntity) {
				{
				{
				setState(377);
				entityReference();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KOneway) | (1L << KObject) | (1L << KString) | (1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool) | (1L << KVoid) | (1L << TOpenBracket))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)) | (1L << (IdentifierNormal - 87)) | (1L << (IdentifierVerbatim - 87)))) != 0)) {
				{
				{
				setState(383);
				operationDeclaration();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityReferenceContext extends ParserRuleContext {
		public TerminalNode KEntity() { return getToken(SoalParser.KEntity, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public EntityReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterEntityReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitEntityReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitEntityReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityReferenceContext entityReference() throws RecognitionException {
		EntityReferenceContext _localctx = new EntityReferenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_entityReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(KEntity);
			setState(392);
			qualifiedName();
			setState(393);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode KInterface() { return getToken(SoalParser.KInterface, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public List<OperationDeclarationContext> operationDeclaration() {
			return getRuleContexts(OperationDeclarationContext.class);
		}
		public OperationDeclarationContext operationDeclaration(int i) {
			return getRuleContext(OperationDeclarationContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if (_la==TOpenBracket) {
				{
				setState(395);
				annotationList();
				}
			}

			setState(398);
			match(KInterface);
			setState(399);
			identifier();
			setState(400);
			match(TOpenBrace);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KOneway) | (1L << KObject) | (1L << KString) | (1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool) | (1L << KVoid) | (1L << TOpenBracket))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)) | (1L << (IdentifierNormal - 87)) | (1L << (IdentifierVerbatim - 87)))) != 0)) {
				{
				{
				setState(401);
				operationDeclaration();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationDeclarationContext extends ParserRuleContext {
		public OperationResultContext operationResult() {
			return getRuleContext(OperationResultContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenParen() { return getToken(SoalParser.TOpenParen, 0); }
		public TerminalNode TCloseParen() { return getToken(SoalParser.TCloseParen, 0); }
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode KThrows() { return getToken(SoalParser.KThrows, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public OperationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterOperationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitOperationDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitOperationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationDeclarationContext operationDeclaration() throws RecognitionException {
		OperationDeclarationContext _localctx = new OperationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(409);
				annotationList();
				}
				break;
			}
			setState(412);
			operationResult();
			setState(413);
			identifier();
			setState(414);
			match(TOpenParen);
			setState(416);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KObject) | (1L << KString) | (1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool) | (1L << TOpenBracket))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)) | (1L << (IdentifierNormal - 87)) | (1L << (IdentifierVerbatim - 87)))) != 0)) {
				{
				setState(415);
				parameterList();
				}
			}

			setState(418);
			match(TCloseParen);
			setState(421);
			_la = _input.LA(1);
			if (_la==KThrows) {
				{
				setState(419);
				match(KThrows);
				setState(420);
				qualifiedNameList();
				}
			}

			setState(423);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			parameter();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(426);
				match(TComma);
				setState(427);
				parameter();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_la = _input.LA(1);
			if (_la==TOpenBracket) {
				{
				setState(433);
				annotationList();
				}
			}

			setState(436);
			typeReference();
			setState(437);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationResultContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public OnewayTypeContext onewayType() {
			return getRuleContext(OnewayTypeContext.class,0);
		}
		public ReturnAnnotationListContext returnAnnotationList() {
			return getRuleContext(ReturnAnnotationListContext.class,0);
		}
		public OperationResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterOperationResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitOperationResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitOperationResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationResultContext operationResult() throws RecognitionException {
		OperationResultContext _localctx = new OperationResultContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operationResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_la = _input.LA(1);
			if (_la==TOpenBracket) {
				{
				setState(439);
				returnAnnotationList();
				}
			}

			setState(444);
			switch (_input.LA(1)) {
			case KObject:
			case KString:
			case KInt:
			case KLong:
			case KFloat:
			case KDouble:
			case KByte:
			case KBool:
			case KVoid:
			case IDate:
			case ITime:
			case IDateTime:
			case ITimeSpan:
			case IVersion:
			case IStyle:
			case IMTOM:
			case ISSL:
			case IHTTP:
			case IREST:
			case IWebSocket:
			case ISOAP:
			case IXML:
			case IJSON:
			case IClientAuthentication:
			case IdentifierNormal:
			case IdentifierVerbatim:
				{
				setState(442);
				returnType();
				}
				break;
			case KOneway:
				{
				setState(443);
				onewayType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode KComponent() { return getToken(SoalParser.KComponent, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public TerminalNode KAbstract() { return getToken(SoalParser.KAbstract, 0); }
		public TerminalNode TColon() { return getToken(SoalParser.TColon, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ComponentElementsContext componentElements() {
			return getRuleContext(ComponentElementsContext.class,0);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if (_la==KAbstract) {
				{
				setState(446);
				match(KAbstract);
				}
			}

			setState(449);
			match(KComponent);
			setState(450);
			identifier();
			setState(453);
			_la = _input.LA(1);
			if (_la==TColon) {
				{
				setState(451);
				match(TColon);
				setState(452);
				qualifiedName();
				}
			}

			setState(455);
			match(TOpenBrace);
			setState(457);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KReference) | (1L << KService) | (1L << KImplementation) | (1L << KLanguage) | (1L << KObject) | (1L << KString) | (1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)) | (1L << (IdentifierNormal - 87)) | (1L << (IdentifierVerbatim - 87)))) != 0)) {
				{
				setState(456);
				componentElements();
				}
			}

			setState(459);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentElementsContext extends ParserRuleContext {
		public List<ComponentElementContext> componentElement() {
			return getRuleContexts(ComponentElementContext.class);
		}
		public ComponentElementContext componentElement(int i) {
			return getRuleContext(ComponentElementContext.class,i);
		}
		public ComponentElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterComponentElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitComponentElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitComponentElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentElementsContext componentElements() throws RecognitionException {
		ComponentElementsContext _localctx = new ComponentElementsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_componentElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(461);
				componentElement();
				}
				}
				setState(464); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KReference) | (1L << KService) | (1L << KImplementation) | (1L << KLanguage) | (1L << KObject) | (1L << KString) | (1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)) | (1L << (IdentifierNormal - 87)) | (1L << (IdentifierVerbatim - 87)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentElementContext extends ParserRuleContext {
		public ComponentServiceContext componentService() {
			return getRuleContext(ComponentServiceContext.class,0);
		}
		public ComponentReferenceContext componentReference() {
			return getRuleContext(ComponentReferenceContext.class,0);
		}
		public ComponentPropertyContext componentProperty() {
			return getRuleContext(ComponentPropertyContext.class,0);
		}
		public ComponentImplementationContext componentImplementation() {
			return getRuleContext(ComponentImplementationContext.class,0);
		}
		public ComponentLanguageContext componentLanguage() {
			return getRuleContext(ComponentLanguageContext.class,0);
		}
		public ComponentElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterComponentElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitComponentElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitComponentElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentElementContext componentElement() throws RecognitionException {
		ComponentElementContext _localctx = new ComponentElementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_componentElement);
		try {
			setState(471);
			switch (_input.LA(1)) {
			case KService:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				componentService();
				}
				break;
			case KReference:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				componentReference();
				}
				break;
			case KObject:
			case KString:
			case KInt:
			case KLong:
			case KFloat:
			case KDouble:
			case KByte:
			case KBool:
			case IDate:
			case ITime:
			case IDateTime:
			case ITimeSpan:
			case IVersion:
			case IStyle:
			case IMTOM:
			case ISSL:
			case IHTTP:
			case IREST:
			case IWebSocket:
			case ISOAP:
			case IXML:
			case IJSON:
			case IClientAuthentication:
			case IdentifierNormal:
			case IdentifierVerbatim:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				componentProperty();
				}
				break;
			case KImplementation:
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
				componentImplementation();
				}
				break;
			case KLanguage:
				enterOuterAlt(_localctx, 5);
				{
				setState(470);
				componentLanguage();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentServiceContext extends ParserRuleContext {
		public TerminalNode KService() { return getToken(SoalParser.KService, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ComponentServiceOrReferenceBodyContext componentServiceOrReferenceBody() {
			return getRuleContext(ComponentServiceOrReferenceBodyContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ComponentServiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentService; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterComponentService(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitComponentService(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitComponentService(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentServiceContext componentService() throws RecognitionException {
		ComponentServiceContext _localctx = new ComponentServiceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_componentService);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(KService);
			setState(474);
			qualifiedName();
			setState(476);
			_la = _input.LA(1);
			if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)) | (1L << (IdentifierNormal - 87)) | (1L << (IdentifierVerbatim - 87)))) != 0)) {
				{
				setState(475);
				identifier();
				}
			}

			setState(478);
			componentServiceOrReferenceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentReferenceContext extends ParserRuleContext {
		public TerminalNode KReference() { return getToken(SoalParser.KReference, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ComponentServiceOrReferenceBodyContext componentServiceOrReferenceBody() {
			return getRuleContext(ComponentServiceOrReferenceBodyContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ComponentReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterComponentReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitComponentReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitComponentReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentReferenceContext componentReference() throws RecognitionException {
		ComponentReferenceContext _localctx = new ComponentReferenceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_componentReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(KReference);
			setState(481);
			qualifiedName();
			setState(483);
			_la = _input.LA(1);
			if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)) | (1L << (IdentifierNormal - 87)) | (1L << (IdentifierVerbatim - 87)))) != 0)) {
				{
				setState(482);
				identifier();
				}
			}

			setState(485);
			componentServiceOrReferenceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentServiceOrReferenceBodyContext extends ParserRuleContext {
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public List<ComponentServiceOrReferenceElementContext> componentServiceOrReferenceElement() {
			return getRuleContexts(ComponentServiceOrReferenceElementContext.class);
		}
		public ComponentServiceOrReferenceElementContext componentServiceOrReferenceElement(int i) {
			return getRuleContext(ComponentServiceOrReferenceElementContext.class,i);
		}
		public ComponentServiceOrReferenceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentServiceOrReferenceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterComponentServiceOrReferenceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitComponentServiceOrReferenceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitComponentServiceOrReferenceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentServiceOrReferenceBodyContext componentServiceOrReferenceBody() throws RecognitionException {
		ComponentServiceOrReferenceBodyContext _localctx = new ComponentServiceOrReferenceBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_componentServiceOrReferenceBody);
		int _la;
		try {
			setState(496);
			switch (_input.LA(1)) {
			case TSemicolon:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(TSemicolon);
				}
				break;
			case TOpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(TOpenBrace);
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KBinding) {
					{
					{
					setState(489);
					componentServiceOrReferenceElement();
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(495);
				match(TCloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentServiceOrReferenceElementContext extends ParserRuleContext {
		public TerminalNode KBinding() { return getToken(SoalParser.KBinding, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public ComponentServiceOrReferenceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentServiceOrReferenceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterComponentServiceOrReferenceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitComponentServiceOrReferenceElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitComponentServiceOrReferenceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentServiceOrReferenceElementContext componentServiceOrReferenceElement() throws RecognitionException {
		ComponentServiceOrReferenceElementContext _localctx = new ComponentServiceOrReferenceElementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_componentServiceOrReferenceElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(KBinding);
			setState(499);
			qualifiedName();
			setState(500);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentPropertyContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public ComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyContext componentProperty() throws RecognitionException {
		ComponentPropertyContext _localctx = new ComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_componentProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			typeReference();
			setState(503);
			identifier();
			setState(504);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentImplementationContext extends ParserRuleContext {
		public TerminalNode KImplementation() { return getToken(SoalParser.KImplementation, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public ComponentImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterComponentImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitComponentImplementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitComponentImplementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentImplementationContext componentImplementation() throws RecognitionException {
		ComponentImplementationContext _localctx = new ComponentImplementationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_componentImplementation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(KImplementation);
			setState(507);
			identifier();
			setState(508);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentLanguageContext extends ParserRuleContext {
		public TerminalNode KLanguage() { return getToken(SoalParser.KLanguage, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public ComponentLanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentLanguage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterComponentLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitComponentLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitComponentLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentLanguageContext componentLanguage() throws RecognitionException {
		ComponentLanguageContext _localctx = new ComponentLanguageContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_componentLanguage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(KLanguage);
			setState(511);
			identifier();
			setState(512);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompositeDeclarationContext extends ParserRuleContext {
		public TerminalNode KComposite() { return getToken(SoalParser.KComposite, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public TerminalNode TColon() { return getToken(SoalParser.TColon, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public CompositeElementsContext compositeElements() {
			return getRuleContext(CompositeElementsContext.class,0);
		}
		public CompositeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterCompositeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitCompositeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitCompositeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositeDeclarationContext compositeDeclaration() throws RecognitionException {
		CompositeDeclarationContext _localctx = new CompositeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_compositeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(KComposite);
			setState(515);
			identifier();
			setState(518);
			_la = _input.LA(1);
			if (_la==TColon) {
				{
				setState(516);
				match(TColon);
				setState(517);
				qualifiedName();
				}
			}

			setState(520);
			match(TOpenBrace);
			setState(522);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KComponent) | (1L << KReference) | (1L << KService) | (1L << KWire) | (1L << KImplementation) | (1L << KLanguage) | (1L << KObject) | (1L << KString) | (1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)) | (1L << (IdentifierNormal - 87)) | (1L << (IdentifierVerbatim - 87)))) != 0)) {
				{
				setState(521);
				compositeElements();
				}
			}

			setState(524);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyDeclarationContext extends ParserRuleContext {
		public TerminalNode KAssembly() { return getToken(SoalParser.KAssembly, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public TerminalNode TColon() { return getToken(SoalParser.TColon, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public CompositeElementsContext compositeElements() {
			return getRuleContext(CompositeElementsContext.class,0);
		}
		public AssemblyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterAssemblyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitAssemblyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitAssemblyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyDeclarationContext assemblyDeclaration() throws RecognitionException {
		AssemblyDeclarationContext _localctx = new AssemblyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assemblyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(KAssembly);
			setState(527);
			identifier();
			setState(530);
			_la = _input.LA(1);
			if (_la==TColon) {
				{
				setState(528);
				match(TColon);
				setState(529);
				qualifiedName();
				}
			}

			setState(532);
			match(TOpenBrace);
			setState(534);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KComponent) | (1L << KReference) | (1L << KService) | (1L << KWire) | (1L << KImplementation) | (1L << KLanguage) | (1L << KObject) | (1L << KString) | (1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)) | (1L << (IdentifierNormal - 87)) | (1L << (IdentifierVerbatim - 87)))) != 0)) {
				{
				setState(533);
				compositeElements();
				}
			}

			setState(536);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompositeElementsContext extends ParserRuleContext {
		public List<CompositeElementContext> compositeElement() {
			return getRuleContexts(CompositeElementContext.class);
		}
		public CompositeElementContext compositeElement(int i) {
			return getRuleContext(CompositeElementContext.class,i);
		}
		public CompositeElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterCompositeElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitCompositeElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitCompositeElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositeElementsContext compositeElements() throws RecognitionException {
		CompositeElementsContext _localctx = new CompositeElementsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_compositeElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(538);
				compositeElement();
				}
				}
				setState(541); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KComponent) | (1L << KReference) | (1L << KService) | (1L << KWire) | (1L << KImplementation) | (1L << KLanguage) | (1L << KObject) | (1L << KString) | (1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)) | (1L << (IdentifierNormal - 87)) | (1L << (IdentifierVerbatim - 87)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompositeElementContext extends ParserRuleContext {
		public ComponentServiceContext componentService() {
			return getRuleContext(ComponentServiceContext.class,0);
		}
		public ComponentReferenceContext componentReference() {
			return getRuleContext(ComponentReferenceContext.class,0);
		}
		public ComponentPropertyContext componentProperty() {
			return getRuleContext(ComponentPropertyContext.class,0);
		}
		public ComponentImplementationContext componentImplementation() {
			return getRuleContext(ComponentImplementationContext.class,0);
		}
		public ComponentLanguageContext componentLanguage() {
			return getRuleContext(ComponentLanguageContext.class,0);
		}
		public CompositeComponentContext compositeComponent() {
			return getRuleContext(CompositeComponentContext.class,0);
		}
		public CompositeWireContext compositeWire() {
			return getRuleContext(CompositeWireContext.class,0);
		}
		public CompositeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterCompositeElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitCompositeElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitCompositeElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositeElementContext compositeElement() throws RecognitionException {
		CompositeElementContext _localctx = new CompositeElementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_compositeElement);
		try {
			setState(550);
			switch (_input.LA(1)) {
			case KService:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				componentService();
				}
				break;
			case KReference:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				componentReference();
				}
				break;
			case KObject:
			case KString:
			case KInt:
			case KLong:
			case KFloat:
			case KDouble:
			case KByte:
			case KBool:
			case IDate:
			case ITime:
			case IDateTime:
			case ITimeSpan:
			case IVersion:
			case IStyle:
			case IMTOM:
			case ISSL:
			case IHTTP:
			case IREST:
			case IWebSocket:
			case ISOAP:
			case IXML:
			case IJSON:
			case IClientAuthentication:
			case IdentifierNormal:
			case IdentifierVerbatim:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				componentProperty();
				}
				break;
			case KImplementation:
				enterOuterAlt(_localctx, 4);
				{
				setState(546);
				componentImplementation();
				}
				break;
			case KLanguage:
				enterOuterAlt(_localctx, 5);
				{
				setState(547);
				componentLanguage();
				}
				break;
			case KComponent:
				enterOuterAlt(_localctx, 6);
				{
				setState(548);
				compositeComponent();
				}
				break;
			case KWire:
				enterOuterAlt(_localctx, 7);
				{
				setState(549);
				compositeWire();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompositeComponentContext extends ParserRuleContext {
		public TerminalNode KComponent() { return getToken(SoalParser.KComponent, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public CompositeComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterCompositeComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitCompositeComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitCompositeComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositeComponentContext compositeComponent() throws RecognitionException {
		CompositeComponentContext _localctx = new CompositeComponentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_compositeComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(KComponent);
			setState(553);
			qualifiedName();
			setState(554);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompositeWireContext extends ParserRuleContext {
		public TerminalNode KWire() { return getToken(SoalParser.KWire, 0); }
		public WireSourceContext wireSource() {
			return getRuleContext(WireSourceContext.class,0);
		}
		public TerminalNode KTo() { return getToken(SoalParser.KTo, 0); }
		public WireTargetContext wireTarget() {
			return getRuleContext(WireTargetContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public CompositeWireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeWire; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterCompositeWire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitCompositeWire(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitCompositeWire(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositeWireContext compositeWire() throws RecognitionException {
		CompositeWireContext _localctx = new CompositeWireContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_compositeWire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(KWire);
			setState(557);
			wireSource();
			setState(558);
			match(KTo);
			setState(559);
			wireTarget();
			setState(560);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WireSourceContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public WireSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wireSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterWireSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitWireSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitWireSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WireSourceContext wireSource() throws RecognitionException {
		WireSourceContext _localctx = new WireSourceContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_wireSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WireTargetContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public WireTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wireTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterWireTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitWireTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitWireTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WireTargetContext wireTarget() throws RecognitionException {
		WireTargetContext _localctx = new WireTargetContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_wireTarget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeploymentDeclarationContext extends ParserRuleContext {
		public TerminalNode KDeployment() { return getToken(SoalParser.KDeployment, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public DeploymentElementsContext deploymentElements() {
			return getRuleContext(DeploymentElementsContext.class,0);
		}
		public DeploymentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deploymentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterDeploymentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitDeploymentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitDeploymentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeploymentDeclarationContext deploymentDeclaration() throws RecognitionException {
		DeploymentDeclarationContext _localctx = new DeploymentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_deploymentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(KDeployment);
			setState(567);
			identifier();
			setState(568);
			match(TOpenBrace);
			setState(570);
			_la = _input.LA(1);
			if (_la==KWire || _la==KEnvironment) {
				{
				setState(569);
				deploymentElements();
				}
			}

			setState(572);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeploymentElementsContext extends ParserRuleContext {
		public List<DeploymentElementContext> deploymentElement() {
			return getRuleContexts(DeploymentElementContext.class);
		}
		public DeploymentElementContext deploymentElement(int i) {
			return getRuleContext(DeploymentElementContext.class,i);
		}
		public DeploymentElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deploymentElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterDeploymentElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitDeploymentElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitDeploymentElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeploymentElementsContext deploymentElements() throws RecognitionException {
		DeploymentElementsContext _localctx = new DeploymentElementsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_deploymentElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(574);
				deploymentElement();
				}
				}
				setState(577); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KWire || _la==KEnvironment );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeploymentElementContext extends ParserRuleContext {
		public EnvironmentDeclarationContext environmentDeclaration() {
			return getRuleContext(EnvironmentDeclarationContext.class,0);
		}
		public CompositeWireContext compositeWire() {
			return getRuleContext(CompositeWireContext.class,0);
		}
		public DeploymentElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deploymentElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterDeploymentElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitDeploymentElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitDeploymentElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeploymentElementContext deploymentElement() throws RecognitionException {
		DeploymentElementContext _localctx = new DeploymentElementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_deploymentElement);
		try {
			setState(581);
			switch (_input.LA(1)) {
			case KEnvironment:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				environmentDeclaration();
				}
				break;
			case KWire:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				compositeWire();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironmentDeclarationContext extends ParserRuleContext {
		public TerminalNode KEnvironment() { return getToken(SoalParser.KEnvironment, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public RuntimeDeclarationContext runtimeDeclaration() {
			return getRuleContext(RuntimeDeclarationContext.class,0);
		}
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public List<RuntimeReferenceContext> runtimeReference() {
			return getRuleContexts(RuntimeReferenceContext.class);
		}
		public RuntimeReferenceContext runtimeReference(int i) {
			return getRuleContext(RuntimeReferenceContext.class,i);
		}
		public EnvironmentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environmentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterEnvironmentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitEnvironmentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitEnvironmentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvironmentDeclarationContext environmentDeclaration() throws RecognitionException {
		EnvironmentDeclarationContext _localctx = new EnvironmentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_environmentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(KEnvironment);
			setState(584);
			identifier();
			setState(585);
			match(TOpenBrace);
			setState(586);
			runtimeDeclaration();
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KDatabase || _la==KAssembly) {
				{
				{
				setState(587);
				runtimeReference();
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuntimeDeclarationContext extends ParserRuleContext {
		public TerminalNode KRuntime() { return getToken(SoalParser.KRuntime, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public RuntimeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtimeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterRuntimeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitRuntimeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitRuntimeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuntimeDeclarationContext runtimeDeclaration() throws RecognitionException {
		RuntimeDeclarationContext _localctx = new RuntimeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_runtimeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(KRuntime);
			setState(596);
			identifier();
			setState(597);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuntimeReferenceContext extends ParserRuleContext {
		public AssemblyReferenceContext assemblyReference() {
			return getRuleContext(AssemblyReferenceContext.class,0);
		}
		public DatabaseReferenceContext databaseReference() {
			return getRuleContext(DatabaseReferenceContext.class,0);
		}
		public RuntimeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtimeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterRuntimeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitRuntimeReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitRuntimeReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuntimeReferenceContext runtimeReference() throws RecognitionException {
		RuntimeReferenceContext _localctx = new RuntimeReferenceContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_runtimeReference);
		try {
			setState(601);
			switch (_input.LA(1)) {
			case KAssembly:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				assemblyReference();
				}
				break;
			case KDatabase:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				databaseReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyReferenceContext extends ParserRuleContext {
		public TerminalNode KAssembly() { return getToken(SoalParser.KAssembly, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public AssemblyReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterAssemblyReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitAssemblyReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitAssemblyReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyReferenceContext assemblyReference() throws RecognitionException {
		AssemblyReferenceContext _localctx = new AssemblyReferenceContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_assemblyReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(KAssembly);
			setState(604);
			qualifiedName();
			setState(605);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseReferenceContext extends ParserRuleContext {
		public TerminalNode KDatabase() { return getToken(SoalParser.KDatabase, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public DatabaseReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterDatabaseReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitDatabaseReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitDatabaseReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseReferenceContext databaseReference() throws RecognitionException {
		DatabaseReferenceContext _localctx = new DatabaseReferenceContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_databaseReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(KDatabase);
			setState(608);
			qualifiedName();
			setState(609);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingDeclarationContext extends ParserRuleContext {
		public TerminalNode KBinding() { return getToken(SoalParser.KBinding, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public BindingLayersContext bindingLayers() {
			return getRuleContext(BindingLayersContext.class,0);
		}
		public BindingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterBindingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitBindingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitBindingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingDeclarationContext bindingDeclaration() throws RecognitionException {
		BindingDeclarationContext _localctx = new BindingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_bindingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(KBinding);
			setState(612);
			identifier();
			setState(613);
			match(TOpenBrace);
			setState(615);
			_la = _input.LA(1);
			if (_la==KTransport) {
				{
				setState(614);
				bindingLayers();
				}
			}

			setState(617);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingLayersContext extends ParserRuleContext {
		public TransportLayerContext transportLayer() {
			return getRuleContext(TransportLayerContext.class,0);
		}
		public List<EncodingLayerContext> encodingLayer() {
			return getRuleContexts(EncodingLayerContext.class);
		}
		public EncodingLayerContext encodingLayer(int i) {
			return getRuleContext(EncodingLayerContext.class,i);
		}
		public List<ProtocolLayerContext> protocolLayer() {
			return getRuleContexts(ProtocolLayerContext.class);
		}
		public ProtocolLayerContext protocolLayer(int i) {
			return getRuleContext(ProtocolLayerContext.class,i);
		}
		public BindingLayersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingLayers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterBindingLayers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitBindingLayers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitBindingLayers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingLayersContext bindingLayers() throws RecognitionException {
		BindingLayersContext _localctx = new BindingLayersContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_bindingLayers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			transportLayer();
			setState(621); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(620);
				encodingLayer();
				}
				}
				setState(623); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEncoding );
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KProtocol) {
				{
				{
				setState(625);
				protocolLayer();
				}
				}
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransportLayerContext extends ParserRuleContext {
		public HttpTransportLayerContext httpTransportLayer() {
			return getRuleContext(HttpTransportLayerContext.class,0);
		}
		public RestTransportLayerContext restTransportLayer() {
			return getRuleContext(RestTransportLayerContext.class,0);
		}
		public WebSocketTransportLayerContext webSocketTransportLayer() {
			return getRuleContext(WebSocketTransportLayerContext.class,0);
		}
		public TransportLayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transportLayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterTransportLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitTransportLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitTransportLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransportLayerContext transportLayer() throws RecognitionException {
		TransportLayerContext _localctx = new TransportLayerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_transportLayer);
		try {
			setState(634);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				httpTransportLayer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				restTransportLayer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				webSocketTransportLayer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpTransportLayerContext extends ParserRuleContext {
		public TerminalNode KTransport() { return getToken(SoalParser.KTransport, 0); }
		public TerminalNode IHTTP() { return getToken(SoalParser.IHTTP, 0); }
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public List<HttpTransportLayerPropertiesContext> httpTransportLayerProperties() {
			return getRuleContexts(HttpTransportLayerPropertiesContext.class);
		}
		public HttpTransportLayerPropertiesContext httpTransportLayerProperties(int i) {
			return getRuleContext(HttpTransportLayerPropertiesContext.class,i);
		}
		public HttpTransportLayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpTransportLayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterHttpTransportLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitHttpTransportLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitHttpTransportLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpTransportLayerContext httpTransportLayer() throws RecognitionException {
		HttpTransportLayerContext _localctx = new HttpTransportLayerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_httpTransportLayer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(KTransport);
			setState(637);
			match(IHTTP);
			setState(647);
			switch (_input.LA(1)) {
			case TSemicolon:
				{
				setState(638);
				match(TSemicolon);
				}
				break;
			case TOpenBrace:
				{
				setState(639);
				match(TOpenBrace);
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ISSL || _la==IClientAuthentication) {
					{
					{
					setState(640);
					httpTransportLayerProperties();
					}
					}
					setState(645);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(646);
				match(TCloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestTransportLayerContext extends ParserRuleContext {
		public TerminalNode KTransport() { return getToken(SoalParser.KTransport, 0); }
		public TerminalNode IREST() { return getToken(SoalParser.IREST, 0); }
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public RestTransportLayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restTransportLayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterRestTransportLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitRestTransportLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitRestTransportLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestTransportLayerContext restTransportLayer() throws RecognitionException {
		RestTransportLayerContext _localctx = new RestTransportLayerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_restTransportLayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(KTransport);
			setState(650);
			match(IREST);
			setState(654);
			switch (_input.LA(1)) {
			case TSemicolon:
				{
				setState(651);
				match(TSemicolon);
				}
				break;
			case TOpenBrace:
				{
				setState(652);
				match(TOpenBrace);
				setState(653);
				match(TCloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WebSocketTransportLayerContext extends ParserRuleContext {
		public TerminalNode KTransport() { return getToken(SoalParser.KTransport, 0); }
		public TerminalNode IWebSocket() { return getToken(SoalParser.IWebSocket, 0); }
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public WebSocketTransportLayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_webSocketTransportLayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterWebSocketTransportLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitWebSocketTransportLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitWebSocketTransportLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WebSocketTransportLayerContext webSocketTransportLayer() throws RecognitionException {
		WebSocketTransportLayerContext _localctx = new WebSocketTransportLayerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_webSocketTransportLayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(KTransport);
			setState(657);
			match(IWebSocket);
			setState(661);
			switch (_input.LA(1)) {
			case TSemicolon:
				{
				setState(658);
				match(TSemicolon);
				}
				break;
			case TOpenBrace:
				{
				setState(659);
				match(TOpenBrace);
				setState(660);
				match(TCloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpTransportLayerPropertiesContext extends ParserRuleContext {
		public HttpSslPropertyContext httpSslProperty() {
			return getRuleContext(HttpSslPropertyContext.class,0);
		}
		public HttpClientAuthenticationPropertyContext httpClientAuthenticationProperty() {
			return getRuleContext(HttpClientAuthenticationPropertyContext.class,0);
		}
		public HttpTransportLayerPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpTransportLayerProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterHttpTransportLayerProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitHttpTransportLayerProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitHttpTransportLayerProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpTransportLayerPropertiesContext httpTransportLayerProperties() throws RecognitionException {
		HttpTransportLayerPropertiesContext _localctx = new HttpTransportLayerPropertiesContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_httpTransportLayerProperties);
		try {
			setState(665);
			switch (_input.LA(1)) {
			case ISSL:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				httpSslProperty();
				}
				break;
			case IClientAuthentication:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				httpClientAuthenticationProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpSslPropertyContext extends ParserRuleContext {
		public TerminalNode ISSL() { return getToken(SoalParser.ISSL, 0); }
		public TerminalNode TAssign() { return getToken(SoalParser.TAssign, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public HttpSslPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpSslProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterHttpSslProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitHttpSslProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitHttpSslProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpSslPropertyContext httpSslProperty() throws RecognitionException {
		HttpSslPropertyContext _localctx = new HttpSslPropertyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_httpSslProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(ISSL);
			setState(668);
			match(TAssign);
			setState(669);
			booleanLiteral();
			setState(670);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpClientAuthenticationPropertyContext extends ParserRuleContext {
		public TerminalNode IClientAuthentication() { return getToken(SoalParser.IClientAuthentication, 0); }
		public TerminalNode TAssign() { return getToken(SoalParser.TAssign, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public HttpClientAuthenticationPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpClientAuthenticationProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterHttpClientAuthenticationProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitHttpClientAuthenticationProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitHttpClientAuthenticationProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpClientAuthenticationPropertyContext httpClientAuthenticationProperty() throws RecognitionException {
		HttpClientAuthenticationPropertyContext _localctx = new HttpClientAuthenticationPropertyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_httpClientAuthenticationProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(IClientAuthentication);
			setState(673);
			match(TAssign);
			setState(674);
			booleanLiteral();
			setState(675);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EncodingLayerContext extends ParserRuleContext {
		public SoapEncodingLayerContext soapEncodingLayer() {
			return getRuleContext(SoapEncodingLayerContext.class,0);
		}
		public XmlEncodingLayerContext xmlEncodingLayer() {
			return getRuleContext(XmlEncodingLayerContext.class,0);
		}
		public JsonEncodingLayerContext jsonEncodingLayer() {
			return getRuleContext(JsonEncodingLayerContext.class,0);
		}
		public EncodingLayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encodingLayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterEncodingLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitEncodingLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitEncodingLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncodingLayerContext encodingLayer() throws RecognitionException {
		EncodingLayerContext _localctx = new EncodingLayerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_encodingLayer);
		try {
			setState(680);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				soapEncodingLayer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				xmlEncodingLayer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
				jsonEncodingLayer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SoapEncodingLayerContext extends ParserRuleContext {
		public TerminalNode KEncoding() { return getToken(SoalParser.KEncoding, 0); }
		public TerminalNode ISOAP() { return getToken(SoalParser.ISOAP, 0); }
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public List<SoapEncodingPropertiesContext> soapEncodingProperties() {
			return getRuleContexts(SoapEncodingPropertiesContext.class);
		}
		public SoapEncodingPropertiesContext soapEncodingProperties(int i) {
			return getRuleContext(SoapEncodingPropertiesContext.class,i);
		}
		public SoapEncodingLayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soapEncodingLayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterSoapEncodingLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitSoapEncodingLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitSoapEncodingLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoapEncodingLayerContext soapEncodingLayer() throws RecognitionException {
		SoapEncodingLayerContext _localctx = new SoapEncodingLayerContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_soapEncodingLayer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(KEncoding);
			setState(683);
			match(ISOAP);
			setState(693);
			switch (_input.LA(1)) {
			case TSemicolon:
				{
				setState(684);
				match(TSemicolon);
				}
				break;
			case TOpenBrace:
				{
				setState(685);
				match(TOpenBrace);
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (IVersion - 91)) | (1L << (IStyle - 91)) | (1L << (IMTOM - 91)))) != 0)) {
					{
					{
					setState(686);
					soapEncodingProperties();
					}
					}
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(692);
				match(TCloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XmlEncodingLayerContext extends ParserRuleContext {
		public TerminalNode KEncoding() { return getToken(SoalParser.KEncoding, 0); }
		public TerminalNode IXML() { return getToken(SoalParser.IXML, 0); }
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public XmlEncodingLayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlEncodingLayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterXmlEncodingLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitXmlEncodingLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitXmlEncodingLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlEncodingLayerContext xmlEncodingLayer() throws RecognitionException {
		XmlEncodingLayerContext _localctx = new XmlEncodingLayerContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_xmlEncodingLayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(KEncoding);
			setState(696);
			match(IXML);
			setState(700);
			switch (_input.LA(1)) {
			case TSemicolon:
				{
				setState(697);
				match(TSemicolon);
				}
				break;
			case TOpenBrace:
				{
				setState(698);
				match(TOpenBrace);
				setState(699);
				match(TCloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonEncodingLayerContext extends ParserRuleContext {
		public TerminalNode KEncoding() { return getToken(SoalParser.KEncoding, 0); }
		public TerminalNode IJSON() { return getToken(SoalParser.IJSON, 0); }
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public JsonEncodingLayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonEncodingLayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterJsonEncodingLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitJsonEncodingLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitJsonEncodingLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonEncodingLayerContext jsonEncodingLayer() throws RecognitionException {
		JsonEncodingLayerContext _localctx = new JsonEncodingLayerContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_jsonEncodingLayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(KEncoding);
			setState(703);
			match(IJSON);
			setState(707);
			switch (_input.LA(1)) {
			case TSemicolon:
				{
				setState(704);
				match(TSemicolon);
				}
				break;
			case TOpenBrace:
				{
				setState(705);
				match(TOpenBrace);
				setState(706);
				match(TCloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SoapEncodingPropertiesContext extends ParserRuleContext {
		public SoapVersionPropertyContext soapVersionProperty() {
			return getRuleContext(SoapVersionPropertyContext.class,0);
		}
		public SoapMtomPropertyContext soapMtomProperty() {
			return getRuleContext(SoapMtomPropertyContext.class,0);
		}
		public SoapStylePropertyContext soapStyleProperty() {
			return getRuleContext(SoapStylePropertyContext.class,0);
		}
		public SoapEncodingPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soapEncodingProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterSoapEncodingProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitSoapEncodingProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitSoapEncodingProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoapEncodingPropertiesContext soapEncodingProperties() throws RecognitionException {
		SoapEncodingPropertiesContext _localctx = new SoapEncodingPropertiesContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_soapEncodingProperties);
		try {
			setState(712);
			switch (_input.LA(1)) {
			case IVersion:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				soapVersionProperty();
				}
				break;
			case IMTOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				soapMtomProperty();
				}
				break;
			case IStyle:
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				soapStyleProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SoapVersionPropertyContext extends ParserRuleContext {
		public TerminalNode IVersion() { return getToken(SoalParser.IVersion, 0); }
		public TerminalNode TAssign() { return getToken(SoalParser.TAssign, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public SoapVersionPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soapVersionProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterSoapVersionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitSoapVersionProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitSoapVersionProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoapVersionPropertyContext soapVersionProperty() throws RecognitionException {
		SoapVersionPropertyContext _localctx = new SoapVersionPropertyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_soapVersionProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(IVersion);
			setState(715);
			match(TAssign);
			setState(716);
			identifier();
			setState(717);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SoapMtomPropertyContext extends ParserRuleContext {
		public TerminalNode IMTOM() { return getToken(SoalParser.IMTOM, 0); }
		public TerminalNode TAssign() { return getToken(SoalParser.TAssign, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public SoapMtomPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soapMtomProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterSoapMtomProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitSoapMtomProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitSoapMtomProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoapMtomPropertyContext soapMtomProperty() throws RecognitionException {
		SoapMtomPropertyContext _localctx = new SoapMtomPropertyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_soapMtomProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(IMTOM);
			setState(720);
			match(TAssign);
			setState(721);
			booleanLiteral();
			setState(722);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SoapStylePropertyContext extends ParserRuleContext {
		public TerminalNode IStyle() { return getToken(SoalParser.IStyle, 0); }
		public TerminalNode TAssign() { return getToken(SoalParser.TAssign, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public SoapStylePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soapStyleProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterSoapStyleProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitSoapStyleProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitSoapStyleProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoapStylePropertyContext soapStyleProperty() throws RecognitionException {
		SoapStylePropertyContext _localctx = new SoapStylePropertyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_soapStyleProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(IStyle);
			setState(725);
			match(TAssign);
			setState(726);
			identifier();
			setState(727);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolLayerContext extends ParserRuleContext {
		public TerminalNode KProtocol() { return getToken(SoalParser.KProtocol, 0); }
		public ProtocolLayerKindContext protocolLayerKind() {
			return getRuleContext(ProtocolLayerKindContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public ProtocolLayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolLayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterProtocolLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitProtocolLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitProtocolLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolLayerContext protocolLayer() throws RecognitionException {
		ProtocolLayerContext _localctx = new ProtocolLayerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_protocolLayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(KProtocol);
			setState(730);
			protocolLayerKind();
			setState(731);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolLayerKindContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProtocolLayerKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolLayerKind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterProtocolLayerKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitProtocolLayerKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitProtocolLayerKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolLayerKindContext protocolLayerKind() throws RecognitionException {
		ProtocolLayerKindContext _localctx = new ProtocolLayerKindContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_protocolLayerKind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndpointDeclarationContext extends ParserRuleContext {
		public TerminalNode KEndpoint() { return getToken(SoalParser.KEndpoint, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TColon() { return getToken(SoalParser.TColon, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(SoalParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(SoalParser.TCloseBrace, 0); }
		public EndpointPropertiesContext endpointProperties() {
			return getRuleContext(EndpointPropertiesContext.class,0);
		}
		public EndpointDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endpointDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterEndpointDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitEndpointDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitEndpointDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndpointDeclarationContext endpointDeclaration() throws RecognitionException {
		EndpointDeclarationContext _localctx = new EndpointDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_endpointDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(KEndpoint);
			setState(736);
			identifier();
			setState(737);
			match(TColon);
			setState(738);
			qualifiedName();
			setState(739);
			match(TOpenBrace);
			setState(741);
			_la = _input.LA(1);
			if (_la==KBinding || _la==KAddress) {
				{
				setState(740);
				endpointProperties();
				}
			}

			setState(743);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndpointPropertiesContext extends ParserRuleContext {
		public List<EndpointPropertyContext> endpointProperty() {
			return getRuleContexts(EndpointPropertyContext.class);
		}
		public EndpointPropertyContext endpointProperty(int i) {
			return getRuleContext(EndpointPropertyContext.class,i);
		}
		public EndpointPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endpointProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterEndpointProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitEndpointProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitEndpointProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndpointPropertiesContext endpointProperties() throws RecognitionException {
		EndpointPropertiesContext _localctx = new EndpointPropertiesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_endpointProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(745);
				endpointProperty();
				}
				}
				setState(748); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KBinding || _la==KAddress );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndpointPropertyContext extends ParserRuleContext {
		public EndpointBindingPropertyContext endpointBindingProperty() {
			return getRuleContext(EndpointBindingPropertyContext.class,0);
		}
		public EndpointAddressPropertyContext endpointAddressProperty() {
			return getRuleContext(EndpointAddressPropertyContext.class,0);
		}
		public EndpointPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endpointProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterEndpointProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitEndpointProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitEndpointProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndpointPropertyContext endpointProperty() throws RecognitionException {
		EndpointPropertyContext _localctx = new EndpointPropertyContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_endpointProperty);
		try {
			setState(752);
			switch (_input.LA(1)) {
			case KBinding:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				endpointBindingProperty();
				}
				break;
			case KAddress:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				endpointAddressProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndpointBindingPropertyContext extends ParserRuleContext {
		public TerminalNode KBinding() { return getToken(SoalParser.KBinding, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public EndpointBindingPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endpointBindingProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterEndpointBindingProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitEndpointBindingProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitEndpointBindingProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndpointBindingPropertyContext endpointBindingProperty() throws RecognitionException {
		EndpointBindingPropertyContext _localctx = new EndpointBindingPropertyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_endpointBindingProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(KBinding);
			setState(755);
			qualifiedName();
			setState(756);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndpointAddressPropertyContext extends ParserRuleContext {
		public TerminalNode KAddress() { return getToken(SoalParser.KAddress, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(SoalParser.TSemicolon, 0); }
		public EndpointAddressPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endpointAddressProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterEndpointAddressProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitEndpointAddressProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitEndpointAddressProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndpointAddressPropertyContext endpointAddressProperty() throws RecognitionException {
		EndpointAddressPropertyContext _localctx = new EndpointAddressPropertyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_endpointAddressProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(KAddress);
			setState(759);
			stringLiteral();
			setState(760);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public VoidTypeContext voidType() {
			return getRuleContext(VoidTypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_returnType);
		try {
			setState(764);
			switch (_input.LA(1)) {
			case KObject:
			case KString:
			case KInt:
			case KLong:
			case KFloat:
			case KDouble:
			case KByte:
			case KBool:
			case IDate:
			case ITime:
			case IDateTime:
			case ITimeSpan:
			case IVersion:
			case IStyle:
			case IMTOM:
			case ISSL:
			case IHTTP:
			case IREST:
			case IWebSocket:
			case ISOAP:
			case IXML:
			case IJSON:
			case IClientAuthentication:
			case IdentifierNormal:
			case IdentifierVerbatim:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				typeReference();
				}
				break;
			case KVoid:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				voidType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeReferenceContext extends ParserRuleContext {
		public NonNullableArrayTypeContext nonNullableArrayType() {
			return getRuleContext(NonNullableArrayTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public NulledTypeContext nulledType() {
			return getRuleContext(NulledTypeContext.class,0);
		}
		public TypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitTypeReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitTypeReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_typeReference);
		try {
			setState(770);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				nonNullableArrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				simpleType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(769);
				nulledType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_simpleType);
		try {
			setState(775);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				valueType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				objectType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				qualifiedName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NulledTypeContext extends ParserRuleContext {
		public NullableTypeContext nullableType() {
			return getRuleContext(NullableTypeContext.class,0);
		}
		public NonNullableTypeContext nonNullableType() {
			return getRuleContext(NonNullableTypeContext.class,0);
		}
		public NulledTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nulledType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterNulledType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitNulledType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitNulledType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NulledTypeContext nulledType() throws RecognitionException {
		NulledTypeContext _localctx = new NulledTypeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_nulledType);
		try {
			setState(779);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				nullableType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				nonNullableType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_referenceType);
		try {
			setState(783);
			switch (_input.LA(1)) {
			case KObject:
			case KString:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				objectType();
				}
				break;
			case IDate:
			case ITime:
			case IDateTime:
			case ITimeSpan:
			case IVersion:
			case IStyle:
			case IMTOM:
			case ISSL:
			case IHTTP:
			case IREST:
			case IWebSocket:
			case ISOAP:
			case IXML:
			case IJSON:
			case IClientAuthentication:
			case IdentifierNormal:
			case IdentifierVerbatim:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				qualifiedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode KObject() { return getToken(SoalParser.KObject, 0); }
		public TerminalNode KString() { return getToken(SoalParser.KString, 0); }
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			_la = _input.LA(1);
			if ( !(_la==KObject || _la==KString) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueTypeContext extends ParserRuleContext {
		public TerminalNode KInt() { return getToken(SoalParser.KInt, 0); }
		public TerminalNode KLong() { return getToken(SoalParser.KLong, 0); }
		public TerminalNode KFloat() { return getToken(SoalParser.KFloat, 0); }
		public TerminalNode KDouble() { return getToken(SoalParser.KDouble, 0); }
		public TerminalNode KByte() { return getToken(SoalParser.KByte, 0); }
		public TerminalNode KBool() { return getToken(SoalParser.KBool, 0); }
		public TerminalNode IDate() { return getToken(SoalParser.IDate, 0); }
		public TerminalNode ITime() { return getToken(SoalParser.ITime, 0); }
		public TerminalNode IDateTime() { return getToken(SoalParser.IDateTime, 0); }
		public TerminalNode ITimeSpan() { return getToken(SoalParser.ITimeSpan, 0); }
		public ValueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterValueType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitValueType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitValueType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueTypeContext valueType() throws RecognitionException {
		ValueTypeContext _localctx = new ValueTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_valueType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (KInt - 35)) | (1L << (KLong - 35)) | (1L << (KFloat - 35)) | (1L << (KDouble - 35)) | (1L << (KByte - 35)) | (1L << (KBool - 35)) | (1L << (IDate - 35)) | (1L << (ITime - 35)) | (1L << (IDateTime - 35)) | (1L << (ITimeSpan - 35)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidTypeContext extends ParserRuleContext {
		public TerminalNode KVoid() { return getToken(SoalParser.KVoid, 0); }
		public VoidTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidTypeContext voidType() throws RecognitionException {
		VoidTypeContext _localctx = new VoidTypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_voidType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(KVoid);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnewayTypeContext extends ParserRuleContext {
		public TerminalNode KOneway() { return getToken(SoalParser.KOneway, 0); }
		public OnewayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onewayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterOnewayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitOnewayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitOnewayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnewayTypeContext onewayType() throws RecognitionException {
		OnewayTypeContext _localctx = new OnewayTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_onewayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(KOneway);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullableTypeContext extends ParserRuleContext {
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public TerminalNode TQuestion() { return getToken(SoalParser.TQuestion, 0); }
		public NullableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterNullableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitNullableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitNullableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullableTypeContext nullableType() throws RecognitionException {
		NullableTypeContext _localctx = new NullableTypeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_nullableType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			valueType();
			setState(794);
			match(TQuestion);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonNullableTypeContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode TExclamation() { return getToken(SoalParser.TExclamation, 0); }
		public NonNullableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonNullableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterNonNullableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitNonNullableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitNonNullableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonNullableTypeContext nonNullableType() throws RecognitionException {
		NonNullableTypeContext _localctx = new NonNullableTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_nonNullableType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			referenceType();
			setState(797);
			match(TExclamation);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonNullableArrayTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode TExclamation() { return getToken(SoalParser.TExclamation, 0); }
		public NonNullableArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonNullableArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterNonNullableArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitNonNullableArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitNonNullableArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonNullableArrayTypeContext nonNullableArrayType() throws RecognitionException {
		NonNullableArrayTypeContext _localctx = new NonNullableArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_nonNullableArrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			arrayType();
			setState(800);
			match(TExclamation);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public SimpleArrayTypeContext simpleArrayType() {
			return getRuleContext(SimpleArrayTypeContext.class,0);
		}
		public NulledArrayTypeContext nulledArrayType() {
			return getRuleContext(NulledArrayTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_arrayType);
		try {
			setState(804);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				simpleArrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				nulledArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleArrayTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode TOpenBracket() { return getToken(SoalParser.TOpenBracket, 0); }
		public TerminalNode TCloseBracket() { return getToken(SoalParser.TCloseBracket, 0); }
		public SimpleArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterSimpleArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitSimpleArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitSimpleArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleArrayTypeContext simpleArrayType() throws RecognitionException {
		SimpleArrayTypeContext _localctx = new SimpleArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_simpleArrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			simpleType();
			setState(807);
			match(TOpenBracket);
			setState(808);
			match(TCloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NulledArrayTypeContext extends ParserRuleContext {
		public NulledTypeContext nulledType() {
			return getRuleContext(NulledTypeContext.class,0);
		}
		public TerminalNode TOpenBracket() { return getToken(SoalParser.TOpenBracket, 0); }
		public TerminalNode TCloseBracket() { return getToken(SoalParser.TCloseBracket, 0); }
		public NulledArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nulledArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterNulledArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitNulledArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitNulledArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NulledArrayTypeContext nulledArrayType() throws RecognitionException {
		NulledArrayTypeContext _localctx = new NulledArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_nulledArrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			nulledType();
			setState(811);
			match(TOpenBracket);
			setState(812);
			match(TCloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantValueContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterConstantValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitConstantValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitConstantValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantValueContext constantValue() throws RecognitionException {
		ConstantValueContext _localctx = new ConstantValueContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_constantValue);
		try {
			setState(816);
			switch (_input.LA(1)) {
			case KNull:
			case KTrue:
			case KFalse:
			case IntegerLiteral:
			case DecimalLiteral:
			case ScientificLiteral:
			case RegularStringLiteral:
			case DoubleQuoteVerbatimStringLiteral:
			case SingleQuoteVerbatimStringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				literal();
				}
				break;
			case IDate:
			case ITime:
			case IDateTime:
			case ITimeSpan:
			case IVersion:
			case IStyle:
			case IMTOM:
			case ISSL:
			case IHTTP:
			case IREST:
			case IWebSocket:
			case ISOAP:
			case IXML:
			case IJSON:
			case IClientAuthentication:
			case IdentifierNormal:
			case IdentifierVerbatim:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeofValueContext extends ParserRuleContext {
		public TerminalNode KTypeof() { return getToken(SoalParser.KTypeof, 0); }
		public TerminalNode TOpenParen() { return getToken(SoalParser.TOpenParen, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode TCloseParen() { return getToken(SoalParser.TCloseParen, 0); }
		public TypeofValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeofValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterTypeofValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitTypeofValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitTypeofValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeofValueContext typeofValue() throws RecognitionException {
		TypeofValueContext _localctx = new TypeofValueContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_typeofValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(KTypeof);
			setState(819);
			match(TOpenParen);
			setState(820);
			returnType();
			setState(821);
			match(TCloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IdentifierNormal() { return getToken(SoalParser.IdentifierNormal, 0); }
		public TerminalNode IdentifierVerbatim() { return getToken(SoalParser.IdentifierVerbatim, 0); }
		public ContextualKeywordsContext contextualKeywords() {
			return getRuleContext(ContextualKeywordsContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_identifier);
		try {
			setState(826);
			switch (_input.LA(1)) {
			case IdentifierNormal:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				match(IdentifierNormal);
				}
				break;
			case IdentifierVerbatim:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				match(IdentifierVerbatim);
				}
				break;
			case IDate:
			case ITime:
			case IDateTime:
			case ITimeSpan:
			case IVersion:
			case IStyle:
			case IMTOM:
			case ISSL:
			case IHTTP:
			case IREST:
			case IWebSocket:
			case ISOAP:
			case IXML:
			case IJSON:
			case IClientAuthentication:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				contextualKeywords();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public ScientificLiteralContext scientificLiteral() {
			return getRuleContext(ScientificLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_literal);
		try {
			setState(834);
			switch (_input.LA(1)) {
			case KNull:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				nullLiteral();
				}
				break;
			case KTrue:
			case KFalse:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				booleanLiteral();
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(830);
				integerLiteral();
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(831);
				decimalLiteral();
				}
				break;
			case ScientificLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(832);
				scientificLiteral();
				}
				break;
			case RegularStringLiteral:
			case DoubleQuoteVerbatimStringLiteral:
			case SingleQuoteVerbatimStringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(833);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullLiteralContext extends ParserRuleContext {
		public TerminalNode KNull() { return getToken(SoalParser.KNull, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(KNull);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode KTrue() { return getToken(SoalParser.KTrue, 0); }
		public TerminalNode KFalse() { return getToken(SoalParser.KFalse, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_la = _input.LA(1);
			if ( !(_la==KTrue || _la==KFalse) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(SoalParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(SoalParser.DecimalLiteral, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(DecimalLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScientificLiteralContext extends ParserRuleContext {
		public TerminalNode ScientificLiteral() { return getToken(SoalParser.ScientificLiteral, 0); }
		public ScientificLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientificLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterScientificLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitScientificLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitScientificLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificLiteralContext scientificLiteral() throws RecognitionException {
		ScientificLiteralContext _localctx = new ScientificLiteralContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_scientificLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(ScientificLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode RegularStringLiteral() { return getToken(SoalParser.RegularStringLiteral, 0); }
		public TerminalNode SingleQuoteVerbatimStringLiteral() { return getToken(SoalParser.SingleQuoteVerbatimStringLiteral, 0); }
		public TerminalNode DoubleQuoteVerbatimStringLiteral() { return getToken(SoalParser.DoubleQuoteVerbatimStringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			_la = _input.LA(1);
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (RegularStringLiteral - 111)) | (1L << (DoubleQuoteVerbatimStringLiteral - 111)) | (1L << (SingleQuoteVerbatimStringLiteral - 111)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContextualKeywordsContext extends ParserRuleContext {
		public TerminalNode IDate() { return getToken(SoalParser.IDate, 0); }
		public TerminalNode ITime() { return getToken(SoalParser.ITime, 0); }
		public TerminalNode IDateTime() { return getToken(SoalParser.IDateTime, 0); }
		public TerminalNode ITimeSpan() { return getToken(SoalParser.ITimeSpan, 0); }
		public TerminalNode IVersion() { return getToken(SoalParser.IVersion, 0); }
		public TerminalNode IStyle() { return getToken(SoalParser.IStyle, 0); }
		public TerminalNode IMTOM() { return getToken(SoalParser.IMTOM, 0); }
		public TerminalNode ISSL() { return getToken(SoalParser.ISSL, 0); }
		public TerminalNode IHTTP() { return getToken(SoalParser.IHTTP, 0); }
		public TerminalNode IREST() { return getToken(SoalParser.IREST, 0); }
		public TerminalNode IWebSocket() { return getToken(SoalParser.IWebSocket, 0); }
		public TerminalNode ISOAP() { return getToken(SoalParser.ISOAP, 0); }
		public TerminalNode IXML() { return getToken(SoalParser.IXML, 0); }
		public TerminalNode IJSON() { return getToken(SoalParser.IJSON, 0); }
		public TerminalNode IClientAuthentication() { return getToken(SoalParser.IClientAuthentication, 0); }
		public ContextualKeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextualKeywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).enterContextualKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoalParserListener ) ((SoalParserListener)listener).exitContextualKeywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoalParserVisitor ) return ((SoalParserVisitor<? extends T>)visitor).visitContextualKeywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextualKeywordsContext contextualKeywords() throws RecognitionException {
		ContextualKeywordsContext _localctx = new ContextualKeywordsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_contextualKeywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IDate - 87)) | (1L << (ITime - 87)) | (1L << (IDateTime - 87)) | (1L << (ITimeSpan - 87)) | (1L << (IVersion - 87)) | (1L << (IStyle - 87)) | (1L << (IMTOM - 87)) | (1L << (ISSL - 87)) | (1L << (IHTTP - 87)) | (1L << (IREST - 87)) | (1L << (IWebSocket - 87)) | (1L << (ISOAP - 87)) | (1L << (IXML - 87)) | (1L << (IJSON - 87)) | (1L << (IClientAuthentication - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3{\u0355\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\3\2\7\2\u00d2\n\2"+
		"\f\2\16\2\u00d5\13\2\3\3\3\3\3\3\7\3\u00da\n\3\f\3\16\3\u00dd\13\3\3\4"+
		"\3\4\3\4\7\4\u00e2\n\4\f\4\16\4\u00e5\13\4\3\5\3\5\3\5\7\5\u00ea\n\5\f"+
		"\5\16\5\u00ed\13\5\3\6\6\6\u00f0\n\6\r\6\16\6\u00f1\3\7\6\7\u00f5\n\7"+
		"\r\7\16\7\u00f6\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u0105"+
		"\n\n\3\13\3\13\5\13\u0109\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u0110\n\f\f\f"+
		"\16\f\u0113\13\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u011b\n\16\3\17\5\17\u011e"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0126\n\17\3\17\3\17\3\17\7\17"+
		"\u012b\n\17\f\17\16\17\u012e\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u013c\n\20\3\21\5\21\u013f\n\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0145\n\21\3\21\3\21\5\21\u0149\n\21\3\21\3\21\3\22"+
		"\3\22\3\22\7\22\u0150\n\22\f\22\16\22\u0153\13\22\3\22\5\22\u0156\n\22"+
		"\3\23\5\23\u0159\n\23\3\23\3\23\3\24\5\24\u015e\n\24\3\24\3\24\3\24\3"+
		"\24\5\24\u0164\n\24\3\24\3\24\7\24\u0168\n\24\f\24\16\24\u016b\13\24\3"+
		"\24\3\24\3\25\5\25\u0170\n\25\3\25\3\25\3\25\3\25\3\26\5\26\u0177\n\26"+
		"\3\26\3\26\3\26\3\26\7\26\u017d\n\26\f\26\16\26\u0180\13\26\3\26\7\26"+
		"\u0183\n\26\f\26\16\26\u0186\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30"+
		"\5\30\u018f\n\30\3\30\3\30\3\30\3\30\7\30\u0195\n\30\f\30\16\30\u0198"+
		"\13\30\3\30\3\30\3\31\5\31\u019d\n\31\3\31\3\31\3\31\3\31\5\31\u01a3\n"+
		"\31\3\31\3\31\3\31\5\31\u01a8\n\31\3\31\3\31\3\32\3\32\3\32\7\32\u01af"+
		"\n\32\f\32\16\32\u01b2\13\32\3\33\5\33\u01b5\n\33\3\33\3\33\3\33\3\34"+
		"\5\34\u01bb\n\34\3\34\3\34\5\34\u01bf\n\34\3\35\5\35\u01c2\n\35\3\35\3"+
		"\35\3\35\3\35\5\35\u01c8\n\35\3\35\3\35\5\35\u01cc\n\35\3\35\3\35\3\36"+
		"\6\36\u01d1\n\36\r\36\16\36\u01d2\3\37\3\37\3\37\3\37\3\37\5\37\u01da"+
		"\n\37\3 \3 \3 \5 \u01df\n \3 \3 \3!\3!\3!\5!\u01e6\n!\3!\3!\3\"\3\"\3"+
		"\"\7\"\u01ed\n\"\f\"\16\"\u01f0\13\"\3\"\5\"\u01f3\n\"\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u0209\n\'\3\'\3"+
		"\'\5\'\u020d\n\'\3\'\3\'\3(\3(\3(\3(\5(\u0215\n(\3(\3(\5(\u0219\n(\3("+
		"\3(\3)\6)\u021e\n)\r)\16)\u021f\3*\3*\3*\3*\3*\3*\3*\5*\u0229\n*\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\5/\u023d\n/\3/\3/\3"+
		"\60\6\60\u0242\n\60\r\60\16\60\u0243\3\61\3\61\5\61\u0248\n\61\3\62\3"+
		"\62\3\62\3\62\3\62\7\62\u024f\n\62\f\62\16\62\u0252\13\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\5\64\u025c\n\64\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u026a\n\67\3\67\3\67\38\38\6"+
		"8\u0270\n8\r8\168\u0271\38\78\u0275\n8\f8\168\u0278\138\39\39\39\59\u027d"+
		"\n9\3:\3:\3:\3:\3:\7:\u0284\n:\f:\16:\u0287\13:\3:\5:\u028a\n:\3;\3;\3"+
		";\3;\3;\5;\u0291\n;\3<\3<\3<\3<\3<\5<\u0298\n<\3=\3=\5=\u029c\n=\3>\3"+
		">\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\5@\u02ab\n@\3A\3A\3A\3A\3A\7A\u02b2"+
		"\nA\fA\16A\u02b5\13A\3A\5A\u02b8\nA\3B\3B\3B\3B\3B\5B\u02bf\nB\3C\3C\3"+
		"C\3C\3C\5C\u02c6\nC\3D\3D\3D\5D\u02cb\nD\3E\3E\3E\3E\3E\3F\3F\3F\3F\3"+
		"F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3J\3J\3J\3J\3J\3J\5J\u02e8\nJ\3J\3"+
		"J\3K\6K\u02ed\nK\rK\16K\u02ee\3L\3L\5L\u02f3\nL\3M\3M\3M\3M\3N\3N\3N\3"+
		"N\3O\3O\5O\u02ff\nO\3P\3P\3P\3P\5P\u0305\nP\3Q\3Q\3Q\5Q\u030a\nQ\3R\3"+
		"R\5R\u030e\nR\3S\3S\5S\u0312\nS\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3X\3Y\3"+
		"Y\3Y\3Z\3Z\3Z\3[\3[\5[\u0327\n[\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3^\3^\5^\u0333"+
		"\n^\3_\3_\3_\3_\3_\3`\3`\3`\5`\u033d\n`\3a\3a\3a\3a\3a\3a\5a\u0345\na"+
		"\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3h\2\2i\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\2\7\3\2#$\4\2%*Y\\\3\2!\"\4\2qqyz\3\2Y"+
		"g\u035b\2\u00d3\3\2\2\2\4\u00d6\3\2\2\2\6\u00de\3\2\2\2\b\u00e6\3\2\2"+
		"\2\n\u00ef\3\2\2\2\f\u00f4\3\2\2\2\16\u00f8\3\2\2\2\20\u00fc\3\2\2\2\22"+
		"\u0102\3\2\2\2\24\u0106\3\2\2\2\26\u010c\3\2\2\2\30\u0114\3\2\2\2\32\u011a"+
		"\3\2\2\2\34\u011d\3\2\2\2\36\u013b\3\2\2\2 \u013e\3\2\2\2\"\u014c\3\2"+
		"\2\2$\u0158\3\2\2\2&\u015d\3\2\2\2(\u016f\3\2\2\2*\u0176\3\2\2\2,\u0189"+
		"\3\2\2\2.\u018e\3\2\2\2\60\u019c\3\2\2\2\62\u01ab\3\2\2\2\64\u01b4\3\2"+
		"\2\2\66\u01ba\3\2\2\28\u01c1\3\2\2\2:\u01d0\3\2\2\2<\u01d9\3\2\2\2>\u01db"+
		"\3\2\2\2@\u01e2\3\2\2\2B\u01f2\3\2\2\2D\u01f4\3\2\2\2F\u01f8\3\2\2\2H"+
		"\u01fc\3\2\2\2J\u0200\3\2\2\2L\u0204\3\2\2\2N\u0210\3\2\2\2P\u021d\3\2"+
		"\2\2R\u0228\3\2\2\2T\u022a\3\2\2\2V\u022e\3\2\2\2X\u0234\3\2\2\2Z\u0236"+
		"\3\2\2\2\\\u0238\3\2\2\2^\u0241\3\2\2\2`\u0247\3\2\2\2b\u0249\3\2\2\2"+
		"d\u0255\3\2\2\2f\u025b\3\2\2\2h\u025d\3\2\2\2j\u0261\3\2\2\2l\u0265\3"+
		"\2\2\2n\u026d\3\2\2\2p\u027c\3\2\2\2r\u027e\3\2\2\2t\u028b\3\2\2\2v\u0292"+
		"\3\2\2\2x\u029b\3\2\2\2z\u029d\3\2\2\2|\u02a2\3\2\2\2~\u02aa\3\2\2\2\u0080"+
		"\u02ac\3\2\2\2\u0082\u02b9\3\2\2\2\u0084\u02c0\3\2\2\2\u0086\u02ca\3\2"+
		"\2\2\u0088\u02cc\3\2\2\2\u008a\u02d1\3\2\2\2\u008c\u02d6\3\2\2\2\u008e"+
		"\u02db\3\2\2\2\u0090\u02df\3\2\2\2\u0092\u02e1\3\2\2\2\u0094\u02ec\3\2"+
		"\2\2\u0096\u02f2\3\2\2\2\u0098\u02f4\3\2\2\2\u009a\u02f8\3\2\2\2\u009c"+
		"\u02fe\3\2\2\2\u009e\u0304\3\2\2\2\u00a0\u0309\3\2\2\2\u00a2\u030d\3\2"+
		"\2\2\u00a4\u0311\3\2\2\2\u00a6\u0313\3\2\2\2\u00a8\u0315\3\2\2\2\u00aa"+
		"\u0317\3\2\2\2\u00ac\u0319\3\2\2\2\u00ae\u031b\3\2\2\2\u00b0\u031e\3\2"+
		"\2\2\u00b2\u0321\3\2\2\2\u00b4\u0326\3\2\2\2\u00b6\u0328\3\2\2\2\u00b8"+
		"\u032c\3\2\2\2\u00ba\u0332\3\2\2\2\u00bc\u0334\3\2\2\2\u00be\u033c\3\2"+
		"\2\2\u00c0\u0344\3\2\2\2\u00c2\u0346\3\2\2\2\u00c4\u0348\3\2\2\2\u00c6"+
		"\u034a\3\2\2\2\u00c8\u034c\3\2\2\2\u00ca\u034e\3\2\2\2\u00cc\u0350\3\2"+
		"\2\2\u00ce\u0352\3\2\2\2\u00d0\u00d2\5\34\17\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\3\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d6\u00db\5\u00be`\2\u00d7\u00d8\7\60\2\2\u00d8"+
		"\u00da\5\u00be`\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\5\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00e3\5\u00be`\2\u00df\u00e0\7\61\2\2\u00e0\u00e2\5\u00be`\2\u00e1\u00df"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00eb\5\4\3\2\u00e7\u00e8\7\61\2"+
		"\2\u00e8\u00ea\5\4\3\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\t\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f0\5\16\b\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\13\3\2\2\2\u00f3\u00f5\5\20\t\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\r\3\2\2\2\u00f8\u00f9\7\65\2\2\u00f9\u00fa\5\22\n\2\u00fa\u00fb"+
		"\7\66\2\2\u00fb\17\3\2\2\2\u00fc\u00fd\7\65\2\2\u00fd\u00fe\7\n\2\2\u00fe"+
		"\u00ff\7/\2\2\u00ff\u0100\5\22\n\2\u0100\u0101\7\66\2\2\u0101\21\3\2\2"+
		"\2\u0102\u0104\5\u00be`\2\u0103\u0105\5\24\13\2\u0104\u0103\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\23\3\2\2\2\u0106\u0108\7\63\2\2\u0107\u0109\5\26"+
		"\f\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\7\64\2\2\u010b\25\3\2\2\2\u010c\u0111\5\30\r\2\u010d\u010e\7\61"+
		"\2\2\u010e\u0110\5\30\r\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\27\3\2\2\2\u0113\u0111\3\2\2"+
		"\2\u0114\u0115\5\u00be`\2\u0115\u0116\7\62\2\2\u0116\u0117\5\32\16\2\u0117"+
		"\31\3\2\2\2\u0118\u011b\5\u00ba^\2\u0119\u011b\5\u00bc_\2\u011a\u0118"+
		"\3\2\2\2\u011a\u0119\3\2\2\2\u011b\33\3\2\2\2\u011c\u011e\5\n\6\2\u011d"+
		"\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\3"+
		"\2\2\u0120\u0121\5\4\3\2\u0121\u0125\7\62\2\2\u0122\u0123\5\u00be`\2\u0123"+
		"\u0124\7/\2\2\u0124\u0126\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0128\5\u00ccg\2\u0128\u012c\7\67\2\2\u0129"+
		"\u012b\5\36\20\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3"+
		"\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0130\78\2\2\u0130\35\3\2\2\2\u0131\u013c\5 \21\2\u0132\u013c\5&\24\2"+
		"\u0133\u013c\5*\26\2\u0134\u013c\5.\30\2\u0135\u013c\58\35\2\u0136\u013c"+
		"\5L\'\2\u0137\u013c\5N(\2\u0138\u013c\5l\67\2\u0139\u013c\5\u0092J\2\u013a"+
		"\u013c\5\\/\2\u013b\u0131\3\2\2\2\u013b\u0132\3\2\2\2\u013b\u0133\3\2"+
		"\2\2\u013b\u0134\3\2\2\2\u013b\u0135\3\2\2\2\u013b\u0136\3\2\2\2\u013b"+
		"\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2"+
		"\2\2\u013c\37\3\2\2\2\u013d\u013f\5\n\6\2\u013e\u013d\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\4\2\2\u0141\u0144\5\u00be`"+
		"\2\u0142\u0143\7/\2\2\u0143\u0145\5\4\3\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\7\67\2\2\u0147\u0149\5\"\22\2"+
		"\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b"+
		"\78\2\2\u014b!\3\2\2\2\u014c\u0151\5$\23\2\u014d\u014e\7\61\2\2\u014e"+
		"\u0150\5$\23\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0156\7\61\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156#\3\2\2\2"+
		"\u0157\u0159\5\n\6\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015b\5\u00be`\2\u015b%\3\2\2\2\u015c\u015e\5\n\6\2\u015d"+
		"\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\6"+
		"\2\2\u0160\u0163\5\u00be`\2\u0161\u0162\7/\2\2\u0162\u0164\5\4\3\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0169\7\67"+
		"\2\2\u0166\u0168\5(\25\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016c\u016d\78\2\2\u016d\'\3\2\2\2\u016e\u0170\5\n\6\2\u016f\u016e"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\5\u009eP"+
		"\2\u0172\u0173\5\u00be`\2\u0173\u0174\7.\2\2\u0174)\3\2\2\2\u0175\u0177"+
		"\5\n\6\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\7\21\2\2\u0179\u017a\5\u00be`\2\u017a\u017e\7\67\2\2\u017b\u017d"+
		"\5,\27\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0184\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183\5\60"+
		"\31\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\78"+
		"\2\2\u0188+\3\2\2\2\u0189\u018a\7\22\2\2\u018a\u018b\5\4\3\2\u018b\u018c"+
		"\7.\2\2\u018c-\3\2\2\2\u018d\u018f\5\n\6\2\u018e\u018d\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\7\7\2\2\u0191\u0192\5\u00be`"+
		"\2\u0192\u0196\7\67\2\2\u0193\u0195\5\60\31\2\u0194\u0193\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0199\u019a\78\2\2\u019a/\3\2\2\2\u019b\u019d"+
		"\5\n\6\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\5\66\34\2\u019f\u01a0\5\u00be`\2\u01a0\u01a2\7\63\2\2\u01a1\u01a3"+
		"\5\62\32\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2"+
		"\u01a4\u01a7\7\64\2\2\u01a5\u01a6\7\b\2\2\u01a6\u01a8\5\b\5\2\u01a7\u01a5"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7.\2\2\u01aa"+
		"\61\3\2\2\2\u01ab\u01b0\5\64\33\2\u01ac\u01ad\7\61\2\2\u01ad\u01af\5\64"+
		"\33\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\63\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b5\5\n\6"+
		"\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7"+
		"\5\u009eP\2\u01b7\u01b8\5\u00be`\2\u01b8\65\3\2\2\2\u01b9\u01bb\5\f\7"+
		"\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01bf"+
		"\5\u009cO\2\u01bd\u01bf\5\u00acW\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2"+
		"\2\2\u01bf\67\3\2\2\2\u01c0\u01c2\7\23\2\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\7\24\2\2\u01c4\u01c7\5\u00be"+
		"`\2\u01c5\u01c6\7/\2\2\u01c6\u01c8\5\4\3\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\7\67\2\2\u01ca\u01cc\5:\36\2"+
		"\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce"+
		"\78\2\2\u01ce9\3\2\2\2\u01cf\u01d1\5<\37\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2"+
		"\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3;\3\2\2\2\u01d4"+
		"\u01da\5> \2\u01d5\u01da\5@!\2\u01d6\u01da\5F$\2\u01d7\u01da\5H%\2\u01d8"+
		"\u01da\5J&\2\u01d9\u01d4\3\2\2\2\u01d9\u01d5\3\2\2\2\u01d9\u01d6\3\2\2"+
		"\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da=\3\2\2\2\u01db\u01dc"+
		"\7\27\2\2\u01dc\u01de\5\4\3\2\u01dd\u01df\5\u00be`\2\u01de\u01dd\3\2\2"+
		"\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\5B\"\2\u01e1?\3"+
		"\2\2\2\u01e2\u01e3\7\26\2\2\u01e3\u01e5\5\4\3\2\u01e4\u01e6\5\u00be`\2"+
		"\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8"+
		"\5B\"\2\u01e8A\3\2\2\2\u01e9\u01f3\7.\2\2\u01ea\u01ee\7\67\2\2\u01eb\u01ed"+
		"\5D#\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3\78"+
		"\2\2\u01f2\u01e9\3\2\2\2\u01f2\u01ea\3\2\2\2\u01f3C\3\2\2\2\u01f4\u01f5"+
		"\7\13\2\2\u01f5\u01f6\5\4\3\2\u01f6\u01f7\7.\2\2\u01f7E\3\2\2\2\u01f8"+
		"\u01f9\5\u009eP\2\u01f9\u01fa\5\u00be`\2\u01fa\u01fb\7.\2\2\u01fbG\3\2"+
		"\2\2\u01fc\u01fd\7\32\2\2\u01fd\u01fe\5\u00be`\2\u01fe\u01ff\7.\2\2\u01ff"+
		"I\3\2\2\2\u0200\u0201\7\33\2\2\u0201\u0202\5\u00be`\2\u0202\u0203\7.\2"+
		"\2\u0203K\3\2\2\2\u0204\u0205\7\25\2\2\u0205\u0208\5\u00be`\2\u0206\u0207"+
		"\7/\2\2\u0207\u0209\5\4\3\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020c\7\67\2\2\u020b\u020d\5P)\2\u020c\u020b\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\78\2\2\u020f"+
		"M\3\2\2\2\u0210\u0211\7\34\2\2\u0211\u0214\5\u00be`\2\u0212\u0213\7/\2"+
		"\2\u0213\u0215\5\4\3\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216"+
		"\3\2\2\2\u0216\u0218\7\67\2\2\u0217\u0219\5P)\2\u0218\u0217\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\78\2\2\u021bO\3\2\2\2\u021c"+
		"\u021e\5R*\2\u021d\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u021d\3\2\2"+
		"\2\u021f\u0220\3\2\2\2\u0220Q\3\2\2\2\u0221\u0229\5> \2\u0222\u0229\5"+
		"@!\2\u0223\u0229\5F$\2\u0224\u0229\5H%\2\u0225\u0229\5J&\2\u0226\u0229"+
		"\5T+\2\u0227\u0229\5V,\2\u0228\u0221\3\2\2\2\u0228\u0222\3\2\2\2\u0228"+
		"\u0223\3\2\2\2\u0228\u0224\3\2\2\2\u0228\u0225\3\2\2\2\u0228\u0226\3\2"+
		"\2\2\u0228\u0227\3\2\2\2\u0229S\3\2\2\2\u022a\u022b\7\24\2\2\u022b\u022c"+
		"\5\4\3\2\u022c\u022d\7.\2\2\u022dU\3\2\2\2\u022e\u022f\7\30\2\2\u022f"+
		"\u0230\5X-\2\u0230\u0231\7\31\2\2\u0231\u0232\5Z.\2\u0232\u0233\7.\2\2"+
		"\u0233W\3\2\2\2\u0234\u0235\5\4\3\2\u0235Y\3\2\2\2\u0236\u0237\5\4\3\2"+
		"\u0237[\3\2\2\2\u0238\u0239\7\35\2\2\u0239\u023a\5\u00be`\2\u023a\u023c"+
		"\7\67\2\2\u023b\u023d\5^\60\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2"+
		"\u023d\u023e\3\2\2\2\u023e\u023f\78\2\2\u023f]\3\2\2\2\u0240\u0242\5`"+
		"\61\2\u0241\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0241\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244_\3\2\2\2\u0245\u0248\5b\62\2\u0246\u0248\5V,\2\u0247"+
		"\u0245\3\2\2\2\u0247\u0246\3\2\2\2\u0248a\3\2\2\2\u0249\u024a\7\36\2\2"+
		"\u024a\u024b\5\u00be`\2\u024b\u024c\7\67\2\2\u024c\u0250\5d\63\2\u024d"+
		"\u024f\5f\64\2\u024e\u024d\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2"+
		"\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253"+
		"\u0254\78\2\2\u0254c\3\2\2\2\u0255\u0256\7\37\2\2\u0256\u0257\5\u00be"+
		"`\2\u0257\u0258\7.\2\2\u0258e\3\2\2\2\u0259\u025c\5h\65\2\u025a\u025c"+
		"\5j\66\2\u025b\u0259\3\2\2\2\u025b\u025a\3\2\2\2\u025cg\3\2\2\2\u025d"+
		"\u025e\7\34\2\2\u025e\u025f\5\4\3\2\u025f\u0260\7.\2\2\u0260i\3\2\2\2"+
		"\u0261\u0262\7\21\2\2\u0262\u0263\5\4\3\2\u0263\u0264\7.\2\2\u0264k\3"+
		"\2\2\2\u0265\u0266\7\13\2\2\u0266\u0267\5\u00be`\2\u0267\u0269\7\67\2"+
		"\2\u0268\u026a\5n8\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b"+
		"\3\2\2\2\u026b\u026c\78\2\2\u026cm\3\2\2\2\u026d\u026f\5p9\2\u026e\u0270"+
		"\5~@\2\u026f\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0276\3\2\2\2\u0273\u0275\5\u008eH\2\u0274\u0273"+
		"\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"o\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027d\5r:\2\u027a\u027d\5t;\2\u027b"+
		"\u027d\5v<\2\u027c\u0279\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027b\3\2\2"+
		"\2\u027dq\3\2\2\2\u027e\u027f\7\f\2\2\u027f\u0289\7a\2\2\u0280\u028a\7"+
		".\2\2\u0281\u0285\7\67\2\2\u0282\u0284\5x=\2\u0283\u0282\3\2\2\2\u0284"+
		"\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2"+
		"\2\2\u0287\u0285\3\2\2\2\u0288\u028a\78\2\2\u0289\u0280\3\2\2\2\u0289"+
		"\u0281\3\2\2\2\u028as\3\2\2\2\u028b\u028c\7\f\2\2\u028c\u0290\7b\2\2\u028d"+
		"\u0291\7.\2\2\u028e\u028f\7\67\2\2\u028f\u0291\78\2\2\u0290\u028d\3\2"+
		"\2\2\u0290\u028e\3\2\2\2\u0291u\3\2\2\2\u0292\u0293\7\f\2\2\u0293\u0297"+
		"\7c\2\2\u0294\u0298\7.\2\2\u0295\u0296\7\67\2\2\u0296\u0298\78\2\2\u0297"+
		"\u0294\3\2\2\2\u0297\u0295\3\2\2\2\u0298w\3\2\2\2\u0299\u029c\5z>\2\u029a"+
		"\u029c\5|?\2\u029b\u0299\3\2\2\2\u029b\u029a\3\2\2\2\u029cy\3\2\2\2\u029d"+
		"\u029e\7`\2\2\u029e\u029f\7\62\2\2\u029f\u02a0\5\u00c4c\2\u02a0\u02a1"+
		"\7.\2\2\u02a1{\3\2\2\2\u02a2\u02a3\7g\2\2\u02a3\u02a4\7\62\2\2\u02a4\u02a5"+
		"\5\u00c4c\2\u02a5\u02a6\7.\2\2\u02a6}\3\2\2\2\u02a7\u02ab\5\u0080A\2\u02a8"+
		"\u02ab\5\u0082B\2\u02a9\u02ab\5\u0084C\2\u02aa\u02a7\3\2\2\2\u02aa\u02a8"+
		"\3\2\2\2\u02aa\u02a9\3\2\2\2\u02ab\177\3\2\2\2\u02ac\u02ad\7\r\2\2\u02ad"+
		"\u02b7\7d\2\2\u02ae\u02b8\7.\2\2\u02af\u02b3\7\67\2\2\u02b0\u02b2\5\u0086"+
		"D\2\u02b1\u02b0\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b8\78"+
		"\2\2\u02b7\u02ae\3\2\2\2\u02b7\u02af\3\2\2\2\u02b8\u0081\3\2\2\2\u02b9"+
		"\u02ba\7\r\2\2\u02ba\u02be\7e\2\2\u02bb\u02bf\7.\2\2\u02bc\u02bd\7\67"+
		"\2\2\u02bd\u02bf\78\2\2\u02be\u02bb\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf"+
		"\u0083\3\2\2\2\u02c0\u02c1\7\r\2\2\u02c1\u02c5\7f\2\2\u02c2\u02c6\7.\2"+
		"\2\u02c3\u02c4\7\67\2\2\u02c4\u02c6\78\2\2\u02c5\u02c2\3\2\2\2\u02c5\u02c3"+
		"\3\2\2\2\u02c6\u0085\3\2\2\2\u02c7\u02cb\5\u0088E\2\u02c8\u02cb\5\u008a"+
		"F\2\u02c9\u02cb\5\u008cG\2\u02ca\u02c7\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca"+
		"\u02c9\3\2\2\2\u02cb\u0087\3\2\2\2\u02cc\u02cd\7]\2\2\u02cd\u02ce\7\62"+
		"\2\2\u02ce\u02cf\5\u00be`\2\u02cf\u02d0\7.\2\2\u02d0\u0089\3\2\2\2\u02d1"+
		"\u02d2\7_\2\2\u02d2\u02d3\7\62\2\2\u02d3\u02d4\5\u00c4c\2\u02d4\u02d5"+
		"\7.\2\2\u02d5\u008b\3\2\2\2\u02d6\u02d7\7^\2\2\u02d7\u02d8\7\62\2\2\u02d8"+
		"\u02d9\5\u00be`\2\u02d9\u02da\7.\2\2\u02da\u008d\3\2\2\2\u02db\u02dc\7"+
		"\16\2\2\u02dc\u02dd\5\u0090I\2\u02dd\u02de\7.\2\2\u02de\u008f\3\2\2\2"+
		"\u02df\u02e0\5\u00be`\2\u02e0\u0091\3\2\2\2\u02e1\u02e2\7\17\2\2\u02e2"+
		"\u02e3\5\u00be`\2\u02e3\u02e4\7/\2\2\u02e4\u02e5\5\4\3\2\u02e5\u02e7\7"+
		"\67\2\2\u02e6\u02e8\5\u0094K\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2"+
		"\u02e8\u02e9\3\2\2\2\u02e9\u02ea\78\2\2\u02ea\u0093\3\2\2\2\u02eb\u02ed"+
		"\5\u0096L\2\u02ec\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ec\3\2\2"+
		"\2\u02ee\u02ef\3\2\2\2\u02ef\u0095\3\2\2\2\u02f0\u02f3\5\u0098M\2\u02f1"+
		"\u02f3\5\u009aN\2\u02f2\u02f0\3\2\2\2\u02f2\u02f1\3\2\2\2\u02f3\u0097"+
		"\3\2\2\2\u02f4\u02f5\7\13\2\2\u02f5\u02f6\5\4\3\2\u02f6\u02f7\7.\2\2\u02f7"+
		"\u0099\3\2\2\2\u02f8\u02f9\7\20\2\2\u02f9\u02fa\5\u00ccg\2\u02fa\u02fb"+
		"\7.\2\2\u02fb\u009b\3\2\2\2\u02fc\u02ff\5\u009eP\2\u02fd\u02ff\5\u00aa"+
		"V\2\u02fe\u02fc\3\2\2\2\u02fe\u02fd\3\2\2\2\u02ff\u009d\3\2\2\2\u0300"+
		"\u0305\5\u00b2Z\2\u0301\u0305\5\u00b4[\2\u0302\u0305\5\u00a0Q\2\u0303"+
		"\u0305\5\u00a2R\2\u0304\u0300\3\2\2\2\u0304\u0301\3\2\2\2\u0304\u0302"+
		"\3\2\2\2\u0304\u0303\3\2\2\2\u0305\u009f\3\2\2\2\u0306\u030a\5\u00a8U"+
		"\2\u0307\u030a\5\u00a6T\2\u0308\u030a\5\4\3\2\u0309\u0306\3\2\2\2\u0309"+
		"\u0307\3\2\2\2\u0309\u0308\3\2\2\2\u030a\u00a1\3\2\2\2\u030b\u030e\5\u00ae"+
		"X\2\u030c\u030e\5\u00b0Y\2\u030d\u030b\3\2\2\2\u030d\u030c\3\2\2\2\u030e"+
		"\u00a3\3\2\2\2\u030f\u0312\5\u00a6T\2\u0310\u0312\5\4\3\2\u0311\u030f"+
		"\3\2\2\2\u0311\u0310\3\2\2\2\u0312\u00a5\3\2\2\2\u0313\u0314\t\2\2\2\u0314"+
		"\u00a7\3\2\2\2\u0315\u0316\t\3\2\2\u0316\u00a9\3\2\2\2\u0317\u0318\7,"+
		"\2\2\u0318\u00ab\3\2\2\2\u0319\u031a\7\t\2\2\u031a\u00ad\3\2\2\2\u031b"+
		"\u031c\5\u00a8U\2\u031c\u031d\7;\2\2\u031d\u00af\3\2\2\2\u031e\u031f\5"+
		"\u00a4S\2\u031f\u0320\7G\2\2\u0320\u00b1\3\2\2\2\u0321\u0322\5\u00b4["+
		"\2\u0322\u0323\7G\2\2\u0323\u00b3\3\2\2\2\u0324\u0327\5\u00b6\\\2\u0325"+
		"\u0327\5\u00b8]\2\u0326\u0324\3\2\2\2\u0326\u0325\3\2\2\2\u0327\u00b5"+
		"\3\2\2\2\u0328\u0329\5\u00a0Q\2\u0329\u032a\7\65\2\2\u032a\u032b\7\66"+
		"\2\2\u032b\u00b7\3\2\2\2\u032c\u032d\5\u00a2R\2\u032d\u032e\7\65\2\2\u032e"+
		"\u032f\7\66\2\2\u032f\u00b9\3\2\2\2\u0330\u0333\5\u00c0a\2\u0331\u0333"+
		"\5\u00be`\2\u0332\u0330\3\2\2\2\u0332\u0331\3\2\2\2\u0333\u00bb\3\2\2"+
		"\2\u0334\u0335\7-\2\2\u0335\u0336\7\63\2\2\u0336\u0337\5\u009cO\2\u0337"+
		"\u0338\7\64\2\2\u0338\u00bd\3\2\2\2\u0339\u033d\7h\2\2\u033a\u033d\7i"+
		"\2\2\u033b\u033d\5\u00ceh\2\u033c\u0339\3\2\2\2\u033c\u033a\3\2\2\2\u033c"+
		"\u033b\3\2\2\2\u033d\u00bf\3\2\2\2\u033e\u0345\5\u00c2b\2\u033f\u0345"+
		"\5\u00c4c\2\u0340\u0345\5\u00c6d\2\u0341\u0345\5\u00c8e\2\u0342\u0345"+
		"\5\u00caf\2\u0343\u0345\5\u00ccg\2\u0344\u033e\3\2\2\2\u0344\u033f\3\2"+
		"\2\2\u0344\u0340\3\2\2\2\u0344\u0341\3\2\2\2\u0344\u0342\3\2\2\2\u0344"+
		"\u0343\3\2\2\2\u0345\u00c1\3\2\2\2\u0346\u0347\7 \2\2\u0347\u00c3\3\2"+
		"\2\2\u0348\u0349\t\4\2\2\u0349\u00c5\3\2\2\2\u034a\u034b\7j\2\2\u034b"+
		"\u00c7\3\2\2\2\u034c\u034d\7k\2\2\u034d\u00c9\3\2\2\2\u034e\u034f\7l\2"+
		"\2\u034f\u00cb\3\2\2\2\u0350\u0351\t\5\2\2\u0351\u00cd\3\2\2\2\u0352\u0353"+
		"\t\6\2\2\u0353\u00cf\3\2\2\2U\u00d3\u00db\u00e3\u00eb\u00f1\u00f6\u0104"+
		"\u0108\u0111\u011a\u011d\u0125\u012c\u013b\u013e\u0144\u0148\u0151\u0155"+
		"\u0158\u015d\u0163\u0169\u016f\u0176\u017e\u0184\u018e\u0196\u019c\u01a2"+
		"\u01a7\u01b0\u01b4\u01ba\u01be\u01c1\u01c7\u01cb\u01d2\u01d9\u01de\u01e5"+
		"\u01ee\u01f2\u0208\u020c\u0214\u0218\u021f\u0228\u023c\u0243\u0247\u0250"+
		"\u025b\u0269\u0271\u0276\u027c\u0285\u0289\u0290\u0297\u029b\u02aa\u02b3"+
		"\u02b7\u02be\u02c5\u02ca\u02e7\u02ee\u02f2\u02fe\u0304\u0309\u030d\u0311"+
		"\u0326\u0332\u033c\u0344";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}