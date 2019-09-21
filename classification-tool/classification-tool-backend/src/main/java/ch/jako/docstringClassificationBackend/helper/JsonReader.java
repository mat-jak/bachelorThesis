package ch.jako.docstringClassificationBackend.helper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.List;

public class JsonReader {

    private List<CreaterDocstring> createrDocstringList;


    public void readDocstringsFromJson() {

        try {
            InputStream ruleSet = ClassLoader.getSystemResourceAsStream("docstrings.json");
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(ruleSet));

                    ObjectMapper mapper = new ObjectMapper();

                    createrDocstringList = mapper.readValue(reader, new TypeReference<List<CreaterDocstring>>(){});

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
                catch(Exception e) {
            e.printStackTrace();
        }
            }

    public List<CreaterDocstring> getCreaterDocstringList() {
        return createrDocstringList;
    }

    public void setCreaterDocstringList(List<CreaterDocstring> createrDocstringList) {
        this.createrDocstringList = createrDocstringList;
    }
}
