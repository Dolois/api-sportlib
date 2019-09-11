package fr.formation.sportlib.services;

import fr.formation.sportlib.business.dtos.PlaceViewDto;
import fr.formation.sportlib.business.repositories.PlaceJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {

    private PlaceJpaRepository repo;

    protected PlaceServiceImpl(PlaceJpaRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<PlaceViewDto> getAll() {
        return repo.getAllProjectedBy();
    }
}
