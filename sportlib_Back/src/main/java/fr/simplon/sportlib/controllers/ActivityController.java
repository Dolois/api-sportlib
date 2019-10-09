package fr.simplon.sportlib.controllers;

import fr.simplon.sportlib.dtos.ActivityDto;
import fr.simplon.sportlib.dtos.ActivityViewDto;
import fr.simplon.sportlib.services.ActivityService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    private final ActivityService service;

    protected ActivityController(ActivityService service) {
        this.service = service;
    }

    @GetMapping
    protected List<ActivityViewDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    protected ActivityViewDto getOne(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @PostMapping
    protected void create(@RequestBody @Valid ActivityDto activity) {
        service.create(activity);
    }

    @DeleteMapping("/{id}")
    protected void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id,
                       @RequestBody @Valid ActivityDto activity) {
        service.update(id, activity);
    }
}
