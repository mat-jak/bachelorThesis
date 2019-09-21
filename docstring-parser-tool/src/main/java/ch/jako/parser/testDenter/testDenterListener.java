// Generated from testDenter.g4 by ANTLR 4.7.1

   package ch.jako.parser.testDenter;
  //import com.yuvalshavit.antlr4.DenterHelper;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testDenterParser}.
 */
public interface testDenterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testDenterParser#calculus}.
	 * @param ctx the parse tree
	 */
	void enterCalculus(testDenterParser.CalculusContext ctx);
	/**
	 * Exit a parse tree produced by {@link testDenterParser#calculus}.
	 * @param ctx the parse tree
	 */
	void exitCalculus(testDenterParser.CalculusContext ctx);
}