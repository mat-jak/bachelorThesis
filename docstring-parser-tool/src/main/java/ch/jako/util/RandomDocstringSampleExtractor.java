package ch.jako.util;

import ch.jako.docstring.Docstring;
import ch.jako.docstring.DocstringContainerImplementationType;
import ch.jako.docstring.DocstringContainerType;
import ch.jako.docstring.DocstringLengthCategory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomDocstringSampleExtractor {

    /**
     * Method that creates a json file with randomly selected docstrings for the content classification,
     * and adheres to the defined distribution for the sample.
     *
     * @param docstringList list of docstrings from which the docstrings are extracted.
     * @param outputFile file to which the json objects are written.
     */
    public static void createJson(List<Docstring> docstringList, File outputFile) {
        Collections.shuffle(docstringList);
        List<Docstring> docstringsForJson = new ArrayList<>();
        docstringsForJson.addAll(findByLengthAndType(docstringList, DocstringLengthCategory.ONE_LINER, DocstringContainerType.FUNCTION, 120));
        docstringsForJson.addAll(findByLengthAndType(docstringList, DocstringLengthCategory.SHORT, DocstringContainerType.FUNCTION, 120));
        docstringsForJson.addAll(findByLengthAndType(docstringList, DocstringLengthCategory.MEDIUM, DocstringContainerType.FUNCTION, 300));
        docstringsForJson.addAll(findByLengthAndType(docstringList, DocstringLengthCategory.LONG, DocstringContainerType.FUNCTION, 180));
        docstringsForJson.addAll(findByLengthAndType(docstringList, DocstringLengthCategory.SHORT, DocstringContainerType.CLASS, 40));
        docstringsForJson.addAll(findByLengthAndType(docstringList, DocstringLengthCategory.MEDIUM, DocstringContainerType.CLASS, 40));
        docstringsForJson.addAll(findByLengthAndType(docstringList, DocstringLengthCategory.LONG, DocstringContainerType.CLASS, 40));
        docstringsForJson.addAll(findByLengthAndType(docstringList, DocstringLengthCategory.SHORT, DocstringContainerType.MODULE, 20));
        docstringsForJson.addAll(findByLengthAndType(docstringList, DocstringLengthCategory.MEDIUM, DocstringContainerType.MODULE, 20));
        docstringsForJson.addAll(findByLengthAndType(docstringList, DocstringLengthCategory.LONG, DocstringContainerType.MODULE, 20));



        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(docstringsForJson.size());

        String docstringsJson = gson.toJson(docstringsForJson);


        try     (FileWriter file = new FileWriter(outputFile);
                 BufferedWriter bufferedWriter = new BufferedWriter(file)) {

            bufferedWriter.write(docstringsJson);
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Docstring> findByLengthAndType(List<Docstring> docstrings, DocstringLengthCategory length, DocstringContainerType type, int amount) {
        Collections.shuffle(docstrings);
        List<Docstring> result = new ArrayList<>();
        for(Docstring doc: docstrings) {
            if(doc.docstringLengthCategory == length && doc.docstringContainerType == type && doc.docstringContainerImplementationType != DocstringContainerImplementationType.TEST) {
                result.add(doc);
                if(result.size() == amount) {
                    return result;
                }
            }
        }
        return result;
    }
}
