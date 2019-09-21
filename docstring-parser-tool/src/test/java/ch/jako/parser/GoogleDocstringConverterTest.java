package ch.jako.parser;

import ch.jako.docstringMetaModel.Parameter;
import ch.jako.docstringMetaModel.Raise;
import ch.jako.docstringMetaModel.Return;
import ch.jako.parser.google.GoogleDocstringConverter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class GoogleDocstringConverterTest {

    public GoogleDocstringConverter googleDocstringConverter;

    @Before
    public void setUp() throws Exception {
        this.googleDocstringConverter = new GoogleDocstringConverter();
    }

    @Test
    public void parserTest() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File test = new File(classLoader.getResource("./testcases/googleTestDocstrings/working/1.txt").getFile());
        try {
            this.googleDocstringConverter.run(test);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(googleDocstringConverter.parsable);

        File test2 = new File(classLoader.getResource("./testcases/googleTestDocstrings/working/2.txt").getFile());
        try {
            this.googleDocstringConverter.run(test2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Assert.assertTrue(googleDocstringConverter.parsable);

        File test3 = new File(classLoader.getResource("./testcases/googleTestDocstrings/notWorking/1.txt").getFile());
        try {
            this.googleDocstringConverter.run(test3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Assert.assertFalse(googleDocstringConverter.parsable);

        File test4 = new File(classLoader.getResource("./testcases/googleTestDocstrings/notWorking/2.txt").getFile());
        try {
            this.googleDocstringConverter.run(test4);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Assert.assertFalse(googleDocstringConverter.parsable);
    }

    @Test
    public void testContent() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File test = new File(classLoader.getResource("./testcases/googleTestDocstrings/working/1.txt").getFile());
        try {
            this.googleDocstringConverter.run(test);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        List<Parameter> parameters = removeParameterSpaces(googleDocstringConverter.docstring.argumentsList);
        List<Return> returns = removeReturnSpaces(googleDocstringConverter.docstring.returnsList);
        List<Raise> raises = removeRaiseSpaces(googleDocstringConverter.docstring.raisesList);
        String summary = replaceNewlinesAndWhiteSpaces(googleDocstringConverter.docstring.shortSummary);
        String description = replaceNewlinesAndWhiteSpaces(googleDocstringConverter.docstring.description);

        JSONParser parser = new JSONParser();

        File jsonTest =  new File(classLoader.getResource("./testcases/googleTestDocstrings/contentTest/1.json").getFile());
        try (FileReader reader = new FileReader("/Users/matej/Desktop/UZH/Bachelorarbeit/testcases/googleTestDocstrings/contentTest/1.json"))
        {
            Object obj =  parser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray paramArray = (JSONArray) jsonObject.get("argumentsList");
            JSONArray returnArray = (JSONArray) jsonObject.get("returnsList");
            JSONArray raiseArray = (JSONArray) jsonObject.get("raiseList");
            String jsonSummary = replaceNewlinesAndWhiteSpaces((String)jsonObject.get("shortSummary"));
            String jsondescription = replaceNewlinesAndWhiteSpaces((String)jsonObject.get("description"));

            System.out.println(jsonSummary);
            System.out.println(jsondescription);
            System.out.println(googleDocstringConverter.docstring.description);


            ObjectMapper objectMapper = new ObjectMapper();

            List<Parameter> paramList = objectMapper.readValue(paramArray.toString(), new TypeReference<List<Parameter>>(){});
            List<Return> returnList = objectMapper.readValue(returnArray.toString(), new TypeReference<List<Return>>(){});
            List<Raise> raiseList = objectMapper.readValue(raiseArray.toString(), new TypeReference<List<Raise>>(){});

            paramList = removeParameterSpaces(paramList);
            returnList = removeReturnSpaces(returnList);
            raiseList = removeRaiseSpaces(raiseList);

            for(int i = 0; i < parameters.size(); i++) {
                Assert.assertEquals(parameters.get(i).parameterName, paramList.get(i).parameterName);
                Assert.assertEquals(parameters.get(i).parameterDescription, paramList.get(i).parameterDescription);
            }
            for(int i = 0; i < returns.size(); i++) {
                Assert.assertEquals(returns.get(i).returnName, returnList.get(i).returnName);
                Assert.assertEquals(returns.get(i).returnDescription, returnList.get(i).returnDescription);
            }
            for(int i = 0; i < raises.size(); i++) {
                Assert.assertEquals(raises.get(i).raiseName, raiseList.get(i).raiseName);
                Assert.assertEquals(raises.get(i).raiseDescription, raiseList.get(i).raiseDescription);
            }
            Assert.assertEquals(summary, jsonSummary);
            Assert.assertEquals(description, jsondescription);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String replaceNewlinesAndWhiteSpaces(String s) {
        return s.replaceAll("(\\r\\n|\\r|\\n)", " ").replaceAll("\\s+", " ");
    }

    public List<Parameter> removeParameterSpaces(List<Parameter> paramList) {
        for(Parameter param: paramList) {
            param.parameterName = replaceNewlinesAndWhiteSpaces(param.parameterName);
            param.parameterDescription = replaceNewlinesAndWhiteSpaces(param.parameterDescription);
        }
        return paramList;
    }

    public List<Return> removeReturnSpaces(List<Return> returnList) {
        for(Return returnItem: returnList) {
            returnItem.returnName = replaceNewlinesAndWhiteSpaces(returnItem.returnName);
            returnItem.returnDescription = replaceNewlinesAndWhiteSpaces(returnItem.returnDescription);
        }
        return returnList;
    }

    public List<Raise> removeRaiseSpaces(List<Raise> raiseList) {
        for(Raise raiseItem: raiseList) {
            raiseItem.raiseName = replaceNewlinesAndWhiteSpaces(raiseItem.raiseName);
            raiseItem.raiseDescription = replaceNewlinesAndWhiteSpaces(raiseItem.raiseDescription);
        }
        return raiseList;
    }
}
