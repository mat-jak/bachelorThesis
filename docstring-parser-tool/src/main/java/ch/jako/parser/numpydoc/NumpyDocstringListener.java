// Generated from NumpyDocstring.g4 by ANTLR 4.7.1

   package ch.jako.parser.numpydoc;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NumpyDocstringParser}.
 */
public interface NumpyDocstringListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#docstring}.
	 * @param ctx the parse tree
	 */
	void enterDocstring(NumpyDocstringParser.DocstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#docstring}.
	 * @param ctx the parse tree
	 */
	void exitDocstring(NumpyDocstringParser.DocstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#components}.
	 * @param ctx the parse tree
	 */
	void enterComponents(NumpyDocstringParser.ComponentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#components}.
	 * @param ctx the parse tree
	 */
	void exitComponents(NumpyDocstringParser.ComponentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#oneLiner}.
	 * @param ctx the parse tree
	 */
	void enterOneLiner(NumpyDocstringParser.OneLinerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#oneLiner}.
	 * @param ctx the parse tree
	 */
	void exitOneLiner(NumpyDocstringParser.OneLinerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(NumpyDocstringParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(NumpyDocstringParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#parameterSection}.
	 * @param ctx the parse tree
	 */
	void enterParameterSection(NumpyDocstringParser.ParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#parameterSection}.
	 * @param ctx the parse tree
	 */
	void exitParameterSection(NumpyDocstringParser.ParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(NumpyDocstringParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(NumpyDocstringParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#parameterDescription}.
	 * @param ctx the parse tree
	 */
	void enterParameterDescription(NumpyDocstringParser.ParameterDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#parameterDescription}.
	 * @param ctx the parse tree
	 */
	void exitParameterDescription(NumpyDocstringParser.ParameterDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#paramName}.
	 * @param ctx the parse tree
	 */
	void enterParamName(NumpyDocstringParser.ParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#paramName}.
	 * @param ctx the parse tree
	 */
	void exitParamName(NumpyDocstringParser.ParamNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#returnSection}.
	 * @param ctx the parse tree
	 */
	void enterReturnSection(NumpyDocstringParser.ReturnSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#returnSection}.
	 * @param ctx the parse tree
	 */
	void exitReturnSection(NumpyDocstringParser.ReturnSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#returnItem}.
	 * @param ctx the parse tree
	 */
	void enterReturnItem(NumpyDocstringParser.ReturnItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#returnItem}.
	 * @param ctx the parse tree
	 */
	void exitReturnItem(NumpyDocstringParser.ReturnItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#returnDescription}.
	 * @param ctx the parse tree
	 */
	void enterReturnDescription(NumpyDocstringParser.ReturnDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#returnDescription}.
	 * @param ctx the parse tree
	 */
	void exitReturnDescription(NumpyDocstringParser.ReturnDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#returnName}.
	 * @param ctx the parse tree
	 */
	void enterReturnName(NumpyDocstringParser.ReturnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#returnName}.
	 * @param ctx the parse tree
	 */
	void exitReturnName(NumpyDocstringParser.ReturnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#yieldSection}.
	 * @param ctx the parse tree
	 */
	void enterYieldSection(NumpyDocstringParser.YieldSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#yieldSection}.
	 * @param ctx the parse tree
	 */
	void exitYieldSection(NumpyDocstringParser.YieldSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#yieldItem}.
	 * @param ctx the parse tree
	 */
	void enterYieldItem(NumpyDocstringParser.YieldItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#yieldItem}.
	 * @param ctx the parse tree
	 */
	void exitYieldItem(NumpyDocstringParser.YieldItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#yieldDescription}.
	 * @param ctx the parse tree
	 */
	void enterYieldDescription(NumpyDocstringParser.YieldDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#yieldDescription}.
	 * @param ctx the parse tree
	 */
	void exitYieldDescription(NumpyDocstringParser.YieldDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#yieldName}.
	 * @param ctx the parse tree
	 */
	void enterYieldName(NumpyDocstringParser.YieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#yieldName}.
	 * @param ctx the parse tree
	 */
	void exitYieldName(NumpyDocstringParser.YieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#raiseSection}.
	 * @param ctx the parse tree
	 */
	void enterRaiseSection(NumpyDocstringParser.RaiseSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#raiseSection}.
	 * @param ctx the parse tree
	 */
	void exitRaiseSection(NumpyDocstringParser.RaiseSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#raiseItem}.
	 * @param ctx the parse tree
	 */
	void enterRaiseItem(NumpyDocstringParser.RaiseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#raiseItem}.
	 * @param ctx the parse tree
	 */
	void exitRaiseItem(NumpyDocstringParser.RaiseItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#raiseDescription}.
	 * @param ctx the parse tree
	 */
	void enterRaiseDescription(NumpyDocstringParser.RaiseDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#raiseDescription}.
	 * @param ctx the parse tree
	 */
	void exitRaiseDescription(NumpyDocstringParser.RaiseDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#raiseName}.
	 * @param ctx the parse tree
	 */
	void enterRaiseName(NumpyDocstringParser.RaiseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#raiseName}.
	 * @param ctx the parse tree
	 */
	void exitRaiseName(NumpyDocstringParser.RaiseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#attributeSection}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSection(NumpyDocstringParser.AttributeSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#attributeSection}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSection(NumpyDocstringParser.AttributeSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#attributeItem}.
	 * @param ctx the parse tree
	 */
	void enterAttributeItem(NumpyDocstringParser.AttributeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#attributeItem}.
	 * @param ctx the parse tree
	 */
	void exitAttributeItem(NumpyDocstringParser.AttributeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#attributeDescription}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDescription(NumpyDocstringParser.AttributeDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#attributeDescription}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDescription(NumpyDocstringParser.AttributeDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(NumpyDocstringParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(NumpyDocstringParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(NumpyDocstringParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(NumpyDocstringParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(NumpyDocstringParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(NumpyDocstringParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#variableDescription}.
	 * @param ctx the parse tree
	 */
	void enterVariableDescription(NumpyDocstringParser.VariableDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#variableDescription}.
	 * @param ctx the parse tree
	 */
	void exitVariableDescription(NumpyDocstringParser.VariableDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethods(NumpyDocstringParser.MethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethods(NumpyDocstringParser.MethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumpyDocstringParser#sections}.
	 * @param ctx the parse tree
	 */
	void enterSections(NumpyDocstringParser.SectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumpyDocstringParser#sections}.
	 * @param ctx the parse tree
	 */
	void exitSections(NumpyDocstringParser.SectionsContext ctx);
}