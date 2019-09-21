package ch.jako.docstringClassificationBackend.services.docstring;

import ch.jako.docstringClassificationBackend.domain.docstring.Docstring;
import ch.jako.docstringClassificationBackend.domain.docstring.DocstringContainerType;
import ch.jako.docstringClassificationBackend.domain.docstring.DocstringLengthCategory;
import ch.jako.docstringClassificationBackend.domain.user.User;
import ch.jako.docstringClassificationBackend.dto.docstring.DocstringDTO;
import ch.jako.docstringClassificationBackend.repositories.docstring.DocstringRepository;
import ch.jako.docstringClassificationBackend.services.AbstractService;
import ch.jako.docstringClassificationBackend.helper.CreaterDocstring;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Log4j2
@Service
public class DocstringService extends AbstractService<Docstring, DocstringRepository, DocstringDTO> {

    @Autowired
    public DocstringService(DocstringRepository repository) {
        super(repository);
    }


    public Docstring create(CreaterDocstring createrDocstring) {
        Docstring docstring = new Docstring();
        docstring.setUrl(createrDocstring.getUrl());
        docstring.setNumberOfLines(createrDocstring.getNumberOfLines());
        docstring.setStartLine(createrDocstring.getStartLine());
        docstring.setContent(createrDocstring.getContent());
        docstring.setDocstringContainerType(createrDocstring.getDocstringContainerType());
        docstring.setDocstringLengthCategory(createrDocstring.getDocstringLengthCategory());
        docstring.setTimesAssigned(0);
        getRepository();

        getRepository().save(docstring);

        return docstring;
    }

    public Docstring update(Docstring docstring, DocstringDTO docstringDTO) {
        docstring.setUrl(docstringDTO.getUrl());
        docstring.setNumberOfLines(docstringDTO.getNumberOfLines());
        docstring.setStartLine(docstringDTO.getStartLine());
        docstring.setDocstringContainerType(docstringDTO.getDocstringContainerType());
        docstring.setDocstringLengthCategory(docstringDTO.getDocstringLengthCategory());

        getRepository().save(docstring);

        return docstring;
    }

    public List<Docstring> getDocstringSample() {
        List<Docstring> docstringSample = new ArrayList<>();
        List<Docstring> classDocstrings = getRepository().findByDocstringContainerTypeOrderById(DocstringContainerType.CLASS);
        List<Docstring> moduleDocstrings = getRepository().findByDocstringContainerTypeOrderById(DocstringContainerType.MODULE);
        List<Docstring> oneLinerFunctionDocstrings = getRepository().findByDocstringLengthCategoryAndDocstringContainerTypeOrderById(DocstringLengthCategory.ONE_LINER, DocstringContainerType.FUNCTION);
        List<Docstring> shortFunctionDocstrings = getRepository().findByDocstringLengthCategoryAndDocstringContainerTypeOrderById(DocstringLengthCategory.SHORT, DocstringContainerType.FUNCTION);
        List<Docstring> mediumFunctionDocstrings = getRepository().findByDocstringLengthCategoryAndDocstringContainerTypeOrderById(DocstringLengthCategory.MEDIUM, DocstringContainerType.FUNCTION);
        List<Docstring> longFunctionDocstrings = getRepository().findByDocstringLengthCategoryAndDocstringContainerTypeOrderById(DocstringLengthCategory.LONG, DocstringContainerType.FUNCTION);

        for(Docstring doc: classDocstrings) {
            if(doc.getTimesAssigned() < 3 && docstringSample.size() < 2) {
                getRepository().save(doc);
                docstringSample.add(doc);
            }
            if (docstringSample.size() == 2) {
                break;
            }
        }
        if(docstringSample.size() < 2) {
            docstringSample = completeSample(classDocstrings, docstringSample, 2);
        }
        for(Docstring doc: moduleDocstrings) {
            if(doc.getTimesAssigned() < 3 && docstringSample.size() < 3) {
                getRepository().save(doc);
                docstringSample.add(doc);
            }
            if ( docstringSample.size() == 3) {
                break;
            }
        }
        if(docstringSample.size() < 3) {
            docstringSample = completeSample(moduleDocstrings, docstringSample, 3);
        }
        for(Docstring doc: oneLinerFunctionDocstrings) {
            if(doc.getTimesAssigned() < 3 && docstringSample.size() < 5) {
                getRepository().save(doc);
                docstringSample.add(doc);
            }
            if(docstringSample.size() == 5) {
                break;
            }
        }
        if(docstringSample.size() < 5) {
            docstringSample = completeSample(oneLinerFunctionDocstrings, docstringSample, 5);
        }
        for(Docstring doc: shortFunctionDocstrings) {
            if(doc.getTimesAssigned() < 3 && docstringSample.size() < 7) {
                getRepository().save(doc);
                docstringSample.add(doc);
            }
            if(docstringSample.size() == 7) {
                break;
            }
        }
        if(docstringSample.size() < 7) {
            docstringSample = completeSample(shortFunctionDocstrings, docstringSample, 7);
        }
        for(Docstring doc: mediumFunctionDocstrings) {
            if(doc.getTimesAssigned() < 3 && docstringSample.size() < 12) {
                getRepository().save(doc);
                docstringSample.add(doc);
            }
            if(docstringSample.size() == 12) {
                break;
            }
        }
        if(docstringSample.size() < 12) {
            docstringSample = completeSample(mediumFunctionDocstrings, docstringSample, 12);
        }
        for(Docstring doc: longFunctionDocstrings) {
            if(doc.getTimesAssigned() < 3 && docstringSample.size() < 15) {
                getRepository().save(doc);
                docstringSample.add(doc);
            }
            if(docstringSample.size() == 15) {
                break;
            }
        }
        if(docstringSample.size() < 15) {
            docstringSample = completeSample(longFunctionDocstrings, docstringSample, 15);
        }

        Collections.shuffle(docstringSample);

        return docstringSample;
    }

    public List<Docstring> getMoreDocstrings(User user) {
        List<Docstring> docstringSample = new ArrayList<>(user.getDocstringSample());
        List<Docstring> shortDocstrings = getRepository().findByDocstringLengthCategoryOrderById(DocstringLengthCategory.SHORT);
        List<Docstring> mediumDocstrings = getRepository().findByDocstringLengthCategoryOrderById(DocstringLengthCategory.MEDIUM);
        List<Docstring> longDocstrings = getRepository().findByDocstringLengthCategoryOrderById(DocstringLengthCategory.LONG);

        for(Docstring doc: shortDocstrings) {
            if(doc.getTimesAssigned() < 3 && docstringSample.size() < 1 && !user.getDocstringSample().contains(doc)) {
                getRepository().save(doc);
                docstringSample.add(doc);
            }
            if (docstringSample.size() == 1) {
                break;
            }
        }
        if(docstringSample.size() < 1) {
            docstringSample = completeSample(shortDocstrings, docstringSample, 1);
        }
        for(Docstring doc: mediumDocstrings) {
            if(doc.getTimesAssigned() < 3 && docstringSample.size() < 2 && !user.getDocstringSample().contains(doc)) {
                getRepository().save(doc);
                docstringSample.add(doc);
            }
            if ( docstringSample.size() == 2) {
                break;
            }
        }
        if(docstringSample.size() < 2) {
            docstringSample = completeSample(mediumDocstrings, docstringSample, 2);
        }
        for(Docstring doc: longDocstrings) {
            if(doc.getTimesAssigned() < 3 && docstringSample.size() < 3 && !user.getDocstringSample().contains(doc)) {
                getRepository().save(doc);
                docstringSample.add(doc);
            }
            if(docstringSample.size() == 3) {
                break;
            }
        }
        if(docstringSample.size() < 3) {
            docstringSample = completeSample(longDocstrings, docstringSample, 3);
        }
        Collections.shuffle(docstringSample);

        return docstringSample;
    }

    public static List<Docstring> completeSample(List<Docstring> sourceDocstrings, List<Docstring> docstrings, int maxSize) {
        Random rand = new Random();
        while(docstrings.size() < maxSize) {
            Docstring doc = sourceDocstrings.get(rand.nextInt(sourceDocstrings.size()));
            if(!docstrings.contains(doc)) {
                docstrings.add(doc);
            }
        }
        return docstrings;
    }
}
