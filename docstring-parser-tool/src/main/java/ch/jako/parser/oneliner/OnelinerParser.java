// Generated from Oneliner.g4 by ANTLR 4.7.1

   package ch.jako.parser.oneliner;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OnelinerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, UNKNOWN_CHAR=2;
	public static final int
		RULE_oneliner = 0, RULE_oneLine = 1;
	public static final String[] ruleNames = {
		"oneliner", "oneLine"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "UNKNOWN_CHAR"
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
	public String getGrammarFileName() { return "Oneliner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OnelinerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OnelinerContext extends ParserRuleContext {
		public OneLineContext oneLine() {
			return getRuleContext(OneLineContext.class,0);
		}
		public TerminalNode EOF() { return getToken(OnelinerParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(OnelinerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(OnelinerParser.NEWLINE, i);
		}
		public OnelinerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneliner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnelinerListener ) ((OnelinerListener)listener).enterOneliner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnelinerListener ) ((OnelinerListener)listener).exitOneliner(this);
		}
	}

	public final OnelinerContext oneliner() throws RecognitionException {
		OnelinerContext _localctx = new OnelinerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_oneliner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(4);
				match(NEWLINE);
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(10);
			oneLine();
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(11);
				match(NEWLINE);
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			match(EOF);
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

	public static class OneLineContext extends ParserRuleContext {
		public List<TerminalNode> UNKNOWN_CHAR() { return getTokens(OnelinerParser.UNKNOWN_CHAR); }
		public TerminalNode UNKNOWN_CHAR(int i) {
			return getToken(OnelinerParser.UNKNOWN_CHAR, i);
		}
		public OneLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnelinerListener ) ((OnelinerListener)listener).enterOneLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnelinerListener ) ((OnelinerListener)listener).exitOneLine(this);
		}
	}

	public final OneLineContext oneLine() throws RecognitionException {
		OneLineContext _localctx = new OneLineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_oneLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				match(UNKNOWN_CHAR);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UNKNOWN_CHAR );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\4\33\4\2\t\2\4\3"+
		"\t\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13"+
		"\2\3\2\3\2\3\3\6\3\27\n\3\r\3\16\3\30\3\3\2\2\4\2\4\2\2\2\33\2\t\3\2\2"+
		"\2\4\26\3\2\2\2\6\b\7\3\2\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7\3\2\2\2\t\n\3"+
		"\2\2\2\n\f\3\2\2\2\13\t\3\2\2\2\f\20\5\4\3\2\r\17\7\3\2\2\16\r\3\2\2\2"+
		"\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22\20\3\2\2\2"+
		"\23\24\7\2\2\3\24\3\3\2\2\2\25\27\7\4\2\2\26\25\3\2\2\2\27\30\3\2\2\2"+
		"\30\26\3\2\2\2\30\31\3\2\2\2\31\5\3\2\2\2\5\t\20\30";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}