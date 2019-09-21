package ch.jako.parser.oneliner;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;

public class OnelinerChecker {
    public void run(File f) {
        readFile(f);
    }

    public void readFile(File testFile) {
        MyOnelinerParser myParser = new MyOnelinerParser();

        try {
            OnelinerParser parser = myParser.parse(testFile);
            //System.out.println(parser.docstring().children);
            //print(parser.oneliner());
        }
        catch (Exception e) {
            System.out.println("NOT A ONELINER");
            //throw new RuntimeException(e);
        }

    }

    public void print(RuleContext ctx) {
        explore(ctx, 0);
    }

    private void explore(RuleContext ctx, int indentation) {
        String ruleName = OnelinerParser.ruleNames[ctx.getRuleIndex()];
        for (int i = 0; i < indentation; i++) {
            System.out.print("  ");
        }
        System.out.println(ruleName);


        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);

            if (element instanceof RuleContext) {
                explore((RuleContext)element, indentation + 1);
            }
        }
    }
}
