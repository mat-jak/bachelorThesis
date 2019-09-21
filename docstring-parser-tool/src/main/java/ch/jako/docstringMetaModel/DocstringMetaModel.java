package ch.jako.docstringMetaModel;

import ch.jako.docstringFormats.DocstringFormats;
import ch.jako.docstring.DocstringContainerType;

import java.util.ArrayList;
import java.util.List;

public class DocstringMetaModel {
    public String content = "";
    public int numberOfLines = 0;
    public Boolean hasShortSummary = false;
    public String shortSummary = "";
    public Boolean hasDescription = false;
    public String description = "";
    public Boolean hasArgumentComponent = false;
    public List<Parameter> argumentsList = new ArrayList<>();
    public Boolean hasReturnComponent = false;
    public List<Return> returnsList = new ArrayList<>();
    public Boolean hasRaiseComponent = false;
    public List<Raise> raisesList = new ArrayList<>();
    public String sourceProject = "";
    public String relativePath = "";
    public DocstringFormats docstringFormat = null;
    public DocstringContainerType containerType;
}
