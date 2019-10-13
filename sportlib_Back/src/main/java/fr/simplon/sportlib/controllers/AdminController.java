package fr.simplon.sportlib.controllers;

import fr.simplon.sportlib.services.AdminService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService service;

    protected AdminController(AdminService service) {
        this.service = service;
    }

    @DeleteMapping("/cache/{city}")
    protected void clearCacheCity(@PathVariable("city") String city) {
        service.clearCacheCity(city);
    }

    @DeleteMapping("/cities")
    protected void  clearCacheCities() {
        service.clearCacheCities();
    }
}
