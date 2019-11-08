package fr.simplon.sportlib.services;

import fr.simplon.sportlib.dtos.PlaceDto;
import fr.simplon.sportlib.dtos.PlaceViewDto;
import fr.simplon.sportlib.entities.Structure;
import fr.simplon.sportlib.entities.Place;
import fr.simplon.sportlib.repositories.StructureRepository;
import fr.simplon.sportlib.repositories.PlaceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl extends AbstractService implements PlaceService, StructureService {

    private final PlaceRepository repo;
    private final StructureRepository structureRepository;
    private final ModelMapper modelMapper;

    protected PlaceServiceImpl(PlaceRepository repo, StructureRepository structureRepository, ModelMapper modelMapper) {
        this.repo = repo;
        this.structureRepository = structureRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<PlaceViewDto> getAll() {
        return repo.getAllPlacesBy();
    }

    @Override
    public PlaceViewDto getById(Long id) {
        return repo.getById(id);
    }

    @Override
    public void create(PlaceDto placeDto) {
        Place entity = modelMapper.map(placeDto, Place.class);
        repo.save(entity);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void update(Long id, PlaceDto placeDto) {
        Place place = findById(id, repo);
        modelMapper.map(placeDto, place);
        repo.save(place);
    }

    @Override
    public List<Structure> getAllStructures() {
        return structureRepository.findAll();
    }
}
