package ch.jako.docstringClassificationBackend.controller.docstring;

import ch.jako.docstringClassificationBackend.domain.docstring.Classification;
import ch.jako.docstringClassificationBackend.dto.docstring.ClassificationDTO;
import ch.jako.docstringClassificationBackend.dto.docstring.DocstringDTO;
import ch.jako.docstringClassificationBackend.dto.user.UserDTO;
import ch.jako.docstringClassificationBackend.services.docstring.ClassificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Log4j2
@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@RequestMapping(path = "/classifications", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClassificationController {

    private final ClassificationService classificationService;

    @GetMapping
    @Transactional
    public List<ClassificationDTO> getAllClassifications() {
        return classificationService.findAllAsDTO(ClassificationDTO::new);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClassificationDTO> getClassification(@PathVariable long id) {
        Optional<Classification> potentialClassification = classificationService.findById(id);
        return potentialClassification.map(classification -> ResponseEntity.ok(new ClassificationDTO(classification))).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClassificationDTO> updateClassification(@PathVariable long id, @RequestBody ClassificationDTO classificationDTO) {
        Optional<Classification> potentialClassification = classificationService.findById(id);
        return potentialClassification.map(classification -> ResponseEntity.ok(new ClassificationDTO(classificationService.update(classification, classificationDTO)))).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    @Transactional
    public ClassificationDTO createClassification(@RequestBody ClassificationDTO classificationDTO) {
        Classification classification = classificationService.create(classificationDTO);
        return new ClassificationDTO(classification);
    }

    @PutMapping("/{id}/docstrings/assign")
    @Transactional
    public ResponseEntity assignDocstring(@PathVariable Long id, @RequestBody DocstringDTO docstringDTO) {
        Optional<Classification> potentialClassification = classificationService.findById(id);
        if(potentialClassification.isPresent()) {
            return classificationService.assignDocstring(potentialClassification.get(), docstringDTO.getId()) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}/users/assign")
    @Transactional
    public ResponseEntity assignUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        Optional<Classification> potentialClassification = classificationService.findById(id);
        if(potentialClassification.isPresent()) {
            return classificationService.assignUser(potentialClassification.get(), userDTO.getId()) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
        }
        return ResponseEntity.notFound().build();
    }
}
