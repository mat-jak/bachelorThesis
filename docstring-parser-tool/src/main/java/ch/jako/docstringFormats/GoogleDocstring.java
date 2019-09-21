package ch.jako.docstringFormats;

import ch.jako.docstringMetaModel.Parameter;
import ch.jako.docstringMetaModel.Raise;
import ch.jako.docstringMetaModel.Return;

import java.util.ArrayList;
import java.util.List;

public class GoogleDocstring {
    
    
    public Boolean hasShortSummary;
    public String shortSummary = "";
    public Boolean hasDescription;
    public String description = "";
    public Boolean hasArgumentComponent;
    public List<Parameter> argumentsList = new ArrayList<>();
    public Boolean hasReturnComponent;
    public List<Return> returnsList = new ArrayList<>();
    public Boolean hasRaiseComponent;
    public List<Raise> raisesList = new ArrayList<>();
    public String sourceProject = "";
    public String sourceFile = "";
    public String relativePath = "";
}
