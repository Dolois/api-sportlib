package fr.simplon.sportlib.services;

import fr.simplon.sportlib.dtos.PlaceDto;
import fr.simplon.sportlib.dtos.PlaceViewDto;
import fr.simplon.sportlib.entities.City;
import fr.simplon.sportlib.entities.Place;
import fr.simplon.sportlib.repositories.CityRepository;
import fr.simplon.sportlib.repositories.PlaceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl extends AbstractService implements PlaceService, CityService {

    private final PlaceRepository repo;
    private final CityRepository cityRepository;
    private final ModelMapper modelMapper;

    protected PlaceServiceImpl(PlaceRepository repo, CityRepository cityRepository, ModelMapper modelMapper) {
        this.repo = repo;
        this.cityRepository = cityRepository;
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
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }
}
