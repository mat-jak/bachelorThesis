package ch.jako.docstringClassificationBackend.repositories.docstring;

import ch.jako.docstringClassificationBackend.domain.docstring.Docstring;
import ch.jako.docstringClassificationBackend.domain.docstring.DocstringContainerType;
import ch.jako.docstringClassificationBackend.domain.docstring.DocstringLengthCategory;
import ch.jako.docstringClassificationBackend.repositories.AbstractRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface DocstringRepository extends AbstractRepository<Docstring> {

    public List<Docstring> findByDocstringLengthCategoryOrderById(DocstringLengthCategory categoty);

    public List<Docstring> findByDocstringContainerTypeOrderById(DocstringContainerType container);

    public List<Docstring> findByDocstringLengthCategoryAndDocstringContainerTypeOrderById(DocstringLengthCategory category, DocstringContainerType container);
}
