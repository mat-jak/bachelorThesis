// Generated from EpyDocstring.g4 by ANTLR 4.7.1

   package ch.jako.parser.epydoc;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EpyDocstringLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, TRIPLEQUOTES=2, PARAMNAMINGS=3, PARAM=4, PARAMTYPE=5, KEYWORD=6, 
		RAISES=7, RETURNS=8, RETURNTYPE=9, VARIABLE=10, OTHERSECTIONS=11, PUNCTUATION=12, 
		HYPHENS=13, COLONS=14, NEWLINE=15, NAME=16, SKIP_=17, UNKNOWN_CHAR=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "TRIPLEQUOTES", "PARAMNAMINGS", "PARAM", "PARAMTYPE", "KEYWORD", 
		"RAISES", "RETURNS", "RETURNTYPE", "VARIABLE", "OTHERSECTIONS", "PUNCTUATION", 
		"HYPHENS", "COLONS", "NEWLINE", "NAME", "SKIP_", "UNKNOWN_CHAR", "SINGLETRIPLEQUOTES", 
		"DOUBLETRIPLEQUOTES", "DIGIT", "SMALLLETTER", "BIGLETTER", "SPACES", "COLON", 
		"HYPHEN", "EQUAL", "TILDE", "ID_START", "ID_CONTINUE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'@type'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "TRIPLEQUOTES", "PARAMNAMINGS", "PARAM", "PARAMTYPE", "KEYWORD", 
		"RAISES", "RETURNS", "RETURNTYPE", "VARIABLE", "OTHERSECTIONS", "PUNCTUATION", 
		"HYPHENS", "COLONS", "NEWLINE", "NAME", "SKIP_", "UNKNOWN_CHAR"
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
	           this.emit(commonToken(EpyDocstringParser.NEWLINE, "\n"));

	           // Now emit as much DEDENT tokens as needed.
	           while (!indents.isEmpty()) {
	             this.emit(createDedent());
	             indents.pop();
	           }

	           // Put the EOF back on the token stream.
	           this.emit(commonToken(EpyDocstringParser.EOF, "<EOF>"));
	         }

	         Token next = super.nextToken();

	         if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	           // Keep track of the last token on the default channel.
	           this.lastToken = next;
	         }

	         return tokens.isEmpty() ? next : tokens.poll();
	       }

	       private Token createDedent() {
	         CommonToken dedent = commonToken(EpyDocstringParser.DEDENT, "");
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
	     

	public EpyDocstringLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EpyDocstring.g4"; }

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
		case 14:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

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
			              emit(commonToken(EpyDocstringParser.INDENT, spaces));
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
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0281\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\5\3D\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0081\n\4\3\4\3"+
		"\4\7\4\u0085\n\4\f\4\16\4\u0088\13\4\3\4\7\4\u008b\n\4\f\4\16\4\u008e"+
		"\13\4\3\4\6\4\u0091\n\4\r\4\16\4\u0092\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00fb\n\4\3\4\3\4\3\4\7\4\u0100\n\4\f\4"+
		"\16\4\u0103\13\4\3\4\3\4\5\4\u0107\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u0123\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u013f\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u015c\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u016c\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u017e\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0194\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u023b"+
		"\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\5\20\u0246\n\20\3\20\3"+
		"\20\5\20\u024a\n\20\3\20\5\20\u024d\n\20\5\20\u024f\n\20\3\20\3\20\3\21"+
		"\3\21\7\21\u0255\n\21\f\21\16\21\u0258\13\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\6\31\u026f\n\31\r\31\16\31\u0270\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\5\36\u027c\n\36\3\37\3\37\5\37\u0280\n\37\2\2 \3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2\3\2\n\4\2\17"+
		"\17\"\"\7\2##..\60\60AAaa\3\2\62;\3\2c|\3\2C\\\4\2\13\13\"\"\u0129\2C"+
		"\\aac|\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc\u00c2\u00d8\u00da\u00f8\u00fa"+
		"\u0243\u0252\u02c3\u02c8\u02d3\u02e2\u02e6\u02f0\u02f0\u037c\u037c\u0388"+
		"\u0388\u038a\u038c\u038e\u038e\u0390\u03a3\u03a5\u03d0\u03d2\u03f7\u03f9"+
		"\u0483\u048c\u04d0\u04d2\u04fb\u0502\u0511\u0533\u0558\u055b\u055b\u0563"+
		"\u0589\u05d2\u05ec\u05f2\u05f4\u0623\u063c\u0642\u064c\u0670\u0671\u0673"+
		"\u06d5\u06d7\u06d7\u06e7\u06e8\u06f0\u06f1\u06fc\u06fe\u0701\u0701\u0712"+
		"\u0712\u0714\u0731\u074f\u076f\u0782\u07a7\u07b3\u07b3\u0906\u093b\u093f"+
		"\u093f\u0952\u0952\u095a\u0963\u097f\u097f\u0987\u098e\u0991\u0992\u0995"+
		"\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09bf\u09bf\u09d0\u09d0\u09de"+
		"\u09df\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c"+
		"\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74"+
		"\u0a76\u0a87\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7"+
		"\u0abb\u0abf\u0abf\u0ad2\u0ad2\u0ae2\u0ae3\u0b07\u0b0e\u0b11\u0b12\u0b15"+
		"\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b37\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61"+
		"\u0b63\u0b73\u0b73\u0b85\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b"+
		"\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bbb\u0c07"+
		"\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c62\u0c63\u0c87"+
		"\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0cbf\u0cbf\u0ce0"+
		"\u0ce0\u0ce2\u0ce3\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d2a\u0d2c\u0d3b\u0d62"+
		"\u0d63\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03"+
		"\u0e32\u0e34\u0e35\u0e42\u0e48\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c"+
		"\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9"+
		"\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ebf\u0ec2\u0ec6\u0ec8"+
		"\u0ec8\u0ede\u0edf\u0f02\u0f02\u0f42\u0f49\u0f4b\u0f6c\u0f8a\u0f8d\u1002"+
		"\u1023\u1025\u1029\u102b\u102c\u1052\u1057\u10a2\u10c7\u10d2\u10fc\u10fe"+
		"\u10fe\u1102\u115b\u1161\u11a4\u11aa\u11fb\u1202\u124a\u124c\u124f\u1252"+
		"\u1258\u125a\u125a\u125c\u125f\u1262\u128a\u128c\u128f\u1292\u12b2\u12b4"+
		"\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca\u12d8\u12da\u1312\u1314"+
		"\u1317\u131a\u135c\u1382\u1391\u13a2\u13f6\u1403\u166e\u1671\u1678\u1683"+
		"\u169c\u16a2\u16ec\u16f0\u16f2\u1702\u170e\u1710\u1713\u1722\u1733\u1742"+
		"\u1753\u1762\u176e\u1770\u1772\u1782\u17b5\u17d9\u17d9\u17de\u17de\u1822"+
		"\u1879\u1882\u18aa\u1902\u191e\u1952\u196f\u1972\u1976\u1982\u19ab\u19c3"+
		"\u19c9\u1a02\u1a18\u1d02\u1dc1\u1e02\u1e9d\u1ea2\u1efb\u1f02\u1f17\u1f1a"+
		"\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f"+
		"\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8"+
		"\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2073"+
		"\u2073\u2081\u2081\u2092\u2096\u2104\u2104\u2109\u2109\u210c\u2115\u2117"+
		"\u2117\u211a\u211f\u2126\u2126\u2128\u2128\u212a\u212a\u212c\u2133\u2135"+
		"\u213b\u213e\u2141\u2147\u214b\u2162\u2185\u2c02\u2c30\u2c32\u2c60\u2c82"+
		"\u2ce6\u2d02\u2d27\u2d32\u2d67\u2d71\u2d71\u2d82\u2d98\u2da2\u2da8\u2daa"+
		"\u2db0\u2db2\u2db8\u2dba\u2dc0\u2dc2\u2dc8\u2dca\u2dd0\u2dd2\u2dd8\u2dda"+
		"\u2de0\u3007\u3009\u3023\u302b\u3033\u3037\u303a\u303e\u3043\u3098\u309d"+
		"\u30a1\u30a3\u30fc\u30fe\u3101\u3107\u312e\u3133\u3190\u31a2\u31b9\u31f2"+
		"\u3201\u3402\u4db7\u4e02\u9fbd\ua002\ua48e\ua802\ua803\ua805\ua807\ua809"+
		"\ua80c\ua80e\ua824\uac02\ud7a5\uf902\ufa2f\ufa32\ufa6c\ufa72\ufadb\ufb02"+
		"\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40"+
		"\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94"+
		"\ufdc9\ufdf2\ufdfd\ufe72\ufe76\ufe78\ufefe\uff23\uff3c\uff43\uff5c\uff68"+
		"\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\u0096\2\62;\u0302"+
		"\u0371\u0485\u0488\u0593\u05bb\u05bd\u05bf\u05c1\u05c1\u05c3\u05c4\u05c6"+
		"\u05c7\u05c9\u05c9\u0612\u0617\u064d\u0660\u0662\u066b\u0672\u0672\u06d8"+
		"\u06de\u06e1\u06e6\u06e9\u06ea\u06ec\u06ef\u06f2\u06fb\u0713\u0713\u0732"+
		"\u074c\u07a8\u07b2\u0903\u0905\u093e\u093e\u0940\u094f\u0953\u0956\u0964"+
		"\u0965\u0968\u0971\u0983\u0985\u09be\u09be\u09c0\u09c6\u09c9\u09ca\u09cd"+
		"\u09cf\u09d9\u09d9\u09e4\u09e5\u09e8\u09f1\u0a03\u0a05\u0a3e\u0a3e\u0a40"+
		"\u0a44\u0a49\u0a4a\u0a4d\u0a4f\u0a68\u0a73\u0a83\u0a85\u0abe\u0abe\u0ac0"+
		"\u0ac7\u0ac9\u0acb\u0acd\u0acf\u0ae4\u0ae5\u0ae8\u0af1\u0b03\u0b05\u0b3e"+
		"\u0b3e\u0b40\u0b45\u0b49\u0b4a\u0b4d\u0b4f\u0b58\u0b59\u0b68\u0b71\u0b84"+
		"\u0b84\u0bc0\u0bc4\u0bc8\u0bca\u0bcc\u0bcf\u0bd9\u0bd9\u0be8\u0bf1\u0c03"+
		"\u0c05\u0c40\u0c46\u0c48\u0c4a\u0c4c\u0c4f\u0c57\u0c58\u0c68\u0c71\u0c84"+
		"\u0c85\u0cbe\u0cbe\u0cc0\u0cc6\u0cc8\u0cca\u0ccc\u0ccf\u0cd7\u0cd8\u0ce8"+
		"\u0cf1\u0d04\u0d05\u0d40\u0d45\u0d48\u0d4a\u0d4c\u0d4f\u0d59\u0d59\u0d68"+
		"\u0d71\u0d84\u0d85\u0dcc\u0dcc\u0dd1\u0dd6\u0dd8\u0dd8\u0dda\u0de1\u0df4"+
		"\u0df5\u0e33\u0e33\u0e36\u0e3c\u0e49\u0e50\u0e52\u0e5b\u0eb3\u0eb3\u0eb6"+
		"\u0ebb\u0ebd\u0ebe\u0eca\u0ecf\u0ed2\u0edb\u0f1a\u0f1b\u0f22\u0f2b\u0f37"+
		"\u0f37\u0f39\u0f39\u0f3b\u0f3b\u0f40\u0f41\u0f73\u0f86\u0f88\u0f89\u0f92"+
		"\u0f99\u0f9b\u0fbe\u0fc8\u0fc8\u102e\u1034\u1038\u103b\u1042\u104b\u1058"+
		"\u105b\u1361\u1361\u136b\u1373\u1714\u1716\u1734\u1736\u1754\u1755\u1774"+
		"\u1775\u17b8\u17d5\u17df\u17df\u17e2\u17eb\u180d\u180f\u1812\u181b\u18ab"+
		"\u18ab\u1922\u192d\u1932\u193d\u1948\u1951\u19b2\u19c2\u19ca\u19cb\u19d2"+
		"\u19db\u1a19\u1a1d\u1dc2\u1dc5\u2041\u2042\u2056\u2056\u20d2\u20de\u20e3"+
		"\u20e3\u20e7\u20ed\u302c\u3031\u309b\u309c\ua804\ua804\ua808\ua808\ua80d"+
		"\ua80d\ua825\ua829\ufb20\ufb20\ufe02\ufe11\ufe22\ufe25\ufe35\ufe36\ufe4f"+
		"\ufe51\uff12\uff1b\uff41\uff41\2\u02bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3?\3\2\2\2\5C\3\2"+
		"\2\2\7\u0106\3\2\2\2\t\u0108\3\2\2\2\13\u0124\3\2\2\2\r\u012a\3\2\2\2"+
		"\17\u0140\3\2\2\2\21\u015d\3\2\2\2\23\u016d\3\2\2\2\25\u017f\3\2\2\2\27"+
		"\u0195\3\2\2\2\31\u023c\3\2\2\2\33\u023e\3\2\2\2\35\u0240\3\2\2\2\37\u024e"+
		"\3\2\2\2!\u0252\3\2\2\2#\u0259\3\2\2\2%\u025d\3\2\2\2\'\u025f\3\2\2\2"+
		")\u0263\3\2\2\2+\u0267\3\2\2\2-\u0269\3\2\2\2/\u026b\3\2\2\2\61\u026e"+
		"\3\2\2\2\63\u0272\3\2\2\2\65\u0274\3\2\2\2\67\u0276\3\2\2\29\u0278\3\2"+
		"\2\2;\u027b\3\2\2\2=\u027f\3\2\2\2?@\t\2\2\2@\4\3\2\2\2AD\5\'\24\2BD\5"+
		")\25\2CA\3\2\2\2CB\3\2\2\2DE\3\2\2\2EF\b\3\2\2F\6\3\2\2\2GH\7C\2\2HI\7"+
		"t\2\2IJ\7i\2\2J_\7u\2\2KL\7T\2\2LM\7g\2\2MN\7v\2\2NO\7w\2\2OP\7t\2\2P"+
		"Q\7p\2\2Q_\7u\2\2RS\7[\2\2ST\7k\2\2TU\7g\2\2UV\7n\2\2VW\7f\2\2W_\7u\2"+
		"\2XY\7T\2\2YZ\7c\2\2Z[\7k\2\2[\\\7u\2\2\\]\7g\2\2]_\7u\2\2^G\3\2\2\2^"+
		"K\3\2\2\2^R\3\2\2\2^X\3\2\2\2_`\3\2\2\2`a\5\63\32\2ab\5\37\20\2b\u0107"+
		"\3\2\2\2cd\7R\2\2de\7c\2\2ef\7t\2\2fg\7c\2\2gh\7o\2\2hi\7g\2\2ij\7v\2"+
		"\2jk\7g\2\2kl\7t\2\2l\u0081\7u\2\2mn\7T\2\2no\7g\2\2op\7v\2\2pq\7w\2\2"+
		"qr\7t\2\2rs\7p\2\2s\u0081\7u\2\2tu\7[\2\2uv\7k\2\2vw\7g\2\2wx\7n\2\2x"+
		"y\7f\2\2y\u0081\7u\2\2z{\7T\2\2{|\7c\2\2|}\7k\2\2}~\7u\2\2~\177\7g\2\2"+
		"\177\u0081\7u\2\2\u0080c\3\2\2\2\u0080m\3\2\2\2\u0080t\3\2\2\2\u0080z"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0086\5\37\20\2\u0083\u0085\5\3\2\2"+
		"\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u008c\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\7\13\2\2"+
		"\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\5\33\16\2"+
		"\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0107\3\2\2\2\u0094\u00fa\5\63\32\2\u0095\u0096\7r\2\2"+
		"\u0096\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098\u0099\7c\2\2\u0099\u00fb"+
		"\7o\2\2\u009a\u009b\7r\2\2\u009b\u009c\7c\2\2\u009c\u009d\7t\2\2\u009d"+
		"\u009e\7c\2\2\u009e\u009f\7o\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7v\2\2"+
		"\u00a1\u00a2\7g\2\2\u00a2\u00fb\7t\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5"+
		"\7t\2\2\u00a5\u00fb\7i\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7t\2\2\u00a8"+
		"\u00a9\7i\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7g\2\2"+
		"\u00ac\u00ad\7p\2\2\u00ad\u00fb\7v\2\2\u00ae\u00af\7m\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\u00fb\7{\2\2\u00b1\u00b2\7m\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"\u00b4\7{\2\2\u00b4\u00b5\7y\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7t\2\2"+
		"\u00b7\u00fb\7f\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7{\2\2\u00ba\u00bb"+
		"\7r\2\2\u00bb\u00fb\7g\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7k\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\u00fb\7u\2\2"+
		"\u00c2\u00c3\7t\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6"+
		"\7u\2\2\u00c6\u00fb\7g\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7z\2\2\u00c9"+
		"\u00ca\7e\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7r\2\2\u00cc\u00fb\7v\2\2"+
		"\u00cd\u00ce\7g\2\2\u00ce\u00cf\7z\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7k\2\2\u00d4"+
		"\u00d5\7q\2\2\u00d5\u00fb\7p\2\2\u00d6\u00d7\7x\2\2\u00d7\u00d8\7c\2\2"+
		"\u00d8\u00fb\7t\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7x\2\2\u00db\u00dc"+
		"\7c\2\2\u00dc\u00fb\7t\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7x\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00fb\7t\2\2\u00e1\u00e2\7x\2\2\u00e2\u00e3\7c\2\2"+
		"\u00e3\u00e4\7t\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7{\2\2\u00e6\u00e7"+
		"\7r\2\2\u00e7\u00fb\7g\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7v\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7t\2\2\u00ed\u00fb\7p\2\2"+
		"\u00ee\u00ef\7t\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2"+
		"\7w\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7p\2\2\u00f4\u00fb\7u\2\2\u00f5"+
		"\u00f6\7t\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7{\2\2\u00f8\u00f9\7r\2\2"+
		"\u00f9\u00fb\7g\2\2\u00fa\u0095\3\2\2\2\u00fa\u009a\3\2\2\2\u00fa\u00a3"+
		"\3\2\2\2\u00fa\u00a6\3\2\2\2\u00fa\u00ae\3\2\2\2\u00fa\u00b1\3\2\2\2\u00fa"+
		"\u00b8\3\2\2\2\u00fa\u00bc\3\2\2\2\u00fa\u00c2\3\2\2\2\u00fa\u00c7\3\2"+
		"\2\2\u00fa\u00cd\3\2\2\2\u00fa\u00d6\3\2\2\2\u00fa\u00d9\3\2\2\2\u00fa"+
		"\u00dd\3\2\2\2\u00fa\u00e1\3\2\2\2\u00fa\u00e8\3\2\2\2\u00fa\u00ee\3\2"+
		"\2\2\u00fa\u00f5\3\2\2\2\u00fb\u0101\3\2\2\2\u00fc\u00fd\5\3\2\2\u00fd"+
		"\u00fe\5!\21\2\u00fe\u0100\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\u0103\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0105\5\63\32\2\u0105\u0107\3\2\2\2\u0106^\3\2\2"+
		"\2\u0106\u0080\3\2\2\2\u0106\u0094\3\2\2\2\u0107\b\3\2\2\2\u0108\u0122"+
		"\7B\2\2\u0109\u010a\7r\2\2\u010a\u010b\7c\2\2\u010b\u010c\7t\2\2\u010c"+
		"\u010d\7c\2\2\u010d\u0123\7o\2\2\u010e\u010f\7r\2\2\u010f\u0110\7c\2\2"+
		"\u0110\u0111\7t\2\2\u0111\u0112\7c\2\2\u0112\u0113\7o\2\2\u0113\u0114"+
		"\7g\2\2\u0114\u0115\7v\2\2\u0115\u0116\7g\2\2\u0116\u0123\7t\2\2\u0117"+
		"\u0118\7c\2\2\u0118\u0119\7t\2\2\u0119\u0123\7i\2\2\u011a\u011b\7c\2\2"+
		"\u011b\u011c\7t\2\2\u011c\u011d\7i\2\2\u011d\u011e\7w\2\2\u011e\u011f"+
		"\7o\2\2\u011f\u0120\7g\2\2\u0120\u0121\7p\2\2\u0121\u0123\7v\2\2\u0122"+
		"\u0109\3\2\2\2\u0122\u010e\3\2\2\2\u0122\u0117\3\2\2\2\u0122\u011a\3\2"+
		"\2\2\u0123\n\3\2\2\2\u0124\u0125\7B\2\2\u0125\u0126\7v\2\2\u0126\u0127"+
		"\7{\2\2\u0127\u0128\7r\2\2\u0128\u0129\7g\2\2\u0129\f\3\2\2\2\u012a\u013e"+
		"\7B\2\2\u012b\u012c\7m\2\2\u012c\u012d\7g\2\2\u012d\u012e\7{\2\2\u012e"+
		"\u012f\7y\2\2\u012f\u0130\7q\2\2\u0130\u0131\7t\2\2\u0131\u013f\7f\2\2"+
		"\u0132\u0133\7m\2\2\u0133\u0134\7y\2\2\u0134\u0135\7c\2\2\u0135\u0136"+
		"\7t\2\2\u0136\u013f\7i\2\2\u0137\u0138\7m\2\2\u0138\u0139\7y\2\2\u0139"+
		"\u013a\7r\2\2\u013a\u013b\7c\2\2\u013b\u013c\7t\2\2\u013c\u013d\7c\2\2"+
		"\u013d\u013f\7o\2\2\u013e\u012b\3\2\2\2\u013e\u0132\3\2\2\2\u013e\u0137"+
		"\3\2\2\2\u013f\16\3\2\2\2\u0140\u015b\7B\2\2\u0141\u0142\7t\2\2\u0142"+
		"\u0143\7c\2\2\u0143\u0144\7k\2\2\u0144\u0145\7u\2\2\u0145\u015c\7g\2\2"+
		"\u0146\u0147\7t\2\2\u0147\u0148\7c\2\2\u0148\u0149\7k\2\2\u0149\u014a"+
		"\7u\2\2\u014a\u014b\7g\2\2\u014b\u015c\7u\2\2\u014c\u014d\7g\2\2\u014d"+
		"\u014e\7z\2\2\u014e\u014f\7e\2\2\u014f\u0150\7g\2\2\u0150\u0151\7r\2\2"+
		"\u0151\u015c\7v\2\2\u0152\u0153\7g\2\2\u0153\u0154\7z\2\2\u0154\u0155"+
		"\7e\2\2\u0155\u0156\7g\2\2\u0156\u0157\7r\2\2\u0157\u0158\7v\2\2\u0158"+
		"\u0159\7k\2\2\u0159\u015a\7q\2\2\u015a\u015c\7p\2\2\u015b\u0141\3\2\2"+
		"\2\u015b\u0146\3\2\2\2\u015b\u014c\3\2\2\2\u015b\u0152\3\2\2\2\u015c\20"+
		"\3\2\2\2\u015d\u016b\7B\2\2\u015e\u015f\7t\2\2\u015f\u0160\7g\2\2\u0160"+
		"\u0161\7v\2\2\u0161\u0162\7w\2\2\u0162\u0163\7t\2\2\u0163\u016c\7p\2\2"+
		"\u0164\u0165\7t\2\2\u0165\u0166\7g\2\2\u0166\u0167\7v\2\2\u0167\u0168"+
		"\7w\2\2\u0168\u0169\7t\2\2\u0169\u016a\7p\2\2\u016a\u016c\7u\2\2\u016b"+
		"\u015e\3\2\2\2\u016b\u0164\3\2\2\2\u016c\22\3\2\2\2\u016d\u017d\7B\2\2"+
		"\u016e\u016f\7t\2\2\u016f\u0170\7v\2\2\u0170\u0171\7{\2\2\u0171\u0172"+
		"\7r\2\2\u0172\u017e\7g\2\2\u0173\u0174\7t\2\2\u0174\u0175\7g\2\2\u0175"+
		"\u0176\7v\2\2\u0176\u0177\7w\2\2\u0177\u0178\7t\2\2\u0178\u0179\7p\2\2"+
		"\u0179\u017a\7v\2\2\u017a\u017b\7{\2\2\u017b\u017c\7r\2\2\u017c\u017e"+
		"\7g\2\2\u017d\u016e\3\2\2\2\u017d\u0173\3\2\2\2\u017e\24\3\2\2\2\u017f"+
		"\u0193\7B\2\2\u0180\u0181\7k\2\2\u0181\u0182\7x\2\2\u0182\u0183\7c\2\2"+
		"\u0183\u0194\7t\2\2\u0184\u0185\7e\2\2\u0185\u0186\7x\2\2\u0186\u0187"+
		"\7c\2\2\u0187\u0194\7t\2\2\u0188\u0189\7x\2\2\u0189\u018a\7c\2\2\u018a"+
		"\u0194\7t\2\2\u018b\u018c\7x\2\2\u018c\u018d\7c\2\2\u018d\u018e\7t\2\2"+
		"\u018e\u018f\7k\2\2\u018f\u0190\7c\2\2\u0190\u0191\7d\2\2\u0191\u0192"+
		"\7n\2\2\u0192\u0194\7g\2\2\u0193\u0180\3\2\2\2\u0193\u0184\3\2\2\2\u0193"+
		"\u0188\3\2\2\2\u0193\u018b\3\2\2\2\u0194\26\3\2\2\2\u0195\u023a\7B\2\2"+
		"\u0196\u0197\7u\2\2\u0197\u0198\7g\2\2\u0198\u023b\7g\2\2\u0199\u019a"+
		"\7p\2\2\u019a\u019b\7q\2\2\u019b\u019c\7v\2\2\u019c\u023b\7g\2\2\u019d"+
		"\u019e\7c\2\2\u019e\u019f\7v\2\2\u019f\u01a0\7v\2\2\u01a0\u01a1\7g\2\2"+
		"\u01a1\u01a2\7p\2\2\u01a2\u01a3\7v\2\2\u01a3\u01a4\7k\2\2\u01a4\u01a5"+
		"\7q\2\2\u01a5\u023b\7p\2\2\u01a6\u01a7\7d\2\2\u01a7\u01a8\7w\2\2\u01a8"+
		"\u023b\7i\2\2\u01a9\u01aa\7y\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ac\7t\2\2"+
		"\u01ac\u01ad\7p\2\2\u01ad\u01ae\7k\2\2\u01ae\u01af\7p\2\2\u01af\u023b"+
		"\7i\2\2\u01b0\u01b1\7x\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b3\7t\2\2\u01b3"+
		"\u01b4\7u\2\2\u01b4\u01b5\7k\2\2\u01b5\u01b6\7q\2\2\u01b6\u023b\7p\2\2"+
		"\u01b7\u01b8\7v\2\2\u01b8\u01b9\7q\2\2\u01b9\u01ba\7f\2\2\u01ba\u023b"+
		"\7q\2\2\u01bb\u01bc\7f\2\2\u01bc\u01bd\7g\2\2\u01bd\u01be\7r\2\2\u01be"+
		"\u01bf\7t\2\2\u01bf\u01c0\7g\2\2\u01c0\u01c1\7e\2\2\u01c1\u01c2\7c\2\2"+
		"\u01c2\u01c3\7v\2\2\u01c3\u01c4\7g\2\2\u01c4\u023b\7f\2\2\u01c5\u01c6"+
		"\7u\2\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7p\2\2\u01c8\u01c9\7e\2\2\u01c9"+
		"\u023b\7g\2\2\u01ca\u01cb\7u\2\2\u01cb\u01cc\7v\2\2\u01cc\u01cd\7c\2\2"+
		"\u01cd\u01ce\7v\2\2\u01ce\u01cf\7w\2\2\u01cf\u023b\7u\2\2\u01d0\u01d1"+
		"\7e\2\2\u01d1\u01d2\7j\2\2\u01d2\u01d3\7c\2\2\u01d3\u01d4\7p\2\2\u01d4"+
		"\u01d5\7i\2\2\u01d5\u023b\7g\2\2\u01d6\u01d7\7r\2\2\u01d7\u01d8\7g\2\2"+
		"\u01d8\u01d9\7t\2\2\u01d9\u01da\7o\2\2\u01da\u01db\7k\2\2\u01db\u01dc"+
		"\7u\2\2\u01dc\u01dd\7u\2\2\u01dd\u01de\7k\2\2\u01de\u01df\7q\2\2\u01df"+
		"\u023b\7p\2\2\u01e0\u01e1\7t\2\2\u01e1\u01e2\7g\2\2\u01e2\u01e3\7s\2\2"+
		"\u01e3\u01e4\7w\2\2\u01e4\u01e5\7k\2\2\u01e5\u01e6\7t\2\2\u01e6\u01e7"+
		"\7g\2\2\u01e7\u023b\7u\2\2\u01e8\u01e9\7r\2\2\u01e9\u01ea\7t\2\2\u01ea"+
		"\u01eb\7g\2\2\u01eb\u01ec\7e\2\2\u01ec\u01ed\7q\2\2\u01ed\u01ee\7p\2\2"+
		"\u01ee\u01ef\7f\2\2\u01ef\u01f0\7k\2\2\u01f0\u01f1\7v\2\2\u01f1\u01f2"+
		"\7k\2\2\u01f2\u01f3\7q\2\2\u01f3\u023b\7p\2\2\u01f4\u01f5\7r\2\2\u01f5"+
		"\u01f6\7q\2\2\u01f6\u01f7\7u\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9\7e\2\2"+
		"\u01f9\u01fa\7q\2\2\u01fa\u01fb\7p\2\2\u01fb\u01fc\7f\2\2\u01fc\u01fd"+
		"\7k\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff\7k\2\2\u01ff\u0200\7q\2\2\u0200"+
		"\u023b\7p\2\2\u0201\u0202\7k\2\2\u0202\u0203\7p\2\2\u0203\u0204\7x\2\2"+
		"\u0204\u0205\7c\2\2\u0205\u0206\7t\2\2\u0206\u0207\7k\2\2\u0207\u0208"+
		"\7c\2\2\u0208\u0209\7p\2\2\u0209\u023b\7v\2\2\u020a\u020b\7c\2\2\u020b"+
		"\u020c\7w\2\2\u020c\u020d\7v\2\2\u020d\u020e\7j\2\2\u020e\u020f\7q\2\2"+
		"\u020f\u023b\7t\2\2\u0210\u0211\7q\2\2\u0211\u0212\7t\2\2\u0212\u0213"+
		"\7i\2\2\u0213\u0214\7c\2\2\u0214\u0215\7p\2\2\u0215\u0216\7k\2\2\u0216"+
		"\u0217\7|\2\2\u0217\u0218\7c\2\2\u0218\u0219\7v\2\2\u0219\u021a\7k\2\2"+
		"\u021a\u021b\7q\2\2\u021b\u023b\7p\2\2\u021c\u021d\7e\2\2\u021d\u021e"+
		"\7q\2\2\u021e\u021f\7r\2\2\u021f\u0220\7{\2\2\u0220\u0221\7t\2\2\u0221"+
		"\u0222\7k\2\2\u0222\u0223\7i\2\2\u0223\u0224\7j\2\2\u0224\u023b\7v\2\2"+
		"\u0225\u0226\7n\2\2\u0226\u0227\7k\2\2\u0227\u0228\7e\2\2\u0228\u0229"+
		"\7g\2\2\u0229\u022a\7p\2\2\u022a\u022b\7u\2\2\u022b\u023b\7g\2\2\u022c"+
		"\u022d\7e\2\2\u022d\u022e\7q\2\2\u022e\u022f\7p\2\2\u022f\u0230\7v\2\2"+
		"\u0230\u0231\7c\2\2\u0231\u0232\7e\2\2\u0232\u023b\7v\2\2\u0233\u0234"+
		"\7u\2\2\u0234\u0235\7w\2\2\u0235\u0236\7o\2\2\u0236\u0237\7o\2\2\u0237"+
		"\u0238\7c\2\2\u0238\u0239\7t\2\2\u0239\u023b\7{\2\2\u023a\u0196\3\2\2"+
		"\2\u023a\u0199\3\2\2\2\u023a\u019d\3\2\2\2\u023a\u01a6\3\2\2\2\u023a\u01a9"+
		"\3\2\2\2\u023a\u01b0\3\2\2\2\u023a\u01b7\3\2\2\2\u023a\u01bb\3\2\2\2\u023a"+
		"\u01c5\3\2\2\2\u023a\u01ca\3\2\2\2\u023a\u01d0\3\2\2\2\u023a\u01d6\3\2"+
		"\2\2\u023a\u01e0\3\2\2\2\u023a\u01e8\3\2\2\2\u023a\u01f4\3\2\2\2\u023a"+
		"\u0201\3\2\2\2\u023a\u020a\3\2\2\2\u023a\u0210\3\2\2\2\u023a\u021c\3\2"+
		"\2\2\u023a\u0225\3\2\2\2\u023a\u022c\3\2\2\2\u023a\u0233\3\2\2\2\u023b"+
		"\30\3\2\2\2\u023c\u023d\t\3\2\2\u023d\32\3\2\2\2\u023e\u023f\5\65\33\2"+
		"\u023f\34\3\2\2\2\u0240\u0241\5\63\32\2\u0241\36\3\2\2\2\u0242\u0243\6"+
		"\20\2\2\u0243\u024f\5\61\31\2\u0244\u0246\7\17\2\2\u0245\u0244\3\2\2\2"+
		"\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u024a\7\f\2\2\u0248\u024a"+
		"\4\16\17\2\u0249\u0245\3\2\2\2\u0249\u0248\3\2\2\2\u024a\u024c\3\2\2\2"+
		"\u024b\u024d\5\61\31\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f"+
		"\3\2\2\2\u024e\u0242\3\2\2\2\u024e\u0249\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\b\20\3\2\u0251 \3\2\2\2\u0252\u0256\5;\36\2\u0253\u0255\5=\37\2"+
		"\u0254\u0253\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257"+
		"\3\2\2\2\u0257\"\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025a\5\61\31\2\u025a"+
		"\u025b\3\2\2\2\u025b\u025c\b\22\2\2\u025c$\3\2\2\2\u025d\u025e\13\2\2"+
		"\2\u025e&\3\2\2\2\u025f\u0260\7)\2\2\u0260\u0261\7)\2\2\u0261\u0262\7"+
		")\2\2\u0262(\3\2\2\2\u0263\u0264\7$\2\2\u0264\u0265\7$\2\2\u0265\u0266"+
		"\7$\2\2\u0266*\3\2\2\2\u0267\u0268\t\4\2\2\u0268,\3\2\2\2\u0269\u026a"+
		"\t\5\2\2\u026a.\3\2\2\2\u026b\u026c\t\6\2\2\u026c\60\3\2\2\2\u026d\u026f"+
		"\t\7\2\2\u026e\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u026e\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\62\3\2\2\2\u0272\u0273\7<\2\2\u0273\64\3\2\2\2\u0274"+
		"\u0275\7/\2\2\u0275\66\3\2\2\2\u0276\u0277\7?\2\2\u02778\3\2\2\2\u0278"+
		"\u0279\7\u0080\2\2\u0279:\3\2\2\2\u027a\u027c\t\b\2\2\u027b\u027a\3\2"+
		"\2\2\u027c<\3\2\2\2\u027d\u0280\5;\36\2\u027e\u0280\t\t\2\2\u027f\u027d"+
		"\3\2\2\2\u027f\u027e\3\2\2\2\u0280>\3\2\2\2\33\2C^\u0080\u0086\u008c\u0092"+
		"\u00fa\u0101\u0106\u0122\u013e\u015b\u016b\u017d\u0193\u023a\u0245\u0249"+
		"\u024c\u024e\u0256\u0270\u027b\u027f\4\b\2\2\3\20\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}