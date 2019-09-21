package ch.jako.docstringClassificationBackend.services;

import ch.jako.docstringClassificationBackend.domain.AbstractDBEntity;
import ch.jako.docstringClassificationBackend.dto.AbstractDTO;
import ch.jako.docstringClassificationBackend.repositories.AbstractRepository;
import lombok.NonNull;


import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class AbstractService<T extends AbstractDBEntity, R extends AbstractRepository<T>, U extends AbstractDTO> {

    private final R repository;

    protected AbstractService(@NonNull R repository) {
        this.repository = repository;
    }

    protected R getRepository() {
        return repository;
    }

    public Optional<T> findById(Long id) {
        return repository.findById(id);
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public List<U> findAllAsDTO(Function<? super T, U> mapper) {
        return repository.findAll().stream().map(mapper).collect(Collectors.toList());
    }

    public void delete(T entity) {
        repository.delete(entity);
    }

    public Boolean deleteById(Long id) {
        Optional<T> entity = repository.findById(id);
        if(entity.isPresent()) {
            delete(entity.get());
            return true;
        }
        return false;
    }
}
