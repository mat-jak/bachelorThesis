package ch.jako.docstringExtraction;

import ch.jako.docstring.Docstring;
import ch.jako.docstring.DocstringContainerType;
import ch.jako.parser.python.MyPython3Parser;
import ch.jako.parser.python.Python3Parser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DocstringExtractor {

    public List<Docstring> docstrings = new ArrayList<>();

    /**
     * Method that extracts all docstrings from the input Python file
     * @param f file from which Python docstrings will be extracted
     */
    public void readFile(File f) {
        this.docstrings.clear();
        MyPython3Parser myParser = new MyPython3Parser();
        try {
            Python3Parser parser = myParser.parse(f);
            print(parser.file_input());

        }
        catch (RuntimeException e){
            System.out.println("Not a regular Python file");
        }
    }

    private void print(RuleContext ctx) {
        moduleExplorer(ctx);
        explore(ctx, 0);
    }

    private void explore(RuleContext ctx, int indentation) {
        /*String ruleName = Python3Parser.ruleNames[ctx.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                System.out.print("  ");
            }
            System.out.println(ruleName);*/

        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof Python3Parser.FuncdefContext) {
                functionExplorer((RuleContext) element);
                return;
            }
            if (element instanceof Python3Parser.ClassdefContext) {
                classExplorer((RuleContext) element);
            }
            if (element instanceof RuleContext) {
                explore((RuleContext)element, indentation + 1);
            }
        }
    }

    private void moduleExplorer(RuleContext ctx) {
        ParseTree element = null;
        if(ctx instanceof Python3Parser.File_inputContext) {
            for (int i=0;i<ctx.getChildCount();i++) {
                if(ctx.getChild(i) instanceof RuleContext) {
                    element = ctx.getChild(i);
                    break;
                }
            }
        }
        if(element instanceof Python3Parser.StmtContext) {
            moduleExplorer((Python3Parser.StmtContext) element);
        }

        if (ctx instanceof Python3Parser.Simple_stmtContext) {
            moduleExplorer((RuleContext)ctx.getChild(0));
        }

        else if(ctx.getChildCount() == 1 && !(ctx instanceof Python3Parser.AtomContext) && ctx.getChild(0) instanceof RuleContext && !(ctx instanceof Python3Parser.FuncdefContext) && !(ctx instanceof Python3Parser.ClassdefContext)) {
            moduleExplorer((RuleContext) ctx.getChild(0));
        }
        if (ctx instanceof Python3Parser.AtomContext && ctx.getChildCount() == 1 && (ctx.getText().startsWith("'''") || ctx.getText().startsWith("\"\"\""))) {
            Docstring docstring = new Docstring();
            docstring.content = ctx.getText();
            docstring.startLine = ((Python3Parser.AtomContext) ctx).getStart().getLine();
            docstring.docstringContainerType = DocstringContainerType.MODULE;
            this.docstrings.add(docstring);

        }


    }

    private void classExplorer(RuleContext ctx) {
        if (ctx instanceof Python3Parser.ClassdefContext) {
            classExplorer((Python3Parser.StmtContext)((Python3Parser.ClassdefContext) ctx).suite().stmt(0));
        }

        if (ctx instanceof Python3Parser.Simple_stmtContext) {
            classExplorer((RuleContext)ctx.getChild(0));
        }
        if(ctx.getChildCount() == 1 && !(ctx instanceof Python3Parser.AtomContext) && ctx.getChild(0) instanceof RuleContext) {
            classExplorer((RuleContext) ctx.getChild(0));
        }

        if (ctx instanceof Python3Parser.AtomContext && ctx.getChildCount() == 1 && (ctx.getText().startsWith("'''") || ctx.getText().startsWith("\"\"\""))) {
            Docstring docstring = new Docstring();
            docstring.content = ctx.getText();
            docstring.startLine = ((Python3Parser.AtomContext) ctx).getStart().getLine();
            docstring.docstringContainerType = DocstringContainerType.CLASS;
            this.docstrings.add(docstring);

        }
    }


    private void functionExplorer(RuleContext ctx) {
        if (ctx instanceof Python3Parser.FuncdefContext) {
            functionExplorer((Python3Parser.StmtContext)((Python3Parser.FuncdefContext) ctx).suite().stmt(0));
        }

        if (ctx instanceof Python3Parser.Simple_stmtContext) {
            functionExplorer((RuleContext)ctx.getChild(0));
        }
        if(ctx.getChildCount() == 1 && !(ctx instanceof Python3Parser.AtomContext) && ctx.getChild(0) instanceof RuleContext) {
            functionExplorer((RuleContext) ctx.getChild(0));
        }

        if (ctx instanceof Python3Parser.AtomContext && ctx.getChildCount() == 1 && (ctx.getText().startsWith("'''") || ctx.getText().startsWith("\"\"\""))) {
            Docstring docstring = new Docstring();
            docstring.content = ctx.getText();
            docstring.startLine = ((Python3Parser.AtomContext) ctx).getStart().getLine();
            docstring.docstringContainerType = DocstringContainerType.FUNCTION;
            this.docstrings.add(docstring);

        }
    }




    public List<Docstring> getDocstrings() {
        return this.docstrings;
    }

    public void setDocstrings(List<Docstring> docstrings) {
        this.docstrings = docstrings;
    }
}
