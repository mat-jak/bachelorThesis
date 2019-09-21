package ch.jako.parser.epydoc;

import java.util.ArrayList;
import java.util.List;

public class EpyDocstring {

    private List<String> params = new ArrayList<>();
    private List<String> paragraphs = new ArrayList<>();
    private List<String> returns = new ArrayList<>();
    private List<String> raises = new ArrayList<>();

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public List<String> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<String> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public List<String> getReturns() {
        return returns;
    }

    public void setReturns(List<String> returns) {
        this.returns = returns;
    }

    public List<String> getRaises() {
        return raises;
    }

    public void setRaises(List<String> raises) {
        this.raises = raises;
    }
}
