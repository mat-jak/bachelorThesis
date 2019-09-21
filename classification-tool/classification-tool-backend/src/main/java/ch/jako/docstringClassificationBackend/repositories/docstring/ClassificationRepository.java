package ch.jako.docstringClassificationBackend.repositories.docstring;

import ch.jako.docstringClassificationBackend.domain.docstring.Classification;
import ch.jako.docstringClassificationBackend.repositories.AbstractRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface ClassificationRepository extends AbstractRepository<Classification> {
}
