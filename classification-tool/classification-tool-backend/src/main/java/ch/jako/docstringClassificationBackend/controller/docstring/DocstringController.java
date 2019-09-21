package ch.jako.docstringClassificationBackend.controller.docstring;

import ch.jako.docstringClassificationBackend.domain.docstring.Classification;
import ch.jako.docstringClassificationBackend.domain.docstring.Docstring;
import ch.jako.docstringClassificationBackend.domain.user.User;
import ch.jako.docstringClassificationBackend.dto.docstring.DocstringDTO;
import ch.jako.docstringClassificationBackend.repositories.user.UserRepository;
import ch.jako.docstringClassificationBackend.services.docstring.DocstringService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Log4j2
@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@RequestMapping(path = "/docstrings", produces = MediaType.APPLICATION_JSON_VALUE)
public class DocstringController {

    private final DocstringService docstringService;
    private final UserRepository userRepository;

    @GetMapping
    @Transactional
    public List<DocstringDTO> getAllDocstrings() {
        return docstringService.findAllAsDTO(DocstringDTO::new);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DocstringDTO> getDocstring(@PathVariable Long id) {
        Optional<Docstring> potentialDocstring = docstringService.findById(id);
        return potentialDocstring.map(docstring -> ResponseEntity.ok(new DocstringDTO(docstring))).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<DocstringDTO> updateDocstring(@PathVariable long id, DocstringDTO docstringDTO) {
        Optional<Docstring> potentialDocstring = docstringService.findById(id);
        return potentialDocstring.map(docstring -> ResponseEntity.ok(new DocstringDTO(docstringService.update(docstring, docstringDTO)))).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/sample")
    @Transactional
    public List<DocstringDTO> getDocstringSample() {
        return docstringService.getDocstringSample().stream().map(DocstringDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/{userId}/sample")
    @Transactional
    public ResponseEntity<List<DocstringDTO>> getMoreDocstrings(@PathVariable long userId) {
        Optional<User> potentialUser = userRepository.findById(userId);
        return potentialUser.map(user -> ResponseEntity.ok(docstringService.getMoreDocstrings(user).stream().map(DocstringDTO::new).collect(Collectors.toList()))).orElseGet(() -> ResponseEntity.notFound().build());
    }
}