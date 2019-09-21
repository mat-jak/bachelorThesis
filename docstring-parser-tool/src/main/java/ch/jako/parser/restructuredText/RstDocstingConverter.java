package ch.jako.parser.restructuredText;

import ch.jako.docstringFormats.DocstringFormats;
import ch.jako.docstringMetaModel.DocstringMetaModel;
import ch.jako.docstringMetaModel.Parameter;
import ch.jako.docstringMetaModel.Raise;
import ch.jako.docstringMetaModel.Return;
import ch.jako.parser.AbstractDocstringChecker;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;

public class RstDocstingConverter extends AbstractDocstringChecker {

    public void run(File f) {
        docstring = new DocstringMetaModel();
        parsable = true;
        readFile(f);
    }

    public void readFile(File testFile) {
        MyRestructuredTextParser myParser = new MyRestructuredTextParser();

        try {
            RestructuredTextDocstringParser parser = myParser.parse(testFile);
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
        String ruleName = RestructuredTextDocstringParser.ruleNames[ctx.getRuleIndex()];

        if(ctx instanceof RestructuredTextDocstringParser.DocstringContext) {
            docstring.content = ctx.getText();
        }

        if(ctx instanceof RestructuredTextDocstringParser.OneLinerContext) {
            docstring.hasShortSummary = true;
            docstring.shortSummary = docstring.shortSummary.concat(ctx.getText());
        }

        if(ctx instanceof RestructuredTextDocstringParser.DescriptionContext) {
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if (ctx instanceof RestructuredTextDocstringParser.ParamContext) {
            docstring.hasArgumentComponent = true;
            docstring.docstringFormat = DocstringFormats.RESTRUCTUREDTEXT;
            exploreParameter(ctx);
        }

        if (ctx instanceof RestructuredTextDocstringParser.ReturnItemContext) {
            docstring.hasReturnComponent = true;
            docstring.docstringFormat = DocstringFormats.RESTRUCTUREDTEXT;
            exploreReturns(ctx);
        }

        if (ctx instanceof RestructuredTextDocstringParser.RaiseItemContext) {
            docstring.hasRaiseComponent = true;
            docstring.docstringFormat = DocstringFormats.RESTRUCTUREDTEXT;
            exploreRaises(ctx);
        }

        if (ctx instanceof RestructuredTextDocstringParser.ParamTypeContext) {
            docstring.docstringFormat = DocstringFormats.RESTRUCTUREDTEXT;
        }

        if (ctx instanceof RestructuredTextDocstringParser.ReturnTypeContext) {
            docstring.docstringFormat = DocstringFormats.RESTRUCTUREDTEXT;
        }

        if (ctx instanceof RestructuredTextDocstringParser.InfoFieldContext) {
            docstring.docstringFormat = DocstringFormats.RESTRUCTUREDTEXT;
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if (ctx instanceof RestructuredTextDocstringParser.VarTypeContext) {
            docstring.docstringFormat = DocstringFormats.RESTRUCTUREDTEXT;
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if(ctx instanceof RestructuredTextDocstringParser.DirectivesContext) {
            docstring.docstringFormat = DocstringFormats.RESTRUCTUREDTEXT;
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
        if (((RestructuredTextDocstringParser.ParamContext) ctx).name() != null) {
            parameter.parameterName = ((RestructuredTextDocstringParser.ParamContext) ctx).name().getText();
        }
        if (((RestructuredTextDocstringParser.ParamContext) ctx).variableDescription() != null) {
            parameter.parameterDescription = ((RestructuredTextDocstringParser.ParamContext) ctx).variableDescription().getText();
        }
        docstring.argumentsList.add(parameter);
    }

    public void exploreReturns(RuleContext ctx) {
        Return returnItem = new Return();
        if(((RestructuredTextDocstringParser.ReturnItemContext)ctx).name() != null) {
            returnItem.returnName = ((RestructuredTextDocstringParser.ReturnItemContext)ctx).name().getText();
        }
        if(((RestructuredTextDocstringParser.ReturnItemContext)ctx).variableDescription() != null) {
            returnItem.returnDescription = ((RestructuredTextDocstringParser.ReturnItemContext)ctx).variableDescription().getText();
        }
        docstring.returnsList.add(returnItem);
    }

    public void exploreRaises(RuleContext ctx) {
        Raise raiseItem = new Raise();
        if(((RestructuredTextDocstringParser.RaiseItemContext)ctx).name() != null) {
            raiseItem.raiseName = ((RestructuredTextDocstringParser.RaiseItemContext)ctx).name().getText();
        }
        if(((RestructuredTextDocstringParser.RaiseItemContext)ctx).variableDescription() != null) {
            raiseItem.raiseDescription = ((RestructuredTextDocstringParser.RaiseItemContext)ctx).variableDescription().getText();
        }
        docstring.raisesList.add(raiseItem);
    }
}
