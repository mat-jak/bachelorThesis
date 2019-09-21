// Generated from EpyDocstring.g4 by ANTLR 4.7.1

   package ch.jako.parser.epydoc;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EpyDocstringParser}.
 */
public interface EpyDocstringListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#docstring}.
	 * @param ctx the parse tree
	 */
	void enterDocstring(EpyDocstringParser.DocstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#docstring}.
	 * @param ctx the parse tree
	 */
	void exitDocstring(EpyDocstringParser.DocstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#components}.
	 * @param ctx the parse tree
	 */
	void enterComponents(EpyDocstringParser.ComponentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#components}.
	 * @param ctx the parse tree
	 */
	void exitComponents(EpyDocstringParser.ComponentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#oneLiner}.
	 * @param ctx the parse tree
	 */
	void enterOneLiner(EpyDocstringParser.OneLinerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#oneLiner}.
	 * @param ctx the parse tree
	 */
	void exitOneLiner(EpyDocstringParser.OneLinerContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(EpyDocstringParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(EpyDocstringParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(EpyDocstringParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(EpyDocstringParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#paramType}.
	 * @param ctx the parse tree
	 */
	void enterParamType(EpyDocstringParser.ParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#paramType}.
	 * @param ctx the parse tree
	 */
	void exitParamType(EpyDocstringParser.ParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(EpyDocstringParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(EpyDocstringParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(EpyDocstringParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(EpyDocstringParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#returnItem}.
	 * @param ctx the parse tree
	 */
	void enterReturnItem(EpyDocstringParser.ReturnItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#returnItem}.
	 * @param ctx the parse tree
	 */
	void exitReturnItem(EpyDocstringParser.ReturnItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(EpyDocstringParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(EpyDocstringParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#raiseItem}.
	 * @param ctx the parse tree
	 */
	void enterRaiseItem(EpyDocstringParser.RaiseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#raiseItem}.
	 * @param ctx the parse tree
	 */
	void exitRaiseItem(EpyDocstringParser.RaiseItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#typeItemName}.
	 * @param ctx the parse tree
	 */
	void enterTypeItemName(EpyDocstringParser.TypeItemNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#typeItemName}.
	 * @param ctx the parse tree
	 */
	void exitTypeItemName(EpyDocstringParser.TypeItemNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#variableDescription}.
	 * @param ctx the parse tree
	 */
	void enterVariableDescription(EpyDocstringParser.VariableDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#variableDescription}.
	 * @param ctx the parse tree
	 */
	void exitVariableDescription(EpyDocstringParser.VariableDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#otherSection}.
	 * @param ctx the parse tree
	 */
	void enterOtherSection(EpyDocstringParser.OtherSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#otherSection}.
	 * @param ctx the parse tree
	 */
	void exitOtherSection(EpyDocstringParser.OtherSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(EpyDocstringParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(EpyDocstringParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpyDocstringParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(EpyDocstringParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpyDocstringParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(EpyDocstringParser.NameContext ctx);
}