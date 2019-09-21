package ch.jako.docstringClassificationBackend.services.user;

import ch.jako.docstringClassificationBackend.domain.docstring.Classification;
import ch.jako.docstringClassificationBackend.domain.docstring.Docstring;
import ch.jako.docstringClassificationBackend.dto.docstring.DocstringDTO;
import ch.jako.docstringClassificationBackend.dto.user.UserDTO;
import ch.jako.docstringClassificationBackend.repositories.docstring.ClassificationRepository;
import ch.jako.docstringClassificationBackend.repositories.docstring.DocstringRepository;
import ch.jako.docstringClassificationBackend.repositories.user.UserRepository;
import ch.jako.docstringClassificationBackend.services.AbstractService;
import ch.jako.docstringClassificationBackend.domain.user.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Log4j2
@Service
public class UserService extends AbstractService<User, UserRepository, UserDTO> {

    private final ClassificationRepository classificationRepository;
    private final DocstringRepository docstringRepository;

    @Autowired
    public UserService(UserRepository repository, ClassificationRepository classificationRepository, DocstringRepository docstringRepository) {
        super(repository);
        this.classificationRepository = classificationRepository;
        this.docstringRepository = docstringRepository;
    }

    public User create() {
        User user = new User();

        getRepository().save(user);

        return user;
    }

    public User assignDocstrings(User user, ArrayList<DocstringDTO> docstringDTOList) {
        if(user.getDocstringSample().isEmpty()) {
            List<Docstring> docstrings = new ArrayList<>();
            for (DocstringDTO docstringDTO : docstringDTOList) {
                Optional<Docstring> potentialDocstring = docstringRepository.findById(docstringDTO.getId());
                if (potentialDocstring.isPresent()) {
                    potentialDocstring.get().setTimesAssigned(potentialDocstring.get().getTimesAssigned() + 1);
                    docstringRepository.save(potentialDocstring.get());
                    docstrings.add(potentialDocstring.get());
                }
            }
            user.setDocstringSample(docstrings);
            getRepository().save(user);
        }
        else {
            for(DocstringDTO doc : docstringDTOList) {
                Optional<Docstring> potentialDocstring = docstringRepository.findById(doc.getId());
                if(potentialDocstring.isPresent()) {
                    potentialDocstring.get().setTimesAssigned(potentialDocstring.get().getTimesAssigned() + 1);
                    user.getDocstringSample().add(potentialDocstring.get());
                    docstringRepository.save(potentialDocstring.get());
                }
            }
            getRepository().save(user);
        }

        return user;
    }

    public User update(User user, UserDTO userDTO) {
        user.setEmail(userDTO.getEmail());
        user.setComment(userDTO.getComment());
        user.setMissingCategory(userDTO.getMissingCategory());

        getRepository().save(user);

        return user;
    }

    public User addClassification(User user, Docstring docstring) {
        user.getClassifiedDocstrings().add(docstring);

        getRepository().save(user);

        return user;
    }

    @Scheduled(fixedDelay=1500000)
    @Transactional
    public void checkCreatedDate() {
        List<User> users = findAll();
        ZonedDateTime date = ZonedDateTime.now();

        for(User user: users) {
            long between = ChronoUnit.SECONDS.between(user.getCreated(), date);
            if(between > (long)7200) {
                List<Docstring> docstrings = new ArrayList<>(user.getDocstringSample());
                docstrings.removeAll(user.getClassifiedDocstrings());
                if(!docstrings.isEmpty()) {
                    this.updateDocstringAssignment(docstrings, user);
                }
            }
        }
    }


    @Transactional
    public void updateDocstringAssignment(List<Docstring> docstringList, User user) {
        for(Docstring doc: docstringList) {
            Optional<Docstring> potentialDocstring = docstringRepository.findById(doc.getId());
            if(potentialDocstring.isPresent()) {
                potentialDocstring.get().setTimesAssigned(doc.getTimesAssigned() - 1);
                docstringRepository.save(potentialDocstring.get());
            }
        }
        List<Docstring> newDocstringSample = new ArrayList<>(user.getClassifiedDocstrings());
        user.setDocstringSample(newDocstringSample);
        getRepository().save(user);
    }

    public User updateDemography(User user, UserDTO userDTO) {
        user.setHighestDegree(userDTO.getHighestDegree());
        user.setStyleFormat(userDTO.getStyleFormat());
        user.setExperience(userDTO.getExperience());
        user.setSelfAssessment(userDTO.getSelfAssessment());
        user.setJobTitle(userDTO.getJobTitle());

        getRepository().save(user);

        return user;
    }
}
