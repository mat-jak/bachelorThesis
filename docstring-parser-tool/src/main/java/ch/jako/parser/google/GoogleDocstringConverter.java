package ch.jako.parser.google;

import ch.jako.docstringFormats.DocstringFormats;
import ch.jako.docstringMetaModel.DocstringMetaModel;
import ch.jako.docstringMetaModel.Parameter;
import ch.jako.docstringMetaModel.Raise;
import ch.jako.docstringMetaModel.Return;
import ch.jako.parser.AbstractDocstringChecker;
import ch.jako.parser.IDocstringChecker;
import ch.jako.parser.epydoc.EpyDocstringParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;

public class GoogleDocstringConverter extends AbstractDocstringChecker {

    public void run(File f) {
        docstring = new DocstringMetaModel();
        parsable = true;
        readFile(f);
    }

    public void readFile(File testFile) {
        MyGoogleDocParser myParser = new MyGoogleDocParser();
        try {

            GoogleDocstringParser parser = myParser.parse(testFile);
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
        String ruleName = GoogleDocstringParser.ruleNames[ctx.getRuleIndex()];

        if(ctx instanceof GoogleDocstringParser.DocstringContext) {
            docstring.content = ctx.getText();
        }

        if(ctx instanceof GoogleDocstringParser.OneLinerContext) {
            docstring.hasShortSummary = true;
            docstring.shortSummary = docstring.shortSummary.concat(ctx.getText());
            if(ctx.getText().contains("return") || ctx.getText().contains("Return") || ctx.getText().contains("yield") || ctx.getText().contains("Yield")) {
                docstring.hasReturnComponent = true;
                Return returnItem = new Return();
                returnItem.returnDescription = ctx.getText();
                docstring.returnsList.add(returnItem);
            }
        }
        if(ctx instanceof GoogleDocstringParser.DescriptionContext) {
            //System.out.println(ctx.getText());
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if(ctx instanceof GoogleDocstringParser.AttributesComponentContext) {
            docstring.docstringFormat = DocstringFormats.GOOGLESTYLE;
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if(ctx instanceof GoogleDocstringParser.OtherSectionsContext) {
            docstring.docstringFormat = DocstringFormats.GOOGLESTYLE;
            docstring.hasDescription = true;
            if(docstring.description.isEmpty()) {
                docstring.description = docstring.description.concat(ctx.getText());
            }
            else {
                docstring.description = docstring.description.concat("\n" + ctx.getText());
            }
        }

        if( ctx instanceof GoogleDocstringParser.ArgsComponentContext) {
            docstring.hasArgumentComponent = true;
            docstring.docstringFormat = DocstringFormats.GOOGLESTYLE;
            exploreArguments(ctx);
        }

        if(ctx instanceof GoogleDocstringParser.ReturnComponentContext) {
            docstring.hasReturnComponent = true;
            docstring.docstringFormat = DocstringFormats.GOOGLESTYLE;
            exploreReturns(ctx);
        }

        if(ctx instanceof GoogleDocstringParser.RaiseComponentContext) {
            docstring.hasRaiseComponent = true;
            docstring.docstringFormat = DocstringFormats.GOOGLESTYLE;
            exploreRaises(ctx);
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

    public void exploreArguments(RuleContext ctx) {
        for(int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if(element instanceof GoogleDocstringParser.ArgsContext) {
                Parameter parameter = new Parameter();
                parameter.parameterName = parameter.parameterName.concat(((GoogleDocstringParser.ArgsContext) element).argName().getText());
                parameter.parameterDescription = parameter.parameterDescription.concat(((GoogleDocstringParser.ArgsContext) element).argDescription().getText());
                docstring.argumentsList.add(parameter);
            }
            else if(element instanceof GoogleDocstringParser.ArgDescriptionContext) {
                Parameter parameter = new Parameter();
                parameter.parameterDescription = parameter.parameterDescription.concat(element.getText());
                docstring.argumentsList.add(parameter);
            }
        }
    }


    public void exploreReturns(RuleContext ctx) {
        for(int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if(element instanceof GoogleDocstringParser.ReturnObjectContext) {
                Return returnItem = new Return();
                returnItem.returnName = returnItem.returnName.concat(((GoogleDocstringParser.ReturnObjectContext) element).returnName().getText());
                returnItem.returnDescription = returnItem.returnDescription.concat(((GoogleDocstringParser.ReturnObjectContext) element).returnDescription().getText());
                docstring.returnsList.add(returnItem);
            }
            else if(element instanceof GoogleDocstringParser.ReturnDescriptionContext) {
                Return returnItem = new Return();
                returnItem.returnDescription = returnItem.returnDescription.concat(element.getText());
                docstring.returnsList.add(returnItem);
            }
        }
    }


    public void exploreRaises(RuleContext ctx) {
        for(int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if(element instanceof GoogleDocstringParser.RaiseObjectContext) {
                Raise raiseItem = new Raise();
                raiseItem.raiseName = raiseItem.raiseName.concat(((GoogleDocstringParser.RaiseObjectContext) element).raiseName().getText());
                raiseItem.raiseDescription = raiseItem.raiseDescription.concat(((GoogleDocstringParser.RaiseObjectContext) element).raiseDescription().getText());
                docstring.raisesList.add(raiseItem);
            }
            else if(element instanceof GoogleDocstringParser.RaiseDescriptionContext) {
                Raise raiseItem = new Raise();
                raiseItem.raiseDescription = raiseItem.raiseDescription.concat(element.getText());
                docstring.raisesList.add(raiseItem);
            }
        }
    }
}
