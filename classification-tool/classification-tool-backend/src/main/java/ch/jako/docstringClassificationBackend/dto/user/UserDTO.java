package ch.jako.docstringClassificationBackend.dto.user;

import ch.jako.docstringClassificationBackend.domain.docstring.Classification;
import ch.jako.docstringClassificationBackend.domain.docstring.Docstring;
import ch.jako.docstringClassificationBackend.dto.AbstractDTO;
import ch.jako.docstringClassificationBackend.domain.user.User;
import ch.jako.docstringClassificationBackend.dto.docstring.ClassificationDTO;
import ch.jako.docstringClassificationBackend.dto.docstring.DocstringDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class UserDTO implements AbstractDTO {

    private Long id;

    private String email;

    private List<DocstringDTO> docstringSample;

    private List<ClassificationDTO> classificationDTOList;

    private String comment;

    private String missingCategory;

    private String highestDegree;

    private String styleFormat;

    private int experience;

    private String selfAssessment;

    private String jobTitle;


    public UserDTO(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.comment = user.getComment();
        this.highestDegree = user.getHighestDegree();
        this.styleFormat = user.getStyleFormat();
        this.experience = user.getExperience();
        this.selfAssessment = user.getSelfAssessment();
        this.jobTitle = user.getJobTitle();
        this.missingCategory = user.getMissingCategory();
        if(user.getDocstringSample() != null) {
            this.docstringSample = user.getDocstringSample().stream().map(DocstringDTO::new).collect(Collectors.toList());
        }
        if(user.getClassificationList() != null) {
            this.classificationDTOList = user.getClassificationList().stream().map(ClassificationDTO::new).collect(Collectors.toList());
        }
    }
}
