package ch.jako.parser;

import ch.jako.docstringMetaModel.DocstringMetaModel;
import org.antlr.v4.runtime.RuleContext;

import java.io.File;

public interface IDocstringChecker {
    public void run(File f);

    public void readFile(File f);

    public void explore(RuleContext ctx, int indentation);
}
