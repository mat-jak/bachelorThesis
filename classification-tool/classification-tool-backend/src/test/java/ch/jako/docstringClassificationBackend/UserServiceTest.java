package ch.jako.docstringClassificationBackend;

import ch.jako.docstringClassificationBackend.domain.docstring.Docstring;
import ch.jako.docstringClassificationBackend.domain.user.User;
import ch.jako.docstringClassificationBackend.dto.docstring.DocstringDTO;
import ch.jako.docstringClassificationBackend.dto.user.UserDTO;
import ch.jako.docstringClassificationBackend.repositories.docstring.ClassificationRepository;
import ch.jako.docstringClassificationBackend.repositories.docstring.DocstringRepository;
import ch.jako.docstringClassificationBackend.repositories.user.UserRepository;
import ch.jako.docstringClassificationBackend.services.docstring.DocstringService;
import ch.jako.docstringClassificationBackend.services.user.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class UserServiceTest {

    UserService service;

    @MockBean
    private UserRepository repository;

    @MockBean
    private ClassificationRepository classificationRepository;

    @MockBean
    private DocstringRepository docstringRepository;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
        service = new UserService(repository, classificationRepository, docstringRepository);
    }

    @Test
    public void createTest() {
        User user = service.create();
        Assert.assertNotNull(user);
    }

    @Test
    public void updateTest() {
        User user = new User();
        UserDTO userDTO = new UserDTO();
        userDTO.setComment("test comment");
        userDTO.setEmail("test@mail.com");
        userDTO.setMissingCategory("none");
        when(repository.save(any(User.class))).then(returnsFirstArg());
        User updatedUser = service.update(user, userDTO);
        Assert.assertEquals(updatedUser.getComment(), "test comment");
        Assert.assertEquals(updatedUser.getEmail(), "test@mail.com");
        Assert.assertEquals(updatedUser.getMissingCategory(), "none");
    }

    @Test
    public void assignDocstringsEmptyTest() {
        User user = new User();
        ArrayList<DocstringDTO> docstrings = new ArrayList<>();
        DocstringDTO docstringDTO = new DocstringDTO();
        docstrings.add(docstringDTO);
        when(docstringRepository.findById(docstringDTO.getId())).thenReturn(Optional.of(new Docstring()));
        User updatedUser = service.assignDocstrings(user, docstrings);
        Assert.assertFalse(updatedUser.getDocstringSample().isEmpty());
    }

    @Test
    public void assignDocstringsFullTest() {
        User user = new User();
        ArrayList<Docstring> docstrings = new ArrayList<>();
        Docstring docstring = new Docstring();
        docstrings.add(docstring);

        ArrayList<DocstringDTO> docstringDTOs = new ArrayList<>();
        DocstringDTO docstringDTO = new DocstringDTO();
        docstringDTOs.add(docstringDTO);

        user.setDocstringSample(docstrings);
        when(docstringRepository.findById(docstringDTO.getId())).thenReturn(Optional.of(new Docstring()));
        User updatedUser = service.assignDocstrings(user, docstringDTOs);
        Assert.assertEquals(updatedUser.getDocstringSample().size() , 2);
    }

    @Test
    public void addClassificationTest() {
        User user = new User();
        Docstring docstring = new Docstring();
        when(repository.save(any(User.class))).then(returnsFirstArg());

        User updatedUser = service.addClassification(user, docstring);
        Assert.assertEquals(updatedUser.getClassifiedDocstrings().size(), 1);
    }

    @Test
    public void updateDemographyTest() {
        User user = new User();
        UserDTO userDTO = new UserDTO();
        userDTO.setExperience(2);
        userDTO.setHighestDegree("Bachelor's degree");

        User updatedUser = service.updateDemography(user, userDTO);
        Assert.assertEquals(updatedUser.getExperience(), 2);
        Assert.assertEquals(updatedUser.getHighestDegree(), "Bachelor's degree");
    }

    @Test
    public void updateDocstringAssignmentTest() {
        User user = new User();
        ArrayList<Docstring> docstrings = new ArrayList<>();
        Docstring docstring = new Docstring();
        docstring.setTimesAssigned(2);
        docstrings.add(docstring);
        user.setDocstringSample(docstrings);
        when(docstringRepository.findById(docstring.getId())).thenReturn(Optional.of(docstring));
        when(repository.save(user)).thenReturn(user);
        service.updateDocstringAssignment(docstrings, user);
        Assert.assertEquals(docstring.getTimesAssigned(), 1);
        Assert.assertTrue(user.getDocstringSample().isEmpty());

    }


}
