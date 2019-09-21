package ch.jako.docstringClassificationBackend.repositories.user;

import ch.jako.docstringClassificationBackend.repositories.AbstractRepository;
import ch.jako.docstringClassificationBackend.domain.user.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface UserRepository extends AbstractRepository<User> {
}
