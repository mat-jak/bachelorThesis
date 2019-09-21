package ch.jako.docstringClassificationBackend.controller.user;

import ch.jako.docstringClassificationBackend.domain.docstring.Docstring;
import ch.jako.docstringClassificationBackend.domain.user.User;
import ch.jako.docstringClassificationBackend.dto.docstring.DocstringDTO;
import ch.jako.docstringClassificationBackend.dto.user.UserDTO;
import ch.jako.docstringClassificationBackend.repositories.docstring.DocstringRepository;
import ch.jako.docstringClassificationBackend.services.docstring.DocstringService;
import ch.jako.docstringClassificationBackend.services.user.UserService;
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

@Log4j2
@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@RequestMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private final UserService userService;
    private final DocstringRepository docstringRepository;

    @GetMapping
    @Transactional
    public List<UserDTO> getAllUsers() {
        return userService.findAllAsDTO(UserDTO::new);
    }

    @GetMapping("/{id}")
    @Transactional
    public ResponseEntity<UserDTO> getUser(@PathVariable long id) {
        Optional<User> potentialUser = userService.findById(id);
        return potentialUser.map(user -> ResponseEntity.ok(new UserDTO(user))).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    @Transactional
    public UserDTO createUser() {
        User user = userService.create();
        return new UserDTO(user);
    }

    @PutMapping("/{id}/docstrings")
    @Transactional
    public ResponseEntity<UserDTO> assignDocstrings(@PathVariable long id, @RequestBody ArrayList<DocstringDTO> docstringDTOList) {
        Optional<User> potentialUser = userService.findById(id);
        return potentialUser.map(user -> ResponseEntity.ok(new UserDTO(userService.assignDocstrings(user, docstringDTOList)))).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<UserDTO> update(@PathVariable long id, @RequestBody UserDTO userDTO) {
        Optional<User> potentialUser = userService.findById(id);
        return potentialUser.map(user -> ResponseEntity.ok(new UserDTO(userService.update(user, userDTO)))).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("{id}/classifications")
    @Transactional
    public ResponseEntity<UserDTO> addClassification(@PathVariable long id, @RequestBody DocstringDTO docstringDTO) {
        Optional<Docstring> potentialDocstring = docstringRepository.findById(docstringDTO.getId());
        Optional<User> potentialUser = userService.findById(id);
        if(potentialDocstring.isPresent() && potentialUser.isPresent()) {
            return ResponseEntity.ok(new UserDTO(userService.addClassification(potentialUser.get(), potentialDocstring.get())));
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("{id}/demographies")
    @Transactional
    public ResponseEntity<UserDTO> updateDemography(@PathVariable long id, @RequestBody UserDTO userDTO) {
        Optional<User> potentionalUser = userService.findById(id);
        return potentionalUser.map(user -> ResponseEntity.ok(new UserDTO(userService.updateDemography(user, userDTO)))).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
