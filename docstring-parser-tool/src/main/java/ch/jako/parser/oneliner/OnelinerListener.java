// Generated from Oneliner.g4 by ANTLR 4.7.1

   package ch.jako.parser.oneliner;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OnelinerParser}.
 */
public interface OnelinerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OnelinerParser#oneliner}.
	 * @param ctx the parse tree
	 */
	void enterOneliner(OnelinerParser.OnelinerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnelinerParser#oneliner}.
	 * @param ctx the parse tree
	 */
	void exitOneliner(OnelinerParser.OnelinerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OnelinerParser#oneLine}.
	 * @param ctx the parse tree
	 */
	void enterOneLine(OnelinerParser.OneLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnelinerParser#oneLine}.
	 * @param ctx the parse tree
	 */
	void exitOneLine(OnelinerParser.OneLineContext ctx);
}