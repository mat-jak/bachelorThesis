package ch.jako.parser;

import ch.jako.docstringMetaModel.DocstringMetaModel;

public abstract class AbstractDocstringChecker implements IDocstringChecker {
    public DocstringMetaModel docstring = new DocstringMetaModel();
    public Boolean parsable;
}
