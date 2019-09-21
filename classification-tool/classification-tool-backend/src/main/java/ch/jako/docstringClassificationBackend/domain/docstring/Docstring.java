package ch.jako.docstringClassificationBackend.domain.docstring;

import ch.jako.docstringClassificationBackend.domain.AbstractDBEntity;
import ch.jako.docstringClassificationBackend.domain.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain=true)
@Entity
@Table(name = "docstrings")
public class  Docstring extends AbstractDBEntity {

    @OneToMany(mappedBy = "docstring")
    private List<Classification> classificationList;

    @ManyToMany(mappedBy = "docstringSample", cascade = { CascadeType.ALL })
    private List<User> user;

    private String url;

    @Column(columnDefinition="text")
    private String content;

    private long numberOfLines;

    private int startLine;

    private DocstringContainerType docstringContainerType;

    private DocstringLengthCategory docstringLengthCategory;

    private int timesAssigned;

}
