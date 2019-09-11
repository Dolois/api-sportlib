package fr.formation.sportlib.business.repositories;

import fr.formation.sportlib.business.dtos.PlaceViewDto;
import fr.formation.sportlib.business.entities.Place;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceJpaRepository extends JpaRepository<Place, Long> {

    PlaceViewDto getById(Long id);

    List<PlaceViewDto> getAllProjectedBy();
    // Page<PlaceViewDto> getAllProjectedBy(Pageable pageable);
}
