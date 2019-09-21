package ch.jako.util;

import ch.jako.docstring.DocstringLengthCategory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DocstringHelper {

    /**
     * Method that returns the length category for functions
     * @param length long that describes the numbers of text
     * @return the docstring length category
     */
    public static DocstringLengthCategory setLengthCategoryFunction(long length) {
        if(length < 1) {
            return DocstringLengthCategory.NONE;
        }
        if(length == 1) {
            return DocstringLengthCategory.ONE_LINER;
        }
        else if(length < 4) {
            return DocstringLengthCategory.SHORT;
        }
        else if(length < 9) {
            return DocstringLengthCategory.MEDIUM;
        }
        else if(length < 21) {
            return DocstringLengthCategory.LONG;
        }
        else {
            return DocstringLengthCategory.VERY_LONG;
        }
    }

    /**
     * Method that returns the length category for classes
     * @param length long that describes the numbers of text
     * @return the docstring length category
     */
    public static DocstringLengthCategory setLengthCategoryClass(long length) {
        if(length < 1) {
            return DocstringLengthCategory.NONE;
        }
        if(length == 1) {
            return DocstringLengthCategory.ONE_LINER;
        }
        else if(length < 3) {
            return DocstringLengthCategory.SHORT;
        }
        else if(length < 8) {
            return DocstringLengthCategory.MEDIUM;
        }
        else if(length < 23) {
            return DocstringLengthCategory.LONG;
        }
        else {
            return DocstringLengthCategory.VERY_LONG;
        }
    }

    /**
     * Method that returns the length category for modules
     * @param length long that describes the numbers of text
     * @return the docstring length category
     */
    public static DocstringLengthCategory setLengthCategoryModule(long length) {
        if(length < 1) {
            return DocstringLengthCategory.NONE;
        }
        if(length == 1) {
            return DocstringLengthCategory.ONE_LINER;
        }
        else if(length < 4) {
            return DocstringLengthCategory.SHORT;
        }
        else if(length < 10) {
            return DocstringLengthCategory.MEDIUM;
        }
        else if(length < 28) {
            return DocstringLengthCategory.LONG;
        }
        else {
            return DocstringLengthCategory.VERY_LONG;
        }
    }

    /**
     * Determines the number of lines that contain text (lines that contain only triple quotes are not counted)
     * @param f file for which the line count is determined
     * @return line count
     */
    public static int getNumberOfLines(File f) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            int lines = 0;
            String line;
            while ((line = reader.readLine()) != null) {

                if (!line.matches("^\\s*\"\"\"\\s*$") && !line.matches("^\\s*'''\\s*$") && !line.matches("^\\s*$")) {
                    lines++;
                }
            }
            reader.close();
            return lines;
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
