// Generated from testDenter.g4 by ANTLR 4.7.1

   package ch.jako.parser.testDenter;
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
public class testDenterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACES=1, ANY_CHAR=2, NUMBER=3, OPERATION=4, BIGLETTER=5;
	public static final int
		RULE_calculus = 0;
	public static final String[] ruleNames = {
		"calculus"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACES", "ANY_CHAR", "NUMBER", "OPERATION", "BIGLETTER"
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
	public String getGrammarFileName() { return "testDenter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testDenterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CalculusContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(testDenterParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(testDenterParser.NUMBER, i);
		}
		public TerminalNode OPERATION() { return getToken(testDenterParser.OPERATION, 0); }
		public TerminalNode EOF() { return getToken(testDenterParser.EOF, 0); }
		public TerminalNode ANY_CHAR() { return getToken(testDenterParser.ANY_CHAR, 0); }
		public CalculusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testDenterListener ) ((testDenterListener)listener).enterCalculus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testDenterListener ) ((testDenterListener)listener).exitCalculus(this);
		}
	}

	public final CalculusContext calculus() throws RecognitionException {
		CalculusContext _localctx = new CalculusContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calculus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(NUMBER);
			setState(3);
			match(OPERATION);
			setState(4);
			match(NUMBER);
			setState(6);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANY_CHAR) {
				{
				setState(5);
				match(ANY_CHAR);
				}
			}

			setState(8);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\r\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\5\2\t\n\2\3\2\3\2\3\2\2\2\3\2\2\2\2\f\2\4\3\2\2\2\4\5\7\5\2"+
		"\2\5\6\7\6\2\2\6\b\7\5\2\2\7\t\7\4\2\2\b\7\3\2\2\2\b\t\3\2\2\2\t\n\3\2"+
		"\2\2\n\13\7\2\2\3\13\3\3\2\2\2\3\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}