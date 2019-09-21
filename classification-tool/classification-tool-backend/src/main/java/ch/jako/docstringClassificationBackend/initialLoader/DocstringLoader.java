/*
package ch.jako.docstringClassificationBackend.initialLoader;

import ch.jako.docstringClassificationBackend.repositories.docstring.DocstringRepository;
import ch.jako.docstringClassificationBackend.services.docstring.DocstringService;
import ch.jako.docstringClassificationBackend.helper.CreaterDocstring;
import ch.jako.docstringClassificationBackend.helper.JsonReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DocstringLoader implements ApplicationRunner {

    private DocstringRepository docstringRepository;
    private DocstringService docstringService;
    public JsonReader jsonReader = new JsonReader();

    @Autowired
    public DocstringLoader(DocstringRepository docstringRepository, DocstringService docstringService) {
        this.docstringRepository = docstringRepository;
        this.docstringService = docstringService;
    }

    public void run(ApplicationArguments args) {
        jsonReader.readDocstringsFromJson();
        List<CreaterDocstring> createrDocstrings = jsonReader.getCreaterDocstringList();
        for(CreaterDocstring doc: createrDocstrings) {
            docstringService.create(doc);
        }
    }

}
*/
