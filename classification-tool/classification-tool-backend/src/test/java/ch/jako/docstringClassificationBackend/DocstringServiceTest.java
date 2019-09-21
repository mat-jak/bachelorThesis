package ch.jako.docstringClassificationBackend;

import ch.jako.docstringClassificationBackend.domain.docstring.Docstring;
import ch.jako.docstringClassificationBackend.domain.docstring.DocstringContainerType;
import ch.jako.docstringClassificationBackend.domain.docstring.DocstringLengthCategory;
import ch.jako.docstringClassificationBackend.domain.user.User;
import ch.jako.docstringClassificationBackend.dto.docstring.DocstringDTO;
import ch.jako.docstringClassificationBackend.helper.CreaterDocstring;
import ch.jako.docstringClassificationBackend.repositories.docstring.DocstringRepository;
import ch.jako.docstringClassificationBackend.services.docstring.ClassificationService;
import ch.jako.docstringClassificationBackend.services.docstring.DocstringService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class DocstringServiceTest {

    DocstringService service;

    @MockBean
    private DocstringRepository repository;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
        service = new DocstringService(repository);
    }

    @Test
    public void createTest() {
        CreaterDocstring createrDocstring = new CreaterDocstring();
        createrDocstring.setContent("'''Test'''");
        when(repository.save(any(Docstring.class))).then(returnsFirstArg());
        Docstring docstring = service.create(createrDocstring);
        Assert.assertEquals(docstring.getContent(), "'''Test'''");
    }

    @Test
    public void updateTest() {
        Docstring docstring = new Docstring();
        DocstringDTO docstringDTO = new DocstringDTO();
        docstringDTO.setUrl("new url");
        when(repository.save(any(Docstring.class))).then(returnsFirstArg());
        Docstring updateddocstring = service.update(docstring, docstringDTO);
        Assert.assertEquals(updateddocstring.getUrl(), "new url");
    }

    @Test
    public void getDocstringsampleTest() {
        List<Docstring> docstrings = new ArrayList<>();
        Docstring classifiedDocstring = new Docstring();
        classifiedDocstring.setTimesAssigned(3);
        docstrings.add(classifiedDocstring);
        int i;
        for(i=0; i<14; i++) {
            Docstring docstring = new Docstring();
            docstrings.add(docstring);
        }
        when(repository.findByDocstringContainerTypeOrderById(DocstringContainerType.CLASS)).thenReturn(docstrings.subList(0,2));
        when(repository.findByDocstringContainerTypeOrderById(DocstringContainerType.MODULE)).thenReturn(docstrings.subList(2,3));
        when(repository.findByDocstringLengthCategoryAndDocstringContainerTypeOrderById(DocstringLengthCategory.ONE_LINER, DocstringContainerType.FUNCTION)).thenReturn(docstrings.subList(3,5));
        when(repository.findByDocstringLengthCategoryAndDocstringContainerTypeOrderById(DocstringLengthCategory.SHORT, DocstringContainerType.FUNCTION)).thenReturn(docstrings.subList(5,7));
        when(repository.findByDocstringLengthCategoryAndDocstringContainerTypeOrderById(DocstringLengthCategory.MEDIUM, DocstringContainerType.FUNCTION)).thenReturn(docstrings.subList(7,12));
        when(repository.findByDocstringLengthCategoryAndDocstringContainerTypeOrderById(DocstringLengthCategory.LONG, DocstringContainerType.FUNCTION)).thenReturn(docstrings.subList(12,15));
        List<Docstring> resultDocstrings = service.getDocstringSample();
        Assert.assertEquals(resultDocstrings.size(), 15);
    }

    @Test
    public void getMoreDocstrings() {
        List<Docstring> docstrings = new ArrayList<>();
        User user = new User();
        int i;
        for(i=0; i<3; i++) {
            Docstring docstring = new Docstring();
            docstrings.add(docstring);
        }
        when(repository.findByDocstringLengthCategoryOrderById(DocstringLengthCategory.SHORT)).thenReturn(docstrings.subList(0,1));
        when(repository.findByDocstringLengthCategoryOrderById(DocstringLengthCategory.MEDIUM)).thenReturn(docstrings.subList(1,2));
        when(repository.findByDocstringLengthCategoryOrderById(DocstringLengthCategory.LONG)).thenReturn(docstrings.subList(2,3));

        List<Docstring> resultDocstrings = service.getMoreDocstrings(user);
        Assert.assertEquals(resultDocstrings.size(), 3);
    }
}
