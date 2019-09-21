// Generated from GoogleDocstring.g4 by ANTLR 4.7.1

   package ch.jako.parser.google;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GoogleDocstringParser}.
 */
public interface GoogleDocstringListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#docstring}.
	 * @param ctx the parse tree
	 */
	void enterDocstring(GoogleDocstringParser.DocstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#docstring}.
	 * @param ctx the parse tree
	 */
	void exitDocstring(GoogleDocstringParser.DocstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#components}.
	 * @param ctx the parse tree
	 */
	void enterComponents(GoogleDocstringParser.ComponentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#components}.
	 * @param ctx the parse tree
	 */
	void exitComponents(GoogleDocstringParser.ComponentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#oneLiner}.
	 * @param ctx the parse tree
	 */
	void enterOneLiner(GoogleDocstringParser.OneLinerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#oneLiner}.
	 * @param ctx the parse tree
	 */
	void exitOneLiner(GoogleDocstringParser.OneLinerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(GoogleDocstringParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(GoogleDocstringParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#attributesComponent}.
	 * @param ctx the parse tree
	 */
	void enterAttributesComponent(GoogleDocstringParser.AttributesComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#attributesComponent}.
	 * @param ctx the parse tree
	 */
	void exitAttributesComponent(GoogleDocstringParser.AttributesComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(GoogleDocstringParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(GoogleDocstringParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(GoogleDocstringParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(GoogleDocstringParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#attributeDescription}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDescription(GoogleDocstringParser.AttributeDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#attributeDescription}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDescription(GoogleDocstringParser.AttributeDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#argsComponent}.
	 * @param ctx the parse tree
	 */
	void enterArgsComponent(GoogleDocstringParser.ArgsComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#argsComponent}.
	 * @param ctx the parse tree
	 */
	void exitArgsComponent(GoogleDocstringParser.ArgsComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(GoogleDocstringParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(GoogleDocstringParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#argName}.
	 * @param ctx the parse tree
	 */
	void enterArgName(GoogleDocstringParser.ArgNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#argName}.
	 * @param ctx the parse tree
	 */
	void exitArgName(GoogleDocstringParser.ArgNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#argDescription}.
	 * @param ctx the parse tree
	 */
	void enterArgDescription(GoogleDocstringParser.ArgDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#argDescription}.
	 * @param ctx the parse tree
	 */
	void exitArgDescription(GoogleDocstringParser.ArgDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#returnComponent}.
	 * @param ctx the parse tree
	 */
	void enterReturnComponent(GoogleDocstringParser.ReturnComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#returnComponent}.
	 * @param ctx the parse tree
	 */
	void exitReturnComponent(GoogleDocstringParser.ReturnComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#returnObject}.
	 * @param ctx the parse tree
	 */
	void enterReturnObject(GoogleDocstringParser.ReturnObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#returnObject}.
	 * @param ctx the parse tree
	 */
	void exitReturnObject(GoogleDocstringParser.ReturnObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#returnName}.
	 * @param ctx the parse tree
	 */
	void enterReturnName(GoogleDocstringParser.ReturnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#returnName}.
	 * @param ctx the parse tree
	 */
	void exitReturnName(GoogleDocstringParser.ReturnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#returnDescription}.
	 * @param ctx the parse tree
	 */
	void enterReturnDescription(GoogleDocstringParser.ReturnDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#returnDescription}.
	 * @param ctx the parse tree
	 */
	void exitReturnDescription(GoogleDocstringParser.ReturnDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#raiseComponent}.
	 * @param ctx the parse tree
	 */
	void enterRaiseComponent(GoogleDocstringParser.RaiseComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#raiseComponent}.
	 * @param ctx the parse tree
	 */
	void exitRaiseComponent(GoogleDocstringParser.RaiseComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#raiseObject}.
	 * @param ctx the parse tree
	 */
	void enterRaiseObject(GoogleDocstringParser.RaiseObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#raiseObject}.
	 * @param ctx the parse tree
	 */
	void exitRaiseObject(GoogleDocstringParser.RaiseObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#raiseName}.
	 * @param ctx the parse tree
	 */
	void enterRaiseName(GoogleDocstringParser.RaiseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#raiseName}.
	 * @param ctx the parse tree
	 */
	void exitRaiseName(GoogleDocstringParser.RaiseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#raiseDescription}.
	 * @param ctx the parse tree
	 */
	void enterRaiseDescription(GoogleDocstringParser.RaiseDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#raiseDescription}.
	 * @param ctx the parse tree
	 */
	void exitRaiseDescription(GoogleDocstringParser.RaiseDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#variableIndicator}.
	 * @param ctx the parse tree
	 */
	void enterVariableIndicator(GoogleDocstringParser.VariableIndicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#variableIndicator}.
	 * @param ctx the parse tree
	 */
	void exitVariableIndicator(GoogleDocstringParser.VariableIndicatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(GoogleDocstringParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(GoogleDocstringParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GoogleDocstringParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GoogleDocstringParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#variableDescription}.
	 * @param ctx the parse tree
	 */
	void enterVariableDescription(GoogleDocstringParser.VariableDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#variableDescription}.
	 * @param ctx the parse tree
	 */
	void exitVariableDescription(GoogleDocstringParser.VariableDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoogleDocstringParser#otherSections}.
	 * @param ctx the parse tree
	 */
	void enterOtherSections(GoogleDocstringParser.OtherSectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoogleDocstringParser#otherSections}.
	 * @param ctx the parse tree
	 */
	void exitOtherSections(GoogleDocstringParser.OtherSectionsContext ctx);
}