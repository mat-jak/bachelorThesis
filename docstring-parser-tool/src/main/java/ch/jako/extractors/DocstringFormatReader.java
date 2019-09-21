package ch.jako.extractors;

import ch.jako.docstringMetaModel.DocstringMetaModel;
import ch.jako.docstring.DocstringContainerType;
import ch.jako.parser.AbstractDocstringChecker;
import ch.jako.util.DocstringHelper;
import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DocstringFormatReader {



    public List<DocstringMetaModel> docstrings = new ArrayList<>();
    public List<String> notParsables = new ArrayList<>();

    public List<DocstringMetaModel> run(AbstractDocstringChecker docstringChecker, File sourceFolder) {
        Iterator<File> fs = FileUtils.iterateFiles(sourceFolder, new String[]{"txt"}, true);
        while (fs.hasNext()) {
            File f = fs.next();
            docstringChecker.run(f);
            if(docstringChecker.parsable) {
                String relPath = f.getAbsolutePath().substring(sourceFolder.getAbsolutePath().length(), f.getAbsolutePath().length());
                docstringChecker.docstring.relativePath = relPath;
                String tmp = relPath.substring(1, relPath.length());
                docstringChecker.docstring.sourceProject = tmp.substring(0, tmp.indexOf(File.separator, tmp.indexOf(File.separator) + 1));
                docstringChecker.docstring.containerType = getContainerType(f);
                docstringChecker.docstring.numberOfLines = DocstringHelper.getNumberOfLines(f);
                updateDocstrings(docstringChecker.docstring);
            }
            else if(!docstringChecker.parsable){
                notParsables.add(f.getAbsolutePath().substring(sourceFolder.getAbsolutePath().length(), f.getAbsolutePath().length()));
            }
        }
        System.out.println(docstrings.size());
        return docstrings;
    }

    private DocstringContainerType getContainerType(File f) {
        switch(f.getParentFile().getName()) {
            case "function":
                return DocstringContainerType.FUNCTION;
            case "classes":
                return DocstringContainerType.CLASS;
            case "modules":
                return DocstringContainerType.MODULE;
            default:
                return DocstringContainerType.FUNCTION;
        }
    }

    private void updateDocstrings(DocstringMetaModel docstringMetaModel) {
        if(!isDuplicate(docstringMetaModel)) {
            docstrings.add(docstringMetaModel);
        }
    }

    private Boolean isDuplicate(DocstringMetaModel docstringMetaModel) {
        for(DocstringMetaModel doc : docstrings) {
            if(doc.relativePath.equals(docstringMetaModel.relativePath)) {
                if(doc.docstringFormat == null && docstringMetaModel.docstringFormat != null) {
                    docstrings.remove(doc);
                    return false;
                }
                return docstringMetaModel.docstringFormat == null;
            }
        }
        return false;
    }
}
