package fr.simplon.sportlib.repositories;

import fr.simplon.sportlib.dtos.ActivityViewDto;
import fr.simplon.sportlib.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

    /** method signatures and arguments if present */

    ActivityViewDto getById(Long id);

    List<ActivityViewDto> getAllActivityBy();
}
