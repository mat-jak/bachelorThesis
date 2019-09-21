package ch.jako.extractors;

import ch.jako.parser.epydoc.EpydocConverter;
import ch.jako.parser.google.GoogleDocstringConverter;
import ch.jako.parser.numpydoc.NumpydocConverter;
import ch.jako.parser.restructuredText.RstDocstingConverter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DocstringMetaModelJsonConverter {
    DocstringFormatReader formatReader = new DocstringFormatReader();
    GoogleDocstringConverter googleChecker = new GoogleDocstringConverter();
    NumpydocConverter numpydocConverter = new NumpydocConverter();
    RstDocstingConverter rstChecker = new RstDocstingConverter();
    EpydocConverter epydocConverter = new EpydocConverter();

    public File sourceFolder;

    /**
     * Class that runs the parsers and creates the json file from the obtained meta-model objects
     * @param sourceFolder folder that contains docstrings in .txt files
     */
    public DocstringMetaModelJsonConverter(File sourceFolder){
        this.sourceFolder = sourceFolder;
    }


    public void ConvertToJson(String outputPath) {

        formatReader.run(googleChecker, sourceFolder);
        formatReader.run(numpydocConverter, sourceFolder);
        formatReader.run(rstChecker, sourceFolder);
        formatReader.run(epydocConverter, sourceFolder);
        writeNotParsables(new File(outputPath, "notParsableDocstrings"));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String docstringsJson = gson.toJson(formatReader.docstrings);


        try     (FileWriter file = new FileWriter(outputPath+ "/metaModelDocstrings.json");
        BufferedWriter bufferedWriter = new BufferedWriter(file)) {

            bufferedWriter.write(docstringsJson);
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void writeNotParsables(File outputFile) {
        List<String> notParsables = new ArrayList<>();

        Set<String> distinct = new HashSet<>(formatReader.notParsables);

        for(String s: distinct) {
            if(Collections.frequency(formatReader.notParsables, s) == 4) {
                notParsables.add(s);
            }
        }

        try {
            FileUtils.writeLines(outputFile,"UTF-8", notParsables);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
