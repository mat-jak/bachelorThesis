package ch.jako.parser.testDenter;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;

public class DenterChecker {
    public void run(File f) {
        readFile(f);
    }

    public void readFile(File testFile) {
        MyTestDenterParser myParser = new MyTestDenterParser();

        try {
            testDenterParser parser = myParser.parse(testFile);
            //System.out.println(parser.test().children);
            print(parser.calculus());
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void print(RuleContext ctx) {
        explore(ctx, 0);
    }

    private void explore(RuleContext ctx, int indentation) {
        String ruleName = testDenterParser.ruleNames[ctx.getRuleIndex()];
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
