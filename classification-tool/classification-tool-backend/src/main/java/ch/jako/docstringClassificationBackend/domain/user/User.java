package ch.jako.docstringClassificationBackend.domain.user;

import ch.jako.docstringClassificationBackend.domain.AbstractDBEntity;
import ch.jako.docstringClassificationBackend.domain.docstring.Classification;
import ch.jako.docstringClassificationBackend.domain.docstring.Docstring;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;


import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain=true)
@Entity
@Table(name = "users")
public class User extends AbstractDBEntity {

    private String email;

    @Column(columnDefinition="text")
    private String comment;

    @Column(columnDefinition="text")
    private String missingCategory;

    @OneToMany(mappedBy = "user")
    private List<Classification> classificationList = new ArrayList<>();

    @JsonIgnore
    @ManyToMany(cascade = { CascadeType.ALL })
    private List<Docstring> docstringSample = new ArrayList<>();

    @JsonIgnore
    @ManyToMany(cascade = { CascadeType.ALL })
    private List<Docstring> classifiedDocstrings = new ArrayList<>();

    private String highestDegree;

    private String styleFormat;

    private int experience;

    private String selfAssessment;

    private String jobTitle;
}
