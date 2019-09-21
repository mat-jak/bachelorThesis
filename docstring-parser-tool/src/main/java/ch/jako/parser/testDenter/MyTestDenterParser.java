package ch.jako.parser.testDenter;

import ch.jako.parser.MyErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

public class MyTestDenterParser {
    public static testDenterParser parse(File f) {
        try {
            String content = FileUtils.readFileToString(f, UTF_8);
            MyErrorListener el = new MyErrorListener(f.getAbsolutePath());
            CharStream stream = new ANTLRInputStream(content + "\n");
            testDenterLexer lexer = new testDenterLexer(stream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(el);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            testDenterParser parser = new testDenterParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(el);
            return parser;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
