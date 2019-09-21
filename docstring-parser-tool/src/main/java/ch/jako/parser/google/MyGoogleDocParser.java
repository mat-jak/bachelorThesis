package ch.jako.parser.google;

import ch.jako.docstringMetaModel.DocstringMetaModel;
import ch.jako.parser.MyErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

@SuppressWarnings("deprecation")
public class MyGoogleDocParser {

    public GoogleDocstringParser parse(File f) {
        try {
            String content = FileUtils.readFileToString(f, UTF_8);
            MyErrorListener el = new MyErrorListener(f.getAbsolutePath());
            CharStream stream = new ANTLRInputStream(content);
            GoogleDocstringLexer lexer = new GoogleDocstringLexer(stream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(el);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GoogleDocstringParser parser = new GoogleDocstringParser(tokens);
            /*ParseTree tree = parser.docstring();
            GoogleListener listener = new GoogleListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);*/
            parser.removeErrorListeners();
            parser.addErrorListener(el);
            return parser;
        } catch (IOException e) {
            System.out.println("THIS FILE IS NOT PARSEABLE");
            throw new RuntimeException(e);
        }
    }

}
