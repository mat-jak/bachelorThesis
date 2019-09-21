package ch.jako.parser.google;

import ch.jako.docstringFormats.DocstringFormats;
import ch.jako.docstringMetaModel.DocstringMetaModel;
import ch.jako.docstringMetaModel.Parameter;
import ch.jako.docstringMetaModel.Raise;
import ch.jako.docstringMetaModel.Return;
import ch.jako.parser.AbstractDocstringChecker;
import org.antlr.v4.runtime.tree.ParseTree;

public class GoogleListener extends GoogleDocstringBaseListener {

    public DocstringMetaModel docstring = new DocstringMetaModel();
    public Boolean parsable;

    @Override
    public void exitOneLiner(GoogleDocstringParser.OneLinerContext ctx) {
        docstring.hasShortSummary = true;
        docstring.shortSummary = docstring.shortSummary.concat(ctx.getText());
    }

    @Override
    public void enterDescription(GoogleDocstringParser.DescriptionContext ctx) {
        docstring.hasDescription = true;
        if(docstring.description.isEmpty()) {
            docstring.description = docstring.description.concat(ctx.getText());
        }
        else {
            docstring.description = docstring.description.concat("\n" + ctx.getText());
        }
    }

    @Override
    public void enterArgsComponent(GoogleDocstringParser.ArgsComponentContext ctx) {
        docstring.hasArgumentComponent = true;
        docstring.docstringFormat = DocstringFormats.GOOGLESTYLE;
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

    @Override
    public void enterRaiseComponent(GoogleDocstringParser.RaiseComponentContext ctx) {
        docstring.hasRaiseComponent = true;
        docstring.docstringFormat = DocstringFormats.GOOGLESTYLE;
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

    @Override
    public void enterReturnComponent(GoogleDocstringParser.ReturnComponentContext ctx) {
        docstring.hasReturnComponent = true;
        docstring.docstringFormat = DocstringFormats.GOOGLESTYLE;
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

    @Override
    public void enterAttributesComponent(GoogleDocstringParser.AttributesComponentContext ctx) {
        docstring.docstringFormat = DocstringFormats.GOOGLESTYLE;
    }
}
