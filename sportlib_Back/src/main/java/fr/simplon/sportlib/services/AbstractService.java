package fr.simplon.sportlib.services;

import fr.simplon.sportlib.ResourceException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public abstract class AbstractService  {

    protected AbstractService() {}

    /** declaration d'une genericite (non typé) <T> qui retourne T */
    protected <T> T findById(Long id, JpaRepository<T, Long> repo) {
        Optional<T> optional = repo.findById(id);
        String message = "with id = " + id;
        return optional
                .orElseThrow(() ->
                        new ResourceException(message));
    }
}
