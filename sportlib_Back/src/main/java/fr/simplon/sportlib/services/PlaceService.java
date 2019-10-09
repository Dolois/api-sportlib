package fr.simplon.sportlib.services;

import fr.simplon.sportlib.dtos.PlaceDto;
import fr.simplon.sportlib.dtos.PlaceViewDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlaceService {

    /** method signatures and arguments if present */

    List<PlaceViewDto> getAll();

    PlaceViewDto getById(Long id);

    void create(PlaceDto placeDto);

    void update(Long id, PlaceDto placeDto);

    void delete(Long id);
}
