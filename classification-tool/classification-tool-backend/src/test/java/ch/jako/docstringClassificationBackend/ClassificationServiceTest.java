package ch.jako.docstringClassificationBackend;

import ch.jako.docstringClassificationBackend.domain.docstring.Classification;
import ch.jako.docstringClassificationBackend.domain.docstring.Docstring;
import ch.jako.docstringClassificationBackend.domain.user.User;
import ch.jako.docstringClassificationBackend.dto.docstring.ClassificationDTO;
import ch.jako.docstringClassificationBackend.repositories.docstring.ClassificationRepository;
import ch.jako.docstringClassificationBackend.repositories.docstring.DocstringRepository;
import ch.jako.docstringClassificationBackend.repositories.user.UserRepository;
import ch.jako.docstringClassificationBackend.services.docstring.ClassificationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class ClassificationServiceTest {

    ClassificationService service;

    @MockBean
    private ClassificationRepository repository;

    @MockBean
    private DocstringRepository docstringRepository;

    @MockBean
    private UserRepository userRepository;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
        service = new ClassificationService(repository, docstringRepository,userRepository);
    }

    @Test
    public void createTest() {
        ClassificationDTO classificationDTO = new ClassificationDTO();
        List<String> classes = new ArrayList<>();
        classes.add("Return value");
        classificationDTO.setClasses(classes);
        when(repository.save(any(Classification.class))).then(returnsFirstArg());
        Classification classification = service.create(classificationDTO);
        Assert.assertEquals(classification.getClasses().size(), 1);
    }

    @Test
    public void updateTest() {
        Classification classification = new Classification();
        ClassificationDTO classificationDTO = new ClassificationDTO();
        List<String> classes = new ArrayList<>();
        classes.add("General description");
        classificationDTO.setClasses(classes);
        when(repository.save(any(Classification.class))).then(returnsFirstArg());
        Classification updatedClassificaion = service.update(classification, classificationDTO);
        Assert.assertEquals(updatedClassificaion.getClasses().get(0), "General description");
    }

    @Test
    public void assignDocstringTest() {
        Docstring docstring = Mockito.mock(Docstring.class);
        docstring.setId(1L);
        Classification classification = new Classification();
        when(docstringRepository.findById(docstring.getId())).thenReturn((Optional.of(docstring)));
        when(docstringRepository.save(any(Docstring.class))).then(returnsFirstArg());
        when(repository.save(any(Classification.class))).then(returnsFirstArg());
        Boolean result = service.assignDocstring(classification, docstring.getId());
        Assert.assertTrue(result);
        Assert.assertNotNull(classification.getDocstring());
    }

    @Test
    public void assignUserTest() {
        User user = Mockito.mock(User.class);
        user.setId(1L);
        Classification classification = new Classification();
        when(userRepository.findById(user.getId())).thenReturn((Optional.of(user)));
        when(userRepository.save(any(User.class))).then(returnsFirstArg());
        when(repository.save(any(Classification.class))).then(returnsFirstArg());
        Boolean result = service.assignUser(classification, user.getId());
        Assert.assertTrue(result);
        Assert.assertNotNull(classification.getUser());
    }
}
