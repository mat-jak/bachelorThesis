package ch.jako.parser;

import ch.jako.docstringMetaModel.Parameter;
import ch.jako.docstringMetaModel.Raise;
import ch.jako.docstringMetaModel.Return;
import ch.jako.parser.restructuredText.RstDocstingConverter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.util.List;


public class RstDocstringCheckerTest {

    public RstDocstingConverter rstDocstingConverter;

    @Before
    public void setUp() throws Exception {
        this.rstDocstingConverter = new RstDocstingConverter();
    }

    @Test
    public void parserTest() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File test = new File(classLoader.getResource("./testcases/resTTestDocstrings/working/1.txt").getFile());
        try {
            this.rstDocstingConverter.run(test);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Assert.assertTrue(rstDocstingConverter.parsable);

        File test2 = new File(classLoader.getResource("./testcases/resTTestDocstrings/working/2.txt").getFile());
        try {
            this.rstDocstingConverter.run(test2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Assert.assertTrue(rstDocstingConverter.parsable);

        File test3 = new File(classLoader.getResource("./testcases/resTTestDocstrings/notWorking/1.txt").getFile());
        try {
            this.rstDocstingConverter.run(test3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Assert.assertFalse(rstDocstingConverter.parsable);

        File test4 = new File(classLoader.getResource("./testcases/resTTestDocstrings/notWorking/2.txt").getFile());
        try {
            this.rstDocstingConverter.run(test4);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Assert.assertFalse(rstDocstingConverter.parsable);
    }

    @Test
    public void testContent() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File test = new File(classLoader.getResource("./testcases/resTTestDocstrings/working/1.txt").getFile());
        try {
            this.rstDocstingConverter.run(test);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        List<Parameter> parameters = removeParameterSpaces(rstDocstingConverter.docstring.argumentsList);
        List<Return> returns = removeReturnSpaces(rstDocstingConverter.docstring.returnsList);
        List<Raise> raises = removeRaiseSpaces(rstDocstingConverter.docstring.raisesList);
        String summary = replaceNewlinesAndWhiteSpaces(rstDocstingConverter.docstring.shortSummary);
        String description = replaceNewlinesAndWhiteSpaces(rstDocstingConverter.docstring.description);

        JSONParser parser = new JSONParser();

        File jsonTest =  new File(classLoader.getResource("./testcases/resTTestDocstrings/contentTest/1.json").getFile());
        try (FileReader reader = new FileReader(jsonTest))
        {
            Object obj =  parser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray paramArray = (JSONArray) jsonObject.get("argumentsList");
            JSONArray returnArray = (JSONArray) jsonObject.get("returnsList");
            JSONArray raiseArray = (JSONArray) jsonObject.get("raiseList");
            String jsonSummary = replaceNewlinesAndWhiteSpaces((String)jsonObject.get("shortSummary"));
            String jsondescription = replaceNewlinesAndWhiteSpaces((String)jsonObject.get("description"));

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
