// Generated from RestructuredTextDocstring.g4 by ANTLR 4.7.1

   package ch.jako.parser.restructuredText;
   //import com.yuvalshavit.antlr4.DenterHelper;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RestructuredTextDocstringParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, TRIPLEQUOTES=2, COLONS=3, PARAMNAMINGS=4, PARAM=5, PARAMTYPE=6, 
		RAISES=7, VARIABLES=8, VARIABLETYPE=9, RETURN=10, RETURNTYPE=11, PUNCTUATION=12, 
		DIRECTIVES=13, HYPHENS=14, NEWLINE=15, NAME=16, UNKNOWN_CHAR=17, SKIP_=18, 
		INDENT=19, DEDENT=20;
	public static final int
		RULE_docstring = 0, RULE_components = 1, RULE_oneLiner = 2, RULE_description = 3, 
		RULE_param = 4, RULE_paramType = 5, RULE_returnItem = 6, RULE_returnType = 7, 
		RULE_raiseItem = 8, RULE_varItem = 9, RULE_varType = 10, RULE_infoField = 11, 
		RULE_typeItemName = 12, RULE_directives = 13, RULE_variableDescription = 14, 
		RULE_type = 15, RULE_name = 16;
	public static final String[] ruleNames = {
		"docstring", "components", "oneLiner", "description", "param", "paramType", 
		"returnItem", "returnType", "raiseItem", "varItem", "varType", "infoField", 
		"typeItemName", "directives", "variableDescription", "type", "name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "':type'", null, null, "':vartype'", 
		null, "':rtype'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "TRIPLEQUOTES", "COLONS", "PARAMNAMINGS", "PARAM", "PARAMTYPE", 
		"RAISES", "VARIABLES", "VARIABLETYPE", "RETURN", "RETURNTYPE", "PUNCTUATION", 
		"DIRECTIVES", "HYPHENS", "NEWLINE", "NAME", "UNKNOWN_CHAR", "SKIP_", "INDENT", 
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
	public String getGrammarFileName() { return "RestructuredTextDocstring.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RestructuredTextDocstringParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocstringContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RestructuredTextDocstringParser.EOF, 0); }
		public OneLinerContext oneLiner() {
			return getRuleContext(OneLinerContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RestructuredTextDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RestructuredTextDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(RestructuredTextDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(RestructuredTextDocstringParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(RestructuredTextDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(RestructuredTextDocstringParser.DEDENT, i);
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
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterDocstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitDocstring(this);
		}
	}

	public final DocstringContext docstring() throws RecognitionException {
		DocstringContext _localctx = new DocstringContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_docstring);
		int _la;
		try {
			int _alt;
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(34);
					match(NEWLINE);
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INDENT) {
					{
					{
					setState(40);
					match(INDENT);
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				oneLiner();
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(47);
					match(NEWLINE);
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEDENT) {
					{
					{
					setState(53);
					match(DEDENT);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(59);
				match(EOF);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(61);
						match(NEWLINE);
						}
						}
						setState(66);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==INDENT) {
						{
						{
						setState(67);
						match(INDENT);
						}
						}
						setState(72);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DEDENT) {
						{
						{
						setState(73);
						match(DEDENT);
						}
						}
						setState(78);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(79);
					oneLiner();
					setState(80);
					match(NEWLINE);
					setState(81);
					match(NEWLINE);
					setState(85);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(82);
							match(INDENT);
							}
							} 
						}
						setState(87);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					setState(91);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(88);
							match(DEDENT);
							}
							} 
						}
						setState(93);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					}
					break;
				}
				{
				setState(115); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(99);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(96);
								match(NEWLINE);
								}
								} 
							}
							setState(101);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						}
						setState(105);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(102);
								match(INDENT);
								}
								} 
							}
							setState(107);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						}
						setState(111);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(108);
								match(DEDENT);
								}
								} 
							}
							setState(113);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						}
						setState(114);
						components();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(117); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(120); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(119);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(122); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DEDENT) {
						{
						{
						setState(124);
						match(DEDENT);
						}
						}
						setState(129);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
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
		public ReturnItemContext returnItem() {
			return getRuleContext(ReturnItemContext.class,0);
		}
		public RaiseItemContext raiseItem() {
			return getRuleContext(RaiseItemContext.class,0);
		}
		public InfoFieldContext infoField() {
			return getRuleContext(InfoFieldContext.class,0);
		}
		public VarItemContext varItem() {
			return getRuleContext(VarItemContext.class,0);
		}
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
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
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterComponents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitComponents(this);
		}
	}

	public final ComponentsContext components() throws RecognitionException {
		ComponentsContext _localctx = new ComponentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_components);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARAM:
				{
				setState(139);
				param();
				}
				break;
			case RETURN:
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
			case COLONS:
				{
				setState(142);
				infoField();
				}
				break;
			case VARIABLES:
				{
				setState(143);
				varItem();
				}
				break;
			case PARAMTYPE:
				{
				setState(144);
				paramType();
				}
				break;
			case RETURNTYPE:
				{
				setState(145);
				returnType();
				}
				break;
			case VARIABLETYPE:
				{
				setState(146);
				varType();
				}
				break;
			case DIRECTIVES:
				{
				setState(147);
				directives();
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
				setState(148);
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
		public List<TerminalNode> NAME() { return getTokens(RestructuredTextDocstringParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(RestructuredTextDocstringParser.NAME, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(RestructuredTextDocstringParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(RestructuredTextDocstringParser.PUNCTUATION, i);
		}
		public List<TerminalNode> WS() { return getTokens(RestructuredTextDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RestructuredTextDocstringParser.WS, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(RestructuredTextDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(RestructuredTextDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> HYPHENS() { return getTokens(RestructuredTextDocstringParser.HYPHENS); }
		public TerminalNode HYPHENS(int i) {
			return getToken(RestructuredTextDocstringParser.HYPHENS, i);
		}
		public List<TerminalNode> COLONS() { return getTokens(RestructuredTextDocstringParser.COLONS); }
		public TerminalNode COLONS(int i) {
			return getToken(RestructuredTextDocstringParser.COLONS, i);
		}
		public OneLinerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneLiner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterOneLiner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitOneLiner(this);
		}
	}

	public final OneLinerContext oneLiner() throws RecognitionException {
		OneLinerContext _localctx = new OneLinerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_oneLiner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << COLONS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << COLONS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0) );
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
		public List<TerminalNode> NEWLINE() { return getTokens(RestructuredTextDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RestructuredTextDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(RestructuredTextDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(RestructuredTextDocstringParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(RestructuredTextDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(RestructuredTextDocstringParser.DEDENT, i);
		}
		public List<TerminalNode> COLONS() { return getTokens(RestructuredTextDocstringParser.COLONS); }
		public TerminalNode COLONS(int i) {
			return getToken(RestructuredTextDocstringParser.COLONS, i);
		}
		public List<TerminalNode> NAME() { return getTokens(RestructuredTextDocstringParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(RestructuredTextDocstringParser.NAME, i);
		}
		public List<TerminalNode> WS() { return getTokens(RestructuredTextDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RestructuredTextDocstringParser.WS, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(RestructuredTextDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(RestructuredTextDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(RestructuredTextDocstringParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(RestructuredTextDocstringParser.PUNCTUATION, i);
		}
		public List<TerminalNode> HYPHENS() { return getTokens(RestructuredTextDocstringParser.HYPHENS); }
		public TerminalNode HYPHENS(int i) {
			return getToken(RestructuredTextDocstringParser.HYPHENS, i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitDescription(this);
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
			setState(273); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(156);
						match(NEWLINE);
						}
						}
						setState(161);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==INDENT) {
						{
						{
						setState(162);
						match(INDENT);
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DEDENT) {
						{
						{
						setState(168);
						match(DEDENT);
						}
						}
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(185); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(175); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(174);
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
								setState(177); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(182);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(179);
									match(COLONS);
									}
									} 
								}
								setState(184);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
							}
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(187); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(189);
							match(NEWLINE);
							}
							}
							setState(194);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(196); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(195);
							match(INDENT);
							}
							}
							setState(198); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==INDENT );
						setState(211); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(201); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(200);
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
									setState(203); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								setState(208);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(205);
										match(COLONS);
										}
										} 
									}
									setState(210);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
								}
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(213); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(216);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
						case 1:
							{
							setState(215);
							match(DEDENT);
							}
							break;
						}
						}
						break;
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(223);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NEWLINE) {
								{
								{
								setState(220);
								match(NEWLINE);
								}
								}
								setState(225);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(237); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(227); 
									_errHandler.sync(this);
									_alt = 1;
									do {
										switch (_alt) {
										case 1:
											{
											{
											setState(226);
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
										setState(229); 
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
									} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
									setState(234);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
									while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
										if ( _alt==1 ) {
											{
											{
											setState(231);
											match(COLONS);
											}
											} 
										}
										setState(236);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
									}
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(239); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(244);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(241);
									match(NEWLINE);
									}
									} 
								}
								setState(246);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
							}
							setState(248);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
							case 1:
								{
								setState(247);
								match(DEDENT);
								}
								break;
							}
							}
							} 
						}
						setState(254);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					}
					setState(258);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(255);
							match(NEWLINE);
							}
							} 
						}
						setState(260);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					}
					setState(264);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(261);
							match(INDENT);
							}
							} 
						}
						setState(266);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
					}
					setState(270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(267);
							match(DEDENT);
							}
							} 
						}
						setState(272);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(275); 
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
		public TerminalNode PARAM() { return getToken(RestructuredTextDocstringParser.PARAM, 0); }
		public TerminalNode COLONS() { return getToken(RestructuredTextDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(RestructuredTextDocstringParser.INDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RestructuredTextDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RestructuredTextDocstringParser.NEWLINE, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(PARAM);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(278);
				name();
				}
			}

			setState(281);
			match(COLONS);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(282);
					match(NEWLINE);
					}
					}
					setState(285); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(287);
				match(INDENT);
				}
			}

			setState(290);
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
		public TerminalNode PARAMTYPE() { return getToken(RestructuredTextDocstringParser.PARAMTYPE, 0); }
		public TerminalNode COLONS() { return getToken(RestructuredTextDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public TypeItemNameContext typeItemName() {
			return getRuleContext(TypeItemNameContext.class,0);
		}
		public List<TerminalNode> INDENT() { return getTokens(RestructuredTextDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(RestructuredTextDocstringParser.INDENT, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RestructuredTextDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RestructuredTextDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(RestructuredTextDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(RestructuredTextDocstringParser.DEDENT, i);
		}
		public ParamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterParamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitParamType(this);
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
			setState(292);
			match(PARAMTYPE);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(293);
				typeItemName();
				}
			}

			setState(296);
			match(COLONS);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(297);
					match(NEWLINE);
					}
					}
					setState(300); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(302);
				match(INDENT);
				}
			}

			setState(305);
			variableDescription();
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(INDENT);
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					match(DEDENT);
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		public TerminalNode RETURN() { return getToken(RestructuredTextDocstringParser.RETURN, 0); }
		public TerminalNode COLONS() { return getToken(RestructuredTextDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(RestructuredTextDocstringParser.INDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RestructuredTextDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RestructuredTextDocstringParser.NEWLINE, i);
		}
		public ReturnItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterReturnItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitReturnItem(this);
		}
	}

	public final ReturnItemContext returnItem() throws RecognitionException {
		ReturnItemContext _localctx = new ReturnItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(RETURN);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(325);
				name();
				}
			}

			setState(328);
			match(COLONS);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(329);
					match(NEWLINE);
					}
					}
					setState(332); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(334);
				match(INDENT);
				}
			}

			setState(337);
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
		public TerminalNode RETURNTYPE() { return getToken(RestructuredTextDocstringParser.RETURNTYPE, 0); }
		public TerminalNode COLONS() { return getToken(RestructuredTextDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public TypeItemNameContext typeItemName() {
			return getRuleContext(TypeItemNameContext.class,0);
		}
		public List<TerminalNode> INDENT() { return getTokens(RestructuredTextDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(RestructuredTextDocstringParser.INDENT, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RestructuredTextDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RestructuredTextDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(RestructuredTextDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(RestructuredTextDocstringParser.DEDENT, i);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitReturnType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(RETURNTYPE);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(340);
				typeItemName();
				}
			}

			setState(343);
			match(COLONS);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(344);
					match(NEWLINE);
					}
					}
					setState(347); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(349);
				match(INDENT);
				}
			}

			setState(352);
			variableDescription();
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					match(NEWLINE);
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(359);
					match(INDENT);
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(365);
					match(DEDENT);
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		public TerminalNode RAISES() { return getToken(RestructuredTextDocstringParser.RAISES, 0); }
		public TerminalNode COLONS() { return getToken(RestructuredTextDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(RestructuredTextDocstringParser.INDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RestructuredTextDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RestructuredTextDocstringParser.NEWLINE, i);
		}
		public RaiseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterRaiseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitRaiseItem(this);
		}
	}

	public final RaiseItemContext raiseItem() throws RecognitionException {
		RaiseItemContext _localctx = new RaiseItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_raiseItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(RAISES);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(372);
				name();
				}
			}

			setState(375);
			match(COLONS);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(376);
					match(NEWLINE);
					}
					}
					setState(379); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(381);
				match(INDENT);
				}
			}

			setState(384);
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

	public static class VarItemContext extends ParserRuleContext {
		public TerminalNode VARIABLES() { return getToken(RestructuredTextDocstringParser.VARIABLES, 0); }
		public TerminalNode COLONS() { return getToken(RestructuredTextDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(RestructuredTextDocstringParser.INDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RestructuredTextDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RestructuredTextDocstringParser.NEWLINE, i);
		}
		public VarItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterVarItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitVarItem(this);
		}
	}

	public final VarItemContext varItem() throws RecognitionException {
		VarItemContext _localctx = new VarItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(VARIABLES);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(387);
				name();
				}
			}

			setState(390);
			match(COLONS);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(391);
					match(NEWLINE);
					}
					}
					setState(394); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(396);
				match(INDENT);
				}
			}

			setState(399);
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

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode VARIABLETYPE() { return getToken(RestructuredTextDocstringParser.VARIABLETYPE, 0); }
		public TerminalNode COLONS() { return getToken(RestructuredTextDocstringParser.COLONS, 0); }
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public TypeItemNameContext typeItemName() {
			return getRuleContext(TypeItemNameContext.class,0);
		}
		public List<TerminalNode> INDENT() { return getTokens(RestructuredTextDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(RestructuredTextDocstringParser.INDENT, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RestructuredTextDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RestructuredTextDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(RestructuredTextDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(RestructuredTextDocstringParser.DEDENT, i);
		}
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitVarType(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(VARIABLETYPE);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) {
				{
				setState(402);
				typeItemName();
				}
			}

			setState(405);
			match(COLONS);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(406);
					match(NEWLINE);
					}
					}
					setState(409); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(411);
				match(INDENT);
				}
			}

			setState(414);
			variableDescription();
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(415);
					match(NEWLINE);
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(421);
					match(INDENT);
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(427);
					match(DEDENT);
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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

	public static class InfoFieldContext extends ParserRuleContext {
		public List<TerminalNode> COLONS() { return getTokens(RestructuredTextDocstringParser.COLONS); }
		public TerminalNode COLONS(int i) {
			return getToken(RestructuredTextDocstringParser.COLONS, i);
		}
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(RestructuredTextDocstringParser.INDENT, 0); }
		public List<TerminalNode> NAME() { return getTokens(RestructuredTextDocstringParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(RestructuredTextDocstringParser.NAME, i);
		}
		public List<TerminalNode> WS() { return getTokens(RestructuredTextDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RestructuredTextDocstringParser.WS, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(RestructuredTextDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(RestructuredTextDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RestructuredTextDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RestructuredTextDocstringParser.NEWLINE, i);
		}
		public InfoFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infoField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterInfoField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitInfoField(this);
		}
	}

	public final InfoFieldContext infoField() throws RecognitionException {
		InfoFieldContext _localctx = new InfoFieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_infoField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(COLONS);
			setState(435); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(434);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0) );
			setState(439);
			match(COLONS);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(440);
					match(NEWLINE);
					}
					}
					setState(443); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(445);
				match(INDENT);
				}
			}

			setState(448);
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
		public TerminalNode NAME() { return getToken(RestructuredTextDocstringParser.NAME, 0); }
		public List<TerminalNode> WS() { return getTokens(RestructuredTextDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RestructuredTextDocstringParser.WS, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(RestructuredTextDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(RestructuredTextDocstringParser.UNKNOWN_CHAR, i);
		}
		public TypeItemNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeItemName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterTypeItemName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitTypeItemName(this);
		}
	}

	public final TypeItemNameContext typeItemName() throws RecognitionException {
		TypeItemNameContext _localctx = new TypeItemNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeItemName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(450);
					match(WS);
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNKNOWN_CHAR) {
				{
				{
				setState(456);
				match(UNKNOWN_CHAR);
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(462);
				match(WS);
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
			match(NAME);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(469);
				match(WS);
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNKNOWN_CHAR) {
				{
				{
				setState(475);
				match(UNKNOWN_CHAR);
				}
				}
				setState(480);
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

	public static class DirectivesContext extends ParserRuleContext {
		public TerminalNode DIRECTIVES() { return getToken(RestructuredTextDocstringParser.DIRECTIVES, 0); }
		public List<VariableDescriptionContext> variableDescription() {
			return getRuleContexts(VariableDescriptionContext.class);
		}
		public VariableDescriptionContext variableDescription(int i) {
			return getRuleContext(VariableDescriptionContext.class,i);
		}
		public List<InfoFieldContext> infoField() {
			return getRuleContexts(InfoFieldContext.class);
		}
		public InfoFieldContext infoField(int i) {
			return getRuleContext(InfoFieldContext.class,i);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<ParamTypeContext> paramType() {
			return getRuleContexts(ParamTypeContext.class);
		}
		public ParamTypeContext paramType(int i) {
			return getRuleContext(ParamTypeContext.class,i);
		}
		public List<ReturnTypeContext> returnType() {
			return getRuleContexts(ReturnTypeContext.class);
		}
		public ReturnTypeContext returnType(int i) {
			return getRuleContext(ReturnTypeContext.class,i);
		}
		public List<ReturnItemContext> returnItem() {
			return getRuleContexts(ReturnItemContext.class);
		}
		public ReturnItemContext returnItem(int i) {
			return getRuleContext(ReturnItemContext.class,i);
		}
		public List<RaiseItemContext> raiseItem() {
			return getRuleContexts(RaiseItemContext.class);
		}
		public RaiseItemContext raiseItem(int i) {
			return getRuleContext(RaiseItemContext.class,i);
		}
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public List<VarItemContext> varItem() {
			return getRuleContexts(VarItemContext.class);
		}
		public VarItemContext varItem(int i) {
			return getRuleContext(VarItemContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RestructuredTextDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RestructuredTextDocstringParser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(RestructuredTextDocstringParser.INDENT, 0); }
		public DirectivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterDirectives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitDirectives(this);
		}
	}

	public final DirectivesContext directives() throws RecognitionException {
		DirectivesContext _localctx = new DirectivesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_directives);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(DIRECTIVES);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(483); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(482);
					match(NEWLINE);
					}
					}
					setState(485); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(487);
					match(INDENT);
					}
				}

				}
			}

			setState(501); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(501);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WS:
					case PUNCTUATION:
					case HYPHENS:
					case NAME:
					case UNKNOWN_CHAR:
						{
						setState(492);
						variableDescription();
						}
						break;
					case COLONS:
						{
						setState(493);
						infoField();
						}
						break;
					case PARAM:
						{
						setState(494);
						param();
						}
						break;
					case PARAMTYPE:
						{
						setState(495);
						paramType();
						}
						break;
					case RETURNTYPE:
						{
						setState(496);
						returnType();
						}
						break;
					case RETURN:
						{
						setState(497);
						returnItem();
						}
						break;
					case RAISES:
						{
						setState(498);
						raiseItem();
						}
						break;
					case VARIABLETYPE:
						{
						setState(499);
						varType();
						}
						break;
					case VARIABLES:
						{
						setState(500);
						varItem();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(503); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class VariableDescriptionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(RestructuredTextDocstringParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RestructuredTextDocstringParser.NEWLINE, i);
		}
		public List<TerminalNode> NAME() { return getTokens(RestructuredTextDocstringParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(RestructuredTextDocstringParser.NAME, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(RestructuredTextDocstringParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(RestructuredTextDocstringParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(RestructuredTextDocstringParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(RestructuredTextDocstringParser.DEDENT, i);
		}
		public List<TerminalNode> WS() { return getTokens(RestructuredTextDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RestructuredTextDocstringParser.WS, i);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(RestructuredTextDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(RestructuredTextDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(RestructuredTextDocstringParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(RestructuredTextDocstringParser.PUNCTUATION, i);
		}
		public List<TerminalNode> HYPHENS() { return getTokens(RestructuredTextDocstringParser.HYPHENS); }
		public TerminalNode HYPHENS(int i) {
			return getToken(RestructuredTextDocstringParser.HYPHENS, i);
		}
		public List<TerminalNode> COLONS() { return getTokens(RestructuredTextDocstringParser.COLONS); }
		public TerminalNode COLONS(int i) {
			return getToken(RestructuredTextDocstringParser.COLONS, i);
		}
		public VariableDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterVariableDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitVariableDescription(this);
		}
	}

	public final VariableDescriptionContext variableDescription() throws RecognitionException {
		VariableDescriptionContext _localctx = new VariableDescriptionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDescription);
		int _la;
		try {
			int _alt;
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					{
					setState(517); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(505);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(507); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(506);
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
							setState(509); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(514);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COLONS) {
							{
							{
							setState(511);
							match(COLONS);
							}
							}
							setState(516);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(519); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0) );
					setState(521);
					match(NEWLINE);
					}
					}
					break;
				case 2:
					{
					{
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(522);
						match(WS);
						}
						}
						setState(527);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(528);
					match(NAME);
					setState(529);
					match(NEWLINE);
					setState(531);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						setState(530);
						match(INDENT);
						}
						break;
					}
					}
					}
					break;
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(536);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INDENT) {
							{
							setState(535);
							match(INDENT);
							}
						}

						setState(561);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
						case 1:
							{
							setState(550); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(538);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0)) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(540); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(539);
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
									setState(542); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								setState(547);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COLONS) {
									{
									{
									setState(544);
									match(COLONS);
									}
									}
									setState(549);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								}
								setState(552); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << PUNCTUATION) | (1L << HYPHENS) | (1L << NAME) | (1L << UNKNOWN_CHAR))) != 0) );
							}
							break;
						case 2:
							{
							{
							setState(557);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS) {
								{
								{
								setState(554);
								match(WS);
								}
								}
								setState(559);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(560);
							match(NAME);
							}
							}
							break;
						}
						setState(563);
						match(NEWLINE);
						setState(565);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
						case 1:
							{
							setState(564);
							match(DEDENT);
							}
							break;
						}
						}
						} 
					}
					setState(571);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(572);
					match(WS);
					}
					}
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(578);
				match(NAME);
				setState(579);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(RestructuredTextDocstringParser.NAME, 0); }
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(RestructuredTextDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(RestructuredTextDocstringParser.UNKNOWN_CHAR, i);
		}
		public List<TerminalNode> WS() { return getTokens(RestructuredTextDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RestructuredTextDocstringParser.WS, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNKNOWN_CHAR) {
				{
				{
				setState(582);
				match(UNKNOWN_CHAR);
				}
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(588);
				match(WS);
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
			match(NAME);
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(595);
					match(WS);
					}
					} 
				}
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(601);
					match(UNKNOWN_CHAR);
					}
					} 
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
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
		public TerminalNode NAME() { return getToken(RestructuredTextDocstringParser.NAME, 0); }
		public List<TerminalNode> WS() { return getTokens(RestructuredTextDocstringParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RestructuredTextDocstringParser.WS, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(RestructuredTextDocstringParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(RestructuredTextDocstringParser.UNKNOWN_CHAR, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestructuredTextDocstringListener ) ((RestructuredTextDocstringListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(607);
					match(WS);
					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(613);
				type();
				}
				break;
			}
			setState(619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(616);
					match(WS);
					}
					} 
				}
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNKNOWN_CHAR) {
				{
				{
				setState(622);
				match(UNKNOWN_CHAR);
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(628);
				match(WS);
				}
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(634);
			match(NAME);
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(635);
					match(WS);
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNKNOWN_CHAR) {
				{
				{
				setState(641);
				match(UNKNOWN_CHAR);
				}
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(647);
				match(WS);
				}
				}
				setState(652);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0290\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\7\2\63"+
		"\n\2\f\2\16\2\66\13\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\2\7\2A\n\2"+
		"\f\2\16\2D\13\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\7\2M\n\2\f\2\16\2P\13"+
		"\2\3\2\3\2\3\2\3\2\7\2V\n\2\f\2\16\2Y\13\2\3\2\7\2\\\n\2\f\2\16\2_\13"+
		"\2\5\2a\n\2\3\2\7\2d\n\2\f\2\16\2g\13\2\3\2\7\2j\n\2\f\2\16\2m\13\2\3"+
		"\2\7\2p\n\2\f\2\16\2s\13\2\3\2\6\2v\n\2\r\2\16\2w\3\2\6\2{\n\2\r\2\16"+
		"\2|\3\2\7\2\u0080\n\2\f\2\16\2\u0083\13\2\7\2\u0085\n\2\f\2\16\2\u0088"+
		"\13\2\3\2\3\2\5\2\u008c\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\u0098\n\3\3\4\6\4\u009b\n\4\r\4\16\4\u009c\3\5\7\5\u00a0\n\5\f\5\16"+
		"\5\u00a3\13\5\3\5\7\5\u00a6\n\5\f\5\16\5\u00a9\13\5\3\5\7\5\u00ac\n\5"+
		"\f\5\16\5\u00af\13\5\3\5\6\5\u00b2\n\5\r\5\16\5\u00b3\3\5\7\5\u00b7\n"+
		"\5\f\5\16\5\u00ba\13\5\6\5\u00bc\n\5\r\5\16\5\u00bd\3\5\7\5\u00c1\n\5"+
		"\f\5\16\5\u00c4\13\5\3\5\6\5\u00c7\n\5\r\5\16\5\u00c8\3\5\6\5\u00cc\n"+
		"\5\r\5\16\5\u00cd\3\5\7\5\u00d1\n\5\f\5\16\5\u00d4\13\5\6\5\u00d6\n\5"+
		"\r\5\16\5\u00d7\3\5\5\5\u00db\n\5\5\5\u00dd\n\5\3\5\7\5\u00e0\n\5\f\5"+
		"\16\5\u00e3\13\5\3\5\6\5\u00e6\n\5\r\5\16\5\u00e7\3\5\7\5\u00eb\n\5\f"+
		"\5\16\5\u00ee\13\5\6\5\u00f0\n\5\r\5\16\5\u00f1\3\5\7\5\u00f5\n\5\f\5"+
		"\16\5\u00f8\13\5\3\5\5\5\u00fb\n\5\7\5\u00fd\n\5\f\5\16\5\u0100\13\5\3"+
		"\5\7\5\u0103\n\5\f\5\16\5\u0106\13\5\3\5\7\5\u0109\n\5\f\5\16\5\u010c"+
		"\13\5\3\5\7\5\u010f\n\5\f\5\16\5\u0112\13\5\6\5\u0114\n\5\r\5\16\5\u0115"+
		"\3\6\3\6\5\6\u011a\n\6\3\6\3\6\6\6\u011e\n\6\r\6\16\6\u011f\3\6\5\6\u0123"+
		"\n\6\3\6\3\6\3\7\3\7\5\7\u0129\n\7\3\7\3\7\6\7\u012d\n\7\r\7\16\7\u012e"+
		"\3\7\5\7\u0132\n\7\3\7\3\7\7\7\u0136\n\7\f\7\16\7\u0139\13\7\3\7\7\7\u013c"+
		"\n\7\f\7\16\7\u013f\13\7\3\7\7\7\u0142\n\7\f\7\16\7\u0145\13\7\3\b\3\b"+
		"\5\b\u0149\n\b\3\b\3\b\6\b\u014d\n\b\r\b\16\b\u014e\3\b\5\b\u0152\n\b"+
		"\3\b\3\b\3\t\3\t\5\t\u0158\n\t\3\t\3\t\6\t\u015c\n\t\r\t\16\t\u015d\3"+
		"\t\5\t\u0161\n\t\3\t\3\t\7\t\u0165\n\t\f\t\16\t\u0168\13\t\3\t\7\t\u016b"+
		"\n\t\f\t\16\t\u016e\13\t\3\t\7\t\u0171\n\t\f\t\16\t\u0174\13\t\3\n\3\n"+
		"\5\n\u0178\n\n\3\n\3\n\6\n\u017c\n\n\r\n\16\n\u017d\3\n\5\n\u0181\n\n"+
		"\3\n\3\n\3\13\3\13\5\13\u0187\n\13\3\13\3\13\6\13\u018b\n\13\r\13\16\13"+
		"\u018c\3\13\5\13\u0190\n\13\3\13\3\13\3\f\3\f\5\f\u0196\n\f\3\f\3\f\6"+
		"\f\u019a\n\f\r\f\16\f\u019b\3\f\5\f\u019f\n\f\3\f\3\f\7\f\u01a3\n\f\f"+
		"\f\16\f\u01a6\13\f\3\f\7\f\u01a9\n\f\f\f\16\f\u01ac\13\f\3\f\7\f\u01af"+
		"\n\f\f\f\16\f\u01b2\13\f\3\r\3\r\6\r\u01b6\n\r\r\r\16\r\u01b7\3\r\3\r"+
		"\6\r\u01bc\n\r\r\r\16\r\u01bd\3\r\5\r\u01c1\n\r\3\r\3\r\3\16\7\16\u01c6"+
		"\n\16\f\16\16\16\u01c9\13\16\3\16\7\16\u01cc\n\16\f\16\16\16\u01cf\13"+
		"\16\3\16\7\16\u01d2\n\16\f\16\16\16\u01d5\13\16\3\16\3\16\7\16\u01d9\n"+
		"\16\f\16\16\16\u01dc\13\16\3\16\7\16\u01df\n\16\f\16\16\16\u01e2\13\16"+
		"\3\17\3\17\6\17\u01e6\n\17\r\17\16\17\u01e7\3\17\5\17\u01eb\n\17\5\17"+
		"\u01ed\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u01f8\n"+
		"\17\r\17\16\17\u01f9\3\20\3\20\6\20\u01fe\n\20\r\20\16\20\u01ff\3\20\7"+
		"\20\u0203\n\20\f\20\16\20\u0206\13\20\6\20\u0208\n\20\r\20\16\20\u0209"+
		"\3\20\3\20\7\20\u020e\n\20\f\20\16\20\u0211\13\20\3\20\3\20\3\20\5\20"+
		"\u0216\n\20\5\20\u0218\n\20\3\20\5\20\u021b\n\20\3\20\3\20\6\20\u021f"+
		"\n\20\r\20\16\20\u0220\3\20\7\20\u0224\n\20\f\20\16\20\u0227\13\20\6\20"+
		"\u0229\n\20\r\20\16\20\u022a\3\20\7\20\u022e\n\20\f\20\16\20\u0231\13"+
		"\20\3\20\5\20\u0234\n\20\3\20\3\20\5\20\u0238\n\20\7\20\u023a\n\20\f\20"+
		"\16\20\u023d\13\20\3\20\7\20\u0240\n\20\f\20\16\20\u0243\13\20\3\20\3"+
		"\20\5\20\u0247\n\20\3\21\7\21\u024a\n\21\f\21\16\21\u024d\13\21\3\21\7"+
		"\21\u0250\n\21\f\21\16\21\u0253\13\21\3\21\3\21\7\21\u0257\n\21\f\21\16"+
		"\21\u025a\13\21\3\21\7\21\u025d\n\21\f\21\16\21\u0260\13\21\3\22\7\22"+
		"\u0263\n\22\f\22\16\22\u0266\13\22\3\22\5\22\u0269\n\22\3\22\7\22\u026c"+
		"\n\22\f\22\16\22\u026f\13\22\3\22\7\22\u0272\n\22\f\22\16\22\u0275\13"+
		"\22\3\22\7\22\u0278\n\22\f\22\16\22\u027b\13\22\3\22\3\22\7\22\u027f\n"+
		"\22\f\22\16\22\u0282\13\22\3\22\7\22\u0285\n\22\f\22\16\22\u0288\13\22"+
		"\3\22\7\22\u028b\n\22\f\22\16\22\u028e\13\22\3\22\2\2\23\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"\2\5\7\2\3\3\5\5\16\16\20\20\22\23\6\2\3\3"+
		"\16\16\20\20\22\23\4\2\3\3\22\23\2\u0300\2\u008b\3\2\2\2\4\u0097\3\2\2"+
		"\2\6\u009a\3\2\2\2\b\u0113\3\2\2\2\n\u0117\3\2\2\2\f\u0126\3\2\2\2\16"+
		"\u0146\3\2\2\2\20\u0155\3\2\2\2\22\u0175\3\2\2\2\24\u0184\3\2\2\2\26\u0193"+
		"\3\2\2\2\30\u01b3\3\2\2\2\32\u01c7\3\2\2\2\34\u01e3\3\2\2\2\36\u0246\3"+
		"\2\2\2 \u024b\3\2\2\2\"\u0264\3\2\2\2$&\7\21\2\2%$\3\2\2\2&)\3\2\2\2\'"+
		"%\3\2\2\2\'(\3\2\2\2(-\3\2\2\2)\'\3\2\2\2*,\7\25\2\2+*\3\2\2\2,/\3\2\2"+
		"\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\64\5\6\4\2\61\63\7\21"+
		"\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65:\3\2\2"+
		"\2\66\64\3\2\2\2\679\7\26\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2"+
		"\2;=\3\2\2\2<:\3\2\2\2=>\7\2\2\3>\u008c\3\2\2\2?A\7\21\2\2@?\3\2\2\2A"+
		"D\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2EG\7\25\2\2FE\3\2\2\2"+
		"GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IN\3\2\2\2JH\3\2\2\2KM\7\26\2\2LK\3\2\2"+
		"\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\5\6\4\2RS\7\21"+
		"\2\2SW\7\21\2\2TV\7\25\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X]\3"+
		"\2\2\2YW\3\2\2\2Z\\\7\26\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2"+
		"^a\3\2\2\2_]\3\2\2\2`B\3\2\2\2`a\3\2\2\2au\3\2\2\2bd\7\21\2\2cb\3\2\2"+
		"\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fk\3\2\2\2ge\3\2\2\2hj\7\25\2\2ih\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lq\3\2\2\2mk\3\2\2\2np\7\26\2\2on\3"+
		"\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tv\5\4\3\2ue\3"+
		"\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u0086\3\2\2\2y{\7\21\2\2zy\3\2\2"+
		"\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0081\3\2\2\2~\u0080\7\26\2\2\177~\3"+
		"\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084z\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008a\7\2\2\3\u008a\u008c\3\2\2\2\u008b\'\3\2\2\2\u008b"+
		"`\3\2\2\2\u008c\3\3\2\2\2\u008d\u0098\5\n\6\2\u008e\u0098\5\16\b\2\u008f"+
		"\u0098\5\22\n\2\u0090\u0098\5\30\r\2\u0091\u0098\5\24\13\2\u0092\u0098"+
		"\5\f\7\2\u0093\u0098\5\20\t\2\u0094\u0098\5\26\f\2\u0095\u0098\5\34\17"+
		"\2\u0096\u0098\5\b\5\2\u0097\u008d\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u008f"+
		"\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\5\3\2\2\2\u0099\u009b\t\2\2\2\u009a\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\7\3\2\2\2\u009e"+
		"\u00a0\7\21\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a7\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a6\7\25\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ad\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ac\7\26\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00bb\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b2\t\3\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b7\7\5\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00dc\3\2"+
		"\2\2\u00bf\u00c1\7\21\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c7\7\25\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d5\3\2\2\2\u00ca\u00cc\t\3"+
		"\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d2\3\2\2\2\u00cf\u00d1\7\5\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00cb\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00db\7\26\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3"+
		"\2\2\2\u00dc\u00c2\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00fe\3\2\2\2\u00de"+
		"\u00e0\7\21\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00ef\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e6\t\3\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00eb\7\5\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00e5\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\3\2"+
		"\2\2\u00f3\u00f5\7\21\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u00fb\7\26\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00e1\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0104\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0103\7\21\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3"+
		"\2\2\2\u0104\u0105\3\2\2\2\u0105\u010a\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0109\7\25\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u0110\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010f\7\26\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3"+
		"\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u00a1\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\t\3\2\2\2\u0117\u0119\7\7\2\2\u0118\u011a\5\"\22\2\u0119\u0118"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0122\7\5\2\2\u011c"+
		"\u011e\7\21\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3"+
		"\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\7\25\2\2\u0122"+
		"\u011d\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\5\36"+
		"\20\2\u0125\13\3\2\2\2\u0126\u0128\7\b\2\2\u0127\u0129\5\32\16\2\u0128"+
		"\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0131\7\5"+
		"\2\2\u012b\u012d\7\21\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\7\25"+
		"\2\2\u0131\u012c\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0137\5\36\20\2\u0134\u0136\7\21\2\2\u0135\u0134\3\2\2\2\u0136\u0139"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013d\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013c\7\25\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3"+
		"\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0143\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0142\7\26\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3"+
		"\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\r\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0146\u0148\7\f\2\2\u0147\u0149\5\"\22\2\u0148\u0147\3\2\2\2"+
		"\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0151\7\5\2\2\u014b\u014d"+
		"\7\21\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\7\25\2\2\u0151\u014c"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\5\36\20\2"+
		"\u0154\17\3\2\2\2\u0155\u0157\7\r\2\2\u0156\u0158\5\32\16\2\u0157\u0156"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0160\7\5\2\2\u015a"+
		"\u015c\7\21\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3"+
		"\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\7\25\2\2\u0160"+
		"\u015b\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0166\5\36"+
		"\20\2\u0163\u0165\7\21\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016c\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0169\u016b\7\25\2\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0172\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016f\u0171\7\26\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\21\3\2\2\2\u0174\u0172\3\2\2"+
		"\2\u0175\u0177\7\t\2\2\u0176\u0178\5\"\22\2\u0177\u0176\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0180\7\5\2\2\u017a\u017c\7\21"+
		"\2\2\u017b\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\7\25\2\2\u0180\u017b\3"+
		"\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\5\36\20\2\u0183"+
		"\23\3\2\2\2\u0184\u0186\7\n\2\2\u0185\u0187\5\"\22\2\u0186\u0185\3\2\2"+
		"\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018f\7\5\2\2\u0189\u018b"+
		"\7\21\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2"+
		"\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\7\25\2\2\u018f\u018a"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\5\36\20\2"+
		"\u0192\25\3\2\2\2\u0193\u0195\7\13\2\2\u0194\u0196\5\32\16\2\u0195\u0194"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019e\7\5\2\2\u0198"+
		"\u019a\7\21\2\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3"+
		"\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\7\25\2\2\u019e"+
		"\u0199\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a4\5\36"+
		"\20\2\u01a1\u01a3\7\21\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01aa\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a7\u01a9\7\25\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01b0\3\2\2\2\u01ac\u01aa\3\2"+
		"\2\2\u01ad\u01af\7\26\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\27\3\2\2\2\u01b2\u01b0\3\2\2"+
		"\2\u01b3\u01b5\7\5\2\2\u01b4\u01b6\t\4\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01c0\7\5\2\2\u01ba\u01bc\7\21\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3"+
		"\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c1\7\25\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3"+
		"\2\2\2\u01c2\u01c3\5\36\20\2\u01c3\31\3\2\2\2\u01c4\u01c6\7\3\2\2\u01c5"+
		"\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01cd\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cc\7\23\2\2\u01cb"+
		"\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2"+
		"\2\2\u01ce\u01d3\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d2\7\3\2\2\u01d1"+
		"\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01da\7\22\2\2\u01d7"+
		"\u01d9\7\3\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01db\u01e0\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd"+
		"\u01df\7\23\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3"+
		"\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\33\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3"+
		"\u01ec\7\17\2\2\u01e4\u01e6\7\21\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e7\3"+
		"\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9"+
		"\u01eb\7\25\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3"+
		"\2\2\2\u01ec\u01e5\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f7\3\2\2\2\u01ee"+
		"\u01f8\5\36\20\2\u01ef\u01f8\5\30\r\2\u01f0\u01f8\5\n\6\2\u01f1\u01f8"+
		"\5\f\7\2\u01f2\u01f8\5\20\t\2\u01f3\u01f8\5\16\b\2\u01f4\u01f8\5\22\n"+
		"\2\u01f5\u01f8\5\26\f\2\u01f6\u01f8\5\24\13\2\u01f7\u01ee\3\2\2\2\u01f7"+
		"\u01ef\3\2\2\2\u01f7\u01f0\3\2\2\2\u01f7\u01f1\3\2\2\2\u01f7\u01f2\3\2"+
		"\2\2\u01f7\u01f3\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7"+
		"\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\35\3\2\2\2\u01fb\u01fd\t\3\2\2\u01fc\u01fe\t\3\2\2\u01fd\u01fc"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0204\3\2\2\2\u0201\u0203\7\5\2\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0208\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0207\u01fb\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0218\7\21\2\2\u020c"+
		"\u020e\7\3\2\2\u020d\u020c\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2"+
		"\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212"+
		"\u0213\7\22\2\2\u0213\u0215\7\21\2\2\u0214\u0216\7\25\2\2\u0215\u0214"+
		"\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0207\3\2\2\2\u0217"+
		"\u020f\3\2\2\2\u0218\u023b\3\2\2\2\u0219\u021b\7\25\2\2\u021a\u0219\3"+
		"\2\2\2\u021a\u021b\3\2\2\2\u021b\u0233\3\2\2\2\u021c\u021e\t\3\2\2\u021d"+
		"\u021f\t\3\2\2\u021e\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0225\3\2\2\2\u0222\u0224\7\5\2\2\u0223"+
		"\u0222\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2"+
		"\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u021c\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0234\3\2"+
		"\2\2\u022c\u022e\7\3\2\2\u022d\u022c\3\2\2\2\u022e\u0231\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u022f\3\2"+
		"\2\2\u0232\u0234\7\22\2\2\u0233\u0228\3\2\2\2\u0233\u022f\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u0237\7\21\2\2\u0236\u0238\7\26\2\2\u0237\u0236\3"+
		"\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u021a\3\2\2\2\u023a"+
		"\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0247\3\2"+
		"\2\2\u023d\u023b\3\2\2\2\u023e\u0240\7\3\2\2\u023f\u023e\3\2\2\2\u0240"+
		"\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2"+
		"\2\2\u0243\u0241\3\2\2\2\u0244\u0245\7\22\2\2\u0245\u0247\7\21\2\2\u0246"+
		"\u0217\3\2\2\2\u0246\u0241\3\2\2\2\u0247\37\3\2\2\2\u0248\u024a\7\23\2"+
		"\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c"+
		"\3\2\2\2\u024c\u0251\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0250\7\3\2\2\u024f"+
		"\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2"+
		"\2\2\u0252\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0258\7\22\2\2\u0255"+
		"\u0257\7\3\2\2\u0256\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2"+
		"\2\2\u0258\u0259\3\2\2\2\u0259\u025e\3\2\2\2\u025a\u0258\3\2\2\2\u025b"+
		"\u025d\7\23\2\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3"+
		"\2\2\2\u025e\u025f\3\2\2\2\u025f!\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0263"+
		"\7\3\2\2\u0262\u0261\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0269\5 "+
		"\21\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026d\3\2\2\2\u026a"+
		"\u026c\7\3\2\2\u026b\u026a\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2"+
		"\2\2\u026d\u026e\3\2\2\2\u026e\u0273\3\2\2\2\u026f\u026d\3\2\2\2\u0270"+
		"\u0272\7\23\2\2\u0271\u0270\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3"+
		"\2\2\2\u0273\u0274\3\2\2\2\u0274\u0279\3\2\2\2\u0275\u0273\3\2\2\2\u0276"+
		"\u0278\7\3\2\2\u0277\u0276\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2"+
		"\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c"+
		"\u0280\7\22\2\2\u027d\u027f\7\3\2\2\u027e\u027d\3\2\2\2\u027f\u0282\3"+
		"\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0286\3\2\2\2\u0282"+
		"\u0280\3\2\2\2\u0283\u0285\7\23\2\2\u0284\u0283\3\2\2\2\u0285\u0288\3"+
		"\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u028c\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0289\u028b\7\3\2\2\u028a\u0289\3\2\2\2\u028b\u028e\3\2"+
		"\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d#\3\2\2\2\u028e\u028c"+
		"\3\2\2\2u\'-\64:BHNW]`ekqw|\u0081\u0086\u008b\u0097\u009c\u00a1\u00a7"+
		"\u00ad\u00b3\u00b8\u00bd\u00c2\u00c8\u00cd\u00d2\u00d7\u00da\u00dc\u00e1"+
		"\u00e7\u00ec\u00f1\u00f6\u00fa\u00fe\u0104\u010a\u0110\u0115\u0119\u011f"+
		"\u0122\u0128\u012e\u0131\u0137\u013d\u0143\u0148\u014e\u0151\u0157\u015d"+
		"\u0160\u0166\u016c\u0172\u0177\u017d\u0180\u0186\u018c\u018f\u0195\u019b"+
		"\u019e\u01a4\u01aa\u01b0\u01b7\u01bd\u01c0\u01c7\u01cd\u01d3\u01da\u01e0"+
		"\u01e7\u01ea\u01ec\u01f7\u01f9\u01ff\u0204\u0209\u020f\u0215\u0217\u021a"+
		"\u0220\u0225\u022a\u022f\u0233\u0237\u023b\u0241\u0246\u024b\u0251\u0258"+
		"\u025e\u0264\u0268\u026d\u0273\u0279\u0280\u0286\u028c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}