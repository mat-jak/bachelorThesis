// Generated from RestructuredTextDocstring.g4 by ANTLR 4.7.1

   package ch.jako.parser.restructuredText;
   //import com.yuvalshavit.antlr4.DenterHelper;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RestructuredTextDocstringLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, TRIPLEQUOTES=2, COLONS=3, PARAMNAMINGS=4, PARAM=5, PARAMTYPE=6, 
		RAISES=7, VARIABLES=8, VARIABLETYPE=9, RETURN=10, RETURNTYPE=11, PUNCTUATION=12, 
		DIRECTIVES=13, HYPHENS=14, NEWLINE=15, NAME=16, UNKNOWN_CHAR=17, SKIP_=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "TRIPLEQUOTES", "COLONS", "PARAMNAMINGS", "PARAM", "PARAMTYPE", 
		"RAISES", "VARIABLES", "VARIABLETYPE", "RETURN", "RETURNTYPE", "PUNCTUATION", 
		"DIRECTIVES", "HYPHENS", "NEWLINE", "NAME", "UNKNOWN_CHAR", "SKIP_", "SINGLETRIPLEQUOTES", 
		"DOUBLETRIPLEQUOTES", "SPACES", "DIGIT", "SMALLLETTER", "BIGLETTER", "COLON", 
		"HYPHEN", "ID_START", "ID_CONTINUE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "':type'", null, null, "':vartype'", 
		null, "':rtype'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "TRIPLEQUOTES", "COLONS", "PARAMNAMINGS", "PARAM", "PARAMTYPE", 
		"RAISES", "VARIABLES", "VARIABLETYPE", "RETURN", "RETURNTYPE", "PUNCTUATION", 
		"DIRECTIVES", "HYPHENS", "NEWLINE", "NAME", "UNKNOWN_CHAR", "SKIP_"
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
	           this.emit(commonToken(RestructuredTextDocstringParser.NEWLINE, "\n"));

	           // Now emit as much DEDENT tokens as needed.
	           while (!indents.isEmpty()) {
	             this.emit(createDedent());
	             indents.pop();
	           }

	           // Put the EOF back on the token stream.
	           this.emit(commonToken(RestructuredTextDocstringParser.EOF, "<EOF>"));
	         }

	         Token next = super.nextToken();

	         if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	           // Keep track of the last token on the default channel.
	           this.lastToken = next;
	         }

	         return tokens.isEmpty() ? next : tokens.poll();
	       }

	       private Token createDedent() {
	         CommonToken dedent = commonToken(RestructuredTextDocstringParser.DEDENT, "");
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
	     

	public RestructuredTextDocstringLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RestructuredTextDocstring.g4"; }

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
			                  emit(commonToken(RestructuredTextDocstringParser.INDENT, spaces));
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0179\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\5\3@\n\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\5\7"+
		"\5u\n\5\f\5\16\5x\13\5\3\5\5\5{\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u009b\n\5\3\5\3\5\7\5\u009f\n\5\f\5\16\5\u00a2\13"+
		"\5\3\5\7\5\u00a5\n\5\f\5\16\5\u00a8\13\5\3\5\6\5\u00ab\n\5\r\5\16\5\u00ac"+
		"\5\5\u00af\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00da\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0100\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0110\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u012a\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\5\20\u0142\n\20\3\20\3\20\5\20\u0146\n\20\3\20\5\20"+
		"\u0149\n\20\5\20\u014b\n\20\3\20\3\20\3\21\3\21\7\21\u0151\n\21\f\21\16"+
		"\21\u0154\13\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\6\26\u0165\n\26\r\26\16\26\u0166\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\5\34\u0174\n\34\3\35\3\35\5\35"+
		"\u0178\n\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67"+
		"\29\2\3\2\n\4\2\17\17\"\"\5\2##.\60AA\4\2\13\13\"\"\3\2\62;\3\2c|\3\2"+
		"C\\\u0129\2C\\aac|\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc\u00c2\u00d8\u00da"+
		"\u00f8\u00fa\u0243\u0252\u02c3\u02c8\u02d3\u02e2\u02e6\u02f0\u02f0\u037c"+
		"\u037c\u0388\u0388\u038a\u038c\u038e\u038e\u0390\u03a3\u03a5\u03d0\u03d2"+
		"\u03f7\u03f9\u0483\u048c\u04d0\u04d2\u04fb\u0502\u0511\u0533\u0558\u055b"+
		"\u055b\u0563\u0589\u05d2\u05ec\u05f2\u05f4\u0623\u063c\u0642\u064c\u0670"+
		"\u0671\u0673\u06d5\u06d7\u06d7\u06e7\u06e8\u06f0\u06f1\u06fc\u06fe\u0701"+
		"\u0701\u0712\u0712\u0714\u0731\u074f\u076f\u0782\u07a7\u07b3\u07b3\u0906"+
		"\u093b\u093f\u093f\u0952\u0952\u095a\u0963\u097f\u097f\u0987\u098e\u0991"+
		"\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09bf\u09bf\u09d0"+
		"\u09d0\u09de\u09df\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15"+
		"\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60"+
		"\u0a60\u0a74\u0a76\u0a87\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4"+
		"\u0ab5\u0ab7\u0abb\u0abf\u0abf\u0ad2\u0ad2\u0ae2\u0ae3\u0b07\u0b0e\u0b11"+
		"\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b37\u0b3b\u0b3f\u0b3f\u0b5e"+
		"\u0b5f\u0b61\u0b63\u0b73\u0b73\u0b85\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94"+
		"\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0"+
		"\u0bbb\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c62"+
		"\u0c63\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0cbf"+
		"\u0cbf\u0ce0\u0ce0\u0ce2\u0ce3\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d2a\u0d2c"+
		"\u0d3b\u0d62\u0d63\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2"+
		"\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e42\u0e48\u0e83\u0e84\u0e86\u0e86\u0e89"+
		"\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7"+
		"\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ebf\u0ec2"+
		"\u0ec6\u0ec8\u0ec8\u0ede\u0edf\u0f02\u0f02\u0f42\u0f49\u0f4b\u0f6c\u0f8a"+
		"\u0f8d\u1002\u1023\u1025\u1029\u102b\u102c\u1052\u1057\u10a2\u10c7\u10d2"+
		"\u10fc\u10fe\u10fe\u1102\u115b\u1161\u11a4\u11aa\u11fb\u1202\u124a\u124c"+
		"\u124f\u1252\u1258\u125a\u125a\u125c\u125f\u1262\u128a\u128c\u128f\u1292"+
		"\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca\u12d8\u12da"+
		"\u1312\u1314\u1317\u131a\u135c\u1382\u1391\u13a2\u13f6\u1403\u166e\u1671"+
		"\u1678\u1683\u169c\u16a2\u16ec\u16f0\u16f2\u1702\u170e\u1710\u1713\u1722"+
		"\u1733\u1742\u1753\u1762\u176e\u1770\u1772\u1782\u17b5\u17d9\u17d9\u17de"+
		"\u17de\u1822\u1879\u1882\u18aa\u1902\u191e\u1952\u196f\u1972\u1976\u1982"+
		"\u19ab\u19c3\u19c9\u1a02\u1a18\u1d02\u1dc1\u1e02\u1e9d\u1ea2\u1efb\u1f02"+
		"\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52\u1f59\u1f5b\u1f5b\u1f5d"+
		"\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4"+
		"\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2\u1fee\u1ff4\u1ff6\u1ff8"+
		"\u1ffe\u2073\u2073\u2081\u2081\u2092\u2096\u2104\u2104\u2109\u2109\u210c"+
		"\u2115\u2117\u2117\u211a\u211f\u2126\u2126\u2128\u2128\u212a\u212a\u212c"+
		"\u2133\u2135\u213b\u213e\u2141\u2147\u214b\u2162\u2185\u2c02\u2c30\u2c32"+
		"\u2c60\u2c82\u2ce6\u2d02\u2d27\u2d32\u2d67\u2d71\u2d71\u2d82\u2d98\u2da2"+
		"\u2da8\u2daa\u2db0\u2db2\u2db8\u2dba\u2dc0\u2dc2\u2dc8\u2dca\u2dd0\u2dd2"+
		"\u2dd8\u2dda\u2de0\u3007\u3009\u3023\u302b\u3033\u3037\u303a\u303e\u3043"+
		"\u3098\u309d\u30a1\u30a3\u30fc\u30fe\u3101\u3107\u312e\u3133\u3190\u31a2"+
		"\u31b9\u31f2\u3201\u3402\u4db7\u4e02\u9fbd\ua002\ua48e\ua802\ua803\ua805"+
		"\ua807\ua809\ua80c\ua80e\ua824\uac02\ud7a5\uf902\ufa2f\ufa32\ufa6c\ufa72"+
		"\ufadb\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21\ufb2a\ufb2c\ufb38\ufb3a"+
		"\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f\ufd52"+
		"\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe76\ufe78\ufefe\uff23\uff3c\uff43"+
		"\uff5c\uff68\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\u0096"+
		"\2\62;\u0302\u0371\u0485\u0488\u0593\u05bb\u05bd\u05bf\u05c1\u05c1\u05c3"+
		"\u05c4\u05c6\u05c7\u05c9\u05c9\u0612\u0617\u064d\u0660\u0662\u066b\u0672"+
		"\u0672\u06d8\u06de\u06e1\u06e6\u06e9\u06ea\u06ec\u06ef\u06f2\u06fb\u0713"+
		"\u0713\u0732\u074c\u07a8\u07b2\u0903\u0905\u093e\u093e\u0940\u094f\u0953"+
		"\u0956\u0964\u0965\u0968\u0971\u0983\u0985\u09be\u09be\u09c0\u09c6\u09c9"+
		"\u09ca\u09cd\u09cf\u09d9\u09d9\u09e4\u09e5\u09e8\u09f1\u0a03\u0a05\u0a3e"+
		"\u0a3e\u0a40\u0a44\u0a49\u0a4a\u0a4d\u0a4f\u0a68\u0a73\u0a83\u0a85\u0abe"+
		"\u0abe\u0ac0\u0ac7\u0ac9\u0acb\u0acd\u0acf\u0ae4\u0ae5\u0ae8\u0af1\u0b03"+
		"\u0b05\u0b3e\u0b3e\u0b40\u0b45\u0b49\u0b4a\u0b4d\u0b4f\u0b58\u0b59\u0b68"+
		"\u0b71\u0b84\u0b84\u0bc0\u0bc4\u0bc8\u0bca\u0bcc\u0bcf\u0bd9\u0bd9\u0be8"+
		"\u0bf1\u0c03\u0c05\u0c40\u0c46\u0c48\u0c4a\u0c4c\u0c4f\u0c57\u0c58\u0c68"+
		"\u0c71\u0c84\u0c85\u0cbe\u0cbe\u0cc0\u0cc6\u0cc8\u0cca\u0ccc\u0ccf\u0cd7"+
		"\u0cd8\u0ce8\u0cf1\u0d04\u0d05\u0d40\u0d45\u0d48\u0d4a\u0d4c\u0d4f\u0d59"+
		"\u0d59\u0d68\u0d71\u0d84\u0d85\u0dcc\u0dcc\u0dd1\u0dd6\u0dd8\u0dd8\u0dda"+
		"\u0de1\u0df4\u0df5\u0e33\u0e33\u0e36\u0e3c\u0e49\u0e50\u0e52\u0e5b\u0eb3"+
		"\u0eb3\u0eb6\u0ebb\u0ebd\u0ebe\u0eca\u0ecf\u0ed2\u0edb\u0f1a\u0f1b\u0f22"+
		"\u0f2b\u0f37\u0f37\u0f39\u0f39\u0f3b\u0f3b\u0f40\u0f41\u0f73\u0f86\u0f88"+
		"\u0f89\u0f92\u0f99\u0f9b\u0fbe\u0fc8\u0fc8\u102e\u1034\u1038\u103b\u1042"+
		"\u104b\u1058\u105b\u1361\u1361\u136b\u1373\u1714\u1716\u1734\u1736\u1754"+
		"\u1755\u1774\u1775\u17b8\u17d5\u17df\u17df\u17e2\u17eb\u180d\u180f\u1812"+
		"\u181b\u18ab\u18ab\u1922\u192d\u1932\u193d\u1948\u1951\u19b2\u19c2\u19ca"+
		"\u19cb\u19d2\u19db\u1a19\u1a1d\u1dc2\u1dc5\u2041\u2042\u2056\u2056\u20d2"+
		"\u20de\u20e3\u20e3\u20e7\u20ed\u302c\u3031\u309b\u309c\ua804\ua804\ua808"+
		"\ua808\ua80d\ua80d\ua825\ua829\ufb20\ufb20\ufe02\ufe11\ufe22\ufe25\ufe35"+
		"\ufe36\ufe4f\ufe51\uff12\uff1b\uff41\uff41\2\u0190\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3;\3\2"+
		"\2\2\5?\3\2\2\2\7C\3\2\2\2\t\u00ae\3\2\2\2\13\u00d9\3\2\2\2\r\u00db\3"+
		"\2\2\2\17\u00ff\3\2\2\2\21\u010f\3\2\2\2\23\u0111\3\2\2\2\25\u0129\3\2"+
		"\2\2\27\u012b\3\2\2\2\31\u0132\3\2\2\2\33\u0134\3\2\2\2\35\u013c\3\2\2"+
		"\2\37\u014a\3\2\2\2!\u014e\3\2\2\2#\u0155\3\2\2\2%\u0157\3\2\2\2\'\u015b"+
		"\3\2\2\2)\u015f\3\2\2\2+\u0164\3\2\2\2-\u0168\3\2\2\2/\u016a\3\2\2\2\61"+
		"\u016c\3\2\2\2\63\u016e\3\2\2\2\65\u0170\3\2\2\2\67\u0173\3\2\2\29\u0177"+
		"\3\2\2\2;<\t\2\2\2<\4\3\2\2\2=@\5\'\24\2>@\5)\25\2?=\3\2\2\2?>\3\2\2\2"+
		"@A\3\2\2\2AB\b\3\2\2B\6\3\2\2\2CD\5\63\32\2D\b\3\2\2\2EF\7C\2\2FG\7t\2"+
		"\2GH\7i\2\2H]\7u\2\2IJ\7T\2\2JK\7g\2\2KL\7v\2\2LM\7w\2\2MN\7t\2\2NO\7"+
		"p\2\2O]\7u\2\2PQ\7[\2\2QR\7k\2\2RS\7g\2\2ST\7n\2\2TU\7f\2\2U]\7u\2\2V"+
		"W\7T\2\2WX\7c\2\2XY\7k\2\2YZ\7u\2\2Z[\7g\2\2[]\7u\2\2\\E\3\2\2\2\\I\3"+
		"\2\2\2\\P\3\2\2\2\\V\3\2\2\2]^\3\2\2\2^_\5\63\32\2_`\5\37\20\2`\u00af"+
		"\3\2\2\2aq\7B\2\2bc\7r\2\2cd\7c\2\2de\7t\2\2ef\7c\2\2fr\7o\2\2gh\7v\2"+
		"\2hi\7{\2\2ij\7r\2\2jr\7g\2\2kl\7t\2\2lm\7g\2\2mn\7v\2\2no\7w\2\2op\7"+
		"t\2\2pr\7p\2\2qb\3\2\2\2qg\3\2\2\2qk\3\2\2\2rv\3\2\2\2su\5\3\2\2ts\3\2"+
		"\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2y{\5!\21\2zy\3\2"+
		"\2\2z{\3\2\2\2{|\3\2\2\2|\u00af\5\63\32\2}~\7R\2\2~\177\7c\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7c\2\2\u0081\u0082\7o\2\2\u0082\u0083\7g\2\2\u0083"+
		"\u0084\7v\2\2\u0084\u0085\7g\2\2\u0085\u0086\7t\2\2\u0086\u009b\7u\2\2"+
		"\u0087\u0088\7T\2\2\u0088\u0089\7g\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7w\2\2\u008b\u008c\7t\2\2\u008c\u008d\7p\2\2\u008d\u009b\7u\2\2\u008e"+
		"\u008f\7[\2\2\u008f\u0090\7k\2\2\u0090\u0091\7g\2\2\u0091\u0092\7n\2\2"+
		"\u0092\u0093\7f\2\2\u0093\u009b\7u\2\2\u0094\u0095\7T\2\2\u0095\u0096"+
		"\7c\2\2\u0096\u0097\7k\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099"+
		"\u009b\7u\2\2\u009a}\3\2\2\2\u009a\u0087\3\2\2\2\u009a\u008e\3\2\2\2\u009a"+
		"\u0094\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a0\5\37\20\2\u009d\u009f\5"+
		"\3\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a6\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\13"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\5\35"+
		"\17\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\\\3\2\2\2\u00aea\3\2\2\2\u00ae"+
		"\u009a\3\2\2\2\u00af\n\3\2\2\2\u00b0\u00b1\7<\2\2\u00b1\u00b2\7r\2\2\u00b2"+
		"\u00b3\7c\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7c\2\2\u00b5\u00da\7o\2\2"+
		"\u00b6\u00b7\7<\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7o\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\u00bf\7g\2\2\u00bf\u00da\7t\2\2\u00c0\u00c1\7<\2\2"+
		"\u00c1\u00c2\7c\2\2\u00c2\u00c3\7t\2\2\u00c3\u00da\7i\2\2\u00c4\u00c5"+
		"\7<\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7i\2\2\u00c8"+
		"\u00c9\7w\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7p\2\2"+
		"\u00cc\u00da\7v\2\2\u00cd\u00ce\7<\2\2\u00ce\u00cf\7m\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\u00da\7{\2\2\u00d1\u00d2\7<\2\2\u00d2\u00d3\7m\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7{\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7\7q\2\2"+
		"\u00d7\u00d8\7t\2\2\u00d8\u00da\7f\2\2\u00d9\u00b0\3\2\2\2\u00d9\u00b6"+
		"\3\2\2\2\u00d9\u00c0\3\2\2\2\u00d9\u00c4\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9"+
		"\u00d1\3\2\2\2\u00da\f\3\2\2\2\u00db\u00dc\7<\2\2\u00dc\u00dd\7v\2\2\u00dd"+
		"\u00de\7{\2\2\u00de\u00df\7r\2\2\u00df\u00e0\7g\2\2\u00e0\16\3\2\2\2\u00e1"+
		"\u00e2\7<\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7k\2\2"+
		"\u00e5\u00e6\7u\2\2\u00e6\u00e7\7g\2\2\u00e7\u0100\7u\2\2\u00e8\u00e9"+
		"\7<\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7k\2\2\u00ec"+
		"\u00ed\7u\2\2\u00ed\u0100\7g\2\2\u00ee\u00ef\7<\2\2\u00ef\u00f0\7g\2\2"+
		"\u00f0\u00f1\7z\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4"+
		"\7r\2\2\u00f4\u0100\7v\2\2\u00f5\u00f6\7<\2\2\u00f6\u00f7\7g\2\2\u00f7"+
		"\u00f8\7z\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7r\2\2"+
		"\u00fb\u00fc\7v\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7q\2\2\u00fe\u0100"+
		"\7p\2\2\u00ff\u00e1\3\2\2\2\u00ff\u00e8\3\2\2\2\u00ff\u00ee\3\2\2\2\u00ff"+
		"\u00f5\3\2\2\2\u0100\20\3\2\2\2\u0101\u0102\7<\2\2\u0102\u0103\7x\2\2"+
		"\u0103\u0104\7c\2\2\u0104\u0110\7t\2\2\u0105\u0106\7<\2\2\u0106\u0107"+
		"\7k\2\2\u0107\u0108\7x\2\2\u0108\u0109\7c\2\2\u0109\u0110\7t\2\2\u010a"+
		"\u010b\7<\2\2\u010b\u010c\7e\2\2\u010c\u010d\7x\2\2\u010d\u010e\7c\2\2"+
		"\u010e\u0110\7t\2\2\u010f\u0101\3\2\2\2\u010f\u0105\3\2\2\2\u010f\u010a"+
		"\3\2\2\2\u0110\22\3\2\2\2\u0111\u0112\7<\2\2\u0112\u0113\7x\2\2\u0113"+
		"\u0114\7c\2\2\u0114\u0115\7t\2\2\u0115\u0116\7v\2\2\u0116\u0117\7{\2\2"+
		"\u0117\u0118\7r\2\2\u0118\u0119\7g\2\2\u0119\24\3\2\2\2\u011a\u011b\7"+
		"<\2\2\u011b\u011c\7t\2\2\u011c\u011d\7g\2\2\u011d\u011e\7v\2\2\u011e\u011f"+
		"\7w\2\2\u011f\u0120\7t\2\2\u0120\u012a\7p\2\2\u0121\u0122\7<\2\2\u0122"+
		"\u0123\7t\2\2\u0123\u0124\7g\2\2\u0124\u0125\7v\2\2\u0125\u0126\7w\2\2"+
		"\u0126\u0127\7t\2\2\u0127\u0128\7p\2\2\u0128\u012a\7u\2\2\u0129\u011a"+
		"\3\2\2\2\u0129\u0121\3\2\2\2\u012a\26\3\2\2\2\u012b\u012c\7<\2\2\u012c"+
		"\u012d\7t\2\2\u012d\u012e\7v\2\2\u012e\u012f\7{\2\2\u012f\u0130\7r\2\2"+
		"\u0130\u0131\7g\2\2\u0131\30\3\2\2\2\u0132\u0133\t\3\2\2\u0133\32\3\2"+
		"\2\2\u0134\u0135\7\60\2\2\u0135\u0136\7\60\2\2\u0136\u0137\7\"\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\5!\21\2\u0139\u013a\5\7\4\2\u013a\u013b\5\7"+
		"\4\2\u013b\34\3\2\2\2\u013c\u013d\5\65\33\2\u013d\36\3\2\2\2\u013e\u013f"+
		"\6\20\2\2\u013f\u014b\5+\26\2\u0140\u0142\7\17\2\2\u0141\u0140\3\2\2\2"+
		"\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0146\7\f\2\2\u0144\u0146"+
		"\4\16\17\2\u0145\u0141\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u0148\3\2\2\2"+
		"\u0147\u0149\5+\26\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b"+
		"\3\2\2\2\u014a\u013e\3\2\2\2\u014a\u0145\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\b\20\3\2\u014d \3\2\2\2\u014e\u0152\5\67\34\2\u014f\u0151\59\35"+
		"\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\"\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\13\2\2\2\u0156"+
		"$\3\2\2\2\u0157\u0158\5+\26\2\u0158\u0159\3\2\2\2\u0159\u015a\b\23\2\2"+
		"\u015a&\3\2\2\2\u015b\u015c\7)\2\2\u015c\u015d\7)\2\2\u015d\u015e\7)\2"+
		"\2\u015e(\3\2\2\2\u015f\u0160\7$\2\2\u0160\u0161\7$\2\2\u0161\u0162\7"+
		"$\2\2\u0162*\3\2\2\2\u0163\u0165\t\4\2\2\u0164\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167,\3\2\2\2\u0168"+
		"\u0169\t\5\2\2\u0169.\3\2\2\2\u016a\u016b\t\6\2\2\u016b\60\3\2\2\2\u016c"+
		"\u016d\t\7\2\2\u016d\62\3\2\2\2\u016e\u016f\7<\2\2\u016f\64\3\2\2\2\u0170"+
		"\u0171\7/\2\2\u0171\66\3\2\2\2\u0172\u0174\t\b\2\2\u0173\u0172\3\2\2\2"+
		"\u01748\3\2\2\2\u0175\u0178\5\67\34\2\u0176\u0178\t\t\2\2\u0177\u0175"+
		"\3\2\2\2\u0177\u0176\3\2\2\2\u0178:\3\2\2\2\31\2?\\qvz\u009a\u00a0\u00a6"+
		"\u00ac\u00ae\u00d9\u00ff\u010f\u0129\u0141\u0145\u0148\u014a\u0152\u0166"+
		"\u0173\u0177\4\b\2\2\3\20\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}