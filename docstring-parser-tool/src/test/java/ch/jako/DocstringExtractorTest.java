package ch.jako;

import ch.jako.docstring.Docstring;
import ch.jako.docstringExtraction.DocstringExtractor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocstringExtractorTest {

    DocstringExtractor extractor = new DocstringExtractor();
    File testSourceFile = new File("/Users/matej/Desktop/UZH/Bachelorarbeit/testcases/extractorTest/test.py");

    @Test
    public void extractorTest() {
        extractor.readFile(testSourceFile);
        Assert.assertEquals(extractor.docstrings.size(), 4);

        List<Docstring> docstrings = new ArrayList<>(extractor.docstrings);

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("/Users/matej/Desktop/UZH/Bachelorarbeit/testcases/extractorTest/docstrings.json"))
        {
            Object obj =  parser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray docstringsArray = (JSONArray) jsonObject.get("docstrings");

            ObjectMapper objectMapper = new ObjectMapper();

            List<String> docstringContentsList = objectMapper.readValue(docstringsArray.toString(), new TypeReference<List<String>>(){});

            for(int i = 0; i < docstrings.size(); i++) {
                Assert.assertEquals(docstrings.get(i).content, docstringContentsList.get(i));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
