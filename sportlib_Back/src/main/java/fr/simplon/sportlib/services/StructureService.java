package fr.simplon.sportlib.services;

import fr.simplon.sportlib.entities.Structure;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {

    /** method signatures and arguments if present */

    List<Structure> getAllCities();
}
