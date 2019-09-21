// Generated from RestructuredTextDocstring.g4 by ANTLR 4.7.1

   package ch.jako.parser.restructuredText;
   //import com.yuvalshavit.antlr4.DenterHelper;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RestructuredTextDocstringParser}.
 */
public interface RestructuredTextDocstringListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#docstring}.
	 * @param ctx the parse tree
	 */
	void enterDocstring(RestructuredTextDocstringParser.DocstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#docstring}.
	 * @param ctx the parse tree
	 */
	void exitDocstring(RestructuredTextDocstringParser.DocstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#components}.
	 * @param ctx the parse tree
	 */
	void enterComponents(RestructuredTextDocstringParser.ComponentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#components}.
	 * @param ctx the parse tree
	 */
	void exitComponents(RestructuredTextDocstringParser.ComponentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#oneLiner}.
	 * @param ctx the parse tree
	 */
	void enterOneLiner(RestructuredTextDocstringParser.OneLinerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#oneLiner}.
	 * @param ctx the parse tree
	 */
	void exitOneLiner(RestructuredTextDocstringParser.OneLinerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(RestructuredTextDocstringParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(RestructuredTextDocstringParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(RestructuredTextDocstringParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(RestructuredTextDocstringParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#paramType}.
	 * @param ctx the parse tree
	 */
	void enterParamType(RestructuredTextDocstringParser.ParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#paramType}.
	 * @param ctx the parse tree
	 */
	void exitParamType(RestructuredTextDocstringParser.ParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#returnItem}.
	 * @param ctx the parse tree
	 */
	void enterReturnItem(RestructuredTextDocstringParser.ReturnItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#returnItem}.
	 * @param ctx the parse tree
	 */
	void exitReturnItem(RestructuredTextDocstringParser.ReturnItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(RestructuredTextDocstringParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(RestructuredTextDocstringParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#raiseItem}.
	 * @param ctx the parse tree
	 */
	void enterRaiseItem(RestructuredTextDocstringParser.RaiseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#raiseItem}.
	 * @param ctx the parse tree
	 */
	void exitRaiseItem(RestructuredTextDocstringParser.RaiseItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#varItem}.
	 * @param ctx the parse tree
	 */
	void enterVarItem(RestructuredTextDocstringParser.VarItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#varItem}.
	 * @param ctx the parse tree
	 */
	void exitVarItem(RestructuredTextDocstringParser.VarItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(RestructuredTextDocstringParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(RestructuredTextDocstringParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#infoField}.
	 * @param ctx the parse tree
	 */
	void enterInfoField(RestructuredTextDocstringParser.InfoFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#infoField}.
	 * @param ctx the parse tree
	 */
	void exitInfoField(RestructuredTextDocstringParser.InfoFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#typeItemName}.
	 * @param ctx the parse tree
	 */
	void enterTypeItemName(RestructuredTextDocstringParser.TypeItemNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#typeItemName}.
	 * @param ctx the parse tree
	 */
	void exitTypeItemName(RestructuredTextDocstringParser.TypeItemNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#directives}.
	 * @param ctx the parse tree
	 */
	void enterDirectives(RestructuredTextDocstringParser.DirectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#directives}.
	 * @param ctx the parse tree
	 */
	void exitDirectives(RestructuredTextDocstringParser.DirectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#variableDescription}.
	 * @param ctx the parse tree
	 */
	void enterVariableDescription(RestructuredTextDocstringParser.VariableDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#variableDescription}.
	 * @param ctx the parse tree
	 */
	void exitVariableDescription(RestructuredTextDocstringParser.VariableDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RestructuredTextDocstringParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RestructuredTextDocstringParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestructuredTextDocstringParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(RestructuredTextDocstringParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestructuredTextDocstringParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(RestructuredTextDocstringParser.NameContext ctx);
}