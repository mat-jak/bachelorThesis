package ch.jako.docstringClassificationBackend.helper;

import ch.jako.docstringClassificationBackend.domain.docstring.DocstringContainerImplementationType;
import ch.jako.docstringClassificationBackend.domain.docstring.DocstringContainerType;
import ch.jako.docstringClassificationBackend.domain.docstring.DocstringLengthCategory;

public class CreaterDocstring {
    private int startLine;
    private long numberOfLines;
    private DocstringContainerType docstringContainerType;
    private DocstringLengthCategory docstringLengthCategory;
    private String source;
    private String url;
    private String content;
    private String sourceFile;
    private String sourceProject;
    private DocstringContainerImplementationType docstringContainerImplementationType;

    public int getStartLine() {
        return startLine;
    }

    public void setStartLine(int startLine) {
        this.startLine = startLine;
    }

    public long getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(long numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public DocstringContainerType getDocstringContainerType() {
        return docstringContainerType;
    }

    public void setDocstringContainerType(DocstringContainerType docstringContainerType) {
        this.docstringContainerType = docstringContainerType;
    }

    public DocstringLengthCategory getDocstringLengthCategory() {
        return docstringLengthCategory;
    }

    public void setDocstringLengthCategory(DocstringLengthCategory docstringLengthCategory) {
        this.docstringLengthCategory = docstringLengthCategory;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public String getSourceProject() {
        return sourceProject;
    }

    public void setSourceProject(String sourceProject) {
        this.sourceProject = sourceProject;
    }

    public DocstringContainerImplementationType getDocstringContainerImplementationType() {
        return docstringContainerImplementationType;
    }

    public void setDocstringContainerImplementationType(DocstringContainerImplementationType docstringContainerImplementationType) {
        this.docstringContainerImplementationType = docstringContainerImplementationType;
    }
}
