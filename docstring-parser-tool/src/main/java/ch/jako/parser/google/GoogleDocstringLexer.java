// Generated from GoogleDocstring.g4 by ANTLR 4.7.1

   package ch.jako.parser.google;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoogleDocstringLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, TRIPLEQUOTES=2, PARAMNAMINGS=3, ARGS=4, RETURNS=5, RAISES=6, ATTRIBUTES=7, 
		OTHERSECTIONS=8, PUNCTUATION=9, COLONS=10, HYPHENS=11, NEWLINE=12, NAME=13, 
		SKIP_=14, UNKNOWN_CHAR=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "TRIPLEQUOTES", "PARAMNAMINGS", "ARGS", "RETURNS", "RAISES", "ATTRIBUTES", 
		"OTHERSECTIONS", "PUNCTUATION", "COLONS", "HYPHENS", "NEWLINE", "NAME", 
		"SKIP_", "UNKNOWN_CHAR", "SINGLETRIPLEQUOTES", "DOUBLETRIPLEQUOTES", "DIGIT", 
		"SMALLLETTER", "BIGLETTER", "SPACES", "COLON", "HYPHEN", "ID_START", "ID_CONTINUE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "TRIPLEQUOTES", "PARAMNAMINGS", "ARGS", "RETURNS", "RAISES", 
		"ATTRIBUTES", "OTHERSECTIONS", "PUNCTUATION", "COLONS", "HYPHENS", "NEWLINE", 
		"NAME", "SKIP_", "UNKNOWN_CHAR"
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


	   // A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
	          private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	          // The stack that keeps track of the indentation level.
	          private java.util.Stack<Integer> indents = new java.util.Stack<>();
	          // The amount of opened braces, brackets and parenthesis.
	          private int opened = 0;
	          // The most recently produced token.
	          private Token lastToken = null;
	          @Override
	          public void emit(Token t) {
	            super.setToken(t);
	            tokens.offer(t);
	          }

	          @Override
	          public Token nextToken() {
	            // Check if the end-of-file is ahead and there are still some DEDENTS expected.
	            if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
	              // Remove any trailing EOF tokens from our buffer.
	              for (int i = tokens.size() - 1; i >= 0; i--) {
	                if (tokens.get(i).getType() == EOF) {
	                  tokens.remove(i);
	                }
	              }

	              // First emit an extra line break that serves as the end of the statement.
	              this.emit(commonToken(GoogleDocstringParser.NEWLINE, "\n"));

	              // Now emit as much DEDENT tokens as needed.
	              while (!indents.isEmpty()) {
	                this.emit(createDedent());
	                indents.pop();
	              }

	              // Put the EOF back on the token stream.
	              this.emit(commonToken(GoogleDocstringParser.EOF, "<EOF>"));
	            }

	            Token next = super.nextToken();

	            if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	              // Keep track of the last token on the default channel.
	              this.lastToken = next;
	            }

	            return tokens.isEmpty() ? next : tokens.poll();
	          }

	          private Token createDedent() {
	            CommonToken dedent = commonToken(GoogleDocstringParser.DEDENT, "");
	            dedent.setLine(this.lastToken.getLine());
	            return dedent;
	          }

	          private CommonToken commonToken(int type, String text) {
	            int stop = this.getCharIndex() - 1;
	            int start = text.isEmpty() ? stop : stop - text.length() + 1;
	            return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	          }

	          // Calculates the indentation of the provided spaces, taking the
	          // following rules into account:
	          //
	          // "Tabs are replaced (from left to right) by one to eight spaces
	          //  such that the total number of characters up to and including
	          //  the replacement is a multiple of eight [...]"
	          //
	          //  -- https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
	          static int getIndentationCount(String spaces) {
	            int count = 0;
	            for (char ch : spaces.toCharArray()) {
	              switch (ch) {
	                case '\t':
	                  count += 4 - (count % 4);
	                  break;
	                default:
	                  // A normal space char.
	                  count++;
	              }
	            }

	            return count;
	          }

	          boolean atStartOfInput() {
	            return super.getCharPositionInLine() == 0 && super.getLine() == 1;
	          }
	        

	public GoogleDocstringLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GoogleDocstring.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2:
			PARAMNAMINGS_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void PARAMNAMINGS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("OTHER DOCSTRING FORMAT");
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			         String newLine = getText().replaceAll("[^\r\n\f]+", "");
			         String spaces = getText().replaceAll("[\r\n\f]+", "");
			         int next = _input.LA(1);
			         if (next == '\r' || next == '\n' || next == '\f' || next == '#') {
			           // If we're inside a list or on a blank line, ignore all indents,
			           // dedents and line breaks.
			           //skip();
			         }
			         else {
			           emit(commonToken(NEWLINE, getText()));
			           int indent = getIndentationCount(spaces);
			           int previous = indents.isEmpty() ? 0 : indents.peek();
			           if (indent == previous) {
			             // skip indents of the same size as the present indent-size
			             skip();
			           }
			           else if (indent > previous) {
			             indents.push(indent);
			             emit(commonToken(GoogleDocstringParser.INDENT, spaces));
			           }
			           else {
			             // Possibly emit more than 1 DEDENT token.
			             while(!indents.isEmpty() && indents.peek() > indent) {
			               this.emit(createDedent());
			               indents.pop();
			             }
			           }
			         }
			       
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u033d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\5\3:\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4x\n\4\3\4\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4\7\4\u0082\n\4\f\4\16"+
		"\4\u0085\13\4\3\4\6\4\u0088\n\4\r\4\16\4\u0089\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00f2\n\4\3\4\3\4\3\4\7\4\u00f7"+
		"\n\4\f\4\16\4\u00fa\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u010e\n\4\3\4\7\4\u0111\n\4\f\4\16\4\u0114"+
		"\13\4\3\4\7\4\u0117\n\4\f\4\16\4\u011a\13\4\3\4\5\4\u011d\n\4\3\4\7\4"+
		"\u0120\n\4\f\4\16\4\u0123\13\4\5\4\u0125\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0157\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u018b\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u019b\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01b3"+
		"\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u02ef\n\t\3\t\3\t\6\t\u02f3\n\t\r\t\16\t\u02f4\3\t\3\t\6\t\u02f9"+
		"\n\t\r\t\16\t\u02fa\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\5\r\u0306\n"+
		"\r\3\r\3\r\5\r\u030a\n\r\3\r\5\r\u030d\n\r\5\r\u030f\n\r\3\r\3\r\3\16"+
		"\3\16\7\16\u0315\n\16\f\16\16\16\u0318\13\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\6\26\u032f\n\26\r\26\16\26\u0330\3\27\3\27\3\30\3\30\3\31\5"+
		"\31\u0338\n\31\3\32\3\32\5\32\u033c\n\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2%\2\'\2)\2+"+
		"\2-\2/\2\61\2\63\2\3\2\n\4\2\17\17\"\"\5\2##.\60AA\3\2\62;\3\2c|\3\2C"+
		"\\\4\2\13\13\"\"\u0129\2C\\aac|\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc\u00c2"+
		"\u00d8\u00da\u00f8\u00fa\u0243\u0252\u02c3\u02c8\u02d3\u02e2\u02e6\u02f0"+
		"\u02f0\u037c\u037c\u0388\u0388\u038a\u038c\u038e\u038e\u0390\u03a3\u03a5"+
		"\u03d0\u03d2\u03f7\u03f9\u0483\u048c\u04d0\u04d2\u04fb\u0502\u0511\u0533"+
		"\u0558\u055b\u055b\u0563\u0589\u05d2\u05ec\u05f2\u05f4\u0623\u063c\u0642"+
		"\u064c\u0670\u0671\u0673\u06d5\u06d7\u06d7\u06e7\u06e8\u06f0\u06f1\u06fc"+
		"\u06fe\u0701\u0701\u0712\u0712\u0714\u0731\u074f\u076f\u0782\u07a7\u07b3"+
		"\u07b3\u0906\u093b\u093f\u093f\u0952\u0952\u095a\u0963\u097f\u097f\u0987"+
		"\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09bf"+
		"\u09bf\u09d0\u09d0\u09de\u09df\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11"+
		"\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b"+
		"\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac"+
		"\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0abf\u0ad2\u0ad2\u0ae2\u0ae3\u0b07"+
		"\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b37\u0b3b\u0b3f"+
		"\u0b3f\u0b5e\u0b5f\u0b61\u0b63\u0b73\u0b73\u0b85\u0b85\u0b87\u0b8c\u0b90"+
		"\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa"+
		"\u0bac\u0bb0\u0bbb\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37"+
		"\u0c3b\u0c62\u0c63\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7"+
		"\u0cbb\u0cbf\u0cbf\u0ce0\u0ce0\u0ce2\u0ce3\u0d07\u0d0e\u0d10\u0d12\u0d14"+
		"\u0d2a\u0d2c\u0d3b\u0d62\u0d63\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf"+
		"\u0dbf\u0dc2\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e42\u0e48\u0e83\u0e84\u0e86"+
		"\u0e86\u0e89\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3"+
		"\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf"+
		"\u0ebf\u0ec2\u0ec6\u0ec8\u0ec8\u0ede\u0edf\u0f02\u0f02\u0f42\u0f49\u0f4b"+
		"\u0f6c\u0f8a\u0f8d\u1002\u1023\u1025\u1029\u102b\u102c\u1052\u1057\u10a2"+
		"\u10c7\u10d2\u10fc\u10fe\u10fe\u1102\u115b\u1161\u11a4\u11aa\u11fb\u1202"+
		"\u124a\u124c\u124f\u1252\u1258\u125a\u125a\u125c\u125f\u1262\u128a\u128c"+
		"\u128f\u1292\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca"+
		"\u12d8\u12da\u1312\u1314\u1317\u131a\u135c\u1382\u1391\u13a2\u13f6\u1403"+
		"\u166e\u1671\u1678\u1683\u169c\u16a2\u16ec\u16f0\u16f2\u1702\u170e\u1710"+
		"\u1713\u1722\u1733\u1742\u1753\u1762\u176e\u1770\u1772\u1782\u17b5\u17d9"+
		"\u17d9\u17de\u17de\u1822\u1879\u1882\u18aa\u1902\u191e\u1952\u196f\u1972"+
		"\u1976\u1982\u19ab\u19c3\u19c9\u1a02\u1a18\u1d02\u1dc1\u1e02\u1e9d\u1ea2"+
		"\u1efb\u1f02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52\u1f59\u1f5b"+
		"\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8\u1fbe\u1fc0"+
		"\u1fc0\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2\u1fee\u1ff4"+
		"\u1ff6\u1ff8\u1ffe\u2073\u2073\u2081\u2081\u2092\u2096\u2104\u2104\u2109"+
		"\u2109\u210c\u2115\u2117\u2117\u211a\u211f\u2126\u2126\u2128\u2128\u212a"+
		"\u212a\u212c\u2133\u2135\u213b\u213e\u2141\u2147\u214b\u2162\u2185\u2c02"+
		"\u2c30\u2c32\u2c60\u2c82\u2ce6\u2d02\u2d27\u2d32\u2d67\u2d71\u2d71\u2d82"+
		"\u2d98\u2da2\u2da8\u2daa\u2db0\u2db2\u2db8\u2dba\u2dc0\u2dc2\u2dc8\u2dca"+
		"\u2dd0\u2dd2\u2dd8\u2dda\u2de0\u3007\u3009\u3023\u302b\u3033\u3037\u303a"+
		"\u303e\u3043\u3098\u309d\u30a1\u30a3\u30fc\u30fe\u3101\u3107\u312e\u3133"+
		"\u3190\u31a2\u31b9\u31f2\u3201\u3402\u4db7\u4e02\u9fbd\ua002\ua48e\ua802"+
		"\ua803\ua805\ua807\ua809\ua80c\ua80e\ua824\uac02\ud7a5\uf902\ufa2f\ufa32"+
		"\ufa6c\ufa72\ufadb\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21\ufb2a\ufb2c"+
		"\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5"+
		"\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe76\ufe78\ufefe\uff23"+
		"\uff3c\uff43\uff5c\uff68\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc"+
		"\uffde\u0096\2\62;\u0302\u0371\u0485\u0488\u0593\u05bb\u05bd\u05bf\u05c1"+
		"\u05c1\u05c3\u05c4\u05c6\u05c7\u05c9\u05c9\u0612\u0617\u064d\u0660\u0662"+
		"\u066b\u0672\u0672\u06d8\u06de\u06e1\u06e6\u06e9\u06ea\u06ec\u06ef\u06f2"+
		"\u06fb\u0713\u0713\u0732\u074c\u07a8\u07b2\u0903\u0905\u093e\u093e\u0940"+
		"\u094f\u0953\u0956\u0964\u0965\u0968\u0971\u0983\u0985\u09be\u09be\u09c0"+
		"\u09c6\u09c9\u09ca\u09cd\u09cf\u09d9\u09d9\u09e4\u09e5\u09e8\u09f1\u0a03"+
		"\u0a05\u0a3e\u0a3e\u0a40\u0a44\u0a49\u0a4a\u0a4d\u0a4f\u0a68\u0a73\u0a83"+
		"\u0a85\u0abe\u0abe\u0ac0\u0ac7\u0ac9\u0acb\u0acd\u0acf\u0ae4\u0ae5\u0ae8"+
		"\u0af1\u0b03\u0b05\u0b3e\u0b3e\u0b40\u0b45\u0b49\u0b4a\u0b4d\u0b4f\u0b58"+
		"\u0b59\u0b68\u0b71\u0b84\u0b84\u0bc0\u0bc4\u0bc8\u0bca\u0bcc\u0bcf\u0bd9"+
		"\u0bd9\u0be8\u0bf1\u0c03\u0c05\u0c40\u0c46\u0c48\u0c4a\u0c4c\u0c4f\u0c57"+
		"\u0c58\u0c68\u0c71\u0c84\u0c85\u0cbe\u0cbe\u0cc0\u0cc6\u0cc8\u0cca\u0ccc"+
		"\u0ccf\u0cd7\u0cd8\u0ce8\u0cf1\u0d04\u0d05\u0d40\u0d45\u0d48\u0d4a\u0d4c"+
		"\u0d4f\u0d59\u0d59\u0d68\u0d71\u0d84\u0d85\u0dcc\u0dcc\u0dd1\u0dd6\u0dd8"+
		"\u0dd8\u0dda\u0de1\u0df4\u0df5\u0e33\u0e33\u0e36\u0e3c\u0e49\u0e50\u0e52"+
		"\u0e5b\u0eb3\u0eb3\u0eb6\u0ebb\u0ebd\u0ebe\u0eca\u0ecf\u0ed2\u0edb\u0f1a"+
		"\u0f1b\u0f22\u0f2b\u0f37\u0f37\u0f39\u0f39\u0f3b\u0f3b\u0f40\u0f41\u0f73"+
		"\u0f86\u0f88\u0f89\u0f92\u0f99\u0f9b\u0fbe\u0fc8\u0fc8\u102e\u1034\u1038"+
		"\u103b\u1042\u104b\u1058\u105b\u1361\u1361\u136b\u1373\u1714\u1716\u1734"+
		"\u1736\u1754\u1755\u1774\u1775\u17b8\u17d5\u17df\u17df\u17e2\u17eb\u180d"+
		"\u180f\u1812\u181b\u18ab\u18ab\u1922\u192d\u1932\u193d\u1948\u1951\u19b2"+
		"\u19c2\u19ca\u19cb\u19d2\u19db\u1a19\u1a1d\u1dc2\u1dc5\u2041\u2042\u2056"+
		"\u2056\u20d2\u20de\u20e3\u20e3\u20e7\u20ed\u302c\u3031\u309b\u309c\ua804"+
		"\ua804\ua808\ua808\ua80d\ua80d\ua825\ua829\ufb20\ufb20\ufe02\ufe11\ufe22"+
		"\ufe25\ufe35\ufe36\ufe4f\ufe51\uff12\uff1b\uff41\uff41\2\u038e\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3\65\3\2\2\2\59\3\2\2\2\7"+
		"\u0124\3\2\2\2\t\u0156\3\2\2\2\13\u018a\3\2\2\2\r\u019a\3\2\2\2\17\u01b2"+
		"\3\2\2\2\21\u02ee\3\2\2\2\23\u02fc\3\2\2\2\25\u02fe\3\2\2\2\27\u0300\3"+
		"\2\2\2\31\u030e\3\2\2\2\33\u0312\3\2\2\2\35\u0319\3\2\2\2\37\u031d\3\2"+
		"\2\2!\u031f\3\2\2\2#\u0323\3\2\2\2%\u0327\3\2\2\2\'\u0329\3\2\2\2)\u032b"+
		"\3\2\2\2+\u032e\3\2\2\2-\u0332\3\2\2\2/\u0334\3\2\2\2\61\u0337\3\2\2\2"+
		"\63\u033b\3\2\2\2\65\66\t\2\2\2\66\4\3\2\2\2\67:\5!\21\28:\5#\22\29\67"+
		"\3\2\2\298\3\2\2\2:;\3\2\2\2;<\b\3\2\2<\6\3\2\2\2=>\7R\2\2>?\7c\2\2?@"+
		"\7t\2\2@A\7c\2\2AB\7o\2\2BC\7g\2\2CD\7v\2\2DE\7g\2\2EF\7t\2\2Fx\7u\2\2"+
		"GH\7T\2\2HI\7g\2\2IJ\7v\2\2JK\7w\2\2KL\7t\2\2LM\7p\2\2Mx\7u\2\2NO\7[\2"+
		"\2OP\7k\2\2PQ\7g\2\2QR\7n\2\2RS\7f\2\2Sx\7u\2\2TU\7T\2\2UV\7c\2\2VW\7"+
		"k\2\2WX\7u\2\2XY\7g\2\2Yx\7u\2\2Z[\7r\2\2[\\\7c\2\2\\]\7t\2\2]^\7c\2\2"+
		"^_\7o\2\2_`\7g\2\2`a\7v\2\2ab\7g\2\2bc\7t\2\2cx\7u\2\2de\7t\2\2ef\7g\2"+
		"\2fg\7v\2\2gh\7w\2\2hi\7t\2\2ij\7p\2\2jx\7u\2\2kl\7{\2\2lm\7k\2\2mn\7"+
		"g\2\2no\7n\2\2op\7f\2\2px\7u\2\2qr\7t\2\2rs\7c\2\2st\7k\2\2tu\7u\2\2u"+
		"v\7g\2\2vx\7u\2\2w=\3\2\2\2wG\3\2\2\2wN\3\2\2\2wT\3\2\2\2wZ\3\2\2\2wd"+
		"\3\2\2\2wk\3\2\2\2wq\3\2\2\2xy\3\2\2\2y}\5\31\r\2z|\5\3\2\2{z\3\2\2\2"+
		"|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0083\3\2\2\2\177}\3\2\2\2\u0080\u0082"+
		"\7\13\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088"+
		"\5\27\f\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u0125\3\2\2\2\u008b\u00f1\5-\27\2\u008c\u008d"+
		"\7r\2\2\u008d\u008e\7c\2\2\u008e\u008f\7t\2\2\u008f\u0090\7c\2\2\u0090"+
		"\u00f2\7o\2\2\u0091\u0092\7r\2\2\u0092\u0093\7c\2\2\u0093\u0094\7t\2\2"+
		"\u0094\u0095\7c\2\2\u0095\u0096\7o\2\2\u0096\u0097\7g\2\2\u0097\u0098"+
		"\7v\2\2\u0098\u0099\7g\2\2\u0099\u00f2\7t\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7t\2\2\u009c\u00f2\7i\2\2\u009d\u009e\7c\2\2\u009e\u009f\7t\2\2"+
		"\u009f\u00a0\7i\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7o\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3\u00a4\7p\2\2\u00a4\u00f2\7v\2\2\u00a5\u00a6\7m\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\u00f2\7{\2\2\u00a8\u00a9\7m\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa\u00ab\7{\2\2\u00ab\u00ac\7y\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae"+
		"\7t\2\2\u00ae\u00f2\7f\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7{\2\2\u00b1"+
		"\u00b2\7r\2\2\u00b2\u00f2\7g\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7c\2\2"+
		"\u00b5\u00b6\7k\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8\u00f2"+
		"\7u\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7u\2\2\u00bd\u00f2\7g\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7z\2\2"+
		"\u00c0\u00c1\7e\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7r\2\2\u00c3\u00f2"+
		"\7v\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7z\2\2\u00c6\u00c7\7e\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7r\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7k\2\2"+
		"\u00cb\u00cc\7q\2\2\u00cc\u00f2\7p\2\2\u00cd\u00ce\7x\2\2\u00ce\u00cf"+
		"\7c\2\2\u00cf\u00f2\7t\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7x\2\2\u00d2"+
		"\u00d3\7c\2\2\u00d3\u00f2\7t\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7x\2\2"+
		"\u00d6\u00d7\7c\2\2\u00d7\u00f2\7t\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da"+
		"\7c\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7{\2\2\u00dd"+
		"\u00de\7r\2\2\u00de\u00f2\7g\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7g\2\2"+
		"\u00e1\u00e2\7v\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7t\2\2\u00e4\u00f2"+
		"\7p\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7v\2\2\u00e8"+
		"\u00e9\7w\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7p\2\2\u00eb\u00f2\7u\2\2"+
		"\u00ec\u00ed\7t\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7{\2\2\u00ef\u00f0"+
		"\7r\2\2\u00f0\u00f2\7g\2\2\u00f1\u008c\3\2\2\2\u00f1\u0091\3\2\2\2\u00f1"+
		"\u009a\3\2\2\2\u00f1\u009d\3\2\2\2\u00f1\u00a5\3\2\2\2\u00f1\u00a8\3\2"+
		"\2\2\u00f1\u00af\3\2\2\2\u00f1\u00b3\3\2\2\2\u00f1\u00b9\3\2\2\2\u00f1"+
		"\u00be\3\2\2\2\u00f1\u00c4\3\2\2\2\u00f1\u00cd\3\2\2\2\u00f1\u00d0\3\2"+
		"\2\2\u00f1\u00d4\3\2\2\2\u00f1\u00d8\3\2\2\2\u00f1\u00df\3\2\2\2\u00f1"+
		"\u00e5\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2\u00f8\3\2\2\2\u00f3\u00f4\5\3"+
		"\2\2\u00f4\u00f5\5\33\16\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\5-\27\2\u00fc\u0125\3\2\2\2\u00fd"+
		"\u010d\7B\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7t\2\2"+
		"\u0101\u0102\7c\2\2\u0102\u010e\7o\2\2\u0103\u0104\7v\2\2\u0104\u0105"+
		"\7{\2\2\u0105\u0106\7r\2\2\u0106\u010e\7g\2\2\u0107\u0108\7t\2\2\u0108"+
		"\u0109\7g\2\2\u0109\u010a\7v\2\2\u010a\u010b\7w\2\2\u010b\u010c\7t\2\2"+
		"\u010c\u010e\7p\2\2\u010d\u00fe\3\2\2\2\u010d\u0103\3\2\2\2\u010d\u0107"+
		"\3\2\2\2\u010e\u0112\3\2\2\2\u010f\u0111\5\3\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0118\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0115\u0117\5\37\20\2\u0116\u0115\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011b\u011d\5\33\16\2\u011c\u011b\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u0121\3\2\2\2\u011e\u0120\5\37\20\2\u011f\u011e\3"+
		"\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0124w\3\2\2\2\u0124\u008b\3\2\2\2"+
		"\u0124\u00fd\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\b\4\3\2\u0127\b\3"+
		"\2\2\2\u0128\u0129\7C\2\2\u0129\u012a\7t\2\2\u012a\u012b\7i\2\2\u012b"+
		"\u0157\7u\2\2\u012c\u012d\7C\2\2\u012d\u012e\7t\2\2\u012e\u012f\7i\2\2"+
		"\u012f\u0130\7w\2\2\u0130\u0131\7o\2\2\u0131\u0132\7g\2\2\u0132\u0133"+
		"\7p\2\2\u0133\u0134\7v\2\2\u0134\u0157\7u\2\2\u0135\u0136\7R\2\2\u0136"+
		"\u0137\7c\2\2\u0137\u0138\7t\2\2\u0138\u0139\7c\2\2\u0139\u013a\7o\2\2"+
		"\u013a\u013b\7g\2\2\u013b\u013c\7v\2\2\u013c\u013d\7g\2\2\u013d\u013e"+
		"\7t\2\2\u013e\u0157\7u\2\2\u013f\u0140\7c\2\2\u0140\u0141\7t\2\2\u0141"+
		"\u0142\7i\2\2\u0142\u0157\7u\2\2\u0143\u0144\7c\2\2\u0144\u0145\7t\2\2"+
		"\u0145\u0146\7i\2\2\u0146\u0147\7w\2\2\u0147\u0148\7o\2\2\u0148\u0149"+
		"\7g\2\2\u0149\u014a\7p\2\2\u014a\u014b\7v\2\2\u014b\u0157\7u\2\2\u014c"+
		"\u014d\7r\2\2\u014d\u014e\7c\2\2\u014e\u014f\7t\2\2\u014f\u0150\7c\2\2"+
		"\u0150\u0151\7o\2\2\u0151\u0152\7g\2\2\u0152\u0153\7v\2\2\u0153\u0154"+
		"\7g\2\2\u0154\u0155\7t\2\2\u0155\u0157\7u\2\2\u0156\u0128\3\2\2\2\u0156"+
		"\u012c\3\2\2\2\u0156\u0135\3\2\2\2\u0156\u013f\3\2\2\2\u0156\u0143\3\2"+
		"\2\2\u0156\u014c\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\5\25\13\2\u0159"+
		"\n\3\2\2\2\u015a\u015b\7T\2\2\u015b\u015c\7g\2\2\u015c\u015d\7v\2\2\u015d"+
		"\u015e\7w\2\2\u015e\u015f\7t\2\2\u015f\u0160\7p\2\2\u0160\u018b\7u\2\2"+
		"\u0161\u0162\7T\2\2\u0162\u0163\7g\2\2\u0163\u0164\7v\2\2\u0164\u0165"+
		"\7w\2\2\u0165\u0166\7t\2\2\u0166\u018b\7p\2\2\u0167\u0168\7[\2\2\u0168"+
		"\u0169\7k\2\2\u0169\u016a\7g\2\2\u016a\u016b\7n\2\2\u016b\u016c\7f\2\2"+
		"\u016c\u018b\7u\2\2\u016d\u016e\7[\2\2\u016e\u016f\7k\2\2\u016f\u0170"+
		"\7g\2\2\u0170\u0171\7n\2\2\u0171\u018b\7f\2\2\u0172\u0173\7t\2\2\u0173"+
		"\u0174\7g\2\2\u0174\u0175\7v\2\2\u0175\u0176\7w\2\2\u0176\u0177\7t\2\2"+
		"\u0177\u0178\7p\2\2\u0178\u018b\7u\2\2\u0179\u017a\7t\2\2\u017a\u017b"+
		"\7g\2\2\u017b\u017c\7v\2\2\u017c\u017d\7w\2\2\u017d\u017e\7t\2\2\u017e"+
		"\u018b\7p\2\2\u017f\u0180\7{\2\2\u0180\u0181\7k\2\2\u0181\u0182\7g\2\2"+
		"\u0182\u0183\7n\2\2\u0183\u0184\7f\2\2\u0184\u018b\7u\2\2\u0185\u0186"+
		"\7{\2\2\u0186\u0187\7k\2\2\u0187\u0188\7g\2\2\u0188\u0189\7n\2\2\u0189"+
		"\u018b\7f\2\2\u018a\u015a\3\2\2\2\u018a\u0161\3\2\2\2\u018a\u0167\3\2"+
		"\2\2\u018a\u016d\3\2\2\2\u018a\u0172\3\2\2\2\u018a\u0179\3\2\2\2\u018a"+
		"\u017f\3\2\2\2\u018a\u0185\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\5\25"+
		"\13\2\u018d\f\3\2\2\2\u018e\u018f\7T\2\2\u018f\u0190\7c\2\2\u0190\u0191"+
		"\7k\2\2\u0191\u0192\7u\2\2\u0192\u0193\7g\2\2\u0193\u019b\7u\2\2\u0194"+
		"\u0195\7t\2\2\u0195\u0196\7c\2\2\u0196\u0197\7k\2\2\u0197\u0198\7u\2\2"+
		"\u0198\u0199\7g\2\2\u0199\u019b\7u\2\2\u019a\u018e\3\2\2\2\u019a\u0194"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\5\25\13\2\u019d\16\3\2\2\2\u019e"+
		"\u019f\7C\2\2\u019f\u01a0\7v\2\2\u01a0\u01a1\7v\2\2\u01a1\u01a2\7t\2\2"+
		"\u01a2\u01a3\7k\2\2\u01a3\u01a4\7d\2\2\u01a4\u01a5\7w\2\2\u01a5\u01a6"+
		"\7v\2\2\u01a6\u01a7\7g\2\2\u01a7\u01b3\7u\2\2\u01a8\u01a9\7c\2\2\u01a9"+
		"\u01aa\7v\2\2\u01aa\u01ab\7v\2\2\u01ab\u01ac\7t\2\2\u01ac\u01ad\7k\2\2"+
		"\u01ad\u01ae\7d\2\2\u01ae\u01af\7w\2\2\u01af\u01b0\7v\2\2\u01b0\u01b1"+
		"\7g\2\2\u01b1\u01b3\7u\2\2\u01b2\u019e\3\2\2\2\u01b2\u01a8\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b5\5\25\13\2\u01b5\20\3\2\2\2\u01b6\u01b7\7G\2"+
		"\2\u01b7\u01b8\7z\2\2\u01b8\u01b9\7c\2\2\u01b9\u01ba\7o\2\2\u01ba\u01bb"+
		"\7r\2\2\u01bb\u01bc\7n\2\2\u01bc\u02ef\7g\2\2\u01bd\u01be\7G\2\2\u01be"+
		"\u01bf\7z\2\2\u01bf\u01c0\7c\2\2\u01c0\u01c1\7o\2\2\u01c1\u01c2\7r\2\2"+
		"\u01c2\u01c3\7n\2\2\u01c3\u01c4\7g\2\2\u01c4\u02ef\7u\2\2\u01c5\u01c6"+
		"\7M\2\2\u01c6\u01c7\7g\2\2\u01c7\u01c8\7{\2\2\u01c8\u01c9\7y\2\2\u01c9"+
		"\u01ca\7q\2\2\u01ca\u01cb\7t\2\2\u01cb\u01cc\7f\2\2\u01cc\u01cd\7\"\2"+
		"\2\u01cd\u01ce\7C\2\2\u01ce\u01cf\7t\2\2\u01cf\u01d0\7i\2\2\u01d0\u02ef"+
		"\7u\2\2\u01d1\u01d2\7M\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4\7{\2\2\u01d4"+
		"\u01d5\7y\2\2\u01d5\u01d6\7q\2\2\u01d6\u01d7\7t\2\2\u01d7\u01d8\7f\2\2"+
		"\u01d8\u01d9\7\"\2\2\u01d9\u01da\7C\2\2\u01da\u01db\7t\2\2\u01db\u01dc"+
		"\7i\2\2\u01dc\u01dd\7w\2\2\u01dd\u01de\7o\2\2\u01de\u01df\7g\2\2\u01df"+
		"\u01e0\7p\2\2\u01e0\u01e1\7v\2\2\u01e1\u02ef\7u\2\2\u01e2\u01e3\7P\2\2"+
		"\u01e3\u01e4\7q\2\2\u01e4\u01e5\7v\2\2\u01e5\u02ef\7g\2\2\u01e6\u01e7"+
		"\7P\2\2\u01e7\u01e8\7q\2\2\u01e8\u01e9\7v\2\2\u01e9\u01ea\7g\2\2\u01ea"+
		"\u02ef\7u\2\2\u01eb\u01ec\7Q\2\2\u01ec\u01ed\7v\2\2\u01ed\u01ee\7j\2\2"+
		"\u01ee\u01ef\7g\2\2\u01ef\u01f0\7t\2\2\u01f0\u01f1\7\"\2\2\u01f1\u01f2"+
		"\7R\2\2\u01f2\u01f3\7c\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5\7c\2\2\u01f5"+
		"\u01f6\7o\2\2\u01f6\u01f7\7g\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9\7g\2\2"+
		"\u01f9\u01fa\7t\2\2\u01fa\u02ef\7u\2\2\u01fb\u01fc\7T\2\2\u01fc\u01fd"+
		"\7g\2\2\u01fd\u01fe\7h\2\2\u01fe\u01ff\7g\2\2\u01ff\u0200\7t\2\2\u0200"+
		"\u0201\7g\2\2\u0201\u0202\7p\2\2\u0202\u0203\7e\2\2\u0203\u0204\7g\2\2"+
		"\u0204\u02ef\7u\2\2\u0205\u0206\7U\2\2\u0206\u0207\7g\2\2\u0207\u0208"+
		"\7g\2\2\u0208\u0209\7\"\2\2\u0209\u020a\7C\2\2\u020a\u020b\7n\2\2\u020b"+
		"\u020c\7u\2\2\u020c\u02ef\7q\2\2\u020d\u020e\7V\2\2\u020e\u020f\7q\2\2"+
		"\u020f\u0210\7f\2\2\u0210\u02ef\7q\2\2\u0211\u0212\7Y\2\2\u0212\u0213"+
		"\7c\2\2\u0213\u0214\7t\2\2\u0214\u0215\7p\2\2\u0215\u0216\7k\2\2\u0216"+
		"\u0217\7p\2\2\u0217\u02ef\7i\2\2\u0218\u0219\7Y\2\2\u0219\u021a\7c\2\2"+
		"\u021a\u021b\7t\2\2\u021b\u021c\7p\2\2\u021c\u021d\7k\2\2\u021d\u021e"+
		"\7p\2\2\u021e\u021f\7i\2\2\u021f\u02ef\7u\2\2\u0220\u0221\7Y\2\2\u0221"+
		"\u0222\7c\2\2\u0222\u0223\7t\2\2\u0223\u0224\7p\2\2\u0224\u02ef\7u\2\2"+
		"\u0225\u0226\7g\2\2\u0226\u0227\7z\2\2\u0227\u0228\7c\2\2\u0228\u0229"+
		"\7o\2\2\u0229\u022a\7r\2\2\u022a\u022b\7n\2\2\u022b\u02ef\7g\2\2\u022c"+
		"\u022d\7g\2\2\u022d\u022e\7z\2\2\u022e\u022f\7c\2\2\u022f\u0230\7o\2\2"+
		"\u0230\u0231\7r\2\2\u0231\u0232\7n\2\2\u0232\u0233\7g\2\2\u0233\u02ef"+
		"\7u\2\2\u0234\u0235\7m\2\2\u0235\u0236\7g\2\2\u0236\u0237\7{\2\2\u0237"+
		"\u0238\7y\2\2\u0238\u0239\7q\2\2\u0239\u023a\7t\2\2\u023a\u023b\7f\2\2"+
		"\u023b\u023c\7\"\2\2\u023c\u023d\7c\2\2\u023d\u023e\7t\2\2\u023e\u023f"+
		"\7i\2\2\u023f\u02ef\7u\2\2\u0240\u0241\7m\2\2\u0241\u0242\7g\2\2\u0242"+
		"\u0243\7{\2\2\u0243\u0244\7y\2\2\u0244\u0245\7q\2\2\u0245\u0246\7t\2\2"+
		"\u0246\u0247\7f\2\2\u0247\u0248\7\"\2\2\u0248\u0249\7c\2\2\u0249\u024a"+
		"\7t\2\2\u024a\u024b\7i\2\2\u024b\u024c\7w\2\2\u024c\u024d\7o\2\2\u024d"+
		"\u024e\7g\2\2\u024e\u024f\7p\2\2\u024f\u0250\7v\2\2\u0250\u02ef\7u\2\2"+
		"\u0251\u0252\7p\2\2\u0252\u0253\7q\2\2\u0253\u0254\7v\2\2\u0254\u02ef"+
		"\7g\2\2\u0255\u0256\7p\2\2\u0256\u0257\7q\2\2\u0257\u0258\7v\2\2\u0258"+
		"\u0259\7g\2\2\u0259\u02ef\7u\2\2\u025a\u025b\7q\2\2\u025b\u025c\7v\2\2"+
		"\u025c\u025d\7j\2\2\u025d\u025e\7g\2\2\u025e\u025f\7t\2\2\u025f\u0260"+
		"\7\"\2\2\u0260\u0261\7r\2\2\u0261\u0262\7c\2\2\u0262\u0263\7t\2\2\u0263"+
		"\u0264\7c\2\2\u0264\u0265\7o\2\2\u0265\u0266\7g\2\2\u0266\u0267\7v\2\2"+
		"\u0267\u0268\7g\2\2\u0268\u0269\7t\2\2\u0269\u02ef\7u\2\2\u026a\u026b"+
		"\7t\2\2\u026b\u026c\7g\2\2\u026c\u026d\7h\2\2\u026d\u026e\7g\2\2\u026e"+
		"\u026f\7t\2\2\u026f\u0270\7g\2\2\u0270\u0271\7p\2\2\u0271\u0272\7e\2\2"+
		"\u0272\u0273\7g\2\2\u0273\u02ef\7u\2\2\u0274\u0275\7u\2\2\u0275\u0276"+
		"\7g\2\2\u0276\u0277\7g\2\2\u0277\u0278\7\"\2\2\u0278\u0279\7c\2\2\u0279"+
		"\u027a\7n\2\2\u027a\u027b\7u\2\2\u027b\u02ef\7q\2\2\u027c\u027d\7v\2\2"+
		"\u027d\u027e\7q\2\2\u027e\u027f\7f\2\2\u027f\u02ef\7q\2\2\u0280\u0281"+
		"\7y\2\2\u0281\u0282\7c\2\2\u0282\u0283\7t\2\2\u0283\u0284\7p\2\2\u0284"+
		"\u0285\7k\2\2\u0285\u0286\7p\2\2\u0286\u02ef\7i\2\2\u0287\u0288\7y\2\2"+
		"\u0288\u0289\7c\2\2\u0289\u028a\7t\2\2\u028a\u028b\7p\2\2\u028b\u028c"+
		"\7k\2\2\u028c\u028d\7p\2\2\u028d\u028e\7i\2\2\u028e\u02ef\7u\2\2\u028f"+
		"\u0290\7y\2\2\u0290\u0291\7c\2\2\u0291\u0292\7t\2\2\u0292\u0293\7p\2\2"+
		"\u0293\u02ef\7u\2\2\u0294\u0295\7M\2\2\u0295\u0296\7g\2\2\u0296\u0297"+
		"\7{\2\2\u0297\u0298\7y\2\2\u0298\u0299\7q\2\2\u0299\u029a\7t\2\2\u029a"+
		"\u029b\7f\2\2\u029b\u029c\7\"\2\2\u029c\u029d\7c\2\2\u029d\u029e\7t\2"+
		"\2\u029e\u029f\7i\2\2\u029f\u02ef\7u\2\2\u02a0\u02a1\7m\2\2\u02a1\u02a2"+
		"\7g\2\2\u02a2\u02a3\7{\2\2\u02a3\u02a4\7y\2\2\u02a4\u02a5\7q\2\2\u02a5"+
		"\u02a6\7t\2\2\u02a6\u02a7\7f\2\2\u02a7\u02a8\7\"\2\2\u02a8\u02a9\7C\2"+
		"\2\u02a9\u02aa\7t\2\2\u02aa\u02ab\7i\2\2\u02ab\u02ef\7u\2\2\u02ac\u02ad"+
		"\7q\2\2\u02ad\u02ae\7v\2\2\u02ae\u02af\7j\2\2\u02af\u02b0\7g\2\2\u02b0"+
		"\u02b1\7t\2\2\u02b1\u02b2\7\"\2\2\u02b2\u02b3\7R\2\2\u02b3\u02b4\7c\2"+
		"\2\u02b4\u02b5\7t\2\2\u02b5\u02b6\7c\2\2\u02b6\u02b7\7o\2\2\u02b7\u02b8"+
		"\7g\2\2\u02b8\u02b9\7v\2\2\u02b9\u02ba\7g\2\2\u02ba\u02bb\7t\2\2\u02bb"+
		"\u02ef\7u\2\2\u02bc\u02bd\7Q\2\2\u02bd\u02be\7v\2\2\u02be\u02bf\7j\2\2"+
		"\u02bf\u02c0\7g\2\2\u02c0\u02c1\7t\2\2\u02c1\u02c2\7\"\2\2\u02c2\u02c3"+
		"\7r\2\2\u02c3\u02c4\7c\2\2\u02c4\u02c5\7t\2\2\u02c5\u02c6\7c\2\2\u02c6"+
		"\u02c7\7o\2\2\u02c7\u02c8\7g\2\2\u02c8\u02c9\7v\2\2\u02c9\u02ca\7g\2\2"+
		"\u02ca\u02cb\7t\2\2\u02cb\u02ef\7u\2\2\u02cc\u02cd\7M\2\2\u02cd\u02ce"+
		"\7g\2\2\u02ce\u02cf\7{\2\2\u02cf\u02d0\7y\2\2\u02d0\u02d1\7q\2\2\u02d1"+
		"\u02d2\7t\2\2\u02d2\u02d3\7f\2\2\u02d3\u02d4\7\"\2\2\u02d4\u02d5\7c\2"+
		"\2\u02d5\u02d6\7t\2\2\u02d6\u02d7\7i\2\2\u02d7\u02d8\7w\2\2\u02d8\u02d9"+
		"\7o\2\2\u02d9\u02da\7g\2\2\u02da\u02db\7p\2\2\u02db\u02dc\7v\2\2\u02dc"+
		"\u02ef\7u\2\2\u02dd\u02de\7m\2\2\u02de\u02df\7g\2\2\u02df\u02e0\7{\2\2"+
		"\u02e0\u02e1\7y\2\2\u02e1\u02e2\7q\2\2\u02e2\u02e3\7t\2\2\u02e3\u02e4"+
		"\7f\2\2\u02e4\u02e5\7\"\2\2\u02e5\u02e6\7C\2\2\u02e6\u02e7\7t\2\2\u02e7"+
		"\u02e8\7i\2\2\u02e8\u02e9\7w\2\2\u02e9\u02ea\7o\2\2\u02ea\u02eb\7g\2\2"+
		"\u02eb\u02ec\7p\2\2\u02ec\u02ed\7v\2\2\u02ed\u02ef\7u\2\2\u02ee\u01b6"+
		"\3\2\2\2\u02ee\u01bd\3\2\2\2\u02ee\u01c5\3\2\2\2\u02ee\u01d1\3\2\2\2\u02ee"+
		"\u01e2\3\2\2\2\u02ee\u01e6\3\2\2\2\u02ee\u01eb\3\2\2\2\u02ee\u01fb\3\2"+
		"\2\2\u02ee\u0205\3\2\2\2\u02ee\u020d\3\2\2\2\u02ee\u0211\3\2\2\2\u02ee"+
		"\u0218\3\2\2\2\u02ee\u0220\3\2\2\2\u02ee\u0225\3\2\2\2\u02ee\u022c\3\2"+
		"\2\2\u02ee\u0234\3\2\2\2\u02ee\u0240\3\2\2\2\u02ee\u0251\3\2\2\2\u02ee"+
		"\u0255\3\2\2\2\u02ee\u025a\3\2\2\2\u02ee\u026a\3\2\2\2\u02ee\u0274\3\2"+
		"\2\2\u02ee\u027c\3\2\2\2\u02ee\u0280\3\2\2\2\u02ee\u0287\3\2\2\2\u02ee"+
		"\u028f\3\2\2\2\u02ee\u0294\3\2\2\2\u02ee\u02a0\3\2\2\2\u02ee\u02ac\3\2"+
		"\2\2\u02ee\u02bc\3\2\2\2\u02ee\u02cc\3\2\2\2\u02ee\u02dd\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f2\5\25\13\2\u02f1\u02f3\5\31\r\2\u02f2\u02f1"+
		"\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f8\3\2\2\2\u02f6\u02f9\5\3\2\2\u02f7\u02f9\7\13\2\2\u02f8\u02f6\3"+
		"\2\2\2\u02f8\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\22\3\2\2\2\u02fc\u02fd\t\3\2\2\u02fd\24\3\2\2\2\u02fe"+
		"\u02ff\5-\27\2\u02ff\26\3\2\2\2\u0300\u0301\5/\30\2\u0301\30\3\2\2\2\u0302"+
		"\u0303\6\r\2\2\u0303\u030f\5+\26\2\u0304\u0306\7\17\2\2\u0305\u0304\3"+
		"\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u030a\7\f\2\2\u0308"+
		"\u030a\4\16\17\2\u0309\u0305\3\2\2\2\u0309\u0308\3\2\2\2\u030a\u030c\3"+
		"\2\2\2\u030b\u030d\5+\26\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u030f\3\2\2\2\u030e\u0302\3\2\2\2\u030e\u0309\3\2\2\2\u030f\u0310\3\2"+
		"\2\2\u0310\u0311\b\r\4\2\u0311\32\3\2\2\2\u0312\u0316\5\61\31\2\u0313"+
		"\u0315\5\63\32\2\u0314\u0313\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3"+
		"\2\2\2\u0316\u0317\3\2\2\2\u0317\34\3\2\2\2\u0318\u0316\3\2\2\2\u0319"+
		"\u031a\5+\26\2\u031a\u031b\3\2\2\2\u031b\u031c\b\17\2\2\u031c\36\3\2\2"+
		"\2\u031d\u031e\13\2\2\2\u031e \3\2\2\2\u031f\u0320\7)\2\2\u0320\u0321"+
		"\7)\2\2\u0321\u0322\7)\2\2\u0322\"\3\2\2\2\u0323\u0324\7$\2\2\u0324\u0325"+
		"\7$\2\2\u0325\u0326\7$\2\2\u0326$\3\2\2\2\u0327\u0328\t\4\2\2\u0328&\3"+
		"\2\2\2\u0329\u032a\t\5\2\2\u032a(\3\2\2\2\u032b\u032c\t\6\2\2\u032c*\3"+
		"\2\2\2\u032d\u032f\t\7\2\2\u032e\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331,\3\2\2\2\u0332\u0333\7<\2\2\u0333"+
		".\3\2\2\2\u0334\u0335\7/\2\2\u0335\60\3\2\2\2\u0336\u0338\t\b\2\2\u0337"+
		"\u0336\3\2\2\2\u0338\62\3\2\2\2\u0339\u033c\5\61\31\2\u033a\u033c\t\t"+
		"\2\2\u033b\u0339\3\2\2\2\u033b\u033a\3\2\2\2\u033c\64\3\2\2\2 \29w}\u0083"+
		"\u0089\u00f1\u00f8\u010d\u0112\u0118\u011c\u0121\u0124\u0156\u018a\u019a"+
		"\u01b2\u02ee\u02f4\u02f8\u02fa\u0305\u0309\u030c\u030e\u0316\u0330\u0337"+
		"\u033b\5\b\2\2\3\4\2\3\r\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}