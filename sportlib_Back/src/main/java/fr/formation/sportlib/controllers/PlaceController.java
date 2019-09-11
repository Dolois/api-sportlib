package fr.formation.sportlib.controllers;

import fr.formation.sportlib.business.dtos.PlaceViewDto;
import fr.formation.sportlib.services.PlaceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/places")
public class PlaceController {

    private final PlaceService service;

    protected PlaceController(PlaceService service) {
        this.service = service;
    }

    @GetMapping
    protected List<PlaceViewDto> getAll() {
        return service.getAll();
    }
}
