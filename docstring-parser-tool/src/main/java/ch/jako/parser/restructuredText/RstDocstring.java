package ch.jako.parser.restructuredText;

import java.util.ArrayList;
import java.util.List;

public class RstDocstring {

    private List<String> paragraphs = new ArrayList<>();
    private List<String> literalBlocks = new ArrayList<>();
    private List<String> unorderedLists = new ArrayList<>();
    private List<String> orderedLists = new ArrayList<>();
    private List<String> directives = new ArrayList<>();
    private List<String> headers = new ArrayList<>();
    private List<String> params = new ArrayList<>();


    public List<String> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<String> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public List<String> getLiteralBlocks() {
        return literalBlocks;
    }

    public void setLiteralBlocks(List<String> literalBlock) {
        this.literalBlocks = literalBlock;
    }

    public List<String> getUnorderedLists() {
        return unorderedLists;
    }

    public void setUnorderedLists(List<String> unorderedList) {
        this.unorderedLists = unorderedList;
    }

    public List<String> getOrderedLists() {
        return orderedLists;
    }

    public void setOrderedLists(List<String> orderedList) {
        this.orderedLists = orderedList;
    }

    public List<String> getDirectives() {
        return directives;
    }

    public void setDirectives(List<String> directives) {
        this.directives = directives;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }
}
