package ch.jako.docstringClassificationBackend.services.docstring;

import ch.jako.docstringClassificationBackend.domain.docstring.Classification;
import ch.jako.docstringClassificationBackend.domain.docstring.Docstring;
import ch.jako.docstringClassificationBackend.domain.user.User;
import ch.jako.docstringClassificationBackend.dto.docstring.ClassificationDTO;
import ch.jako.docstringClassificationBackend.repositories.docstring.ClassificationRepository;
import ch.jako.docstringClassificationBackend.repositories.docstring.DocstringRepository;
import ch.jako.docstringClassificationBackend.repositories.user.UserRepository;
import ch.jako.docstringClassificationBackend.services.AbstractService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@Service
public class ClassificationService extends AbstractService<Classification, ClassificationRepository, ClassificationDTO> {

    private final DocstringRepository docstringRepository;
    private final UserRepository userRepository;

    @Autowired
    public ClassificationService(ClassificationRepository repository, DocstringRepository docstringRepository, UserRepository userRepository) {
        super(repository);
        this.docstringRepository = docstringRepository;
        this.userRepository = userRepository;
    }

    public Classification create(ClassificationDTO classificationDTO) {
        Classification classification = new Classification();
        classification.setClasses(classificationDTO.getClasses());
        classification.setComment(classificationDTO.getComment());

        getRepository().save(classification);

        return classification;
    }

    public Classification update(Classification classification, ClassificationDTO classificationDTO) {
        classification.setClasses(classificationDTO.getClasses());
        classification.setComment(classificationDTO.getComment());

        getRepository().save(classification);

        return classification;
    }

    public Boolean assignDocstring(Classification classification, Long docstringId) {

        Optional<Docstring> potentialDocstring = docstringRepository.findById(docstringId);
        if(potentialDocstring.isPresent()) {
            classification.setDocstring(potentialDocstring.get());
            getRepository().save(classification);
            docstringRepository.save(potentialDocstring.get());
            return true;
        }
        return false;
    }

    public Boolean assignUser(Classification classification, Long userId) {
        Optional<User> potentialUser = userRepository.findById(userId);
        if(potentialUser.isPresent()) {
            classification.setUser(potentialUser.get());
            getRepository().save(classification);
            userRepository.save(potentialUser.get());
            return true;
        }
        return false;
    }
}
