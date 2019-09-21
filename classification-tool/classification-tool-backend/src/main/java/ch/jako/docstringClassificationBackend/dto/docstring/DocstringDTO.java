package ch.jako.docstringClassificationBackend.dto.docstring;

import ch.jako.docstringClassificationBackend.domain.docstring.Classification;
import ch.jako.docstringClassificationBackend.domain.docstring.Docstring;
import ch.jako.docstringClassificationBackend.domain.docstring.DocstringContainerType;
import ch.jako.docstringClassificationBackend.domain.docstring.DocstringLengthCategory;
import ch.jako.docstringClassificationBackend.dto.AbstractDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class DocstringDTO implements AbstractDTO {

    private Long id;

    private List<ClassificationDTO> classificationDTOList;

    private String url;

    private String content;

    private long numberOfLines;

    private int startLine;

    private int timesAssigned;

    /*private List<String> classes = new ArrayList<>();*/

    private DocstringContainerType docstringContainerType;

    private DocstringLengthCategory docstringLengthCategory;


    public DocstringDTO(Docstring docstring) {
        this.id = docstring.getId();
        this.url = docstring.getUrl();
        this.content = docstring.getContent();
        this.numberOfLines = docstring.getNumberOfLines();
        this.startLine = docstring.getStartLine();
        this.docstringContainerType = docstring.getDocstringContainerType();
        this.docstringLengthCategory = docstring.getDocstringLengthCategory();
        this.timesAssigned = docstring.getTimesAssigned();
        if(docstring.getClassificationList() != null) {
            this.classificationDTOList = docstring.getClassificationList().stream().map(ClassificationDTO::new).collect(Collectors.toList());
        }
    }
}
