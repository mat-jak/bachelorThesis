// Generated from NumpyDocstring.g4 by ANTLR 4.7.1

   package ch.jako.parser.numpydoc;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NumpyDocstringLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, TRIPLEQUOTES=2, PARAMNAMINGS=3, PARAMETERS=4, RAISES=5, RETURNS=6, 
		YIELDS=7, ATTRIBUTES=8, METHODS=9, OTHERSECTIONS=10, PUNCTUATION=11, HYPHENS=12, 
		COLONS=13, NEWLINE=14, NAME=15, SKIP_=16, UNKNOWN_CHAR=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "TRIPLEQUOTES", "PARAMNAMINGS", "PARAMETERS", "RAISES", "RETURNS", 
		"YIELDS", "ATTRIBUTES", "METHODS", "OTHERSECTIONS", "PUNCTUATION", "HYPHENS", 
		"COLONS", "NEWLINE", "NAME", "SKIP_", "UNKNOWN_CHAR", "SINGLETRIPLEQUOTES", 
		"DOUBLETRIPLEQUOTES", "DIGIT", "SMALLLETTER", "BIGLETTER", "SPACES", "COLON", 
		"HYPHEN", "ID_START", "ID_CONTINUE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "TRIPLEQUOTES", "PARAMNAMINGS", "PARAMETERS", "RAISES", "RETURNS", 
		"YIELDS", "ATTRIBUTES", "METHODS", "OTHERSECTIONS", "PUNCTUATION", "HYPHENS", 
		"COLONS", "NEWLINE", "NAME", "SKIP_", "UNKNOWN_CHAR"
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
	           this.emit(commonToken(NumpyDocstringParser.NEWLINE, "\n"));

	           // Now emit as much DEDENT tokens as needed.
	           while (!indents.isEmpty()) {
	             this.emit(createDedent());
	             indents.pop();
	           }

	           // Put the EOF back on the token stream.
	           this.emit(commonToken(NumpyDocstringParser.EOF, "<EOF>"));
	         }

	         Token next = super.nextToken();

	         if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	           // Keep track of the last token on the default channel.
	           this.lastToken = next;
	         }

	         return tokens.isEmpty() ? next : tokens.poll();
	       }

	       private Token createDedent() {
	         CommonToken dedent = commonToken(NumpyDocstringParser.DEDENT, "");
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
	     

	public NumpyDocstringLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NumpyDocstring.g4"; }

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
		case 13:
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
			                  emit(commonToken(NumpyDocstringParser.INDENT, spaces));
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
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u039f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\5\3>\n\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0085\n"+
		"\4\3\4\7\4\u0088\n\4\f\4\16\4\u008b\13\4\3\4\5\4\u008e\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00f7\n\4\3\4\3"+
		"\4\3\4\7\4\u00fc\n\4\f\4\16\4\u00ff\13\4\3\4\3\4\5\4\u0103\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0133\n\5\3\5\3\5\7\5\u0137\n"+
		"\5\f\5\16\5\u013a\13\5\3\5\7\5\u013d\n\5\f\5\16\5\u0140\13\5\3\5\3\5\6"+
		"\5\u0144\n\5\r\5\16\5\u0145\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0154\n\6\3\6\3\6\7\6\u0158\n\6\f\6\16\6\u015b\13\6\3\6\7\6"+
		"\u015e\n\6\f\6\16\6\u0161\13\6\3\6\3\6\6\6\u0165\n\6\r\6\16\6\u0166\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0183\n\7\3\7\3\7\7\7\u0187\n\7\f"+
		"\7\16\7\u018a\13\7\3\7\7\7\u018d\n\7\f\7\16\7\u0190\13\7\3\7\3\7\6\7\u0194"+
		"\n\7\r\7\16\7\u0195\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01ae\n\b\3\b\3\b\7\b\u01b2"+
		"\n\b\f\b\16\b\u01b5\13\b\3\b\7\b\u01b8\n\b\f\b\16\b\u01bb\13\b\3\b\3\b"+
		"\6\b\u01bf\n\b\r\b\16\b\u01c0\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01d7\n\t\3\t\3\t\7\t\u01db"+
		"\n\t\f\t\16\t\u01de\13\t\3\t\7\t\u01e1\n\t\f\t\16\t\u01e4\13\t\3\t\3\t"+
		"\6\t\u01e8\n\t\r\t\16\t\u01e9\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u01fa\n\n\3\n\3\n\7\n\u01fe\n\n\f\n\16\n\u0201\13"+
		"\n\3\n\7\n\u0204\n\n\f\n\16\n\u0207\13\n\3\n\3\n\6\n\u020b\n\n\r\n\16"+
		"\n\u020c\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u0347\n\13\3\13\3\13\7\13\u034b\n\13"+
		"\f\13\16\13\u034e\13\13\3\13\7\13\u0351\n\13\f\13\16\13\u0354\13\13\3"+
		"\13\3\13\6\13\u0358\n\13\r\13\16\13\u0359\3\f\3\f\3\r\6\r\u035f\n\r\r"+
		"\r\16\r\u0360\3\16\3\16\3\17\3\17\3\17\5\17\u0368\n\17\3\17\3\17\5\17"+
		"\u036c\n\17\3\17\5\17\u036f\n\17\5\17\u0371\n\17\3\17\3\17\3\20\3\20\7"+
		"\20\u0377\n\20\f\20\16\20\u037a\13\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\6\30\u0391\n\30\r\30\16\30\u0392\3\31\3\31\3\32\3\32\3\33\5\33\u039a"+
		"\n\33\3\34\3\34\5\34\u039e\n\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\2)\2+\2-\2/\2"+
		"\61\2\63\2\65\2\67\2\3\2\n\4\2\17\17\"\"\5\2##.\60AA\3\2\62;\3\2c|\3\2"+
		"C\\\4\2\13\13\"\"\u0129\2C\\aac|\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc\u00c2"+
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
		"\ufe25\ufe35\ufe36\ufe4f\ufe51\uff12\uff1b\uff41\uff41\2\u03fe\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\39\3"+
		"\2\2\2\5=\3\2\2\2\7\u0102\3\2\2\2\t\u0132\3\2\2\2\13\u0153\3\2\2\2\r\u0182"+
		"\3\2\2\2\17\u01ad\3\2\2\2\21\u01d6\3\2\2\2\23\u01f9\3\2\2\2\25\u0346\3"+
		"\2\2\2\27\u035b\3\2\2\2\31\u035e\3\2\2\2\33\u0362\3\2\2\2\35\u0370\3\2"+
		"\2\2\37\u0374\3\2\2\2!\u037b\3\2\2\2#\u037f\3\2\2\2%\u0381\3\2\2\2\'\u0385"+
		"\3\2\2\2)\u0389\3\2\2\2+\u038b\3\2\2\2-\u038d\3\2\2\2/\u0390\3\2\2\2\61"+
		"\u0394\3\2\2\2\63\u0396\3\2\2\2\65\u0399\3\2\2\2\67\u039d\3\2\2\29:\t"+
		"\2\2\2:\4\3\2\2\2;>\5%\23\2<>\5\'\24\2=;\3\2\2\2=<\3\2\2\2>?\3\2\2\2?"+
		"@\b\3\2\2@\6\3\2\2\2AB\7C\2\2BC\7t\2\2CD\7i\2\2Dp\7u\2\2EF\7T\2\2FG\7"+
		"g\2\2GH\7v\2\2HI\7w\2\2IJ\7t\2\2JK\7p\2\2Kp\7u\2\2LM\7[\2\2MN\7k\2\2N"+
		"O\7g\2\2OP\7n\2\2PQ\7f\2\2Qp\7u\2\2RS\7T\2\2ST\7c\2\2TU\7k\2\2UV\7u\2"+
		"\2VW\7g\2\2Wp\7u\2\2XY\7c\2\2YZ\7t\2\2Z[\7i\2\2[p\7u\2\2\\]\7t\2\2]^\7"+
		"g\2\2^_\7v\2\2_`\7w\2\2`a\7t\2\2ab\7p\2\2bp\7u\2\2cd\7{\2\2de\7k\2\2e"+
		"f\7g\2\2fg\7n\2\2gh\7f\2\2hp\7u\2\2ij\7t\2\2jk\7c\2\2kl\7k\2\2lm\7u\2"+
		"\2mn\7g\2\2np\7u\2\2oA\3\2\2\2oE\3\2\2\2oL\3\2\2\2oR\3\2\2\2oX\3\2\2\2"+
		"o\\\3\2\2\2oc\3\2\2\2oi\3\2\2\2pq\3\2\2\2qr\5\61\31\2rs\5\35\17\2s\u0103"+
		"\3\2\2\2t\u0084\7B\2\2uv\7r\2\2vw\7c\2\2wx\7t\2\2xy\7c\2\2y\u0085\7o\2"+
		"\2z{\7v\2\2{|\7{\2\2|}\7r\2\2}\u0085\7g\2\2~\177\7t\2\2\177\u0080\7g\2"+
		"\2\u0080\u0081\7v\2\2\u0081\u0082\7w\2\2\u0082\u0083\7t\2\2\u0083\u0085"+
		"\7p\2\2\u0084u\3\2\2\2\u0084z\3\2\2\2\u0084~\3\2\2\2\u0085\u0089\3\2\2"+
		"\2\u0086\u0088\5\3\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008e\5\37\20\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u0103\5\61\31\2\u0090\u00f6\5\61\31\2\u0091\u0092\7r\2\2"+
		"\u0092\u0093\7c\2\2\u0093\u0094\7t\2\2\u0094\u0095\7c\2\2\u0095\u00f7"+
		"\7o\2\2\u0096\u0097\7r\2\2\u0097\u0098\7c\2\2\u0098\u0099\7t\2\2\u0099"+
		"\u009a\7c\2\2\u009a\u009b\7o\2\2\u009b\u009c\7g\2\2\u009c\u009d\7v\2\2"+
		"\u009d\u009e\7g\2\2\u009e\u00f7\7t\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1"+
		"\7t\2\2\u00a1\u00f7\7i\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7i\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\u00a9\7p\2\2\u00a9\u00f7\7v\2\2\u00aa\u00ab\7m\2\2\u00ab\u00ac"+
		"\7g\2\2\u00ac\u00f7\7{\2\2\u00ad\u00ae\7m\2\2\u00ae\u00af\7g\2\2\u00af"+
		"\u00b0\7{\2\2\u00b0\u00b1\7y\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7t\2\2"+
		"\u00b3\u00f7\7f\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7{\2\2\u00b6\u00b7"+
		"\7r\2\2\u00b7\u00f7\7g\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7c\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2\u00bd\u00f7\7u\2\2"+
		"\u00be\u00bf\7t\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2"+
		"\7u\2\2\u00c2\u00f7\7g\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7z\2\2\u00c5"+
		"\u00c6\7e\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7r\2\2\u00c8\u00f7\7v\2\2"+
		"\u00c9\u00ca\7g\2\2\u00ca\u00cb\7z\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7k\2\2\u00d0"+
		"\u00d1\7q\2\2\u00d1\u00f7\7p\2\2\u00d2\u00d3\7x\2\2\u00d3\u00d4\7c\2\2"+
		"\u00d4\u00f7\7t\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7x\2\2\u00d7\u00d8"+
		"\7c\2\2\u00d8\u00f7\7t\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7x\2\2\u00db"+
		"\u00dc\7c\2\2\u00dc\u00f7\7t\2\2\u00dd\u00de\7x\2\2\u00de\u00df\7c\2\2"+
		"\u00df\u00e0\7t\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7{\2\2\u00e2\u00e3"+
		"\7r\2\2\u00e3\u00f7\7g\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"\u00e7\7v\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7t\2\2\u00e9\u00f7\7p\2\2"+
		"\u00ea\u00eb\7t\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee"+
		"\7w\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f7\7u\2\2\u00f1"+
		"\u00f2\7t\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7{\2\2\u00f4\u00f5\7r\2\2"+
		"\u00f5\u00f7\7g\2\2\u00f6\u0091\3\2\2\2\u00f6\u0096\3\2\2\2\u00f6\u009f"+
		"\3\2\2\2\u00f6\u00a2\3\2\2\2\u00f6\u00aa\3\2\2\2\u00f6\u00ad\3\2\2\2\u00f6"+
		"\u00b4\3\2\2\2\u00f6\u00b8\3\2\2\2\u00f6\u00be\3\2\2\2\u00f6\u00c3\3\2"+
		"\2\2\u00f6\u00c9\3\2\2\2\u00f6\u00d2\3\2\2\2\u00f6\u00d5\3\2\2\2\u00f6"+
		"\u00d9\3\2\2\2\u00f6\u00dd\3\2\2\2\u00f6\u00e4\3\2\2\2\u00f6\u00ea\3\2"+
		"\2\2\u00f6\u00f1\3\2\2\2\u00f7\u00fd\3\2\2\2\u00f8\u00f9\5\3\2\2\u00f9"+
		"\u00fa\5\37\20\2\u00fa\u00fc\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc\u00ff\3"+
		"\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0101\5\61\31\2\u0101\u0103\3\2\2\2\u0102o\3\2\2"+
		"\2\u0102t\3\2\2\2\u0102\u0090\3\2\2\2\u0103\b\3\2\2\2\u0104\u0105\7C\2"+
		"\2\u0105\u0106\7t\2\2\u0106\u0107\7i\2\2\u0107\u0133\7u\2\2\u0108\u0109"+
		"\7C\2\2\u0109\u010a\7t\2\2\u010a\u010b\7i\2\2\u010b\u010c\7w\2\2\u010c"+
		"\u010d\7o\2\2\u010d\u010e\7g\2\2\u010e\u010f\7p\2\2\u010f\u0110\7v\2\2"+
		"\u0110\u0133\7u\2\2\u0111\u0112\7R\2\2\u0112\u0113\7c\2\2\u0113\u0114"+
		"\7t\2\2\u0114\u0115\7c\2\2\u0115\u0116\7o\2\2\u0116\u0117\7g\2\2\u0117"+
		"\u0118\7v\2\2\u0118\u0119\7g\2\2\u0119\u011a\7t\2\2\u011a\u0133\7u\2\2"+
		"\u011b\u011c\7c\2\2\u011c\u011d\7t\2\2\u011d\u011e\7i\2\2\u011e\u0133"+
		"\7u\2\2\u011f\u0120\7c\2\2\u0120\u0121\7t\2\2\u0121\u0122\7i\2\2\u0122"+
		"\u0123\7w\2\2\u0123\u0124\7o\2\2\u0124\u0125\7g\2\2\u0125\u0126\7p\2\2"+
		"\u0126\u0127\7v\2\2\u0127\u0133\7u\2\2\u0128\u0129\7r\2\2\u0129\u012a"+
		"\7c\2\2\u012a\u012b\7t\2\2\u012b\u012c\7c\2\2\u012c\u012d\7o\2\2\u012d"+
		"\u012e\7g\2\2\u012e\u012f\7v\2\2\u012f\u0130\7g\2\2\u0130\u0131\7t\2\2"+
		"\u0131\u0133\7u\2\2\u0132\u0104\3\2\2\2\u0132\u0108\3\2\2\2\u0132\u0111"+
		"\3\2\2\2\u0132\u011b\3\2\2\2\u0132\u011f\3\2\2\2\u0132\u0128\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0138\5\35\17\2\u0135\u0137\5\3\2\2\u0136\u0135\3"+
		"\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013e\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\7\13\2\2\u013c\u013b\3"+
		"\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\5\31\r\2\u0142\u0144\5"+
		"\31\r\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\n\3\2\2\2\u0147\u0148\7T\2\2\u0148\u0149\7c\2\2\u0149"+
		"\u014a\7k\2\2\u014a\u014b\7u\2\2\u014b\u014c\7g\2\2\u014c\u0154\7u\2\2"+
		"\u014d\u014e\7t\2\2\u014e\u014f\7c\2\2\u014f\u0150\7k\2\2\u0150\u0151"+
		"\7u\2\2\u0151\u0152\7g\2\2\u0152\u0154\7u\2\2\u0153\u0147\3\2\2\2\u0153"+
		"\u014d\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0159\5\35\17\2\u0156\u0158\5"+
		"\3\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015f\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\7\13"+
		"\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\5\31"+
		"\r\2\u0163\u0165\5\31\r\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\f\3\2\2\2\u0168\u0169\7T\2\2"+
		"\u0169\u016a\7g\2\2\u016a\u016b\7v\2\2\u016b\u016c\7w\2\2\u016c\u016d"+
		"\7t\2\2\u016d\u016e\7p\2\2\u016e\u0183\7u\2\2\u016f\u0170\7T\2\2\u0170"+
		"\u0171\7g\2\2\u0171\u0172\7v\2\2\u0172\u0173\7w\2\2\u0173\u0174\7t\2\2"+
		"\u0174\u0183\7p\2\2\u0175\u0176\7t\2\2\u0176\u0177\7g\2\2\u0177\u0178"+
		"\7v\2\2\u0178\u0179\7w\2\2\u0179\u017a\7t\2\2\u017a\u017b\7p\2\2\u017b"+
		"\u0183\7u\2\2\u017c\u017d\7t\2\2\u017d\u017e\7g\2\2\u017e\u017f\7v\2\2"+
		"\u017f\u0180\7w\2\2\u0180\u0181\7t\2\2\u0181\u0183\7p\2\2\u0182\u0168"+
		"\3\2\2\2\u0182\u016f\3\2\2\2\u0182\u0175\3\2\2\2\u0182\u017c\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0188\5\35\17\2\u0185\u0187\5\3\2\2\u0186\u0185\3"+
		"\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018e\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018d\7\13\2\2\u018c\u018b\3"+
		"\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193\5\31\r\2\u0192\u0194\5"+
		"\31\r\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\16\3\2\2\2\u0197\u0198\7[\2\2\u0198\u0199\7k\2\2"+
		"\u0199\u019a\7g\2\2\u019a\u019b\7n\2\2\u019b\u019c\7f\2\2\u019c\u01ae"+
		"\7u\2\2\u019d\u019e\7[\2\2\u019e\u019f\7k\2\2\u019f\u01a0\7g\2\2\u01a0"+
		"\u01a1\7n\2\2\u01a1\u01ae\7f\2\2\u01a2\u01a3\7{\2\2\u01a3\u01a4\7k\2\2"+
		"\u01a4\u01a5\7g\2\2\u01a5\u01a6\7n\2\2\u01a6\u01a7\7f\2\2\u01a7\u01ae"+
		"\7u\2\2\u01a8\u01a9\7{\2\2\u01a9\u01aa\7k\2\2\u01aa\u01ab\7g\2\2\u01ab"+
		"\u01ac\7n\2\2\u01ac\u01ae\7f\2\2\u01ad\u0197\3\2\2\2\u01ad\u019d\3\2\2"+
		"\2\u01ad\u01a2\3\2\2\2\u01ad\u01a8\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b3"+
		"\5\35\17\2\u01b0\u01b2\5\3\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2"+
		"\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b9\3\2\2\2\u01b5\u01b3"+
		"\3\2\2\2\u01b6\u01b8\7\13\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2"+
		"\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bc\u01be\5\31\r\2\u01bd\u01bf\5\31\r\2\u01be\u01bd\3\2\2\2"+
		"\u01bf\u01c0\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\20"+
		"\3\2\2\2\u01c2\u01c3\7C\2\2\u01c3\u01c4\7v\2\2\u01c4\u01c5\7v\2\2\u01c5"+
		"\u01c6\7t\2\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7d\2\2\u01c8\u01c9\7w\2\2"+
		"\u01c9\u01ca\7v\2\2\u01ca\u01cb\7g\2\2\u01cb\u01d7\7u\2\2\u01cc\u01cd"+
		"\7c\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0\7t\2\2\u01d0"+
		"\u01d1\7k\2\2\u01d1\u01d2\7d\2\2\u01d2\u01d3\7w\2\2\u01d3\u01d4\7v\2\2"+
		"\u01d4\u01d5\7g\2\2\u01d5\u01d7\7u\2\2\u01d6\u01c2\3\2\2\2\u01d6\u01cc"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dc\5\35\17\2\u01d9\u01db\5\3\2\2"+
		"\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\u01e2\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e1\7\13\2\2"+
		"\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e7\5\31\r\2"+
		"\u01e6\u01e8\5\31\r\2\u01e7\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\22\3\2\2\2\u01eb\u01ec\7O\2\2\u01ec"+
		"\u01ed\7g\2\2\u01ed\u01ee\7v\2\2\u01ee\u01ef\7j\2\2\u01ef\u01f0\7q\2\2"+
		"\u01f0\u01f1\7f\2\2\u01f1\u01fa\7u\2\2\u01f2\u01f3\7o\2\2\u01f3\u01f4"+
		"\7g\2\2\u01f4\u01f5\7v\2\2\u01f5\u01f6\7j\2\2\u01f6\u01f7\7q\2\2\u01f7"+
		"\u01f8\7f\2\2\u01f8\u01fa\7u\2\2\u01f9\u01eb\3\2\2\2\u01f9\u01f2\3\2\2"+
		"\2\u01fa\u01fb\3\2\2\2\u01fb\u01ff\5\35\17\2\u01fc\u01fe\5\3\2\2\u01fd"+
		"\u01fc\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u0205\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0204\7\13\2\2\u0203"+
		"\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u0208\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020a\5\31\r\2\u0209"+
		"\u020b\5\31\r\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020a\3"+
		"\2\2\2\u020c\u020d\3\2\2\2\u020d\24\3\2\2\2\u020e\u020f\7G\2\2\u020f\u0210"+
		"\7z\2\2\u0210\u0211\7c\2\2\u0211\u0212\7o\2\2\u0212\u0213\7r\2\2\u0213"+
		"\u0214\7n\2\2\u0214\u0347\7g\2\2\u0215\u0216\7G\2\2\u0216\u0217\7z\2\2"+
		"\u0217\u0218\7c\2\2\u0218\u0219\7o\2\2\u0219\u021a\7r\2\2\u021a\u021b"+
		"\7n\2\2\u021b\u021c\7g\2\2\u021c\u0347\7u\2\2\u021d\u021e\7M\2\2\u021e"+
		"\u021f\7g\2\2\u021f\u0220\7{\2\2\u0220\u0221\7y\2\2\u0221\u0222\7q\2\2"+
		"\u0222\u0223\7t\2\2\u0223\u0224\7f\2\2\u0224\u0225\7\"\2\2\u0225\u0226"+
		"\7C\2\2\u0226\u0227\7t\2\2\u0227\u0228\7i\2\2\u0228\u0347\7u\2\2\u0229"+
		"\u022a\7M\2\2\u022a\u022b\7g\2\2\u022b\u022c\7{\2\2\u022c\u022d\7y\2\2"+
		"\u022d\u022e\7q\2\2\u022e\u022f\7t\2\2\u022f\u0230\7f\2\2\u0230\u0231"+
		"\7\"\2\2\u0231\u0232\7C\2\2\u0232\u0233\7t\2\2\u0233\u0234\7i\2\2\u0234"+
		"\u0235\7w\2\2\u0235\u0236\7o\2\2\u0236\u0237\7g\2\2\u0237\u0238\7p\2\2"+
		"\u0238\u0239\7v\2\2\u0239\u0347\7u\2\2\u023a\u023b\7P\2\2\u023b\u023c"+
		"\7q\2\2\u023c\u023d\7v\2\2\u023d\u0347\7g\2\2\u023e\u023f\7P\2\2\u023f"+
		"\u0240\7q\2\2\u0240\u0241\7v\2\2\u0241\u0242\7g\2\2\u0242\u0347\7u\2\2"+
		"\u0243\u0244\7Q\2\2\u0244\u0245\7v\2\2\u0245\u0246\7j\2\2\u0246\u0247"+
		"\7g\2\2\u0247\u0248\7t\2\2\u0248\u0249\7\"\2\2\u0249\u024a\7R\2\2\u024a"+
		"\u024b\7c\2\2\u024b\u024c\7t\2\2\u024c\u024d\7c\2\2\u024d\u024e\7o\2\2"+
		"\u024e\u024f\7g\2\2\u024f\u0250\7v\2\2\u0250\u0251\7g\2\2\u0251\u0252"+
		"\7t\2\2\u0252\u0347\7u\2\2\u0253\u0254\7T\2\2\u0254\u0255\7g\2\2\u0255"+
		"\u0256\7h\2\2\u0256\u0257\7g\2\2\u0257\u0258\7t\2\2\u0258\u0259\7g\2\2"+
		"\u0259\u025a\7p\2\2\u025a\u025b\7e\2\2\u025b\u025c\7g\2\2\u025c\u0347"+
		"\7u\2\2\u025d\u025e\7U\2\2\u025e\u025f\7g\2\2\u025f\u0260\7g\2\2\u0260"+
		"\u0261\7\"\2\2\u0261\u0262\7C\2\2\u0262\u0263\7n\2\2\u0263\u0264\7u\2"+
		"\2\u0264\u0347\7q\2\2\u0265\u0266\7V\2\2\u0266\u0267\7q\2\2\u0267\u0268"+
		"\7f\2\2\u0268\u0347\7q\2\2\u0269\u026a\7Y\2\2\u026a\u026b\7c\2\2\u026b"+
		"\u026c\7t\2\2\u026c\u026d\7p\2\2\u026d\u026e\7k\2\2\u026e\u026f\7p\2\2"+
		"\u026f\u0347\7i\2\2\u0270\u0271\7Y\2\2\u0271\u0272\7c\2\2\u0272\u0273"+
		"\7t\2\2\u0273\u0274\7p\2\2\u0274\u0275\7k\2\2\u0275\u0276\7p\2\2\u0276"+
		"\u0277\7i\2\2\u0277\u0347\7u\2\2\u0278\u0279\7Y\2\2\u0279\u027a\7c\2\2"+
		"\u027a\u027b\7t\2\2\u027b\u027c\7p\2\2\u027c\u0347\7u\2\2\u027d\u027e"+
		"\7g\2\2\u027e\u027f\7z\2\2\u027f\u0280\7c\2\2\u0280\u0281\7o\2\2\u0281"+
		"\u0282\7r\2\2\u0282\u0283\7n\2\2\u0283\u0347\7g\2\2\u0284\u0285\7g\2\2"+
		"\u0285\u0286\7z\2\2\u0286\u0287\7c\2\2\u0287\u0288\7o\2\2\u0288\u0289"+
		"\7r\2\2\u0289\u028a\7n\2\2\u028a\u028b\7g\2\2\u028b\u0347\7u\2\2\u028c"+
		"\u028d\7m\2\2\u028d\u028e\7g\2\2\u028e\u028f\7{\2\2\u028f\u0290\7y\2\2"+
		"\u0290\u0291\7q\2\2\u0291\u0292\7t\2\2\u0292\u0293\7f\2\2\u0293\u0294"+
		"\7\"\2\2\u0294\u0295\7c\2\2\u0295\u0296\7t\2\2\u0296\u0297\7i\2\2\u0297"+
		"\u0347\7u\2\2\u0298\u0299\7m\2\2\u0299\u029a\7g\2\2\u029a\u029b\7{\2\2"+
		"\u029b\u029c\7y\2\2\u029c\u029d\7q\2\2\u029d\u029e\7t\2\2\u029e\u029f"+
		"\7f\2\2\u029f\u02a0\7\"\2\2\u02a0\u02a1\7c\2\2\u02a1\u02a2\7t\2\2\u02a2"+
		"\u02a3\7i\2\2\u02a3\u02a4\7w\2\2\u02a4\u02a5\7o\2\2\u02a5\u02a6\7g\2\2"+
		"\u02a6\u02a7\7p\2\2\u02a7\u02a8\7v\2\2\u02a8\u0347\7u\2\2\u02a9\u02aa"+
		"\7p\2\2\u02aa\u02ab\7q\2\2\u02ab\u02ac\7v\2\2\u02ac\u0347\7g\2\2\u02ad"+
		"\u02ae\7p\2\2\u02ae\u02af\7q\2\2\u02af\u02b0\7v\2\2\u02b0\u02b1\7g\2\2"+
		"\u02b1\u0347\7u\2\2\u02b2\u02b3\7q\2\2\u02b3\u02b4\7v\2\2\u02b4\u02b5"+
		"\7j\2\2\u02b5\u02b6\7g\2\2\u02b6\u02b7\7t\2\2\u02b7\u02b8\7\"\2\2\u02b8"+
		"\u02b9\7r\2\2\u02b9\u02ba\7c\2\2\u02ba\u02bb\7t\2\2\u02bb\u02bc\7c\2\2"+
		"\u02bc\u02bd\7o\2\2\u02bd\u02be\7g\2\2\u02be\u02bf\7v\2\2\u02bf\u02c0"+
		"\7g\2\2\u02c0\u02c1\7t\2\2\u02c1\u0347\7u\2\2\u02c2\u02c3\7t\2\2\u02c3"+
		"\u02c4\7g\2\2\u02c4\u02c5\7h\2\2\u02c5\u02c6\7g\2\2\u02c6\u02c7\7t\2\2"+
		"\u02c7\u02c8\7g\2\2\u02c8\u02c9\7p\2\2\u02c9\u02ca\7e\2\2\u02ca\u02cb"+
		"\7g\2\2\u02cb\u0347\7u\2\2\u02cc\u02cd\7u\2\2\u02cd\u02ce\7g\2\2\u02ce"+
		"\u02cf\7g\2\2\u02cf\u02d0\7\"\2\2\u02d0\u02d1\7c\2\2\u02d1\u02d2\7n\2"+
		"\2\u02d2\u02d3\7u\2\2\u02d3\u0347\7q\2\2\u02d4\u02d5\7v\2\2\u02d5\u02d6"+
		"\7q\2\2\u02d6\u02d7\7f\2\2\u02d7\u0347\7q\2\2\u02d8\u02d9\7y\2\2\u02d9"+
		"\u02da\7c\2\2\u02da\u02db\7t\2\2\u02db\u02dc\7p\2\2\u02dc\u02dd\7k\2\2"+
		"\u02dd\u02de\7p\2\2\u02de\u0347\7i\2\2\u02df\u02e0\7y\2\2\u02e0\u02e1"+
		"\7c\2\2\u02e1\u02e2\7t\2\2\u02e2\u02e3\7p\2\2\u02e3\u02e4\7k\2\2\u02e4"+
		"\u02e5\7p\2\2\u02e5\u02e6\7i\2\2\u02e6\u0347\7u\2\2\u02e7\u02e8\7y\2\2"+
		"\u02e8\u02e9\7c\2\2\u02e9\u02ea\7t\2\2\u02ea\u02eb\7p\2\2\u02eb\u0347"+
		"\7u\2\2\u02ec\u02ed\7M\2\2\u02ed\u02ee\7g\2\2\u02ee\u02ef\7{\2\2\u02ef"+
		"\u02f0\7y\2\2\u02f0\u02f1\7q\2\2\u02f1\u02f2\7t\2\2\u02f2\u02f3\7f\2\2"+
		"\u02f3\u02f4\7\"\2\2\u02f4\u02f5\7c\2\2\u02f5\u02f6\7t\2\2\u02f6\u02f7"+
		"\7i\2\2\u02f7\u0347\7u\2\2\u02f8\u02f9\7m\2\2\u02f9\u02fa\7g\2\2\u02fa"+
		"\u02fb\7{\2\2\u02fb\u02fc\7y\2\2\u02fc\u02fd\7q\2\2\u02fd\u02fe\7t\2\2"+
		"\u02fe\u02ff\7f\2\2\u02ff\u0300\7\"\2\2\u0300\u0301\7C\2\2\u0301\u0302"+
		"\7t\2\2\u0302\u0303\7i\2\2\u0303\u0347\7u\2\2\u0304\u0305\7q\2\2\u0305"+
		"\u0306\7v\2\2\u0306\u0307\7j\2\2\u0307\u0308\7g\2\2\u0308\u0309\7t\2\2"+
		"\u0309\u030a\7\"\2\2\u030a\u030b\7R\2\2\u030b\u030c\7c\2\2\u030c\u030d"+
		"\7t\2\2\u030d\u030e\7c\2\2\u030e\u030f\7o\2\2\u030f\u0310\7g\2\2\u0310"+
		"\u0311\7v\2\2\u0311\u0312\7g\2\2\u0312\u0313\7t\2\2\u0313\u0347\7u\2\2"+
		"\u0314\u0315\7Q\2\2\u0315\u0316\7v\2\2\u0316\u0317\7j\2\2\u0317\u0318"+
		"\7g\2\2\u0318\u0319\7t\2\2\u0319\u031a\7\"\2\2\u031a\u031b\7r\2\2\u031b"+
		"\u031c\7c\2\2\u031c\u031d\7t\2\2\u031d\u031e\7c\2\2\u031e\u031f\7o\2\2"+
		"\u031f\u0320\7g\2\2\u0320\u0321\7v\2\2\u0321\u0322\7g\2\2\u0322\u0323"+
		"\7t\2\2\u0323\u0347\7u\2\2\u0324\u0325\7M\2\2\u0325\u0326\7g\2\2\u0326"+
		"\u0327\7{\2\2\u0327\u0328\7y\2\2\u0328\u0329\7q\2\2\u0329\u032a\7t\2\2"+
		"\u032a\u032b\7f\2\2\u032b\u032c\7\"\2\2\u032c\u032d\7c\2\2\u032d\u032e"+
		"\7t\2\2\u032e\u032f\7i\2\2\u032f\u0330\7w\2\2\u0330\u0331\7o\2\2\u0331"+
		"\u0332\7g\2\2\u0332\u0333\7p\2\2\u0333\u0334\7v\2\2\u0334\u0347\7u\2\2"+
		"\u0335\u0336\7m\2\2\u0336\u0337\7g\2\2\u0337\u0338\7{\2\2\u0338\u0339"+
		"\7y\2\2\u0339\u033a\7q\2\2\u033a\u033b\7t\2\2\u033b\u033c\7f\2\2\u033c"+
		"\u033d\7\"\2\2\u033d\u033e\7C\2\2\u033e\u033f\7t\2\2\u033f\u0340\7i\2"+
		"\2\u0340\u0341\7w\2\2\u0341\u0342\7o\2\2\u0342\u0343\7g\2\2\u0343\u0344"+
		"\7p\2\2\u0344\u0345\7v\2\2\u0345\u0347\7u\2\2\u0346\u020e\3\2\2\2\u0346"+
		"\u0215\3\2\2\2\u0346\u021d\3\2\2\2\u0346\u0229\3\2\2\2\u0346\u023a\3\2"+
		"\2\2\u0346\u023e\3\2\2\2\u0346\u0243\3\2\2\2\u0346\u0253\3\2\2\2\u0346"+
		"\u025d\3\2\2\2\u0346\u0265\3\2\2\2\u0346\u0269\3\2\2\2\u0346\u0270\3\2"+
		"\2\2\u0346\u0278\3\2\2\2\u0346\u027d\3\2\2\2\u0346\u0284\3\2\2\2\u0346"+
		"\u028c\3\2\2\2\u0346\u0298\3\2\2\2\u0346\u02a9\3\2\2\2\u0346\u02ad\3\2"+
		"\2\2\u0346\u02b2\3\2\2\2\u0346\u02c2\3\2\2\2\u0346\u02cc\3\2\2\2\u0346"+
		"\u02d4\3\2\2\2\u0346\u02d8\3\2\2\2\u0346\u02df\3\2\2\2\u0346\u02e7\3\2"+
		"\2\2\u0346\u02ec\3\2\2\2\u0346\u02f8\3\2\2\2\u0346\u0304\3\2\2\2\u0346"+
		"\u0314\3\2\2\2\u0346\u0324\3\2\2\2\u0346\u0335\3\2\2\2\u0347\u0348\3\2"+
		"\2\2\u0348\u034c\5\35\17\2\u0349\u034b\5\3\2\2\u034a\u0349\3\2\2\2\u034b"+
		"\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u0352\3\2"+
		"\2\2\u034e\u034c\3\2\2\2\u034f\u0351\7\13\2\2\u0350\u034f\3\2\2\2\u0351"+
		"\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2"+
		"\2\2\u0354\u0352\3\2\2\2\u0355\u0357\5\31\r\2\u0356\u0358\5\31\r\2\u0357"+
		"\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2"+
		"\2\2\u035a\26\3\2\2\2\u035b\u035c\t\3\2\2\u035c\30\3\2\2\2\u035d\u035f"+
		"\5\63\32\2\u035e\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u035e\3\2\2\2"+
		"\u0360\u0361\3\2\2\2\u0361\32\3\2\2\2\u0362\u0363\5\61\31\2\u0363\34\3"+
		"\2\2\2\u0364\u0365\6\17\2\2\u0365\u0371\5/\30\2\u0366\u0368\7\17\2\2\u0367"+
		"\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036c\7\f"+
		"\2\2\u036a\u036c\4\16\17\2\u036b\u0367\3\2\2\2\u036b\u036a\3\2\2\2\u036c"+
		"\u036e\3\2\2\2\u036d\u036f\5/\30\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2"+
		"\2\2\u036f\u0371\3\2\2\2\u0370\u0364\3\2\2\2\u0370\u036b\3\2\2\2\u0371"+
		"\u0372\3\2\2\2\u0372\u0373\b\17\3\2\u0373\36\3\2\2\2\u0374\u0378\5\65"+
		"\33\2\u0375\u0377\5\67\34\2\u0376\u0375\3\2\2\2\u0377\u037a\3\2\2\2\u0378"+
		"\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379 \3\2\2\2\u037a\u0378\3\2\2\2"+
		"\u037b\u037c\5/\30\2\u037c\u037d\3\2\2\2\u037d\u037e\b\21\2\2\u037e\""+
		"\3\2\2\2\u037f\u0380\13\2\2\2\u0380$\3\2\2\2\u0381\u0382\7)\2\2\u0382"+
		"\u0383\7)\2\2\u0383\u0384\7)\2\2\u0384&\3\2\2\2\u0385\u0386\7$\2\2\u0386"+
		"\u0387\7$\2\2\u0387\u0388\7$\2\2\u0388(\3\2\2\2\u0389\u038a\t\4\2\2\u038a"+
		"*\3\2\2\2\u038b\u038c\t\5\2\2\u038c,\3\2\2\2\u038d\u038e\t\6\2\2\u038e"+
		".\3\2\2\2\u038f\u0391\t\7\2\2\u0390\u038f\3\2\2\2\u0391\u0392\3\2\2\2"+
		"\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393\60\3\2\2\2\u0394\u0395"+
		"\7<\2\2\u0395\62\3\2\2\2\u0396\u0397\7/\2\2\u0397\64\3\2\2\2\u0398\u039a"+
		"\t\b\2\2\u0399\u0398\3\2\2\2\u039a\66\3\2\2\2\u039b\u039e\5\65\33\2\u039c"+
		"\u039e\t\t\2\2\u039d\u039b\3\2\2\2\u039d\u039c\3\2\2\2\u039e8\3\2\2\2"+
		"\60\2=o\u0084\u0089\u008d\u00f6\u00fd\u0102\u0132\u0138\u013e\u0145\u0153"+
		"\u0159\u015f\u0166\u0182\u0188\u018e\u0195\u01ad\u01b3\u01b9\u01c0\u01d6"+
		"\u01dc\u01e2\u01e9\u01f9\u01ff\u0205\u020c\u0346\u034c\u0352\u0359\u0360"+
		"\u0367\u036b\u036e\u0370\u0378\u0392\u0399\u039d\4\b\2\2\3\17\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}