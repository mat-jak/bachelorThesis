package ch.jako.parser.numpydoc;

import ch.jako.docstringFormats.DocstringFormats;
import ch.jako.docstringMetaModel.DocstringMetaModel;
import ch.jako.docstringMetaModel.Parameter;
import ch.jako.docstringMetaModel.Raise;
import ch.jako.docstringMetaModel.Return;
import ch.jako.parser.AbstractDocstringChecker;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;

public class NumpydocConverter extends AbstractDocstringChecker {

    public void run(File f) {
        docstring = new DocstringMetaModel();
        parsable = true;
        readFile(f);
    }

    public void readFile(File testFile) {
        MyNumpyDocParser myParser = new MyNumpyDocParser();

        try {
            NumpyDocstringParser parser = myParser.parse(testFile);
            print(parser.docstring());
        }
        catch (Exception e) {
            //notParsable = true;
            System.out.println("NOT PARSABLE");
            parsable = false;
            //throw new RuntimeException(e);
        }

    }

    public void print(RuleContext ctx) {
        explore(ctx, 0);
    }

    public void explore(RuleContext ctx, int indentation) {
        String ruleName = NumpyDocstringParser.ruleNames[ctx.getRuleIndex()];

        if(ctx instanceof NumpyDocstringParser.DocstringContext) {
            docstring.content = ctx.getText();
        }

        if(ctx instanceof NumpyDocstringParser.OneLinerContext) {
            //System.out.println(ctx.getText());
            docstring.hasShortSummary = true;
            docstring.shortSummary = docstring.shortSummary.concat(ctx.getText());
        }
        if(ctx instanceof NumpyDocstringParser.DescriptionContext) {
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if(ctx instanceof NumpyDocstringParser.ParameterSectionContext) {
            docstring.hasArgumentComponent = true;
            docstring.docstringFormat = DocstringFormats.NUMPYDOC;
            exploreParameter(ctx);
        }

        if(ctx instanceof NumpyDocstringParser.ReturnSectionContext) {
            docstring.hasReturnComponent = true;
            docstring.docstringFormat = DocstringFormats.NUMPYDOC;
            exploreReturns(ctx);
        }

        if(ctx instanceof NumpyDocstringParser.YieldSectionContext) {
            docstring.hasReturnComponent = true;
            docstring.docstringFormat = DocstringFormats.NUMPYDOC;
            exploreReturns(ctx);
        }

        if(ctx instanceof NumpyDocstringParser.RaiseSectionContext) {
            docstring.hasRaiseComponent = true;
            docstring.docstringFormat = DocstringFormats.NUMPYDOC;
            exploreRaises(ctx);
        }

        if(ctx instanceof NumpyDocstringParser.AttributeSectionContext) {
            docstring.docstringFormat = DocstringFormats.NUMPYDOC;
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if(ctx instanceof NumpyDocstringParser.SectionsContext) {
            docstring.docstringFormat = DocstringFormats.NUMPYDOC;
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if(ctx instanceof NumpyDocstringParser.MethodsContext) {
            docstring.docstringFormat = DocstringFormats.NUMPYDOC;
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }


        /*for (int i = 0; i < indentation; i++) {
            System.out.print("  ");
        }
        System.out.println(ruleName);*/

        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);

            if (element instanceof RuleContext) {
                explore((RuleContext)element, indentation + 1);
            }
        }
    }

    public void exploreParameter(RuleContext ctx) {
        for(int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if(element instanceof NumpyDocstringParser.ParameterContext) {
                Parameter parameter = new Parameter();
                parameter.parameterName = parameter.parameterName.concat(((NumpyDocstringParser.ParameterContext) element).paramName().getText());
                parameter.parameterDescription = parameter.parameterDescription.concat(((NumpyDocstringParser.ParameterContext) element).parameterDescription().getText());
                docstring.argumentsList.add(parameter);
            }
            else if(element instanceof NumpyDocstringParser.ParameterDescriptionContext) {
                Parameter parameter = new Parameter();
                parameter.parameterDescription = parameter.parameterDescription.concat(element.getText());
                docstring.argumentsList.add(parameter);
            }
        }
    }

    public void exploreReturns(RuleContext ctx) {
        for(int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if(element instanceof NumpyDocstringParser.ReturnItemContext) {
                Return returnItem = new Return();
                returnItem.returnName = returnItem.returnName.concat(((NumpyDocstringParser.ReturnItemContext) element).returnName().getText());
                returnItem.returnDescription = returnItem.returnDescription.concat(((NumpyDocstringParser.ReturnItemContext) element).returnDescription().getText());
                docstring.returnsList.add(returnItem);
            }
            else if(element instanceof NumpyDocstringParser.ReturnDescriptionContext) {
                Return returnItem = new Return();
                returnItem.returnDescription = returnItem.returnDescription.concat(element.getText());
                docstring.returnsList.add(returnItem);
            }
        }
    }

    public void exploreRaises(RuleContext ctx) {
        for(int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if(element instanceof NumpyDocstringParser.RaiseItemContext) {
                Raise raiseItem = new Raise();
                raiseItem.raiseName = raiseItem.raiseName.concat(((NumpyDocstringParser.RaiseItemContext) element).raiseName().getText());
                raiseItem.raiseDescription = raiseItem.raiseDescription.concat(((NumpyDocstringParser.RaiseItemContext) element).raiseDescription().getText());
                docstring.raisesList.add(raiseItem);
            }
            else if(element instanceof NumpyDocstringParser.RaiseDescriptionContext) {
                Raise raiseItem = new Raise();
                raiseItem.raiseDescription = raiseItem.raiseDescription.concat(element.getText());
                docstring.raisesList.add(raiseItem);
            }
        }
    }
}
