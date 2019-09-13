package fr.formation.sportlib.services;

import fr.formation.sportlib.business.dtos.PlaceViewDto;
import java.util.List;

public interface PlaceService {

    // List<PlaceChoiceDto> getPlaceByCity();

    List<PlaceViewDto> getAll();

    PlaceViewDto getOne(Long id);
}
