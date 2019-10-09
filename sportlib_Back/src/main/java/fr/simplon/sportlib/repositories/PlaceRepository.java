package fr.simplon.sportlib.repositories;

import fr.simplon.sportlib.dtos.PlaceViewDto;
import fr.simplon.sportlib.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceJpaRepository extends JpaRepository<Place, Long> {

    // ProjectedBy est uniquement pour les Listes
    List<PlaceViewDto> getAllProjectedBy();

    PlaceViewDto getOneById(Long id);

    // Page<PlaceViewDto> getAllProjectedBy(Pageable pageable);
}
