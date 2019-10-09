package fr.simplon.sportlib.repositories;

import fr.simplon.sportlib.dtos.CityViewDto;
import fr.simplon.sportlib.entities.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, String> {

    /** method signatures and arguments if present */

    /** ProjectedBy est uniquement pour les Listes */
    List<CityViewDto> getAllProjectedBy();

    Page<CityViewDto> getAllProjectedBy(Pageable pageable);
}
