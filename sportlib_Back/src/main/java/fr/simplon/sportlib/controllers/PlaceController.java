package fr.simplon.sportlib.controllers;

import fr.simplon.sportlib.dtos.PlaceDto;
import fr.simplon.sportlib.dtos.PlaceViewDto;
import fr.simplon.sportlib.services.PlaceService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/place")
public class PlaceController {

    private final PlaceService service;

    protected PlaceController(PlaceService service) {
        this.service = service;
    }

    @GetMapping
    protected List<PlaceViewDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    protected PlaceViewDto getOne(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @PostMapping
    protected void createPlace(@RequestBody @Valid PlaceDto place) {
        service.create(place);
    }

    @DeleteMapping("/{id}")
    protected void deletePlace(@PathVariable("id") Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id,
                       @RequestBody @Valid PlaceDto place) {
        service.update(id, place);
    }
}
