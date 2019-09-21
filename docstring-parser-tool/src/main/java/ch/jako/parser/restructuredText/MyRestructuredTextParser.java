package ch.jako.parser.restructuredText;

import ch.jako.parser.MyErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

@SuppressWarnings("deprecation")
public class MyRestructuredTextParser {
    public static RestructuredTextDocstringParser parse(File f) {
        try {
            String content = FileUtils.readFileToString(f, UTF_8);
            MyErrorListener el = new MyErrorListener(f.getAbsolutePath());
            CharStream stream = new ANTLRInputStream(content + "\n");
            RestructuredTextDocstringLexer lexer = new RestructuredTextDocstringLexer(stream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(el);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RestructuredTextDocstringParser parser = new RestructuredTextDocstringParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(el);
            return parser;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
