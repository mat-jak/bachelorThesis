package ch.jako.docstringClassificationBackend.dto.docstring;

import ch.jako.docstringClassificationBackend.domain.docstring.Classification;
import ch.jako.docstringClassificationBackend.domain.docstring.Docstring;
import ch.jako.docstringClassificationBackend.dto.AbstractDTO;
import ch.jako.docstringClassificationBackend.domain.user.User;
import ch.jako.docstringClassificationBackend.dto.user.UserDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class ClassificationDTO implements AbstractDTO {

    private Long id;

    private List<String> classes;

    private String comment;


    public ClassificationDTO(Classification classification) {
        this.id = classification.getId();
        this.classes = classification.getClasses();
        this.comment = classification.getComment();
    }
}
