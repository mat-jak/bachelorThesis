package ch.jako.docstringClassificationBackend.domain.docstring;


import ch.jako.docstringClassificationBackend.domain.AbstractDBEntity;
import ch.jako.docstringClassificationBackend.domain.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Data
@Accessors(chain=true)
@Entity
@Table(name = "classifications")
public class Classification extends AbstractDBEntity {

    @ElementCollection
    private List<String> classes;

    @Column(columnDefinition="text")
    private String comment;

    @JsonIgnore
    @ManyToOne
    private Docstring docstring;

    @JsonIgnore
    @ManyToOne
    private User user;
}
