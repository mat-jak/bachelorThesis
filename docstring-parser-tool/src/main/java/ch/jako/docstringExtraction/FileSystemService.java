package ch.jako.docstringExtraction;

import ch.jako.docstring.Docstring;
import ch.jako.docstring.DocstringContainerImplementationType;
import ch.jako.docstring.DocstringContainerType;
import ch.jako.docstring.DocstringLengthCategory;
import ch.jako.util.DocstringHelper;
import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class FileSystemService {

    private DocstringExtractor docstringExtractor = new DocstringExtractor();
    private List<Docstring> docstringList = new ArrayList<>();

    /**
     * Finds all docstrings contained in a folder, extracts them and writes them to .txt files by keeping
     * the relative path similar and adding information about source file, container type, and the position in the source code.
     * @param oldRepo Folder from which docstrings are extracted
     * @param newRepo Base folder to which the .txt file, that contain the individual docstrings, are moved.
     */
    public void run(File oldRepo, File newRepo) {
        MoveAllDocstringsToNewRepo(oldRepo, newRepo);
    }

    private void MoveAllDocstringsToNewRepo(File oldRepo, File newRepo) {
        Iterator<File> fs = FileUtils.iterateFiles(oldRepo, new String[]{"py"}, true);

        while (fs.hasNext()) {
            File f = fs.next();
            moveDocstringsToTextFiles(f, oldRepo, newRepo);
        }

    }

    private void moveDocstringsToTextFiles(File f, File oldRepo, File newRepo) {
        docstringExtractor.readFile(f);
        List<Docstring> docstrings = docstringExtractor.getDocstrings();
        if (docstrings.isEmpty()) {
            return;
        }
        String shortName = f.getAbsolutePath().replace(oldRepo.getAbsolutePath() + File.separator, "");
        int lastOccurrence = f.getAbsolutePath().lastIndexOf(File.separator);
        String pathToFile = shortName.substring(0, shortName.lastIndexOf(File.separator)+1);
        String tmp = shortName.substring(1, shortName.length());
        String sourceProject = tmp.substring(0, tmp.indexOf(File.separator, tmp.indexOf(File.separator) + 1));
        String lastRepoName = f.getAbsolutePath().substring(lastOccurrence+1, f.getAbsolutePath().length()-3);
        String newRelativePath = pathToFile + lastRepoName;
        File newPath = new File(newRepo, newRelativePath);
        File newRepoClass = new File(newPath, "classes");
        File newRepoFunc = new File(newPath, "functions");
        File newRepoModule = new File(newPath, "modules");
        for(Docstring doc : docstrings) {
            String docstringUrl = newRelativePath.replaceAll(Pattern.quote(File.separator), "/") + ".py";
            doc.sourceProject = sourceProject;
            doc.url = ("https://github.com/" + docstringUrl);
            doc.source = shortName;
            doc.sourceFile = f.getName();
            if(this.checkIfTest(doc)) {
                doc.docstringContainerImplementationType = DocstringContainerImplementationType.TEST;
            }
            else {
                doc.docstringContainerImplementationType = DocstringContainerImplementationType.IMPLEMENTATION;
            }
            docstringList.add(doc);
            if (doc.docstringContainerType.equals(DocstringContainerType.MODULE)) {
                try {
                    File moduleDocstring = new File(newRepoModule, doc.startLine + ".txt");
                    FileUtils.writeStringToFile(moduleDocstring, doc.content, Charset.forName("UTF-8"));
                    doc.numberOfLines = DocstringHelper.getNumberOfLines(moduleDocstring);
                    doc.docstringLengthCategory = DocstringHelper.setLengthCategoryModule(doc.numberOfLines);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (doc.docstringContainerType.equals(DocstringContainerType.CLASS)) {
                try {
                    File classDocstring = new File(newRepoClass, doc.startLine + ".txt");
                    FileUtils.writeStringToFile(classDocstring, doc.content, Charset.forName("UTF-8"));
                    doc.numberOfLines = DocstringHelper.getNumberOfLines(classDocstring);
                    doc.docstringLengthCategory = DocstringHelper.setLengthCategoryClass(doc.numberOfLines);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (doc.docstringContainerType.equals(DocstringContainerType.FUNCTION)) {
                try {
                    File functionDocstring = new File(newRepoFunc, doc.startLine + ".txt");
                    FileUtils.writeStringToFile(functionDocstring, doc.content, Charset.forName("UTF-8"));
                    doc.numberOfLines = DocstringHelper.getNumberOfLines(functionDocstring);
                    doc.docstringLengthCategory = DocstringHelper.setLengthCategoryFunction(doc.numberOfLines);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }



    private Boolean checkIfTest(Docstring docstring) {
        return docstring.sourceFile.matches(".*test.*") || docstring.sourceFile.matches(".*Test.*") || docstring.sourceFile.matches(".*TEST.*");
    }

    public List<Docstring> getDocstringList() {
        return docstringList;
    }

    public void setDocstringList(List<Docstring> docstringList) {
        this.docstringList = docstringList;
    }


}
