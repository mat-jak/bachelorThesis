// Generated from EpyDocstring.g4 by ANTLR 4.7.1

   package ch.jako.parser.epydoc;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EpyDocstringParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, TRIPLEQUOTES=2, PARAMNAMINGS=3, PARAM=4, PARAMTYPE=5, KEYWORD=6, 
		RAISES=7, RETURNS=8, RETURNTYPE=9, VARIABLE=10, OTHERSECTIONS=11, PUNCTUATION=12, 
		HYPHENS=13, COLONS=14, NEWLINE=15, NAME=16, SKIP_=17, UNKNOWN_CHAR=18, 
		INDENT=19, DEDENT=20;
	public static final int
		RULE_docstring = 0, RULE_components = 1, RULE_oneLiner = 2, RULE_description = 3, 
		RULE_param = 4, RULE_paramType = 5, RULE_keyword = 6, RULE_variable = 7, 
		RULE_returnItem = 8, RULE_returnType = 9, RULE_raiseItem = 10, RULE_typeItemName = 11, 
		RULE_variableDescription = 12, RULE_otherSection = 13, RULE_type = 14, 
		RULE_name = 15;
	public static final String[] ruleNames = {
		"docstring", "components", "oneLiner", "description", "param", "paramType", 
		"keyword", "variable", "returnItem", "returnType", "raiseItem", "typeItemName", 
		"variableDescription", "otherSection", "type", "name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'@type'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "TRIPLEQUOTES", "PARAMNAMINGS", "PARAM", "PARAMTYPE", "KEYWORD", 
		"RAISES", "RETURNS", "RETURNTYPE", "VARIABLE", "OTHERSECTIONS", "PUNCTUATION", 
		"HYPHENS", "COLONS", "NEWLINE", "NAME", "SKIP_", "UNKNOWN_CHAR", "INDENT", 
		"DEDENT"
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
	public String getGrammarFileName() { return "EpyDocstring.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EpyDocstringParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocstringContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EpyDocstringParser.EOF, 0); }
		public OneLinerContext oneLiner() {
			return getRuleContext(OneLinerContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(EpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EpyDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(EpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(EpyDocstringParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(EpyDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(EpyDocstringParser.DEDENT, i);
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
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterDocstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitDocstring(this);
		}
	}

	public final DocstringContext docstring() throws RecognitionException {
		DocstringContext _localctx = new DocstringContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_docstring);
		int _la;
		try {
			int _alt;
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(32);
					match(NEWLINE);
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INDENT) {
					{
					{
					setState(38);
					match(INDENT);
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				oneLiner();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(45);
					match(NEWLINE);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEDENT) {
					{
					{
					setState(51);
					match(DEDENT);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(57);
				match(EOF);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(59);
						match(NEWLINE);
						}
						}
						setState(64);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==INDENT) {
						{
						{
						setState(65);
						match(INDENT);
						}
						}
						setState(70);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DEDENT) {
						{
						{
						setState(71);
						match(DEDENT);
						}
						}
						setState(76);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(77);
					oneLiner();
					setState(78);
					match(NEWLINE);
					setState(79);
					match(NEWLINE);
					setState(83);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(80);
							match(INDENT);
							}
							} 
						}
						setState(85);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					setState(89);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(86);
							match(DEDENT);
							}
							} 
						}
						setState(91);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					}
					break;
				}
				{
				setState(113); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(97);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(94);
								match(NEWLINE);
								}
								} 
							}
							setState(99);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						}
						setState(103);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(100);
								match(INDENT);
								}
								} 
							}
							setState(105);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						}
						setState(109);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(106);
								match(DEDENT);
								}
								} 
							}
							setState(111);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						}
						setState(112);
						components();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(115); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(118); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(117);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(120); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DEDENT) {
						{
						{
						setState(122);
						match(DEDENT);
						}
						}
						setState(127);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
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
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ReturnItemContext returnItem() {
			return getRuleContext(ReturnItemContext.class,0);
		}
		public RaiseItemContext raiseItem() {
			return getRuleContext(RaiseItemContext.class,0);
		}
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public OtherSectionContext otherSection() {
			return getRuleContext(OtherSectionContext.class,0);
		}
		public ComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_components; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterComponents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitComponents(this);
		}
	}

	public final ComponentsContext components() throws RecognitionException {
		ComponentsContext _localctx = new ComponentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_components);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARAM:
				{
				setState(137);
				param();
				}
				break;
			case KEYWORD:
				{
				setState(138);
				keyword();
				}
				break;
			case VARIABLE:
				{
				setState(139);
				variable();
				}
				break;
			case RETURNS:
				{
				setState(140);
				returnItem();
				}
				break;
			case RAISES:
				{
				setState(141);
				raiseItem();
				}
				break;
			case PARAMTYPE:
				{
				setState(142);
				paramType();
				}
				break;
			case RETURNTYPE:
				{
				setState(143);
				returnType();
				}
				break;
			case WS:
			case PUNCTUATION:
			case HYPHENS:
			case NEWLINE:
			case NAME:
			case UNKNOWN_CHAR:
			case INDENT:
			case DEDENT:
				{
				setState(144);
				description();
				}
				break;
			case OTHERSECTIONS:
				{
				setState(145);
				otherSection();
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
		public List<TerminalNode> NAME() { return getTokens(EpyDocstringParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EpyDocstringParser.NAME, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(EpyDocstringParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(EpyDocstringParser.PUNCTUATION, i);
		}
		public List<TerminalNode> WS() { return getTokens(EpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(EpyDocstringParser.WS, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(EpyDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(EpyDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> HYPHENS() { return getTokens(EpyDocstringParser.HYPHENS); }
		public TerminalNode HYPHENS(int i) {
			return getToken(EpyDocstringParser.HYPHENS, i);
		}
		public List<TerminalNode> COLONS() { return getTokens(EpyDocstringParser.COLONS); }
		public TerminalNode COLONS(int i) {
			return getToken(EpyDocstringParser.COLONS, i);
		}
		public OneLinerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneLiner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterOneLiner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitOneLiner(this);
		}
	}

	public final OneLinerContext oneLiner() throws RecognitionException {
		OneLinerContext _localctx = new OneLinerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_oneLiner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
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
				setState(151); 
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
		public List<TerminalNode> NEWLINE() { return getTokens(EpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EpyDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(EpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(EpyDocstringParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(EpyDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(EpyDocstringParser.DEDENT, i);
		}
		public List<TerminalNode> COLONS() { return getTokens(EpyDocstringParser.COLONS); }
		public TerminalNode COLONS(int i) {
			return getToken(EpyDocstringParser.COLONS, i);
		}
		public List<TerminalNode> NAME() { return getTokens(EpyDocstringParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EpyDocstringParser.NAME, i);
		}
		public List<TerminalNode> WS() { return getTokens(EpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(EpyDocstringParser.WS, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(EpyDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(EpyDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(EpyDocstringParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(EpyDocstringParser.PUNCTUATION, i);
		}
		public List<TerminalNode> HYPHENS() { return getTokens(EpyDocstringParser.HYPHENS); }
		public TerminalNode HYPHENS(int i) {
			return getToken(EpyDocstringParser.HYPHENS, i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitDescription(this);
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
			setState(270); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(153);
						match(NEWLINE);
						}
						}
						setState(158);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==INDENT) {
						{
						{
						setState(159);
						match(INDENT);
						}
						}
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DEDENT) {
						{
						{
						setState(165);
						match(DEDENT);
						}
						}
						setState(170);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(182); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(172); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(171);
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
								setState(174); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(179);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COLONS) {
								{
								{
								setState(176);
								match(COLONS);
								}
								}
								setState(181);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(184); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(189);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(186);
							match(NEWLINE);
							}
							}
							setState(191);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(193); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(192);
							match(INDENT);
							}
							}
							setState(195); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==INDENT );
						setState(208); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(198); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(197);
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
									setState(200); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								setState(205);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COLONS) {
									{
									{
									setState(202);
									match(COLONS);
									}
									}
									setState(207);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(210); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(213);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
						case 1:
							{
							setState(212);
							match(DEDENT);
							}
							break;
						}
						}
						break;
					}
					setState(249);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(220);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NEWLINE) {
								{
								{
								setState(217);
								match(NEWLINE);
								}
								}
								setState(222);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(234); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(224); 
									_errHandler.sync(this);
									_alt = 1;
									do {
										switch (_alt) {
										case 1:
											{
											{
											setState(223);
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
										setState(226); 
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
									} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
									setState(231);
									_errHandler.sync(this);
									_la = _input.LA(1);
									while (_la==COLONS) {
										{
										{
										setState(228);
										match(COLONS);
										}
										}
										setState(233);
										_errHandler.sync(this);
										_la = _input.LA(1);
									}
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(236); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(241);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
								_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
							}
							setState(245);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
							case 1:
								{
								setState(244);
								match(DEDENT);
								}
								break;
							}
							}
							} 
						}
						setState(251);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					}
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(252);
							match(NEWLINE);
							}
							} 
						}
						setState(257);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(258);
							match(INDENT);
							}
							} 
						}
						setState(263);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(264);
							match(DEDENT);
							}
							} 
						}
						setState(269);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(272); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode PARAM() { return getToken(EpyDocstringParser.PARAM, 0); }
		public TerminalNode COLONS() { return getToken(EpyDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(EpyDocstringParser.INDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(EpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EpyDocstringParser.NEWLINE, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(PARAM);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(275);
				name();
				}
			}

			setState(278);
			match(COLONS);
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(279);
					match(NEWLINE);
					}
					}
					setState(282); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(284);
				match(INDENT);
				}
				break;
			}
			setState(287);
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

	public static class ParamTypeContext extends ParserRuleContext {
		public TerminalNode PARAMTYPE() { return getToken(EpyDocstringParser.PARAMTYPE, 0); }
		public TerminalNode COLONS() { return getToken(EpyDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public TypeItemNameContext typeItemName() {
			return getRuleContext(TypeItemNameContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(EpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EpyDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(EpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(EpyDocstringParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(EpyDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(EpyDocstringParser.DEDENT, i);
		}
		public ParamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterParamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitParamType(this);
		}
	}

	public final ParamTypeContext paramType() throws RecognitionException {
		ParamTypeContext _localctx = new ParamTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(PARAMTYPE);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(290);
				typeItemName();
				}
			}

			setState(293);
			match(COLONS);
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(295); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(294);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(297); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(299);
					match(INDENT);
					}
					break;
				}
				}
				break;
			}
			setState(304);
			variableDescription();
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					match(NEWLINE);
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					match(INDENT);
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(317);
					match(DEDENT);
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(EpyDocstringParser.KEYWORD, 0); }
		public TerminalNode COLONS() { return getToken(EpyDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(EpyDocstringParser.INDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(EpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EpyDocstringParser.NEWLINE, i);
		}
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(KEYWORD);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(324);
				name();
				}
			}

			setState(327);
			match(COLONS);
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(328);
					match(NEWLINE);
					}
					}
					setState(331); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(333);
				match(INDENT);
				}
				break;
			}
			setState(336);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(EpyDocstringParser.VARIABLE, 0); }
		public TerminalNode COLONS() { return getToken(EpyDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(EpyDocstringParser.INDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(EpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EpyDocstringParser.NEWLINE, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(VARIABLE);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(339);
				name();
				}
			}

			setState(342);
			match(COLONS);
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(344); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(343);
					match(NEWLINE);
					}
					}
					setState(346); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(348);
				match(INDENT);
				}
				break;
			}
			setState(351);
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

	public static class ReturnItemContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(EpyDocstringParser.RETURNS, 0); }
		public TerminalNode COLONS() { return getToken(EpyDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(EpyDocstringParser.INDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(EpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EpyDocstringParser.NEWLINE, i);
		}
		public ReturnItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterReturnItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitReturnItem(this);
		}
	}

	public final ReturnItemContext returnItem() throws RecognitionException {
		ReturnItemContext _localctx = new ReturnItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(RETURNS);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(354);
				name();
				}
			}

			setState(357);
			match(COLONS);
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(359); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(358);
					match(NEWLINE);
					}
					}
					setState(361); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(363);
				match(INDENT);
				}
				break;
			}
			setState(366);
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public TerminalNode RETURNTYPE() { return getToken(EpyDocstringParser.RETURNTYPE, 0); }
		public TerminalNode COLONS() { return getToken(EpyDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public TypeItemNameContext typeItemName() {
			return getRuleContext(TypeItemNameContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(EpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EpyDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(EpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(EpyDocstringParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(EpyDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(EpyDocstringParser.DEDENT, i);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitReturnType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(RETURNTYPE);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(369);
				typeItemName();
				}
			}

			setState(372);
			match(COLONS);
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(374); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(373);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(376); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(378);
					match(INDENT);
					}
					break;
				}
				}
				break;
			}
			setState(383);
			variableDescription();
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(384);
					match(NEWLINE);
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(390);
					match(INDENT);
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(396);
					match(DEDENT);
					}
					} 
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		public TerminalNode RAISES() { return getToken(EpyDocstringParser.RAISES, 0); }
		public TerminalNode COLONS() { return getToken(EpyDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(EpyDocstringParser.INDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(EpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EpyDocstringParser.NEWLINE, i);
		}
		public RaiseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterRaiseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitRaiseItem(this);
		}
	}

	public final RaiseItemContext raiseItem() throws RecognitionException {
		RaiseItemContext _localctx = new RaiseItemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_raiseItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(RAISES);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(403);
				name();
				}
			}

			setState(406);
			match(COLONS);
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(408); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(407);
					match(NEWLINE);
					}
					}
					setState(410); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(412);
				match(INDENT);
				}
				break;
			}
			setState(415);
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

	public static class TypeItemNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EpyDocstringParser.NAME, 0); }
		public List<TerminalNode> WS() { return getTokens(EpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(EpyDocstringParser.WS, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(EpyDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(EpyDocstringParser.UNKNOWN_CHAR, i);
		}
		public TypeItemNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeItemName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterTypeItemName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitTypeItemName(this);
		}
	}

	public final TypeItemNameContext typeItemName() throws RecognitionException {
		TypeItemNameContext _localctx = new TypeItemNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeItemName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(417);
					match(WS);
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNKNOWN_CHAR) {
				{
				{
				setState(423);
				match(UNKNOWN_CHAR);
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(429);
				match(WS);
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			match(NAME);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(436);
				match(WS);
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNKNOWN_CHAR) {
				{
				{
				setState(442);
				match(UNKNOWN_CHAR);
				}
				}
				setState(447);
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

	public static class VariableDescriptionContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(EpyDocstringParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EpyDocstringParser.NAME, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(EpyDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EpyDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(EpyDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(EpyDocstringParser.INDENT, i);
		}
		public List<TerminalNode> WS() { return getTokens(EpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(EpyDocstringParser.WS, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(EpyDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(EpyDocstringParser.DEDENT, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(EpyDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(EpyDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(EpyDocstringParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(EpyDocstringParser.PUNCTUATION, i);
		}
		public List<TerminalNode> HYPHENS() { return getTokens(EpyDocstringParser.HYPHENS); }
		public TerminalNode HYPHENS(int i) {
			return getToken(EpyDocstringParser.HYPHENS, i);
		}
		public List<TerminalNode> COLONS() { return getTokens(EpyDocstringParser.COLONS); }
		public TerminalNode COLONS(int i) {
			return getToken(EpyDocstringParser.COLONS, i);
		}
		public VariableDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterVariableDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitVariableDescription(this);
		}
	}

	public final VariableDescriptionContext variableDescription() throws RecognitionException {
		VariableDescriptionContext _localctx = new VariableDescriptionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDescription);
		int _la;
		try {
			int _alt;
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(448);
						match(WS);
						}
						}
						setState(453);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(454);
					match(NAME);
					setState(455);
					match(NEWLINE);
					setState(457);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(456);
						match(INDENT);
						}
						break;
					}
					}
					break;
				}
				setState(478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(473); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(461);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(463); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(462);
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
							setState(465); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(470);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COLONS) {
							{
							{
							setState(467);
							match(COLONS);
							}
							}
							setState(472);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(475); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0) );
					setState(477);
					match(NEWLINE);
					}
					break;
				}
				setState(482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(480);
					match(NEWLINE);
					setState(481);
					match(INDENT);
					}
					break;
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(485);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INDENT) {
							{
							setState(484);
							match(INDENT);
							}
						}

						setState(510);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
						case 1:
							{
							setState(499); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(487);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(489); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(488);
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
									setState(491); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								setState(496);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COLONS) {
									{
									{
									setState(493);
									match(COLONS);
									}
									}
									setState(498);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								}
								setState(501); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0) );
							}
							break;
						case 2:
							{
							{
							setState(506);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS) {
								{
								{
								setState(503);
								match(WS);
								}
								}
								setState(508);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(509);
							match(NAME);
							}
							}
							break;
						}
						setState(512);
						match(NEWLINE);
						setState(514);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
						case 1:
							{
							setState(513);
							match(DEDENT);
							}
							break;
						}
						}
						} 
					}
					setState(520);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(521);
					match(WS);
					}
					}
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(527);
				match(NAME);
				setState(528);
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

	public static class OtherSectionContext extends ParserRuleContext {
		public TerminalNode OTHERSECTIONS() { return getToken(EpyDocstringParser.OTHERSECTIONS, 0); }
		public TerminalNode COLONS() { return getToken(EpyDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OtherSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterOtherSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitOtherSection(this);
		}
	}

	public final OtherSectionContext otherSection() throws RecognitionException {
		OtherSectionContext _localctx = new OtherSectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_otherSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(OTHERSECTIONS);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(532);
				name();
				}
			}

			setState(535);
			match(COLONS);
			setState(536);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EpyDocstringParser.NAME, 0); }
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(EpyDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(EpyDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> WS() { return getTokens(EpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(EpyDocstringParser.WS, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNKNOWN_CHAR) {
				{
				{
				setState(538);
				match(UNKNOWN_CHAR);
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(544);
				match(WS);
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(550);
			match(NAME);
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(551);
					match(WS);
					}
					} 
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(557);
					match(UNKNOWN_CHAR);
					}
					} 
				}
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EpyDocstringParser.NAME, 0); }
		public List<TerminalNode> WS() { return getTokens(EpyDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(EpyDocstringParser.WS, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(EpyDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(EpyDocstringParser.UNKNOWN_CHAR, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EpyDocstringListener ) ((EpyDocstringListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					match(WS);
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(569);
				type();
				}
				break;
			}
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(572);
					match(WS);
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNKNOWN_CHAR) {
				{
				{
				setState(578);
				match(UNKNOWN_CHAR);
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(584);
				match(WS);
				}
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(590);
			match(NAME);
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(591);
					match(WS);
					}
					} 
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNKNOWN_CHAR) {
				{
				{
				setState(597);
				match(UNKNOWN_CHAR);
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(603);
				match(WS);
				}
				}
				setState(608);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0264\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\2\7\2?\n\2\f\2"+
		"\16\2B\13\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3"+
		"\2\3\2\3\2\3\2\7\2T\n\2\f\2\16\2W\13\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\5\2"+
		"_\n\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\7\2h\n\2\f\2\16\2k\13\2\3\2\7\2"+
		"n\n\2\f\2\16\2q\13\2\3\2\6\2t\n\2\r\2\16\2u\3\2\6\2y\n\2\r\2\16\2z\3\2"+
		"\7\2~\n\2\f\2\16\2\u0081\13\2\7\2\u0083\n\2\f\2\16\2\u0086\13\2\3\2\3"+
		"\2\5\2\u008a\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0095\n\3\3\4"+
		"\6\4\u0098\n\4\r\4\16\4\u0099\3\5\7\5\u009d\n\5\f\5\16\5\u00a0\13\5\3"+
		"\5\7\5\u00a3\n\5\f\5\16\5\u00a6\13\5\3\5\7\5\u00a9\n\5\f\5\16\5\u00ac"+
		"\13\5\3\5\6\5\u00af\n\5\r\5\16\5\u00b0\3\5\7\5\u00b4\n\5\f\5\16\5\u00b7"+
		"\13\5\6\5\u00b9\n\5\r\5\16\5\u00ba\3\5\7\5\u00be\n\5\f\5\16\5\u00c1\13"+
		"\5\3\5\6\5\u00c4\n\5\r\5\16\5\u00c5\3\5\6\5\u00c9\n\5\r\5\16\5\u00ca\3"+
		"\5\7\5\u00ce\n\5\f\5\16\5\u00d1\13\5\6\5\u00d3\n\5\r\5\16\5\u00d4\3\5"+
		"\5\5\u00d8\n\5\5\5\u00da\n\5\3\5\7\5\u00dd\n\5\f\5\16\5\u00e0\13\5\3\5"+
		"\6\5\u00e3\n\5\r\5\16\5\u00e4\3\5\7\5\u00e8\n\5\f\5\16\5\u00eb\13\5\6"+
		"\5\u00ed\n\5\r\5\16\5\u00ee\3\5\7\5\u00f2\n\5\f\5\16\5\u00f5\13\5\3\5"+
		"\5\5\u00f8\n\5\7\5\u00fa\n\5\f\5\16\5\u00fd\13\5\3\5\7\5\u0100\n\5\f\5"+
		"\16\5\u0103\13\5\3\5\7\5\u0106\n\5\f\5\16\5\u0109\13\5\3\5\7\5\u010c\n"+
		"\5\f\5\16\5\u010f\13\5\6\5\u0111\n\5\r\5\16\5\u0112\3\6\3\6\5\6\u0117"+
		"\n\6\3\6\3\6\6\6\u011b\n\6\r\6\16\6\u011c\3\6\5\6\u0120\n\6\3\6\3\6\3"+
		"\7\3\7\5\7\u0126\n\7\3\7\3\7\6\7\u012a\n\7\r\7\16\7\u012b\3\7\5\7\u012f"+
		"\n\7\5\7\u0131\n\7\3\7\3\7\7\7\u0135\n\7\f\7\16\7\u0138\13\7\3\7\7\7\u013b"+
		"\n\7\f\7\16\7\u013e\13\7\3\7\7\7\u0141\n\7\f\7\16\7\u0144\13\7\3\b\3\b"+
		"\5\b\u0148\n\b\3\b\3\b\6\b\u014c\n\b\r\b\16\b\u014d\3\b\5\b\u0151\n\b"+
		"\3\b\3\b\3\t\3\t\5\t\u0157\n\t\3\t\3\t\6\t\u015b\n\t\r\t\16\t\u015c\3"+
		"\t\5\t\u0160\n\t\3\t\3\t\3\n\3\n\5\n\u0166\n\n\3\n\3\n\6\n\u016a\n\n\r"+
		"\n\16\n\u016b\3\n\5\n\u016f\n\n\3\n\3\n\3\13\3\13\5\13\u0175\n\13\3\13"+
		"\3\13\6\13\u0179\n\13\r\13\16\13\u017a\3\13\5\13\u017e\n\13\5\13\u0180"+
		"\n\13\3\13\3\13\7\13\u0184\n\13\f\13\16\13\u0187\13\13\3\13\7\13\u018a"+
		"\n\13\f\13\16\13\u018d\13\13\3\13\7\13\u0190\n\13\f\13\16\13\u0193\13"+
		"\13\3\f\3\f\5\f\u0197\n\f\3\f\3\f\6\f\u019b\n\f\r\f\16\f\u019c\3\f\5\f"+
		"\u01a0\n\f\3\f\3\f\3\r\7\r\u01a5\n\r\f\r\16\r\u01a8\13\r\3\r\7\r\u01ab"+
		"\n\r\f\r\16\r\u01ae\13\r\3\r\7\r\u01b1\n\r\f\r\16\r\u01b4\13\r\3\r\3\r"+
		"\7\r\u01b8\n\r\f\r\16\r\u01bb\13\r\3\r\7\r\u01be\n\r\f\r\16\r\u01c1\13"+
		"\r\3\16\7\16\u01c4\n\16\f\16\16\16\u01c7\13\16\3\16\3\16\3\16\5\16\u01cc"+
		"\n\16\5\16\u01ce\n\16\3\16\3\16\6\16\u01d2\n\16\r\16\16\16\u01d3\3\16"+
		"\7\16\u01d7\n\16\f\16\16\16\u01da\13\16\6\16\u01dc\n\16\r\16\16\16\u01dd"+
		"\3\16\5\16\u01e1\n\16\3\16\3\16\5\16\u01e5\n\16\3\16\5\16\u01e8\n\16\3"+
		"\16\3\16\6\16\u01ec\n\16\r\16\16\16\u01ed\3\16\7\16\u01f1\n\16\f\16\16"+
		"\16\u01f4\13\16\6\16\u01f6\n\16\r\16\16\16\u01f7\3\16\7\16\u01fb\n\16"+
		"\f\16\16\16\u01fe\13\16\3\16\5\16\u0201\n\16\3\16\3\16\5\16\u0205\n\16"+
		"\7\16\u0207\n\16\f\16\16\16\u020a\13\16\3\16\7\16\u020d\n\16\f\16\16\16"+
		"\u0210\13\16\3\16\3\16\5\16\u0214\n\16\3\17\3\17\5\17\u0218\n\17\3\17"+
		"\3\17\3\17\3\20\7\20\u021e\n\20\f\20\16\20\u0221\13\20\3\20\7\20\u0224"+
		"\n\20\f\20\16\20\u0227\13\20\3\20\3\20\7\20\u022b\n\20\f\20\16\20\u022e"+
		"\13\20\3\20\7\20\u0231\n\20\f\20\16\20\u0234\13\20\3\21\7\21\u0237\n\21"+
		"\f\21\16\21\u023a\13\21\3\21\5\21\u023d\n\21\3\21\7\21\u0240\n\21\f\21"+
		"\16\21\u0243\13\21\3\21\7\21\u0246\n\21\f\21\16\21\u0249\13\21\3\21\7"+
		"\21\u024c\n\21\f\21\16\21\u024f\13\21\3\21\3\21\7\21\u0253\n\21\f\21\16"+
		"\21\u0256\13\21\3\21\7\21\u0259\n\21\f\21\16\21\u025c\13\21\3\21\7\21"+
		"\u025f\n\21\f\21\16\21\u0262\13\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \2\4\6\2\3\3\16\20\22\22\24\24\6\2\3\3\16\17\22\22\24"+
		"\24\2\u02c7\2\u0089\3\2\2\2\4\u0094\3\2\2\2\6\u0097\3\2\2\2\b\u0110\3"+
		"\2\2\2\n\u0114\3\2\2\2\f\u0123\3\2\2\2\16\u0145\3\2\2\2\20\u0154\3\2\2"+
		"\2\22\u0163\3\2\2\2\24\u0172\3\2\2\2\26\u0194\3\2\2\2\30\u01a6\3\2\2\2"+
		"\32\u0213\3\2\2\2\34\u0215\3\2\2\2\36\u021f\3\2\2\2 \u0238\3\2\2\2\"$"+
		"\7\21\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&+\3\2\2\2\'%\3\2\2"+
		"\2(*\7\25\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2"+
		"\2\2.\62\5\6\4\2/\61\7\21\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2"+
		"\62\63\3\2\2\2\638\3\2\2\2\64\62\3\2\2\2\65\67\7\26\2\2\66\65\3\2\2\2"+
		"\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\2\2\3<\u008a"+
		"\3\2\2\2=?\7\21\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AF\3\2\2\2"+
		"B@\3\2\2\2CE\7\25\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GL\3\2\2"+
		"\2HF\3\2\2\2IK\7\26\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2"+
		"\2\2NL\3\2\2\2OP\5\6\4\2PQ\7\21\2\2QU\7\21\2\2RT\7\25\2\2SR\3\2\2\2TW"+
		"\3\2\2\2US\3\2\2\2UV\3\2\2\2V[\3\2\2\2WU\3\2\2\2XZ\7\26\2\2YX\3\2\2\2"+
		"Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^@\3\2\2\2^_\3\2\2"+
		"\2_s\3\2\2\2`b\7\21\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2di\3\2"+
		"\2\2ec\3\2\2\2fh\7\25\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jo\3"+
		"\2\2\2ki\3\2\2\2ln\7\26\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr"+
		"\3\2\2\2qo\3\2\2\2rt\5\4\3\2sc\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v"+
		"\u0084\3\2\2\2wy\7\21\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\177"+
		"\3\2\2\2|~\7\26\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082x\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7\2\2\3\u0088\u008a\3\2\2\2\u0089%\3\2\2\2"+
		"\u0089^\3\2\2\2\u008a\3\3\2\2\2\u008b\u0095\5\n\6\2\u008c\u0095\5\16\b"+
		"\2\u008d\u0095\5\20\t\2\u008e\u0095\5\22\n\2\u008f\u0095\5\26\f\2\u0090"+
		"\u0095\5\f\7\2\u0091\u0095\5\24\13\2\u0092\u0095\5\b\5\2\u0093\u0095\5"+
		"\34\17\2\u0094\u008b\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008d\3\2\2\2\u0094"+
		"\u008e\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\5\3\2\2\2\u0096\u0098"+
		"\t\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\7\3\2\2\2\u009b\u009d\7\21\2\2\u009c\u009b\3\2\2"+
		"\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a4"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\7\25\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00aa"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7\26\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b8"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\t\3\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b5\3\2"+
		"\2\2\u00b2\u00b4\7\20\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00ae\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00d9\3\2\2\2\u00bc\u00be\7\21\2\2\u00bd\u00bc\3"+
		"\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\7\25\2\2\u00c3\u00c2\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00d2\3\2\2\2\u00c7\u00c9\t\3\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cf\3\2\2\2\u00cc"+
		"\u00ce\7\20\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00c8\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\7\26\2\2\u00d7\u00d6\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00bf\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00fb\3\2\2\2\u00db\u00dd\7\21\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00ec\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\t\3\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e9\3\2"+
		"\2\2\u00e6\u00e8\7\20\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00e2\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f2\7\21\2\2\u00f1\u00f0\3"+
		"\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\7\26\2\2\u00f7\u00f6\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00de\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0101\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\7\21\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0107\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0104\u0106\7\25\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010d\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u010c\7\26\2\2\u010b\u010a\3\2\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u0110\u009e\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\t\3\2\2\2\u0114\u0116\7\6\2\2"+
		"\u0115\u0117\5 \21\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u011f\7\20\2\2\u0119\u011b\7\21\2\2\u011a\u0119\3\2\2\2"+
		"\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u0120\7\25\2\2\u011f\u011a\3\2\2\2\u011f\u0120\3\2\2\2"+
		"\u0120\u0121\3\2\2\2\u0121\u0122\5\32\16\2\u0122\13\3\2\2\2\u0123\u0125"+
		"\7\7\2\2\u0124\u0126\5\30\r\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2"+
		"\u0126\u0127\3\2\2\2\u0127\u0130\7\20\2\2\u0128\u012a\7\21\2\2\u0129\u0128"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012e\3\2\2\2\u012d\u012f\7\25\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3"+
		"\2\2\2\u012f\u0131\3\2\2\2\u0130\u0129\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0136\5\32\16\2\u0133\u0135\7\21\2\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u013c\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\7\25\2\2\u013a\u0139\3"+
		"\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u0142\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\7\26\2\2\u0140\u013f\3"+
		"\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\r\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\7\b\2\2\u0146\u0148\5 \21\2"+
		"\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0150"+
		"\7\20\2\2\u014a\u014c\7\21\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2"+
		"\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151"+
		"\7\25\2\2\u0150\u014b\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2"+
		"\u0152\u0153\5\32\16\2\u0153\17\3\2\2\2\u0154\u0156\7\f\2\2\u0155\u0157"+
		"\5 \21\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015f\7\20\2\2\u0159\u015b\7\21\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3"+
		"\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0160\7\25\2\2\u015f\u015a\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3"+
		"\2\2\2\u0161\u0162\5\32\16\2\u0162\21\3\2\2\2\u0163\u0165\7\n\2\2\u0164"+
		"\u0166\5 \21\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u016e\7\20\2\2\u0168\u016a\7\21\2\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u016f\7\25\2\2\u016e\u0169\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\5\32\16\2\u0171\23\3\2\2\2\u0172\u0174\7\13"+
		"\2\2\u0173\u0175\5\30\r\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u017f\7\20\2\2\u0177\u0179\7\21\2\2\u0178\u0177\3"+
		"\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017d\3\2\2\2\u017c\u017e\7\25\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3"+
		"\2\2\2\u017e\u0180\3\2\2\2\u017f\u0178\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0185\5\32\16\2\u0182\u0184\7\21\2\2\u0183\u0182"+
		"\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u018b\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018a\7\25\2\2\u0189\u0188\3"+
		"\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u0191\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\7\26\2\2\u018f\u018e\3"+
		"\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\25\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0196\7\t\2\2\u0195\u0197\5 \21"+
		"\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019f"+
		"\7\20\2\2\u0199\u019b\7\21\2\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2\2\2"+
		"\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0"+
		"\7\25\2\2\u019f\u019a\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2"+
		"\u01a1\u01a2\5\32\16\2\u01a2\27\3\2\2\2\u01a3\u01a5\7\3\2\2\u01a4\u01a3"+
		"\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01ac\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ab\7\24\2\2\u01aa\u01a9\3"+
		"\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01b2\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b1\7\3\2\2\u01b0\u01af\3\2"+
		"\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b9\7\22\2\2\u01b6\u01b8\7"+
		"\3\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bf\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01be\7\24"+
		"\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\31\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c4\7\3\2"+
		"\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6"+
		"\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7\22\2\2"+
		"\u01c9\u01cb\7\21\2\2\u01ca\u01cc\7\25\2\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01c5\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01e0\3\2\2\2\u01cf\u01d1\t\3\2\2\u01d0\u01d2\t\3\2\2\u01d1\u01d0\3\2"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d8\3\2\2\2\u01d5\u01d7\7\20\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3"+
		"\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01db\u01cf\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\7\21\2\2\u01e0"+
		"\u01db\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e3\7\21"+
		"\2\2\u01e3\u01e5\7\25\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u0208\3\2\2\2\u01e6\u01e8\7\25\2\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3"+
		"\2\2\2\u01e8\u0200\3\2\2\2\u01e9\u01eb\t\3\2\2\u01ea\u01ec\t\3\2\2\u01eb"+
		"\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01f2\3\2\2\2\u01ef\u01f1\7\20\2\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f6\3\2"+
		"\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01e9\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u0201\3\2\2\2\u01f9\u01fb\7\3"+
		"\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0201\7\22"+
		"\2\2\u0200\u01f5\3\2\2\2\u0200\u01fc\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0204\7\21\2\2\u0203\u0205\7\26\2\2\u0204\u0203\3\2\2\2\u0204\u0205\3"+
		"\2\2\2\u0205\u0207\3\2\2\2\u0206\u01e7\3\2\2\2\u0207\u020a\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0214\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020b\u020d\7\3\2\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e"+
		"\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2"+
		"\2\2\u0211\u0212\7\22\2\2\u0212\u0214\7\21\2\2\u0213\u01cd\3\2\2\2\u0213"+
		"\u020e\3\2\2\2\u0214\33\3\2\2\2\u0215\u0217\7\r\2\2\u0216\u0218\5 \21"+
		"\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a"+
		"\7\20\2\2\u021a\u021b\5\32\16\2\u021b\35\3\2\2\2\u021c\u021e\7\24\2\2"+
		"\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0225\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0224\7\3\2\2\u0223"+
		"\u0222\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2"+
		"\2\2\u0226\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u022c\7\22\2\2\u0229"+
		"\u022b\7\3\2\2\u022a\u0229\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2"+
		"\2\2\u022c\u022d\3\2\2\2\u022d\u0232\3\2\2\2\u022e\u022c\3\2\2\2\u022f"+
		"\u0231\7\24\2\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3"+
		"\2\2\2\u0232\u0233\3\2\2\2\u0233\37\3\2\2\2\u0234\u0232\3\2\2\2\u0235"+
		"\u0237\7\3\2\2\u0236\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2"+
		"\2\2\u0238\u0239\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023b"+
		"\u023d\5\36\20\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0241\3"+
		"\2\2\2\u023e\u0240\7\3\2\2\u023f\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0247\3\2\2\2\u0243\u0241\3\2"+
		"\2\2\u0244\u0246\7\24\2\2\u0245\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024d\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u024a\u024c\7\3\2\2\u024b\u024a\3\2\2\2\u024c\u024f\3\2\2\2\u024d"+
		"\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u024d\3\2"+
		"\2\2\u0250\u0254\7\22\2\2\u0251\u0253\7\3\2\2\u0252\u0251\3\2\2\2\u0253"+
		"\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u025a\3\2"+
		"\2\2\u0256\u0254\3\2\2\2\u0257\u0259\7\24\2\2\u0258\u0257\3\2\2\2\u0259"+
		"\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0260\3\2"+
		"\2\2\u025c\u025a\3\2\2\2\u025d\u025f\7\3\2\2\u025e\u025d\3\2\2\2\u025f"+
		"\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261!\3\2\2\2"+
		"\u0262\u0260\3\2\2\2o%+\628@FLU[^ciouz\177\u0084\u0089\u0094\u0099\u009e"+
		"\u00a4\u00aa\u00b0\u00b5\u00ba\u00bf\u00c5\u00ca\u00cf\u00d4\u00d7\u00d9"+
		"\u00de\u00e4\u00e9\u00ee\u00f3\u00f7\u00fb\u0101\u0107\u010d\u0112\u0116"+
		"\u011c\u011f\u0125\u012b\u012e\u0130\u0136\u013c\u0142\u0147\u014d\u0150"+
		"\u0156\u015c\u015f\u0165\u016b\u016e\u0174\u017a\u017d\u017f\u0185\u018b"+
		"\u0191\u0196\u019c\u019f\u01a6\u01ac\u01b2\u01b9\u01bf\u01c5\u01cb\u01cd"+
		"\u01d3\u01d8\u01dd\u01e0\u01e4\u01e7\u01ed\u01f2\u01f7\u01fc\u0200\u0204"+
		"\u0208\u020e\u0213\u0217\u021f\u0225\u022c\u0232\u0238\u023c\u0241\u0247"+
		"\u024d\u0254\u025a\u0260";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}