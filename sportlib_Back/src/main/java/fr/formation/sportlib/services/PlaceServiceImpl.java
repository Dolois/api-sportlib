package fr.formation.sportlib.services;

import fr.formation.sportlib.business.dtos.PlaceViewDto;
import fr.formation.sportlib.business.repositories.PlaceJpaRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {

    private PlaceJpaRepository repo;

    protected PlaceServiceImpl(PlaceJpaRepository repo) {
        this.repo = repo;
    }

    // @Override
    // public List<PlaceViewDto> getPlaceByZipCode(String place, String zipCode) {
       // return repo.getAllProjectedBy();
    // }

    @Override
    @Cacheable("places")  // la liste places est chargee dans le cache places
    public List<PlaceViewDto> getAll() {
        return repo.getAllProjectedBy();
    }

    @Override
    @Cacheable("places")  // la place est chargee dans le cache places
    public PlaceViewDto getOne(Long id) {
        return repo.getOneById(id);
    }
}
