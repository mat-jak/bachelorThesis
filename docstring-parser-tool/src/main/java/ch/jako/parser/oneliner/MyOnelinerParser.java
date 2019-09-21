package ch.jako.parser.oneliner;

import ch.jako.parser.MyErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

@SuppressWarnings("deprecation")
public class MyOnelinerParser {
    public static OnelinerParser parse(File f) {
        try {
            String content = FileUtils.readFileToString(f, UTF_8);
            MyErrorListener el = new MyErrorListener(f.getAbsolutePath());
            CharStream stream = new ANTLRInputStream(content);
            OnelinerLexer lexer = new OnelinerLexer(stream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(el);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            OnelinerParser parser = new OnelinerParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(el);
            return parser;
        } catch (IOException e) {
            System.out.println("THIS FILE IS NOT PARSEABLE");
            throw new RuntimeException(e);
        }
    }
}
