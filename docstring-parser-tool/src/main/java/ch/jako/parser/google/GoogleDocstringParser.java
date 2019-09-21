// Generated from GoogleDocstring.g4 by ANTLR 4.7.1

   package ch.jako.parser.google;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoogleDocstringParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, TRIPLEQUOTES=2, PARAMNAMINGS=3, ARGS=4, RETURNS=5, RAISES=6, ATTRIBUTES=7, 
		OTHERSECTIONS=8, PUNCTUATION=9, COLONS=10, HYPHENS=11, NEWLINE=12, NAME=13, 
		SKIP_=14, UNKNOWN_CHAR=15, INDENT=16, DEDENT=17;
	public static final int
		RULE_docstring = 0, RULE_components = 1, RULE_oneLiner = 2, RULE_description = 3, 
		RULE_attributesComponent = 4, RULE_attributes = 5, RULE_attributeName = 6, 
		RULE_attributeDescription = 7, RULE_argsComponent = 8, RULE_args = 9, 
		RULE_argName = 10, RULE_argDescription = 11, RULE_returnComponent = 12, 
		RULE_returnObject = 13, RULE_returnName = 14, RULE_returnDescription = 15, 
		RULE_raiseComponent = 16, RULE_raiseObject = 17, RULE_raiseName = 18, 
		RULE_raiseDescription = 19, RULE_variableIndicator = 20, RULE_variableName = 21, 
		RULE_type = 22, RULE_variableDescription = 23, RULE_otherSections = 24;
	public static final String[] ruleNames = {
		"docstring", "components", "oneLiner", "description", "attributesComponent", 
		"attributes", "attributeName", "attributeDescription", "argsComponent", 
		"args", "argName", "argDescription", "returnComponent", "returnObject", 
		"returnName", "returnDescription", "raiseComponent", "raiseObject", "raiseName", 
		"raiseDescription", "variableIndicator", "variableName", "type", "variableDescription", 
		"otherSections"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "TRIPLEQUOTES", "PARAMNAMINGS", "ARGS", "RETURNS", "RAISES", 
		"ATTRIBUTES", "OTHERSECTIONS", "PUNCTUATION", "COLONS", "HYPHENS", "NEWLINE", 
		"NAME", "SKIP_", "UNKNOWN_CHAR", "INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "GoogleDocstring.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GoogleDocstringParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocstringContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GoogleDocstringParser.EOF, 0); }
		public OneLinerContext oneLiner() {
			return getRuleContext(OneLinerContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GoogleDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GoogleDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(GoogleDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(GoogleDocstringParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(GoogleDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(GoogleDocstringParser.DEDENT, i);
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
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterDocstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitDocstring(this);
		}
	}

	public final DocstringContext docstring() throws RecognitionException {
		DocstringContext _localctx = new DocstringContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_docstring);
		int _la;
		try {
			int _alt;
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(50);
					match(NEWLINE);
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INDENT) {
					{
					{
					setState(56);
					match(INDENT);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				oneLiner();
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(63);
					match(NEWLINE);
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEDENT) {
					{
					{
					setState(69);
					match(DEDENT);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(75);
				match(EOF);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(77);
						match(NEWLINE);
						}
						}
						setState(82);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==INDENT) {
						{
						{
						setState(83);
						match(INDENT);
						}
						}
						setState(88);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DEDENT) {
						{
						{
						setState(89);
						match(DEDENT);
						}
						}
						setState(94);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(95);
					oneLiner();
					setState(96);
					match(NEWLINE);
					setState(97);
					match(NEWLINE);
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(98);
							match(INDENT);
							}
							} 
						}
						setState(103);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(104);
							match(DEDENT);
							}
							} 
						}
						setState(109);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					}
					break;
				}
				{
				setState(131); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(115);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(112);
								match(NEWLINE);
								}
								} 
							}
							setState(117);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						}
						setState(121);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(118);
								match(INDENT);
								}
								} 
							}
							setState(123);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						}
						setState(127);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(124);
								match(DEDENT);
								}
								} 
							}
							setState(129);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						}
						setState(130);
						components();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(133); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(136); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(135);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(138); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DEDENT) {
						{
						{
						setState(140);
						match(DEDENT);
						}
						}
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
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
		public AttributesComponentContext attributesComponent() {
			return getRuleContext(AttributesComponentContext.class,0);
		}
		public ArgsComponentContext argsComponent() {
			return getRuleContext(ArgsComponentContext.class,0);
		}
		public ReturnComponentContext returnComponent() {
			return getRuleContext(ReturnComponentContext.class,0);
		}
		public RaiseComponentContext raiseComponent() {
			return getRuleContext(RaiseComponentContext.class,0);
		}
		public OtherSectionsContext otherSections() {
			return getRuleContext(OtherSectionsContext.class,0);
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
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterComponents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitComponents(this);
		}
	}

	public final ComponentsContext components() throws RecognitionException {
		ComponentsContext _localctx = new ComponentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_components);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTRIBUTES:
				{
				setState(155);
				attributesComponent();
				}
				break;
			case ARGS:
				{
				setState(156);
				argsComponent();
				}
				break;
			case RETURNS:
				{
				setState(157);
				returnComponent();
				}
				break;
			case RAISES:
				{
				setState(158);
				raiseComponent();
				}
				break;
			case OTHERSECTIONS:
				{
				setState(159);
				otherSections();
				}
				break;
			case WS:
			case TRIPLEQUOTES:
			case PUNCTUATION:
			case COLONS:
			case HYPHENS:
			case NEWLINE:
			case NAME:
			case SKIP_:
			case UNKNOWN_CHAR:
			case INDENT:
			case DEDENT:
				{
				setState(160);
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
		public List<TerminalNode> NAME() { return getTokens(GoogleDocstringParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GoogleDocstringParser.NAME, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(GoogleDocstringParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(GoogleDocstringParser.PUNCTUATION, i);
		}
		public List<TerminalNode> WS() { return getTokens(GoogleDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GoogleDocstringParser.WS, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(GoogleDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(GoogleDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> HYPHENS() { return getTokens(GoogleDocstringParser.HYPHENS); }
		public TerminalNode HYPHENS(int i) {
			return getToken(GoogleDocstringParser.HYPHENS, i);
		}
		public List<TerminalNode> COLONS() { return getTokens(GoogleDocstringParser.COLONS); }
		public TerminalNode COLONS(int i) {
			return getToken(GoogleDocstringParser.COLONS, i);
		}
		public OneLinerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneLiner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterOneLiner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitOneLiner(this);
		}
	}

	public final OneLinerContext oneLiner() throws RecognitionException {
		OneLinerContext _localctx = new OneLinerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_oneLiner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << COLONS) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << COLONS) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0) );
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
		public List<TerminalNode> NEWLINE() { return getTokens(GoogleDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GoogleDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(GoogleDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(GoogleDocstringParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(GoogleDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(GoogleDocstringParser.DEDENT, i);
		}
		public List<TerminalNode> PARAMNAMINGS() { return getTokens(GoogleDocstringParser.PARAMNAMINGS); }
		public TerminalNode PARAMNAMINGS(int i) {
			return getToken(GoogleDocstringParser.PARAMNAMINGS, i);
		}
		public List<TerminalNode> ARGS() { return getTokens(GoogleDocstringParser.ARGS); }
		public TerminalNode ARGS(int i) {
			return getToken(GoogleDocstringParser.ARGS, i);
		}
		public List<TerminalNode> RETURNS() { return getTokens(GoogleDocstringParser.RETURNS); }
		public TerminalNode RETURNS(int i) {
			return getToken(GoogleDocstringParser.RETURNS, i);
		}
		public List<TerminalNode> RAISES() { return getTokens(GoogleDocstringParser.RAISES); }
		public TerminalNode RAISES(int i) {
			return getToken(GoogleDocstringParser.RAISES, i);
		}
		public List<TerminalNode> ATTRIBUTES() { return getTokens(GoogleDocstringParser.ATTRIBUTES); }
		public TerminalNode ATTRIBUTES(int i) {
			return getToken(GoogleDocstringParser.ATTRIBUTES, i);
		}
		public List<TerminalNode> OTHERSECTIONS() { return getTokens(GoogleDocstringParser.OTHERSECTIONS); }
		public TerminalNode OTHERSECTIONS(int i) {
			return getToken(GoogleDocstringParser.OTHERSECTIONS, i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitDescription(this);
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
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(168);
				match(NEWLINE);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(174);
						match(INDENT);
						}
						break;
					}
					setState(178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(177);
						_la = _input.LA(1);
						if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARAMNAMINGS) | (1L << ARGS) | (1L << RETURNS) | (1L << RAISES) | (1L << ATTRIBUTES) | (1L << OTHERSECTIONS) | (1L << NEWLINE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(180); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TRIPLEQUOTES) | (1L << PUNCTUATION) | (1L << COLONS) | (1L << HYPHENS) | (1L << NAME) | (1L << SKIP_) | (1L << UNKNOWN_CHAR) | (1L << INDENT) | (1L << DEDENT))) != 0) );
					setState(183); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(182);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(185); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(187);
						match(DEDENT);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class AttributesComponentContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTES() { return getToken(GoogleDocstringParser.ATTRIBUTES, 0); }
		public TerminalNode INDENT() { return getToken(GoogleDocstringParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(GoogleDocstringParser.DEDENT, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<AttributeDescriptionContext> attributeDescription() {
			return getRuleContexts(AttributeDescriptionContext.class);
		}
		public AttributeDescriptionContext attributeDescription(int i) {
			return getRuleContext(AttributeDescriptionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GoogleDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GoogleDocstringParser.NEWLINE, i);
		}
		public AttributesComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributesComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterAttributesComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitAttributesComponent(this);
		}
	}

	public final AttributesComponentContext attributesComponent() throws RecognitionException {
		AttributesComponentContext _localctx = new AttributesComponentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attributesComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ATTRIBUTES);
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(195);
					match(NEWLINE);
					}
					}
					setState(198); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(200);
				match(INDENT);
				}
				break;
			}
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(203);
						attributes();
						}
						break;
					case 2:
						{
						setState(204);
						attributeDescription();
						}
						break;
					}
					setState(210);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(207);
							match(NEWLINE);
							}
							} 
						}
						setState(212);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(218);
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

	public static class AttributesContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeDescriptionContext attributeDescription() {
			return getRuleContext(AttributeDescriptionContext.class,0);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			attributeName();
			setState(222);
			attributeDescription();
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
		public VariableIndicatorContext variableIndicator() {
			return getRuleContext(VariableIndicatorContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitAttributeName(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			variableIndicator();
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
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterAttributeDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitAttributeDescription(this);
		}
	}

	public final AttributeDescriptionContext attributeDescription() throws RecognitionException {
		AttributeDescriptionContext _localctx = new AttributeDescriptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attributeDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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

	public static class ArgsComponentContext extends ParserRuleContext {
		public TerminalNode ARGS() { return getToken(GoogleDocstringParser.ARGS, 0); }
		public TerminalNode INDENT() { return getToken(GoogleDocstringParser.INDENT, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public TerminalNode DEDENT() { return getToken(GoogleDocstringParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GoogleDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GoogleDocstringParser.NEWLINE, i);
		}
		public ArgsComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterArgsComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitArgsComponent(this);
		}
	}

	public final ArgsComponentContext argsComponent() throws RecognitionException {
		ArgsComponentContext _localctx = new ArgsComponentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argsComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ARGS);
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(229);
					match(NEWLINE);
					}
					}
					setState(232); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(234);
				match(INDENT);
				}
				break;
			}
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					args();
					setState(241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(238);
							match(NEWLINE);
							}
							} 
						}
						setState(243);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
					}
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(249);
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

	public static class ArgsContext extends ParserRuleContext {
		public ArgNameContext argName() {
			return getRuleContext(ArgNameContext.class,0);
		}
		public ArgDescriptionContext argDescription() {
			return getRuleContext(ArgDescriptionContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			argName();
			setState(253);
			argDescription();
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

	public static class ArgNameContext extends ParserRuleContext {
		public VariableIndicatorContext variableIndicator() {
			return getRuleContext(VariableIndicatorContext.class,0);
		}
		public ArgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterArgName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitArgName(this);
		}
	}

	public final ArgNameContext argName() throws RecognitionException {
		ArgNameContext _localctx = new ArgNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			variableIndicator();
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

	public static class ArgDescriptionContext extends ParserRuleContext {
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public ArgDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterArgDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitArgDescription(this);
		}
	}

	public final ArgDescriptionContext argDescription() throws RecognitionException {
		ArgDescriptionContext _localctx = new ArgDescriptionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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

	public static class ReturnComponentContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(GoogleDocstringParser.RETURNS, 0); }
		public TerminalNode INDENT() { return getToken(GoogleDocstringParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(GoogleDocstringParser.DEDENT, 0); }
		public List<ReturnObjectContext> returnObject() {
			return getRuleContexts(ReturnObjectContext.class);
		}
		public ReturnObjectContext returnObject(int i) {
			return getRuleContext(ReturnObjectContext.class,i);
		}
		public List<ReturnDescriptionContext> returnDescription() {
			return getRuleContexts(ReturnDescriptionContext.class);
		}
		public ReturnDescriptionContext returnDescription(int i) {
			return getRuleContext(ReturnDescriptionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GoogleDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GoogleDocstringParser.NEWLINE, i);
		}
		public ReturnComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterReturnComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitReturnComponent(this);
		}
	}

	public final ReturnComponentContext returnComponent() throws RecognitionException {
		ReturnComponentContext _localctx = new ReturnComponentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(RETURNS);
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(260);
					match(NEWLINE);
					}
					}
					setState(263); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(265);
				match(INDENT);
				}
				break;
			}
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(268);
						returnObject();
						}
						break;
					case 2:
						{
						setState(269);
						returnDescription();
						}
						break;
					}
					setState(275);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(272);
							match(NEWLINE);
							}
							} 
						}
						setState(277);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					}
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(283);
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

	public static class ReturnObjectContext extends ParserRuleContext {
		public ReturnNameContext returnName() {
			return getRuleContext(ReturnNameContext.class,0);
		}
		public ReturnDescriptionContext returnDescription() {
			return getRuleContext(ReturnDescriptionContext.class,0);
		}
		public ReturnObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterReturnObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitReturnObject(this);
		}
	}

	public final ReturnObjectContext returnObject() throws RecognitionException {
		ReturnObjectContext _localctx = new ReturnObjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			returnName();
			setState(287);
			returnDescription();
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
		public VariableIndicatorContext variableIndicator() {
			return getRuleContext(VariableIndicatorContext.class,0);
		}
		public ReturnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterReturnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitReturnName(this);
		}
	}

	public final ReturnNameContext returnName() throws RecognitionException {
		ReturnNameContext _localctx = new ReturnNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(289);
			variableIndicator();
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
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterReturnDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitReturnDescription(this);
		}
	}

	public final ReturnDescriptionContext returnDescription() throws RecognitionException {
		ReturnDescriptionContext _localctx = new ReturnDescriptionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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

	public static class RaiseComponentContext extends ParserRuleContext {
		public TerminalNode RAISES() { return getToken(GoogleDocstringParser.RAISES, 0); }
		public TerminalNode INDENT() { return getToken(GoogleDocstringParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(GoogleDocstringParser.DEDENT, 0); }
		public List<RaiseObjectContext> raiseObject() {
			return getRuleContexts(RaiseObjectContext.class);
		}
		public RaiseObjectContext raiseObject(int i) {
			return getRuleContext(RaiseObjectContext.class,i);
		}
		public List<RaiseDescriptionContext> raiseDescription() {
			return getRuleContexts(RaiseDescriptionContext.class);
		}
		public RaiseDescriptionContext raiseDescription(int i) {
			return getRuleContext(RaiseDescriptionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GoogleDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GoogleDocstringParser.NEWLINE, i);
		}
		public RaiseComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterRaiseComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitRaiseComponent(this);
		}
	}

	public final RaiseComponentContext raiseComponent() throws RecognitionException {
		RaiseComponentContext _localctx = new RaiseComponentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_raiseComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(RAISES);
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(294);
					match(NEWLINE);
					}
					}
					setState(297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(299);
				match(INDENT);
				}
				break;
			}
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(304);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(302);
						raiseObject();
						}
						break;
					case 2:
						{
						setState(303);
						raiseDescription();
						}
						break;
					}
					setState(309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(306);
							match(NEWLINE);
							}
							} 
						}
						setState(311);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					}
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(317);
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

	public static class RaiseObjectContext extends ParserRuleContext {
		public RaiseNameContext raiseName() {
			return getRuleContext(RaiseNameContext.class,0);
		}
		public RaiseDescriptionContext raiseDescription() {
			return getRuleContext(RaiseDescriptionContext.class,0);
		}
		public RaiseObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterRaiseObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitRaiseObject(this);
		}
	}

	public final RaiseObjectContext raiseObject() throws RecognitionException {
		RaiseObjectContext _localctx = new RaiseObjectContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_raiseObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			raiseName();
			setState(321);
			raiseDescription();
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
		public VariableIndicatorContext variableIndicator() {
			return getRuleContext(VariableIndicatorContext.class,0);
		}
		public RaiseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterRaiseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitRaiseName(this);
		}
	}

	public final RaiseNameContext raiseName() throws RecognitionException {
		RaiseNameContext _localctx = new RaiseNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_raiseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(323);
			variableIndicator();
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
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterRaiseDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitRaiseDescription(this);
		}
	}

	public final RaiseDescriptionContext raiseDescription() throws RecognitionException {
		RaiseDescriptionContext _localctx = new RaiseDescriptionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_raiseDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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

	public static class VariableIndicatorContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode COLONS() { return getToken(GoogleDocstringParser.COLONS, 0); }
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(GoogleDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(GoogleDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> WS() { return getTokens(GoogleDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GoogleDocstringParser.WS, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableIndicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIndicator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterVariableIndicator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitVariableIndicator(this);
		}
	}

	public final VariableIndicatorContext variableIndicator() throws RecognitionException {
		VariableIndicatorContext _localctx = new VariableIndicatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableIndicator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNKNOWN_CHAR) {
				{
				{
				setState(327);
				match(UNKNOWN_CHAR);
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(333);
				match(WS);
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			variableName();
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340);
					match(WS);
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(346);
					match(UNKNOWN_CHAR);
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(352);
				match(WS);
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME || _la==UNKNOWN_CHAR) {
				{
				setState(358);
				type();
				}
			}

			setState(361);
			match(COLONS);
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
		public TerminalNode NAME() { return getToken(GoogleDocstringParser.NAME, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(NAME);
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
		public TerminalNode NAME() { return getToken(GoogleDocstringParser.NAME, 0); }
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(GoogleDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(GoogleDocstringParser.UNKNOWN_CHAR, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNKNOWN_CHAR) {
				{
				setState(365);
				match(UNKNOWN_CHAR);
				}
			}

			setState(368);
			match(NAME);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNKNOWN_CHAR) {
				{
				setState(369);
				match(UNKNOWN_CHAR);
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

	public static class VariableDescriptionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(GoogleDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GoogleDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> NAME() { return getTokens(GoogleDocstringParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GoogleDocstringParser.NAME, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(GoogleDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(GoogleDocstringParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(GoogleDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(GoogleDocstringParser.DEDENT, i);
		}
		public List<TerminalNode> WS() { return getTokens(GoogleDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GoogleDocstringParser.WS, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(GoogleDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(GoogleDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(GoogleDocstringParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(GoogleDocstringParser.PUNCTUATION, i);
		}
		public List<TerminalNode> HYPHENS() { return getTokens(GoogleDocstringParser.HYPHENS); }
		public TerminalNode HYPHENS(int i) {
			return getToken(GoogleDocstringParser.HYPHENS, i);
		}
		public List<TerminalNode> COLONS() { return getTokens(GoogleDocstringParser.COLONS); }
		public TerminalNode COLONS(int i) {
			return getToken(GoogleDocstringParser.COLONS, i);
		}
		public VariableDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterVariableDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitVariableDescription(this);
		}
	}

	public final VariableDescriptionContext variableDescription() throws RecognitionException {
		VariableDescriptionContext _localctx = new VariableDescriptionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDescription);
		int _la;
		try {
			int _alt;
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					{
					setState(384); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(372);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(374); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(373);
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
							setState(376); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(381);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COLONS) {
							{
							{
							setState(378);
							match(COLONS);
							}
							}
							setState(383);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(386); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0) );
					setState(388);
					match(NEWLINE);
					}
					}
					break;
				case 2:
					{
					{
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(389);
						match(WS);
						}
						}
						setState(394);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(395);
					match(NAME);
					setState(396);
					match(NEWLINE);
					setState(398);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						setState(397);
						match(INDENT);
						}
						break;
					}
					}
					}
					break;
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(403);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INDENT) {
							{
							setState(402);
							match(INDENT);
							}
						}

						setState(428);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
						case 1:
							{
							setState(417); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(405);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(407); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(406);
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
									setState(409); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								setState(414);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COLONS) {
									{
									{
									setState(411);
									match(COLONS);
									}
									}
									setState(416);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								}
								setState(419); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0) );
							}
							break;
						case 2:
							{
							{
							setState(424);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS) {
								{
								{
								setState(421);
								match(WS);
								}
								}
								setState(426);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(427);
							match(NAME);
							}
							}
							break;
						}
						setState(430);
						match(NEWLINE);
						setState(432);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
						case 1:
							{
							setState(431);
							match(DEDENT);
							}
							break;
						}
						}
						} 
					}
					setState(438);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(439);
					match(WS);
					}
					}
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(445);
				match(NAME);
				setState(446);
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

	public static class OtherSectionsContext extends ParserRuleContext {
		public TerminalNode OTHERSECTIONS() { return getToken(GoogleDocstringParser.OTHERSECTIONS, 0); }
		public TerminalNode INDENT() { return getToken(GoogleDocstringParser.INDENT, 0); }
		public List<VariableIndicatorContext> variableIndicator() {
			return getRuleContexts(VariableIndicatorContext.class);
		}
		public VariableIndicatorContext variableIndicator(int i) {
			return getRuleContext(VariableIndicatorContext.class,i);
		}
		public List<VariableDescriptionContext> variableDescription() {
			return getRuleContexts(VariableDescriptionContext.class);
		}
		public VariableDescriptionContext variableDescription(int i) {
			return getRuleContext(VariableDescriptionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GoogleDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GoogleDocstringParser.NEWLINE, i);
		}
		public OtherSectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherSections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).enterOtherSections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoogleDocstringListener ) ((GoogleDocstringListener)listener).exitOtherSections(this);
		}
	}

	public final OtherSectionsContext otherSections() throws RecognitionException {
		OtherSectionsContext _localctx = new OtherSectionsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_otherSections);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(OTHERSECTIONS);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(451); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(450);
					match(NEWLINE);
					}
					}
					setState(453); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(455);
				match(INDENT);
				}
			}

			setState(460); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(458);
						variableIndicator();
						}
						break;
					case 2:
						{
						setState(459);
						variableDescription();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(462); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u01d3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\3\2"+
		"\7\2Q\n\2\f\2\16\2T\13\2\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\7\2]\n\2\f\2"+
		"\16\2`\13\2\3\2\3\2\3\2\3\2\7\2f\n\2\f\2\16\2i\13\2\3\2\7\2l\n\2\f\2\16"+
		"\2o\13\2\5\2q\n\2\3\2\7\2t\n\2\f\2\16\2w\13\2\3\2\7\2z\n\2\f\2\16\2}\13"+
		"\2\3\2\7\2\u0080\n\2\f\2\16\2\u0083\13\2\3\2\6\2\u0086\n\2\r\2\16\2\u0087"+
		"\3\2\6\2\u008b\n\2\r\2\16\2\u008c\3\2\7\2\u0090\n\2\f\2\16\2\u0093\13"+
		"\2\7\2\u0095\n\2\f\2\16\2\u0098\13\2\3\2\3\2\5\2\u009c\n\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u00a4\n\3\3\4\6\4\u00a7\n\4\r\4\16\4\u00a8\3\5\7\5\u00ac"+
		"\n\5\f\5\16\5\u00af\13\5\3\5\5\5\u00b2\n\5\3\5\6\5\u00b5\n\5\r\5\16\5"+
		"\u00b6\3\5\6\5\u00ba\n\5\r\5\16\5\u00bb\3\5\5\5\u00bf\n\5\6\5\u00c1\n"+
		"\5\r\5\16\5\u00c2\3\6\3\6\6\6\u00c7\n\6\r\6\16\6\u00c8\3\6\5\6\u00cc\n"+
		"\6\3\6\3\6\5\6\u00d0\n\6\3\6\7\6\u00d3\n\6\f\6\16\6\u00d6\13\6\7\6\u00d8"+
		"\n\6\f\6\16\6\u00db\13\6\3\6\5\6\u00de\n\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\6\n\u00e9\n\n\r\n\16\n\u00ea\3\n\5\n\u00ee\n\n\3\n\3\n\7\n\u00f2"+
		"\n\n\f\n\16\n\u00f5\13\n\7\n\u00f7\n\n\f\n\16\n\u00fa\13\n\3\n\5\n\u00fd"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\6\16\u0108\n\16\r\16\16"+
		"\16\u0109\3\16\5\16\u010d\n\16\3\16\3\16\5\16\u0111\n\16\3\16\7\16\u0114"+
		"\n\16\f\16\16\16\u0117\13\16\7\16\u0119\n\16\f\16\16\16\u011c\13\16\3"+
		"\16\5\16\u011f\n\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\6\22"+
		"\u012a\n\22\r\22\16\22\u012b\3\22\5\22\u012f\n\22\3\22\3\22\5\22\u0133"+
		"\n\22\3\22\7\22\u0136\n\22\f\22\16\22\u0139\13\22\7\22\u013b\n\22\f\22"+
		"\16\22\u013e\13\22\3\22\5\22\u0141\n\22\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\7\26\u014b\n\26\f\26\16\26\u014e\13\26\3\26\7\26\u0151\n\26"+
		"\f\26\16\26\u0154\13\26\3\26\3\26\7\26\u0158\n\26\f\26\16\26\u015b\13"+
		"\26\3\26\7\26\u015e\n\26\f\26\16\26\u0161\13\26\3\26\7\26\u0164\n\26\f"+
		"\26\16\26\u0167\13\26\3\26\5\26\u016a\n\26\3\26\3\26\3\27\3\27\3\30\5"+
		"\30\u0171\n\30\3\30\3\30\5\30\u0175\n\30\3\31\3\31\6\31\u0179\n\31\r\31"+
		"\16\31\u017a\3\31\7\31\u017e\n\31\f\31\16\31\u0181\13\31\6\31\u0183\n"+
		"\31\r\31\16\31\u0184\3\31\3\31\7\31\u0189\n\31\f\31\16\31\u018c\13\31"+
		"\3\31\3\31\3\31\5\31\u0191\n\31\5\31\u0193\n\31\3\31\5\31\u0196\n\31\3"+
		"\31\3\31\6\31\u019a\n\31\r\31\16\31\u019b\3\31\7\31\u019f\n\31\f\31\16"+
		"\31\u01a2\13\31\6\31\u01a4\n\31\r\31\16\31\u01a5\3\31\7\31\u01a9\n\31"+
		"\f\31\16\31\u01ac\13\31\3\31\5\31\u01af\n\31\3\31\3\31\5\31\u01b3\n\31"+
		"\7\31\u01b5\n\31\f\31\16\31\u01b8\13\31\3\31\7\31\u01bb\n\31\f\31\16\31"+
		"\u01be\13\31\3\31\3\31\5\31\u01c2\n\31\3\32\3\32\6\32\u01c6\n\32\r\32"+
		"\16\32\u01c7\3\32\5\32\u01cb\n\32\3\32\3\32\6\32\u01cf\n\32\r\32\16\32"+
		"\u01d0\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\2\5\6\2\3\3\13\r\17\17\21\21\4\2\5\n\16\16\7\2\3\3\13\13\r\r\17\17"+
		"\21\21\2\u020a\2\u009b\3\2\2\2\4\u00a3\3\2\2\2\6\u00a6\3\2\2\2\b\u00ad"+
		"\3\2\2\2\n\u00c4\3\2\2\2\f\u00df\3\2\2\2\16\u00e2\3\2\2\2\20\u00e4\3\2"+
		"\2\2\22\u00e6\3\2\2\2\24\u00fe\3\2\2\2\26\u0101\3\2\2\2\30\u0103\3\2\2"+
		"\2\32\u0105\3\2\2\2\34\u0120\3\2\2\2\36\u0123\3\2\2\2 \u0125\3\2\2\2\""+
		"\u0127\3\2\2\2$\u0142\3\2\2\2&\u0145\3\2\2\2(\u0147\3\2\2\2*\u014c\3\2"+
		"\2\2,\u016d\3\2\2\2.\u0170\3\2\2\2\60\u01c1\3\2\2\2\62\u01c3\3\2\2\2\64"+
		"\66\7\16\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28=\3\2"+
		"\2\29\67\3\2\2\2:<\7\22\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@"+
		"\3\2\2\2?=\3\2\2\2@D\5\6\4\2AC\7\16\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2"+
		"DE\3\2\2\2EJ\3\2\2\2FD\3\2\2\2GI\7\23\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2"+
		"\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\2\2\3N\u009c\3\2\2\2OQ\7\16\2\2P"+
		"O\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SX\3\2\2\2TR\3\2\2\2UW\7\22\2\2"+
		"VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y^\3\2\2\2ZX\3\2\2\2[]\7\23\2"+
		"\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\5\6"+
		"\4\2bc\7\16\2\2cg\7\16\2\2df\7\22\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh"+
		"\3\2\2\2hm\3\2\2\2ig\3\2\2\2jl\7\23\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2"+
		"mn\3\2\2\2nq\3\2\2\2om\3\2\2\2pR\3\2\2\2pq\3\2\2\2q\u0085\3\2\2\2rt\7"+
		"\16\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v{\3\2\2\2wu\3\2\2\2xz"+
		"\7\22\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0081\3\2\2\2}{\3\2"+
		"\2\2~\u0080\7\23\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086"+
		"\5\4\3\2\u0085u\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0096\3\2\2\2\u0089\u008b\7\16\2\2\u008a\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u0091\3\2\2\2\u008e\u0090\7\23\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u008a\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\7\2\2\3\u009a\u009c\3\2\2\2\u009b\67\3\2\2\2\u009bp\3\2\2\2\u009c"+
		"\3\3\2\2\2\u009d\u00a4\5\n\6\2\u009e\u00a4\5\22\n\2\u009f\u00a4\5\32\16"+
		"\2\u00a0\u00a4\5\"\22\2\u00a1\u00a4\5\62\32\2\u00a2\u00a4\5\b\5\2\u00a3"+
		"\u009d\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\5\3\2\2\2\u00a5\u00a7"+
		"\t\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\7\3\2\2\2\u00aa\u00ac\7\16\2\2\u00ab\u00aa\3\2\2"+
		"\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00c0"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\7\22\2\2\u00b1\u00b0\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\n\3\2\2\u00b4\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00ba\7\16\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3"+
		"\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bf\7\23\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3"+
		"\2\2\2\u00c0\u00b1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\t\3\2\2\2\u00c4\u00cb\7\t\2\2\u00c5\u00c7\7\16\2"+
		"\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\7\22\2\2\u00cb\u00c6\3\2\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc\u00d9\3\2\2\2\u00cd\u00d0\5\f\7\2\u00ce\u00d0"+
		"\5\20\t\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d4\3\2\2\2"+
		"\u00d1\u00d3\7\16\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00cf\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\7\23\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\13\3\2\2\2\u00df\u00e0\5\16\b"+
		"\2\u00e0\u00e1\5\20\t\2\u00e1\r\3\2\2\2\u00e2\u00e3\5*\26\2\u00e3\17\3"+
		"\2\2\2\u00e4\u00e5\5\60\31\2\u00e5\21\3\2\2\2\u00e6\u00ed\7\6\2\2\u00e7"+
		"\u00e9\7\16\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\7\22\2\2\u00ed"+
		"\u00e8\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f8\3\2\2\2\u00ef\u00f3\5\24"+
		"\13\2\u00f0\u00f2\7\16\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00ef\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7\23"+
		"\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\23\3\2\2\2\u00fe\u00ff"+
		"\5\26\f\2\u00ff\u0100\5\30\r\2\u0100\25\3\2\2\2\u0101\u0102\5*\26\2\u0102"+
		"\27\3\2\2\2\u0103\u0104\5\60\31\2\u0104\31\3\2\2\2\u0105\u010c\7\7\2\2"+
		"\u0106\u0108\7\16\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\7\22\2\2"+
		"\u010c\u0107\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u011a\3\2\2\2\u010e\u0111"+
		"\5\34\17\2\u010f\u0111\5 \21\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2"+
		"\u0111\u0115\3\2\2\2\u0112\u0114\7\16\2\2\u0113\u0112\3\2\2\2\u0114\u0117"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u0110\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011f\7\23\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\33\3\2\2"+
		"\2\u0120\u0121\5\36\20\2\u0121\u0122\5 \21\2\u0122\35\3\2\2\2\u0123\u0124"+
		"\5*\26\2\u0124\37\3\2\2\2\u0125\u0126\5\60\31\2\u0126!\3\2\2\2\u0127\u012e"+
		"\7\b\2\2\u0128\u012a\7\16\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2"+
		"\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f"+
		"\7\22\2\2\u012e\u0129\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u013c\3\2\2\2"+
		"\u0130\u0133\5$\23\2\u0131\u0133\5(\25\2\u0132\u0130\3\2\2\2\u0132\u0131"+
		"\3\2\2\2\u0133\u0137\3\2\2\2\u0134\u0136\7\16\2\2\u0135\u0134\3\2\2\2"+
		"\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013b"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u0132\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013f\u0141\7\23\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"#\3\2\2\2\u0142\u0143\5&\24\2\u0143\u0144\5(\25\2\u0144%\3\2\2\2\u0145"+
		"\u0146\5*\26\2\u0146\'\3\2\2\2\u0147\u0148\5\60\31\2\u0148)\3\2\2\2\u0149"+
		"\u014b\7\21\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3"+
		"\2\2\2\u014c\u014d\3\2\2\2\u014d\u0152\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0151\7\3\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0159\5,\27\2\u0156\u0158\7\3\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015f\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015e\7\21\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3"+
		"\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0165\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0164\7\3\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0169\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u016a\5.\30\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7\f\2\2\u016c+\3\2\2\2\u016d\u016e"+
		"\7\17\2\2\u016e-\3\2\2\2\u016f\u0171\7\21\2\2\u0170\u016f\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\7\17\2\2\u0173\u0175\7"+
		"\21\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175/\3\2\2\2\u0176\u0178"+
		"\t\4\2\2\u0177\u0179\t\4\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017f\3\2\2\2\u017c\u017e\7\f"+
		"\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0176\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0193\7\16\2\2\u0187\u0189\7\3\2\2\u0188\u0187\3"+
		"\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7\17\2\2\u018e\u0190\7"+
		"\16\2\2\u018f\u0191\7\22\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0182\3\2\2\2\u0192\u018a\3\2\2\2\u0193\u01b6\3\2"+
		"\2\2\u0194\u0196\7\22\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u01ae\3\2\2\2\u0197\u0199\t\4\2\2\u0198\u019a\t\4\2\2\u0199\u0198\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u01a0\3\2\2\2\u019d\u019f\7\f\2\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u0197\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01af\3\2\2\2\u01a7\u01a9\7\3\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01af\7\17\2\2\u01ae"+
		"\u01a3\3\2\2\2\u01ae\u01aa\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\7\16"+
		"\2\2\u01b1\u01b3\7\23\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u0195\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2"+
		"\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01c2\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9"+
		"\u01bb\7\3\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf"+
		"\u01c0\7\17\2\2\u01c0\u01c2\7\16\2\2\u01c1\u0192\3\2\2\2\u01c1\u01bc\3"+
		"\2\2\2\u01c2\61\3\2\2\2\u01c3\u01ca\7\n\2\2\u01c4\u01c6\7\16\2\2\u01c5"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\7\22\2\2\u01ca\u01c5\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01cf\5*\26\2\u01cd\u01cf\5\60"+
		"\31\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\63\3\2\2\2O\67=DJRX^gmpu{\u0081"+
		"\u0087\u008c\u0091\u0096\u009b\u00a3\u00a8\u00ad\u00b1\u00b6\u00bb\u00be"+
		"\u00c2\u00c8\u00cb\u00cf\u00d4\u00d9\u00dd\u00ea\u00ed\u00f3\u00f8\u00fc"+
		"\u0109\u010c\u0110\u0115\u011a\u011e\u012b\u012e\u0132\u0137\u013c\u0140"+
		"\u014c\u0152\u0159\u015f\u0165\u0169\u0170\u0174\u017a\u017f\u0184\u018a"+
		"\u0190\u0192\u0195\u019b\u01a0\u01a5\u01aa\u01ae\u01b2\u01b6\u01bc\u01c1"+
		"\u01c7\u01ca\u01ce\u01d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}