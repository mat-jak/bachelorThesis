/**
 * Copyright 2019 Sebastian Proksch
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package ch.jako.parser.python;

import ch.jako.parser.MyErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

@SuppressWarnings("deprecation")
public class MyPython3Parser {

	public static Python3Parser parse(File f) {
		try {
			String content = FileUtils.readFileToString(f, UTF_8);
			MyErrorListener el = new MyErrorListener(f.getAbsolutePath());
			CharStream stream = new ANTLRInputStream(content + "\n");
			Python3Lexer lexer = new Python3Lexer(stream);
			lexer.removeErrorListeners();
			lexer.addErrorListener(el);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			Python3Parser parser = new Python3Parser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(el);
			return parser;
		} catch (IOException e) {
			System.out.println("THIS FILE IS NOT PARSEABLE");
			throw new RuntimeException(e);
		}
	}
}