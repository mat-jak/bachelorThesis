package ch.jako.main;

import ch.jako.docstringExtraction.DocstringExtractor;
import ch.jako.docstringExtraction.FileSystemService;
import ch.jako.extractors.DocstringMetaModelJsonConverter;
import ch.jako.util.RandomDocstringSampleExtractor;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.*;

public class App {

    private static void logMem() {
        long maxMem = Runtime.getRuntime().maxMemory();
        float maxMemInMb = Math.round(maxMem * 1.0d / (1024 * 1024 * 1.0f));
        System.out.printf("maximum memory (-Xmx): %.0f MB\n", maxMemInMb);
    }

    public static List<File> findDirectoriesWithSameName(String name1, String name2, String name3, File root) {
        List<File> result = new ArrayList<>();

        for (File file : root.listFiles()) {
            if (file.isDirectory()) {
                if (file.getName().equals(name1) || file.getName().equals(name2) || file.getName().equals(name3)) {
                    result.add(file);
                }

                result.addAll(findDirectoriesWithSameName(name1, name2, name3, file));
            }
        }

        return result;
    }

    public static void main(String[] args) {
       logMem();
        File base = new File("/Users/matej/Desktop/UZH/Bachelorarbeit");
        File repos = new File(base, "repos");
        repos.mkdir();
        File work_directory = new File(base, "work_directory");
        work_directory.mkdir();


        FileSystemService fileSystemService = new FileSystemService();
        fileSystemService.run(repos, work_directory);

        DocstringMetaModelJsonConverter converter = new DocstringMetaModelJsonConverter(work_directory);
        converter.ConvertToJson("/Users/matej/Desktop/parserResults");




    }

}
