package fr.simplon.sportlib.repositories;

import fr.simplon.sportlib.dtos.PlaceViewDto;
import fr.simplon.sportlib.entities.Place;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {

    /** method signatures and arguments if present */

    /** ProjectedBy est uniquement pour les Listes */

    PlaceViewDto getById(Long id);
    Page<PlaceViewDto> getAllProjectedBy(Pageable pageable);

    List<PlaceViewDto> getAllPlacesBy();
}