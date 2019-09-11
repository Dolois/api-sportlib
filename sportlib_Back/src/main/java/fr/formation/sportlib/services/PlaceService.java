package fr.formation.sportlib.services;

import fr.formation.sportlib.business.dtos.PlaceViewDto;
import java.util.List;

public interface PlaceService {

    List<PlaceViewDto> getAll();
}
