// Generated from NumpyDocstring.g4 by ANTLR 4.7.1

   package ch.jako.parser.numpydoc;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NumpyDocstringParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, TRIPLEQUOTES=2, PARAMNAMINGS=3, PARAMETERS=4, RAISES=5, RETURNS=6, 
		YIELDS=7, ATTRIBUTES=8, METHODS=9, OTHERSECTIONS=10, PUNCTUATION=11, HYPHENS=12, 
		COLONS=13, NEWLINE=14, NAME=15, SKIP_=16, UNKNOWN_CHAR=17, INDENT=18, 
		DEDENT=19;
	public static final int
		RULE_docstring = 0, RULE_components = 1, RULE_oneLiner = 2, RULE_description = 3, 
		RULE_parameterSection = 4, RULE_parameter = 5, RULE_parameterDescription = 6, 
		RULE_paramName = 7, RULE_returnSection = 8, RULE_returnItem = 9, RULE_returnDescription = 10, 
		RULE_returnName = 11, RULE_yieldSection = 12, RULE_yieldItem = 13, RULE_yieldDescription = 14, 
		RULE_yieldName = 15, RULE_raiseSection = 16, RULE_raiseItem = 17, RULE_raiseDescription = 18, 
		RULE_raiseName = 19, RULE_attributeSection = 20, RULE_attributeItem = 21, 
		RULE_attributeDescription = 22, RULE_attributeName = 23, RULE_type = 24, 
		RULE_variableName = 25, RULE_variableDescription = 26, RULE_methods = 27, 
		RULE_sections = 28;
	public static final String[] ruleNames = {
		"docstring", "components", "oneLiner", "description", "parameterSection", 
		"parameter", "parameterDescription", "paramName", "returnSection", "returnItem", 
		"returnDescription", "returnName", "yieldSection", "yieldItem", "yieldDescription", 
		"yieldName", "raiseSection", "raiseItem", "raiseDescription", "raiseName", 
		"attributeSection", "attributeItem", "attributeDescription", "attributeName", 
		"type", "variableName", "variableDescription", "methods", "sections"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "TRIPLEQUOTES", "PARAMNAMINGS", "PARAMETERS", "RAISES", "RETURNS", 
		"YIELDS", "ATTRIBUTES", "METHODS", "OTHERSECTIONS", "PUNCTUATION", "HYPHENS", 
		"COLONS", "NEWLINE", "NAME", "SKIP_", "UNKNOWN_CHAR", "INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "NumpyDocstring.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NumpyDocstringParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocstringContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NumpyDocstringParser.EOF, 0); }
		public OneLinerContext oneLiner() {
			return getRuleContext(OneLinerContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(NumpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(NumpyDocstringParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(NumpyDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(NumpyDocstringParser.DEDENT, i);
		}
		public List<ComponentsContext> components() {
			return getRuleContexts(ComponentsContext.class);
		}
		public ComponentsContext components(int i) {
			return getRuleContext(ComponentsContext.class,i);
		}
		public DocstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterDocstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitDocstring(this);
		}
	}

	public final DocstringContext docstring() throws RecognitionException {
		DocstringContext _localctx = new DocstringContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_docstring);
		int _la;
		try {
			int _alt;
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(58);
					match(NEWLINE);
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INDENT) {
					{
					{
					setState(64);
					match(INDENT);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				oneLiner();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(71);
					match(NEWLINE);
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEDENT) {
					{
					{
					setState(77);
					match(DEDENT);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(83);
				match(EOF);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(85);
						match(NEWLINE);
						}
						}
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==INDENT) {
						{
						{
						setState(91);
						match(INDENT);
						}
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DEDENT) {
						{
						{
						setState(97);
						match(DEDENT);
						}
						}
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(103);
					oneLiner();
					setState(104);
					match(NEWLINE);
					setState(105);
					match(NEWLINE);
					setState(109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(106);
							match(INDENT);
							}
							} 
						}
						setState(111);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(112);
							match(DEDENT);
							}
							} 
						}
						setState(117);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					}
					break;
				}
				{
				setState(139); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(123);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(120);
								match(NEWLINE);
								}
								} 
							}
							setState(125);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						}
						setState(129);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(126);
								match(INDENT);
								}
								} 
							}
							setState(131);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						}
						setState(135);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(132);
								match(DEDENT);
								}
								} 
							}
							setState(137);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						}
						setState(138);
						components();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(141); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(144); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(143);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(146); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DEDENT) {
						{
						{
						setState(148);
						match(DEDENT);
						}
						}
						setState(153);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(EOF);
				}
				}
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

	public static class ComponentsContext extends ParserRuleContext {
		public ParameterSectionContext parameterSection() {
			return getRuleContext(ParameterSectionContext.class,0);
		}
		public ReturnSectionContext returnSection() {
			return getRuleContext(ReturnSectionContext.class,0);
		}
		public YieldSectionContext yieldSection() {
			return getRuleContext(YieldSectionContext.class,0);
		}
		public RaiseSectionContext raiseSection() {
			return getRuleContext(RaiseSectionContext.class,0);
		}
		public AttributeSectionContext attributeSection() {
			return getRuleContext(AttributeSectionContext.class,0);
		}
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public SectionsContext sections() {
			return getRuleContext(SectionsContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_components; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterComponents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitComponents(this);
		}
	}

	public final ComponentsContext components() throws RecognitionException {
		ComponentsContext _localctx = new ComponentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_components);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARAMETERS:
				{
				setState(163);
				parameterSection();
				}
				break;
			case RETURNS:
				{
				setState(164);
				returnSection();
				}
				break;
			case YIELDS:
				{
				setState(165);
				yieldSection();
				}
				break;
			case RAISES:
				{
				setState(166);
				raiseSection();
				}
				break;
			case ATTRIBUTES:
				{
				setState(167);
				attributeSection();
				}
				break;
			case METHODS:
				{
				setState(168);
				methods();
				}
				break;
			case OTHERSECTIONS:
				{
				setState(169);
				sections();
				}
				break;
			case WS:
			case TRIPLEQUOTES:
			case PUNCTUATION:
			case HYPHENS:
			case COLONS:
			case NEWLINE:
			case NAME:
			case SKIP_:
			case UNKNOWN_CHAR:
			case INDENT:
			case DEDENT:
				{
				setState(170);
				description();
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

	public static class OneLinerContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(NumpyDocstringParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NumpyDocstringParser.NAME, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(NumpyDocstringParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(NumpyDocstringParser.PUNCTUATION, i);
		}
		public List<TerminalNode> WS() { return getTokens(NumpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NumpyDocstringParser.WS, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(NumpyDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(NumpyDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> HYPHENS() { return getTokens(NumpyDocstringParser.HYPHENS); }
		public TerminalNode HYPHENS(int i) {
			return getToken(NumpyDocstringParser.HYPHENS, i);
		}
		public List<TerminalNode> COLONS() { return getTokens(NumpyDocstringParser.COLONS); }
		public TerminalNode COLONS(int i) {
			return getToken(NumpyDocstringParser.COLONS, i);
		}
		public OneLinerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneLiner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterOneLiner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitOneLiner(this);
		}
	}

	public final OneLinerContext oneLiner() throws RecognitionException {
		OneLinerContext _localctx = new OneLinerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_oneLiner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << COLONS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << COLONS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0) );
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

	public static class DescriptionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(NumpyDocstringParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(NumpyDocstringParser.DEDENT, 0); }
		public List<TerminalNode> PARAMNAMINGS() { return getTokens(NumpyDocstringParser.PARAMNAMINGS); }
		public TerminalNode PARAMNAMINGS(int i) {
			return getToken(NumpyDocstringParser.PARAMNAMINGS, i);
		}
		public List<TerminalNode> PARAMETERS() { return getTokens(NumpyDocstringParser.PARAMETERS); }
		public TerminalNode PARAMETERS(int i) {
			return getToken(NumpyDocstringParser.PARAMETERS, i);
		}
		public List<TerminalNode> RETURNS() { return getTokens(NumpyDocstringParser.RETURNS); }
		public TerminalNode RETURNS(int i) {
			return getToken(NumpyDocstringParser.RETURNS, i);
		}
		public List<TerminalNode> RAISES() { return getTokens(NumpyDocstringParser.RAISES); }
		public TerminalNode RAISES(int i) {
			return getToken(NumpyDocstringParser.RAISES, i);
		}
		public List<TerminalNode> YIELDS() { return getTokens(NumpyDocstringParser.YIELDS); }
		public TerminalNode YIELDS(int i) {
			return getToken(NumpyDocstringParser.YIELDS, i);
		}
		public List<TerminalNode> ATTRIBUTES() { return getTokens(NumpyDocstringParser.ATTRIBUTES); }
		public TerminalNode ATTRIBUTES(int i) {
			return getToken(NumpyDocstringParser.ATTRIBUTES, i);
		}
		public List<TerminalNode> METHODS() { return getTokens(NumpyDocstringParser.METHODS); }
		public TerminalNode METHODS(int i) {
			return getToken(NumpyDocstringParser.METHODS, i);
		}
		public List<TerminalNode> OTHERSECTIONS() { return getTokens(NumpyDocstringParser.OTHERSECTIONS); }
		public TerminalNode OTHERSECTIONS(int i) {
			return getToken(NumpyDocstringParser.OTHERSECTIONS, i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitDescription(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_description);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(178);
				match(NEWLINE);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(184);
				match(INDENT);
				}
				break;
			}
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARAMNAMINGS) | (1L << PARAMETERS) | (1L << RAISES) | (1L << RETURNS) | (1L << YIELDS) | (1L << ATTRIBUTES) | (1L << METHODS) | (1L << OTHERSECTIONS) | (1L << NEWLINE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TRIPLEQUOTES) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << COLONS) | (1L << NAME) | (1L << SKIP_) | (1L << UNKNOWN_CHAR) | (1L << INDENT) | (1L << DEDENT))) != 0) );
			setState(193); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(192);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(195); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(197);
				match(DEDENT);
				}
				break;
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

	public static class ParameterSectionContext extends ParserRuleContext {
		public TerminalNode PARAMETERS() { return getToken(NumpyDocstringParser.PARAMETERS, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(NumpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(NumpyDocstringParser.INDENT, i);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<ParameterDescriptionContext> parameterDescription() {
			return getRuleContexts(ParameterDescriptionContext.class);
		}
		public ParameterDescriptionContext parameterDescription(int i) {
			return getRuleContext(ParameterDescriptionContext.class,i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(NumpyDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(NumpyDocstringParser.DEDENT, i);
		}
		public ParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterParameterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitParameterSection(this);
		}
	}

	public final ParameterSectionContext parameterSection() throws RecognitionException {
		ParameterSectionContext _localctx = new ParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterSection);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(PARAMETERS);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(201);
				match(NEWLINE);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDENT) {
				{
				{
				setState(207);
				match(INDENT);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(213);
						parameter();
						}
						break;
					case 2:
						{
						setState(214);
						parameterDescription();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(217); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219);
					match(NEWLINE);
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(DEDENT);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public ParamNameContext paramName() {
			return getRuleContext(ParamNameContext.class,0);
		}
		public ParameterDescriptionContext parameterDescription() {
			return getRuleContext(ParameterDescriptionContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(NumpyDocstringParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(NumpyDocstringParser.INDENT, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			paramName();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					match(NEWLINE);
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(237);
					match(INDENT);
					}
				}

				}
			}

			setState(242);
			parameterDescription();
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(243);
				match(DEDENT);
				}
				break;
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

	public static class ParameterDescriptionContext extends ParserRuleContext {
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public ParameterDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterParameterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitParameterDescription(this);
		}
	}

	public final ParameterDescriptionContext parameterDescription() throws RecognitionException {
		ParameterDescriptionContext _localctx = new ParameterDescriptionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			variableDescription();
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

	public static class ParamNameContext extends ParserRuleContext {
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(NumpyDocstringParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(NumpyDocstringParser.PUNCTUATION, i);
		}
		public List<TerminalNode> WS() { return getTokens(NumpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NumpyDocstringParser.WS, i);
		}
		public TerminalNode COLONS() { return getToken(NumpyDocstringParser.COLONS, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ParamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterParamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitParamName(this);
		}
	}

	public final ParamNameContext paramName() throws RecognitionException {
		ParamNameContext _localctx = new ParamNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			variableName();
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					match(PUNCTUATION);
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(250);
						match(WS);
						}
						}
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(256);
					variableName();
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
					match(WS);
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLONS) {
				{
				setState(268);
				match(COLONS);
				}
			}

			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(271);
					type();
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class ReturnSectionContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(NumpyDocstringParser.RETURNS, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(NumpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(NumpyDocstringParser.INDENT, i);
		}
		public List<ReturnItemContext> returnItem() {
			return getRuleContexts(ReturnItemContext.class);
		}
		public ReturnItemContext returnItem(int i) {
			return getRuleContext(ReturnItemContext.class,i);
		}
		public List<ReturnDescriptionContext> returnDescription() {
			return getRuleContexts(ReturnDescriptionContext.class);
		}
		public ReturnDescriptionContext returnDescription(int i) {
			return getRuleContext(ReturnDescriptionContext.class,i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(NumpyDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(NumpyDocstringParser.DEDENT, i);
		}
		public ReturnSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterReturnSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitReturnSection(this);
		}
	}

	public final ReturnSectionContext returnSection() throws RecognitionException {
		ReturnSectionContext _localctx = new ReturnSectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnSection);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(RETURNS);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(278);
				match(NEWLINE);
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDENT) {
				{
				{
				setState(284);
				match(INDENT);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(290);
					returnItem();
					}
					break;
				case 2:
					{
					setState(291);
					returnDescription();
					}
					break;
				}
				}
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0) );
			setState(296);
			match(NEWLINE);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					match(DEDENT);
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class ReturnItemContext extends ParserRuleContext {
		public ReturnNameContext returnName() {
			return getRuleContext(ReturnNameContext.class,0);
		}
		public ReturnDescriptionContext returnDescription() {
			return getRuleContext(ReturnDescriptionContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(NumpyDocstringParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(NumpyDocstringParser.INDENT, 0); }
		public ReturnItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterReturnItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitReturnItem(this);
		}
	}

	public final ReturnItemContext returnItem() throws RecognitionException {
		ReturnItemContext _localctx = new ReturnItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			returnName();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(304);
					match(NEWLINE);
					}
					}
					setState(307); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(309);
					match(INDENT);
					}
				}

				}
			}

			setState(314);
			returnDescription();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEDENT) {
				{
				setState(315);
				match(DEDENT);
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

	public static class ReturnDescriptionContext extends ParserRuleContext {
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public ReturnDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterReturnDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitReturnDescription(this);
		}
	}

	public final ReturnDescriptionContext returnDescription() throws RecognitionException {
		ReturnDescriptionContext _localctx = new ReturnDescriptionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			variableDescription();
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

	public static class ReturnNameContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(NumpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NumpyDocstringParser.WS, i);
		}
		public TerminalNode COLONS() { return getToken(NumpyDocstringParser.COLONS, 0); }
		public ReturnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterReturnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitReturnName(this);
		}
	}

	public final ReturnNameContext returnName() throws RecognitionException {
		ReturnNameContext _localctx = new ReturnNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(320);
				variableName();
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(321);
						match(WS);
						}
						} 
					}
					setState(326);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLONS) {
					{
					setState(327);
					match(COLONS);
					}
				}

				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(330);
						match(WS);
						}
						} 
					}
					setState(335);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				break;
			}
			setState(339); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(338);
					type();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(341); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class YieldSectionContext extends ParserRuleContext {
		public TerminalNode YIELDS() { return getToken(NumpyDocstringParser.YIELDS, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(NumpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(NumpyDocstringParser.INDENT, i);
		}
		public List<YieldItemContext> yieldItem() {
			return getRuleContexts(YieldItemContext.class);
		}
		public YieldItemContext yieldItem(int i) {
			return getRuleContext(YieldItemContext.class,i);
		}
		public List<YieldDescriptionContext> yieldDescription() {
			return getRuleContexts(YieldDescriptionContext.class);
		}
		public YieldDescriptionContext yieldDescription(int i) {
			return getRuleContext(YieldDescriptionContext.class,i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(NumpyDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(NumpyDocstringParser.DEDENT, i);
		}
		public YieldSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterYieldSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitYieldSection(this);
		}
	}

	public final YieldSectionContext yieldSection() throws RecognitionException {
		YieldSectionContext _localctx = new YieldSectionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_yieldSection);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(YIELDS);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(344);
				match(NEWLINE);
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDENT) {
				{
				{
				setState(350);
				match(INDENT);
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(358);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						setState(356);
						yieldItem();
						}
						break;
					case 2:
						{
						setState(357);
						yieldDescription();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(360); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					match(NEWLINE);
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(368);
					match(DEDENT);
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class YieldItemContext extends ParserRuleContext {
		public YieldNameContext yieldName() {
			return getRuleContext(YieldNameContext.class,0);
		}
		public YieldDescriptionContext yieldDescription() {
			return getRuleContext(YieldDescriptionContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(NumpyDocstringParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(NumpyDocstringParser.INDENT, 0); }
		public YieldItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterYieldItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitYieldItem(this);
		}
	}

	public final YieldItemContext yieldItem() throws RecognitionException {
		YieldItemContext _localctx = new YieldItemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_yieldItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			yieldName();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(376); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(375);
					match(NEWLINE);
					}
					}
					setState(378); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(380);
					match(INDENT);
					}
				}

				}
			}

			setState(385);
			yieldDescription();
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(386);
				match(DEDENT);
				}
				break;
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

	public static class YieldDescriptionContext extends ParserRuleContext {
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public YieldDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterYieldDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitYieldDescription(this);
		}
	}

	public final YieldDescriptionContext yieldDescription() throws RecognitionException {
		YieldDescriptionContext _localctx = new YieldDescriptionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_yieldDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			variableDescription();
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

	public static class YieldNameContext extends ParserRuleContext {
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(NumpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NumpyDocstringParser.WS, i);
		}
		public List<TerminalNode> COLONS() { return getTokens(NumpyDocstringParser.COLONS); }
		public TerminalNode COLONS(int i) {
			return getToken(NumpyDocstringParser.COLONS, i);
		}
		public YieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterYieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitYieldName(this);
		}
	}

	public final YieldNameContext yieldName() throws RecognitionException {
		YieldNameContext _localctx = new YieldNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_yieldName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(391);
					variableName();
					setState(395);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(392);
							match(WS);
							}
							} 
						}
						setState(397);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLONS) {
						{
						setState(398);
						match(COLONS);
						}
					}

					setState(404);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(401);
							match(WS);
							}
							} 
						}
						setState(406);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
					}
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(413); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(412);
					type();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(415); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class RaiseSectionContext extends ParserRuleContext {
		public TerminalNode RAISES() { return getToken(NumpyDocstringParser.RAISES, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(NumpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(NumpyDocstringParser.INDENT, i);
		}
		public List<RaiseItemContext> raiseItem() {
			return getRuleContexts(RaiseItemContext.class);
		}
		public RaiseItemContext raiseItem(int i) {
			return getRuleContext(RaiseItemContext.class,i);
		}
		public List<RaiseDescriptionContext> raiseDescription() {
			return getRuleContexts(RaiseDescriptionContext.class);
		}
		public RaiseDescriptionContext raiseDescription(int i) {
			return getRuleContext(RaiseDescriptionContext.class,i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(NumpyDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(NumpyDocstringParser.DEDENT, i);
		}
		public RaiseSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterRaiseSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitRaiseSection(this);
		}
	}

	public final RaiseSectionContext raiseSection() throws RecognitionException {
		RaiseSectionContext _localctx = new RaiseSectionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_raiseSection);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(RAISES);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(418);
				match(NEWLINE);
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDENT) {
				{
				{
				setState(424);
				match(INDENT);
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(432);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						setState(430);
						raiseItem();
						}
						break;
					case 2:
						{
						setState(431);
						raiseDescription();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(434); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(436);
					match(NEWLINE);
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(442);
					match(DEDENT);
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class RaiseItemContext extends ParserRuleContext {
		public RaiseNameContext raiseName() {
			return getRuleContext(RaiseNameContext.class,0);
		}
		public RaiseDescriptionContext raiseDescription() {
			return getRuleContext(RaiseDescriptionContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(NumpyDocstringParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(NumpyDocstringParser.INDENT, 0); }
		public RaiseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterRaiseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitRaiseItem(this);
		}
	}

	public final RaiseItemContext raiseItem() throws RecognitionException {
		RaiseItemContext _localctx = new RaiseItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_raiseItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			raiseName();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(450); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(449);
					match(NEWLINE);
					}
					}
					setState(452); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(454);
					match(INDENT);
					}
				}

				}
			}

			setState(459);
			raiseDescription();
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(460);
				match(DEDENT);
				}
				break;
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

	public static class RaiseDescriptionContext extends ParserRuleContext {
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public RaiseDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterRaiseDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitRaiseDescription(this);
		}
	}

	public final RaiseDescriptionContext raiseDescription() throws RecognitionException {
		RaiseDescriptionContext _localctx = new RaiseDescriptionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_raiseDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			variableDescription();
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

	public static class RaiseNameContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(NumpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NumpyDocstringParser.WS, i);
		}
		public TerminalNode COLONS() { return getToken(NumpyDocstringParser.COLONS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RaiseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterRaiseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitRaiseName(this);
		}
	}

	public final RaiseNameContext raiseName() throws RecognitionException {
		RaiseNameContext _localctx = new RaiseNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_raiseName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			variableName();
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(466);
					match(WS);
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLONS) {
				{
				setState(472);
				match(COLONS);
				}
			}

			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(475);
				type();
				}
				break;
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

	public static class AttributeSectionContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTES() { return getToken(NumpyDocstringParser.ATTRIBUTES, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(NumpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(NumpyDocstringParser.INDENT, i);
		}
		public List<AttributeItemContext> attributeItem() {
			return getRuleContexts(AttributeItemContext.class);
		}
		public AttributeItemContext attributeItem(int i) {
			return getRuleContext(AttributeItemContext.class,i);
		}
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(NumpyDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(NumpyDocstringParser.DEDENT, i);
		}
		public AttributeSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterAttributeSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitAttributeSection(this);
		}
	}

	public final AttributeSectionContext attributeSection() throws RecognitionException {
		AttributeSectionContext _localctx = new AttributeSectionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_attributeSection);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(ATTRIBUTES);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(479);
				match(NEWLINE);
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDENT) {
				{
				{
				setState(485);
				match(INDENT);
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(491);
					attributeItem();
					}
					break;
				case 2:
					{
					setState(492);
					attributeName();
					}
					break;
				}
				}
				setState(495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME || _la==UNKNOWN_CHAR );
			setState(497);
			match(NEWLINE);
			setState(501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(498);
					match(DEDENT);
					}
					} 
				}
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class AttributeItemContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeDescriptionContext attributeDescription() {
			return getRuleContext(AttributeDescriptionContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(NumpyDocstringParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(NumpyDocstringParser.INDENT, 0); }
		public AttributeItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterAttributeItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitAttributeItem(this);
		}
	}

	public final AttributeItemContext attributeItem() throws RecognitionException {
		AttributeItemContext _localctx = new AttributeItemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attributeItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			attributeName();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(506); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(505);
					match(NEWLINE);
					}
					}
					setState(508); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(510);
					match(INDENT);
					}
				}

				}
			}

			setState(515);
			attributeDescription();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEDENT) {
				{
				setState(516);
				match(DEDENT);
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

	public static class AttributeDescriptionContext extends ParserRuleContext {
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public AttributeDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterAttributeDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitAttributeDescription(this);
		}
	}

	public final AttributeDescriptionContext attributeDescription() throws RecognitionException {
		AttributeDescriptionContext _localctx = new AttributeDescriptionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attributeDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			variableDescription();
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

	public static class AttributeNameContext extends ParserRuleContext {
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(NumpyDocstringParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(NumpyDocstringParser.PUNCTUATION, i);
		}
		public List<TerminalNode> WS() { return getTokens(NumpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NumpyDocstringParser.WS, i);
		}
		public TerminalNode COLONS() { return getToken(NumpyDocstringParser.COLONS, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitAttributeName(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attributeName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			variableName();
			setState(532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(522);
					match(PUNCTUATION);
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(523);
						match(WS);
						}
						}
						setState(528);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(529);
					variableName();
					}
					} 
				}
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(535);
					match(WS);
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLONS) {
				{
				setState(541);
				match(COLONS);
				}
			}

			setState(547);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(544);
					type();
					}
					} 
				}
				setState(549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(NumpyDocstringParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NumpyDocstringParser.NAME, i);
		}
		public List<TerminalNode> WS() { return getTokens(NumpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NumpyDocstringParser.WS, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(NumpyDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(NumpyDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(NumpyDocstringParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(NumpyDocstringParser.PUNCTUATION, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(550);
				match(WS);
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNKNOWN_CHAR) {
				{
				{
				setState(556);
				match(UNKNOWN_CHAR);
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(562);
			match(NAME);
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					match(UNKNOWN_CHAR);
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(569);
					match(PUNCTUATION);
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			setState(578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(575);
					match(WS);
					}
					} 
				}
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(581);
					match(NAME);
					}
					} 
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(NumpyDocstringParser.NAME, 0); }
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(NumpyDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(NumpyDocstringParser.UNKNOWN_CHAR, i);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNKNOWN_CHAR) {
				{
				{
				setState(587);
				match(UNKNOWN_CHAR);
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593);
			match(NAME);
			setState(597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(594);
					match(UNKNOWN_CHAR);
					}
					} 
				}
				setState(599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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

	public static class VariableDescriptionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> NAME() { return getTokens(NumpyDocstringParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NumpyDocstringParser.NAME, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(NumpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(NumpyDocstringParser.INDENT, i);
		}
		public List<TerminalNode> WS() { return getTokens(NumpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NumpyDocstringParser.WS, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(NumpyDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(NumpyDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(NumpyDocstringParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(NumpyDocstringParser.PUNCTUATION, i);
		}
		public List<TerminalNode> HYPHENS() { return getTokens(NumpyDocstringParser.HYPHENS); }
		public TerminalNode HYPHENS(int i) {
			return getToken(NumpyDocstringParser.HYPHENS, i);
		}
		public List<TerminalNode> COLONS() { return getTokens(NumpyDocstringParser.COLONS); }
		public TerminalNode COLONS(int i) {
			return getToken(NumpyDocstringParser.COLONS, i);
		}
		public VariableDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterVariableDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitVariableDescription(this);
		}
	}

	public final VariableDescriptionContext variableDescription() throws RecognitionException {
		VariableDescriptionContext _localctx = new VariableDescriptionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variableDescription);
		int _la;
		try {
			int _alt;
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(632);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					{
					setState(612); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(600);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(602); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(601);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(604); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(609);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COLONS) {
							{
							{
							setState(606);
							match(COLONS);
							}
							}
							setState(611);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(614); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0) );
					setState(617); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(616);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(619); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				case 2:
					{
					{
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(621);
						match(WS);
						}
						}
						setState(626);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(627);
					match(NAME);
					setState(628);
					match(NEWLINE);
					setState(630);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						setState(629);
						match(INDENT);
						}
						break;
					}
					}
					}
					break;
				}
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(635);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INDENT) {
							{
							setState(634);
							match(INDENT);
							}
						}

						setState(660);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
						case 1:
							{
							setState(649); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(637);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(639); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(638);
										_la = _input.LA(1);
										if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
										_errHandler.recoverInline(this);
										}
										else {
											if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
											_errHandler.reportMatch(this);
											consume();
										}
										}
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(641); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								setState(646);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COLONS) {
									{
									{
									setState(643);
									match(COLONS);
									}
									}
									setState(648);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								}
								setState(651); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0) );
							}
							break;
						case 2:
							{
							{
							setState(656);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS) {
								{
								{
								setState(653);
								match(WS);
								}
								}
								setState(658);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(659);
							match(NAME);
							}
							}
							break;
						}
						setState(662);
						match(NEWLINE);
						}
						} 
					}
					setState(667);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(668);
					match(WS);
					}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(674);
				match(NAME);
				setState(675);
				match(NEWLINE);
				}
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

	public static class MethodsContext extends ParserRuleContext {
		public TerminalNode METHODS() { return getToken(NumpyDocstringParser.METHODS, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(NumpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(NumpyDocstringParser.INDENT, i);
		}
		public List<DescriptionContext> description() {
			return getRuleContexts(DescriptionContext.class);
		}
		public DescriptionContext description(int i) {
			return getRuleContext(DescriptionContext.class,i);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<VariableDescriptionContext> variableDescription() {
			return getRuleContexts(VariableDescriptionContext.class);
		}
		public VariableDescriptionContext variableDescription(int i) {
			return getRuleContext(VariableDescriptionContext.class,i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(NumpyDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(NumpyDocstringParser.DEDENT, i);
		}
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitMethods(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methods);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(METHODS);
			setState(682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(679);
					match(NEWLINE);
					}
					} 
				}
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(685);
					match(INDENT);
					}
					} 
				}
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			setState(694); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(694);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(691);
						description();
						}
						break;
					case 2:
						{
						setState(692);
						variableName();
						}
						break;
					case 3:
						{
						setState(693);
						variableDescription();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(696); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(698);
					match(NEWLINE);
					}
					} 
				}
				setState(703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			setState(707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(704);
					match(DEDENT);
					}
					} 
				}
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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

	public static class SectionsContext extends ParserRuleContext {
		public TerminalNode OTHERSECTIONS() { return getToken(NumpyDocstringParser.OTHERSECTIONS, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumpyDocstringParser.NEWLINE, i);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<VariableDescriptionContext> variableDescription() {
			return getRuleContexts(VariableDescriptionContext.class);
		}
		public VariableDescriptionContext variableDescription(int i) {
			return getRuleContext(VariableDescriptionContext.class,i);
		}
		public List<TerminalNode> INDENT() { return getTokens(NumpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(NumpyDocstringParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(NumpyDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(NumpyDocstringParser.DEDENT, i);
		}
		public SectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).enterSections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumpyDocstringListener ) ((NumpyDocstringListener)listener).exitSections(this);
		}
	}

	public final SectionsContext sections() throws RecognitionException {
		SectionsContext _localctx = new SectionsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sections);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(OTHERSECTIONS);
			setState(711);
			match(NEWLINE);
			setState(717); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(717);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						setState(712);
						variableName();
						}
						break;
					case 2:
						{
						setState(713);
						variableDescription();
						}
						break;
					case 3:
						{
						setState(714);
						match(INDENT);
						}
						break;
					case 4:
						{
						setState(715);
						match(DEDENT);
						}
						break;
					case 5:
						{
						setState(716);
						match(NEWLINE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(719); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u02d4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3"+
		"\2\7\2Q\n\2\f\2\16\2T\13\2\3\2\3\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\7"+
		"\2_\n\2\f\2\16\2b\13\2\3\2\7\2e\n\2\f\2\16\2h\13\2\3\2\3\2\3\2\3\2\7\2"+
		"n\n\2\f\2\16\2q\13\2\3\2\7\2t\n\2\f\2\16\2w\13\2\5\2y\n\2\3\2\7\2|\n\2"+
		"\f\2\16\2\177\13\2\3\2\7\2\u0082\n\2\f\2\16\2\u0085\13\2\3\2\7\2\u0088"+
		"\n\2\f\2\16\2\u008b\13\2\3\2\6\2\u008e\n\2\r\2\16\2\u008f\3\2\6\2\u0093"+
		"\n\2\r\2\16\2\u0094\3\2\7\2\u0098\n\2\f\2\16\2\u009b\13\2\7\2\u009d\n"+
		"\2\f\2\16\2\u00a0\13\2\3\2\3\2\5\2\u00a4\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u00ae\n\3\3\4\6\4\u00b1\n\4\r\4\16\4\u00b2\3\5\7\5\u00b6\n"+
		"\5\f\5\16\5\u00b9\13\5\3\5\5\5\u00bc\n\5\3\5\6\5\u00bf\n\5\r\5\16\5\u00c0"+
		"\3\5\6\5\u00c4\n\5\r\5\16\5\u00c5\3\5\5\5\u00c9\n\5\3\6\3\6\7\6\u00cd"+
		"\n\6\f\6\16\6\u00d0\13\6\3\6\7\6\u00d3\n\6\f\6\16\6\u00d6\13\6\3\6\3\6"+
		"\6\6\u00da\n\6\r\6\16\6\u00db\3\6\7\6\u00df\n\6\f\6\16\6\u00e2\13\6\3"+
		"\6\7\6\u00e5\n\6\f\6\16\6\u00e8\13\6\3\7\3\7\6\7\u00ec\n\7\r\7\16\7\u00ed"+
		"\3\7\5\7\u00f1\n\7\5\7\u00f3\n\7\3\7\3\7\5\7\u00f7\n\7\3\b\3\b\3\t\3\t"+
		"\3\t\7\t\u00fe\n\t\f\t\16\t\u0101\13\t\3\t\7\t\u0104\n\t\f\t\16\t\u0107"+
		"\13\t\3\t\7\t\u010a\n\t\f\t\16\t\u010d\13\t\3\t\5\t\u0110\n\t\3\t\7\t"+
		"\u0113\n\t\f\t\16\t\u0116\13\t\3\n\3\n\7\n\u011a\n\n\f\n\16\n\u011d\13"+
		"\n\3\n\7\n\u0120\n\n\f\n\16\n\u0123\13\n\3\n\3\n\6\n\u0127\n\n\r\n\16"+
		"\n\u0128\3\n\3\n\7\n\u012d\n\n\f\n\16\n\u0130\13\n\3\13\3\13\6\13\u0134"+
		"\n\13\r\13\16\13\u0135\3\13\5\13\u0139\n\13\5\13\u013b\n\13\3\13\3\13"+
		"\5\13\u013f\n\13\3\f\3\f\3\r\3\r\7\r\u0145\n\r\f\r\16\r\u0148\13\r\3\r"+
		"\5\r\u014b\n\r\3\r\7\r\u014e\n\r\f\r\16\r\u0151\13\r\5\r\u0153\n\r\3\r"+
		"\6\r\u0156\n\r\r\r\16\r\u0157\3\16\3\16\7\16\u015c\n\16\f\16\16\16\u015f"+
		"\13\16\3\16\7\16\u0162\n\16\f\16\16\16\u0165\13\16\3\16\3\16\6\16\u0169"+
		"\n\16\r\16\16\16\u016a\3\16\7\16\u016e\n\16\f\16\16\16\u0171\13\16\3\16"+
		"\7\16\u0174\n\16\f\16\16\16\u0177\13\16\3\17\3\17\6\17\u017b\n\17\r\17"+
		"\16\17\u017c\3\17\5\17\u0180\n\17\5\17\u0182\n\17\3\17\3\17\5\17\u0186"+
		"\n\17\3\20\3\20\3\21\3\21\7\21\u018c\n\21\f\21\16\21\u018f\13\21\3\21"+
		"\5\21\u0192\n\21\3\21\7\21\u0195\n\21\f\21\16\21\u0198\13\21\7\21\u019a"+
		"\n\21\f\21\16\21\u019d\13\21\3\21\6\21\u01a0\n\21\r\21\16\21\u01a1\3\22"+
		"\3\22\7\22\u01a6\n\22\f\22\16\22\u01a9\13\22\3\22\7\22\u01ac\n\22\f\22"+
		"\16\22\u01af\13\22\3\22\3\22\6\22\u01b3\n\22\r\22\16\22\u01b4\3\22\7\22"+
		"\u01b8\n\22\f\22\16\22\u01bb\13\22\3\22\7\22\u01be\n\22\f\22\16\22\u01c1"+
		"\13\22\3\23\3\23\6\23\u01c5\n\23\r\23\16\23\u01c6\3\23\5\23\u01ca\n\23"+
		"\5\23\u01cc\n\23\3\23\3\23\5\23\u01d0\n\23\3\24\3\24\3\25\3\25\7\25\u01d6"+
		"\n\25\f\25\16\25\u01d9\13\25\3\25\5\25\u01dc\n\25\3\25\5\25\u01df\n\25"+
		"\3\26\3\26\7\26\u01e3\n\26\f\26\16\26\u01e6\13\26\3\26\7\26\u01e9\n\26"+
		"\f\26\16\26\u01ec\13\26\3\26\3\26\6\26\u01f0\n\26\r\26\16\26\u01f1\3\26"+
		"\3\26\7\26\u01f6\n\26\f\26\16\26\u01f9\13\26\3\27\3\27\6\27\u01fd\n\27"+
		"\r\27\16\27\u01fe\3\27\5\27\u0202\n\27\5\27\u0204\n\27\3\27\3\27\5\27"+
		"\u0208\n\27\3\30\3\30\3\31\3\31\3\31\7\31\u020f\n\31\f\31\16\31\u0212"+
		"\13\31\3\31\7\31\u0215\n\31\f\31\16\31\u0218\13\31\3\31\7\31\u021b\n\31"+
		"\f\31\16\31\u021e\13\31\3\31\5\31\u0221\n\31\3\31\7\31\u0224\n\31\f\31"+
		"\16\31\u0227\13\31\3\32\7\32\u022a\n\32\f\32\16\32\u022d\13\32\3\32\7"+
		"\32\u0230\n\32\f\32\16\32\u0233\13\32\3\32\3\32\7\32\u0237\n\32\f\32\16"+
		"\32\u023a\13\32\3\32\7\32\u023d\n\32\f\32\16\32\u0240\13\32\3\32\7\32"+
		"\u0243\n\32\f\32\16\32\u0246\13\32\3\32\7\32\u0249\n\32\f\32\16\32\u024c"+
		"\13\32\3\33\7\33\u024f\n\33\f\33\16\33\u0252\13\33\3\33\3\33\7\33\u0256"+
		"\n\33\f\33\16\33\u0259\13\33\3\34\3\34\6\34\u025d\n\34\r\34\16\34\u025e"+
		"\3\34\7\34\u0262\n\34\f\34\16\34\u0265\13\34\6\34\u0267\n\34\r\34\16\34"+
		"\u0268\3\34\6\34\u026c\n\34\r\34\16\34\u026d\3\34\7\34\u0271\n\34\f\34"+
		"\16\34\u0274\13\34\3\34\3\34\3\34\5\34\u0279\n\34\5\34\u027b\n\34\3\34"+
		"\5\34\u027e\n\34\3\34\3\34\6\34\u0282\n\34\r\34\16\34\u0283\3\34\7\34"+
		"\u0287\n\34\f\34\16\34\u028a\13\34\6\34\u028c\n\34\r\34\16\34\u028d\3"+
		"\34\7\34\u0291\n\34\f\34\16\34\u0294\13\34\3\34\5\34\u0297\n\34\3\34\7"+
		"\34\u029a\n\34\f\34\16\34\u029d\13\34\3\34\7\34\u02a0\n\34\f\34\16\34"+
		"\u02a3\13\34\3\34\3\34\5\34\u02a7\n\34\3\35\3\35\7\35\u02ab\n\35\f\35"+
		"\16\35\u02ae\13\35\3\35\7\35\u02b1\n\35\f\35\16\35\u02b4\13\35\3\35\3"+
		"\35\3\35\6\35\u02b9\n\35\r\35\16\35\u02ba\3\35\7\35\u02be\n\35\f\35\16"+
		"\35\u02c1\13\35\3\35\7\35\u02c4\n\35\f\35\16\35\u02c7\13\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\6\36\u02d0\n\36\r\36\16\36\u02d1\3\36\2\2\37"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\6\2"+
		"\3\3\r\17\21\21\23\23\4\2\5\f\20\20\6\2\3\3\r\16\21\21\23\23\2\u0340\2"+
		"\u00a3\3\2\2\2\4\u00ad\3\2\2\2\6\u00b0\3\2\2\2\b\u00b7\3\2\2\2\n\u00ca"+
		"\3\2\2\2\f\u00e9\3\2\2\2\16\u00f8\3\2\2\2\20\u00fa\3\2\2\2\22\u0117\3"+
		"\2\2\2\24\u0131\3\2\2\2\26\u0140\3\2\2\2\30\u0152\3\2\2\2\32\u0159\3\2"+
		"\2\2\34\u0178\3\2\2\2\36\u0187\3\2\2\2 \u019b\3\2\2\2\"\u01a3\3\2\2\2"+
		"$\u01c2\3\2\2\2&\u01d1\3\2\2\2(\u01d3\3\2\2\2*\u01e0\3\2\2\2,\u01fa\3"+
		"\2\2\2.\u0209\3\2\2\2\60\u020b\3\2\2\2\62\u022b\3\2\2\2\64\u0250\3\2\2"+
		"\2\66\u02a6\3\2\2\28\u02a8\3\2\2\2:\u02c8\3\2\2\2<>\7\20\2\2=<\3\2\2\2"+
		">A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3\2\2\2BD\7\24\2\2CB\3\2\2"+
		"\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HL\5\6\4\2IK\7\20"+
		"\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MR\3\2\2\2NL\3\2\2\2OQ\7\25"+
		"\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\2"+
		"\2\3V\u00a4\3\2\2\2WY\7\20\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[`\3\2\2\2\\Z\3\2\2\2]_\7\24\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2"+
		"\2\2af\3\2\2\2b`\3\2\2\2ce\7\25\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3"+
		"\2\2\2gi\3\2\2\2hf\3\2\2\2ij\5\6\4\2jk\7\20\2\2ko\7\20\2\2ln\7\24\2\2"+
		"ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pu\3\2\2\2qo\3\2\2\2rt\7\25\2"+
		"\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xZ\3\2\2"+
		"\2xy\3\2\2\2y\u008d\3\2\2\2z|\7\20\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2"+
		"\2}~\3\2\2\2~\u0083\3\2\2\2\177}\3\2\2\2\u0080\u0082\7\24\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0089\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\25\2\2\u0087\u0086\3"+
		"\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\5\4\3\2\u008d}\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u009e"+
		"\3\2\2\2\u0091\u0093\7\20\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0099\3\2\2\2\u0096\u0098"+
		"\7\25\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u0092"+
		"\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\2\2\3\u00a2\u00a4\3\2"+
		"\2\2\u00a3?\3\2\2\2\u00a3x\3\2\2\2\u00a4\3\3\2\2\2\u00a5\u00ae\5\n\6\2"+
		"\u00a6\u00ae\5\22\n\2\u00a7\u00ae\5\32\16\2\u00a8\u00ae\5\"\22\2\u00a9"+
		"\u00ae\5*\26\2\u00aa\u00ae\58\35\2\u00ab\u00ae\5:\36\2\u00ac\u00ae\5\b"+
		"\5\2\u00ad\u00a5\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad"+
		"\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ac\3\2\2\2\u00ae\5\3\2\2\2\u00af\u00b1\t\2\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\7\3\2\2\2\u00b4\u00b6\7\20\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2"+
		"\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bc\7\24\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2"+
		"\u00bc\u00be\3\2\2\2\u00bd\u00bf\n\3\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c4\7\20\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c9\7\25\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\t\3\2\2\2\u00ca\u00ce\7\6\2\2"+
		"\u00cb\u00cd\7\20\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d4\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d3\7\24\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00da\5\f\7\2\u00d8\u00da\5\16\b\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3"+
		"\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00e0\3\2\2\2\u00dd\u00df\7\20\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e6\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e5\7\25\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\13\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00f2\5\20\t\2\u00ea\u00ec\7\20\2\2\u00eb\u00ea\3"+
		"\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00f1\7\24\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3"+
		"\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00eb\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\5\16\b\2\u00f5\u00f7\7\25\2\2\u00f6\u00f5\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\r\3\2\2\2\u00f8\u00f9\5\66\34\2\u00f9"+
		"\17\3\2\2\2\u00fa\u0105\5\64\33\2\u00fb\u00ff\7\r\2\2\u00fc\u00fe\7\3"+
		"\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\5\64"+
		"\33\2\u0103\u00fb\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u010b\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a\7\3"+
		"\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\7\17"+
		"\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0114\3\2\2\2\u0111"+
		"\u0113\5\62\32\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3"+
		"\2\2\2\u0114\u0115\3\2\2\2\u0115\21\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u011b\7\b\2\2\u0118\u011a\7\20\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3"+
		"\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0121\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u0120\7\24\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3"+
		"\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0126\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0127\5\24\13\2\u0125\u0127\5\26\f\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012e\7\20\2\2\u012b\u012d\7"+
		"\25\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\23\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u013a\5\30\r"+
		"\2\u0132\u0134\7\20\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\7\24"+
		"\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a"+
		"\u0133\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\5\26"+
		"\f\2\u013d\u013f\7\25\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\25\3\2\2\2\u0140\u0141\5\66\34\2\u0141\27\3\2\2\2\u0142\u0146\5\64\33"+
		"\2\u0143\u0145\7\3\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014b\7\17\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014f\3"+
		"\2\2\2\u014c\u014e\7\3\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0152\u0142\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0156\5\62\32\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3"+
		"\2\2\2\u0157\u0158\3\2\2\2\u0158\31\3\2\2\2\u0159\u015d\7\t\2\2\u015a"+
		"\u015c\7\20\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3"+
		"\2\2\2\u015d\u015e\3\2\2\2\u015e\u0163\3\2\2\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0162\7\24\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3"+
		"\2\2\2\u0163\u0164\3\2\2\2\u0164\u0168\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0169\5\34\17\2\u0167\u0169\5\36\20\2\u0168\u0166\3\2\2\2\u0168\u0167"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016f\3\2\2\2\u016c\u016e\7\20\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3"+
		"\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0175\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0172\u0174\7\25\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3"+
		"\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\33\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0178\u0181\5 \21\2\u0179\u017b\7\20\2\2\u017a\u0179\3"+
		"\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\3\2\2\2\u017e\u0180\7\24\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3"+
		"\2\2\2\u0180\u0182\3\2\2\2\u0181\u017a\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0185\5\36\20\2\u0184\u0186\7\25\2\2\u0185\u0184"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\35\3\2\2\2\u0187\u0188\5\66\34\2\u0188"+
		"\37\3\2\2\2\u0189\u018d\5\64\33\2\u018a\u018c\7\3\2\2\u018b\u018a\3\2"+
		"\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0192\7\17\2\2\u0191\u0190\3"+
		"\2\2\2\u0191\u0192\3\2\2\2\u0192\u0196\3\2\2\2\u0193\u0195\7\3\2\2\u0194"+
		"\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u0189\3\2\2\2\u019a"+
		"\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019f\3\2"+
		"\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\5\62\32\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2!\3\2\2\2"+
		"\u01a3\u01a7\7\7\2\2\u01a4\u01a6\7\20\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ad\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa\u01ac\7\24\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3"+
		"\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b2\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01b0\u01b3\5$\23\2\u01b1\u01b3\5&\24\2\u01b2\u01b0\3\2"+
		"\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b9\3\2\2\2\u01b6\u01b8\7\20\2\2\u01b7\u01b6\3"+
		"\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bf\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01be\7\25\2\2\u01bd\u01bc\3"+
		"\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"#\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01cb\5(\25\2\u01c3\u01c5\7\20\2\2"+
		"\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7"+
		"\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01ca\7\24\2\2\u01c9\u01c8\3\2\2\2"+
		"\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c4\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\5&\24\2\u01ce\u01d0\7\25\2\2"+
		"\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0%\3\2\2\2\u01d1\u01d2\5"+
		"\66\34\2\u01d2\'\3\2\2\2\u01d3\u01d7\5\64\33\2\u01d4\u01d6\7\3\2\2\u01d5"+
		"\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dc\7\17\2\2\u01db"+
		"\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01df\5\62"+
		"\32\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df)\3\2\2\2\u01e0\u01e4"+
		"\7\n\2\2\u01e1\u01e3\7\20\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2"+
		"\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01ea\3\2\2\2\u01e6\u01e4"+
		"\3\2\2\2\u01e7\u01e9\7\24\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2"+
		"\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ef\3\2\2\2\u01ec\u01ea"+
		"\3\2\2\2\u01ed\u01f0\5,\27\2\u01ee\u01f0\5\60\31\2\u01ef\u01ed\3\2\2\2"+
		"\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f7\7\20\2\2\u01f4\u01f6\7\25\2\2"+
		"\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8"+
		"\3\2\2\2\u01f8+\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u0203\5\60\31\2\u01fb"+
		"\u01fd\7\20\2\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01fc\3"+
		"\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u0202\7\24\2\2\u0201"+
		"\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u01fc\3\2"+
		"\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\5.\30\2\u0206"+
		"\u0208\7\25\2\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208-\3\2\2\2"+
		"\u0209\u020a\5\66\34\2\u020a/\3\2\2\2\u020b\u0216\5\64\33\2\u020c\u0210"+
		"\7\r\2\2\u020d\u020f\7\3\2\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210"+
		"\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0213\u0215\5\64\33\2\u0214\u020c\3\2\2\2\u0215\u0218\3\2\2\2\u0216"+
		"\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u021c\3\2\2\2\u0218\u0216\3\2"+
		"\2\2\u0219\u021b\7\3\2\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2"+
		"\2\2\u021f\u0221\7\17\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0225\3\2\2\2\u0222\u0224\5\62\32\2\u0223\u0222\3\2\2\2\u0224\u0227\3"+
		"\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\61\3\2\2\2\u0227"+
		"\u0225\3\2\2\2\u0228\u022a\7\3\2\2\u0229\u0228\3\2\2\2\u022a\u022d\3\2"+
		"\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u0231\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022e\u0230\7\23\2\2\u022f\u022e\3\2\2\2\u0230\u0233\3"+
		"\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0234\u0238\7\21\2\2\u0235\u0237\7\23\2\2\u0236\u0235\3"+
		"\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u023e\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023d\7\r\2\2\u023c\u023b\3\2"+
		"\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"\u0244\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0243\7\3\2\2\u0242\u0241\3\2"+
		"\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u024a\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0249\7\21\2\2\u0248\u0247\3"+
		"\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\63\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024f\7\23\2\2\u024e\u024d\3\2\2"+
		"\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0257\7\21\2\2\u0254\u0256\7\23\2\2"+
		"\u0255\u0254\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258"+
		"\3\2\2\2\u0258\65\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025c\t\4\2\2\u025b"+
		"\u025d\t\4\2\2\u025c\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025c\3\2"+
		"\2\2\u025e\u025f\3\2\2\2\u025f\u0263\3\2\2\2\u0260\u0262\7\17\2\2\u0261"+
		"\u0260\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2"+
		"\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u025a\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2"+
		"\2\2\u026a\u026c\7\20\2\2\u026b\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u027b\3\2\2\2\u026f\u0271\7\3"+
		"\2\2\u0270\u026f\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0276\7\21"+
		"\2\2\u0276\u0278\7\20\2\2\u0277\u0279\7\24\2\2\u0278\u0277\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u0266\3\2\2\2\u027a\u0272\3\2"+
		"\2\2\u027b\u029b\3\2\2\2\u027c\u027e\7\24\2\2\u027d\u027c\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u0296\3\2\2\2\u027f\u0281\t\4\2\2\u0280\u0282\t\4"+
		"\2\2\u0281\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0281\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u0288\3\2\2\2\u0285\u0287\7\17\2\2\u0286\u0285\3"+
		"\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u027f\3\2\2\2\u028c\u028d\3\2"+
		"\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0297\3\2\2\2\u028f"+
		"\u0291\7\3\2\2\u0290\u028f\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2"+
		"\2\2\u0292\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u0292\3\2\2\2\u0295"+
		"\u0297\7\21\2\2\u0296\u028b\3\2\2\2\u0296\u0292\3\2\2\2\u0297\u0298\3"+
		"\2\2\2\u0298\u029a\7\20\2\2\u0299\u027d\3\2\2\2\u029a\u029d\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a7\3\2\2\2\u029d\u029b\3\2"+
		"\2\2\u029e\u02a0\7\3\2\2\u029f\u029e\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1"+
		"\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3\u02a1\3\2"+
		"\2\2\u02a4\u02a5\7\21\2\2\u02a5\u02a7\7\20\2\2\u02a6\u027a\3\2\2\2\u02a6"+
		"\u02a1\3\2\2\2\u02a7\67\3\2\2\2\u02a8\u02ac\7\13\2\2\u02a9\u02ab\7\20"+
		"\2\2\u02aa\u02a9\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac"+
		"\u02ad\3\2\2\2\u02ad\u02b2\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02b1\7\24"+
		"\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02b8\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b9\5\b"+
		"\5\2\u02b6\u02b9\5\64\33\2\u02b7\u02b9\5\66\34\2\u02b8\u02b5\3\2\2\2\u02b8"+
		"\u02b6\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02b8\3\2"+
		"\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bf\3\2\2\2\u02bc\u02be\7\20\2\2\u02bd"+
		"\u02bc\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2"+
		"\2\2\u02c0\u02c5\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c4\7\25\2\2\u02c3"+
		"\u02c2\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2"+
		"\2\2\u02c69\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\7\f\2\2\u02c9\u02cf"+
		"\7\20\2\2\u02ca\u02d0\5\64\33\2\u02cb\u02d0\5\66\34\2\u02cc\u02d0\7\24"+
		"\2\2\u02cd\u02d0\7\25\2\2\u02ce\u02d0\7\20\2\2\u02cf\u02ca\3\2\2\2\u02cf"+
		"\u02cb\3\2\2\2\u02cf\u02cc\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02ce\3\2"+
		"\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		";\3\2\2\2\u0082?ELRZ`foux}\u0083\u0089\u008f\u0094\u0099\u009e\u00a3\u00ad"+
		"\u00b2\u00b7\u00bb\u00c0\u00c5\u00c8\u00ce\u00d4\u00d9\u00db\u00e0\u00e6"+
		"\u00ed\u00f0\u00f2\u00f6\u00ff\u0105\u010b\u010f\u0114\u011b\u0121\u0126"+
		"\u0128\u012e\u0135\u0138\u013a\u013e\u0146\u014a\u014f\u0152\u0157\u015d"+
		"\u0163\u0168\u016a\u016f\u0175\u017c\u017f\u0181\u0185\u018d\u0191\u0196"+
		"\u019b\u01a1\u01a7\u01ad\u01b2\u01b4\u01b9\u01bf\u01c6\u01c9\u01cb\u01cf"+
		"\u01d7\u01db\u01de\u01e4\u01ea\u01ef\u01f1\u01f7\u01fe\u0201\u0203\u0207"+
		"\u0210\u0216\u021c\u0220\u0225\u022b\u0231\u0238\u023e\u0244\u024a\u0250"+
		"\u0257\u025e\u0263\u0268\u026d\u0272\u0278\u027a\u027d\u0283\u0288\u028d"+
		"\u0292\u0296\u029b\u02a1\u02a6\u02ac\u02b2\u02b8\u02ba\u02bf\u02c5\u02cf"+
		"\u02d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}