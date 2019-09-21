package ch.jako.parser.epydoc;

import ch.jako.docstringFormats.DocstringFormats;
import ch.jako.docstringMetaModel.DocstringMetaModel;
import ch.jako.docstringMetaModel.Parameter;
import ch.jako.docstringMetaModel.Raise;
import ch.jako.docstringMetaModel.Return;
import ch.jako.parser.AbstractDocstringChecker;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;

public class EpydocConverter extends AbstractDocstringChecker {

    public void run(File f) {
        docstring = new DocstringMetaModel();
        parsable = true;
        readFile(f);
    }

    public void readFile(File testFile) {
        MyEpydocParser myParser = new MyEpydocParser();
        try {
            EpyDocstringParser parser = myParser.parse(testFile);
            print(parser.docstring());
        }
        catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("NOT PARSABLE");
            parsable = false;
            //throw new RuntimeException(e);
        }

    }

    public void print(RuleContext ctx) {
        explore(ctx, 0);
    }


    public void explore(RuleContext ctx, int indentation) {
        String ruleName = EpyDocstringParser.ruleNames[ctx.getRuleIndex()];

        if(ctx instanceof EpyDocstringParser.DocstringContext) {
            docstring.content = ctx.getText();
        }

        if(ctx instanceof EpyDocstringParser.OneLinerContext) {
            docstring.hasShortSummary = true;
            docstring.shortSummary = docstring.shortSummary.concat(ctx.getText());
        }

        if(ctx instanceof EpyDocstringParser.DescriptionContext) {
            //System.out.println(ctx.getText());
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if (ctx instanceof EpyDocstringParser.ParamContext) {
            docstring.hasArgumentComponent = true;
            docstring.docstringFormat = DocstringFormats.EPYTEXT;
            exploreParameter(ctx);
        }

        if (ctx instanceof EpyDocstringParser.ReturnItemContext) {
            docstring.hasReturnComponent = true;
            docstring.docstringFormat = DocstringFormats.EPYTEXT;
            exploreReturns(ctx);
        }

        if (ctx instanceof EpyDocstringParser.RaiseItemContext) {
            docstring.hasRaiseComponent = true;
            docstring.docstringFormat = DocstringFormats.EPYTEXT;
            exploreRaises(ctx);
        }

        if (ctx instanceof EpyDocstringParser.ParamTypeContext) {
            docstring.docstringFormat = DocstringFormats.EPYTEXT;
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if (ctx instanceof EpyDocstringParser.ReturnTypeContext) {
            docstring.docstringFormat = DocstringFormats.EPYTEXT;
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if(ctx instanceof EpyDocstringParser.OtherSectionContext) {
            docstring.docstringFormat = DocstringFormats.EPYTEXT;
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if(ctx instanceof EpyDocstringParser.KeywordContext) {
            docstring.docstringFormat = DocstringFormats.EPYTEXT;
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if(ctx instanceof EpyDocstringParser.VariableContext) {
            docstring.docstringFormat = DocstringFormats.EPYTEXT;
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
        Parameter parameter = new Parameter();
        if (((EpyDocstringParser.ParamContext) ctx).name() != null) {
            parameter.parameterName = ((EpyDocstringParser.ParamContext) ctx).name().getText();
        }
        if (((EpyDocstringParser.ParamContext) ctx).variableDescription() != null) {
            parameter.parameterDescription = ((EpyDocstringParser.ParamContext) ctx).variableDescription().getText();
        }
        docstring.argumentsList.add(parameter);
    }

    public void exploreReturns(RuleContext ctx) {
        Return returnItem = new Return();
        if(((EpyDocstringParser.ReturnItemContext)ctx).name() != null) {
            returnItem.returnName = ((EpyDocstringParser.ReturnItemContext)ctx).name().getText();
        }
        if(((EpyDocstringParser.ReturnItemContext)ctx).variableDescription() != null) {
            returnItem.returnDescription = ((EpyDocstringParser.ReturnItemContext)ctx).variableDescription().getText();
        }
        docstring.returnsList.add(returnItem);
    }

    public void exploreRaises(RuleContext ctx) {
        Raise raiseItem = new Raise();
        if(((EpyDocstringParser.RaiseItemContext)ctx).name() != null) {
            raiseItem.raiseName = ((EpyDocstringParser.RaiseItemContext)ctx).name().getText();
        }
        if(((EpyDocstringParser.RaiseItemContext)ctx).variableDescription() != null) {
            raiseItem.raiseDescription = ((EpyDocstringParser.RaiseItemContext)ctx).variableDescription().getText();
        }
        docstring.raisesList.add(raiseItem);
    }
}
