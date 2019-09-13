package fr.formation.sportlib.controllers;

import fr.formation.sportlib.services.AdminService;
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

    @DeleteMapping("/cache/{region}")
    protected void clearCacheRegion(@PathVariable("region") String region) {
        service.clearCacheRegion(region);
    }

    @DeleteMapping("/caches")
    protected void  clearCacheRegions() {
        service.clearCacheRegions();
    }
}
