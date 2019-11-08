package fr.simplon.sportlib.repositories;

import fr.simplon.sportlib.dtos.StructureViewDto;
import fr.simplon.sportlib.entities.Structure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StructureRepository extends JpaRepository<Structure, Long> {

    StructureViewDto getById(Long id);

    List<StructureViewDto> getAllPlacesBy();
}
