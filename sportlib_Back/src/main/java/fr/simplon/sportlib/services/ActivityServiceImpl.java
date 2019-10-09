package fr.simplon.sportlib.services;

import fr.simplon.sportlib.dtos.ActivityDto;
import fr.simplon.sportlib.dtos.ActivityViewDto;
import fr.simplon.sportlib.entities.Activity;
import fr.simplon.sportlib.repositories.ActivityRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl extends AbstractService implements ActivityService {

    private final ActivityRepository repo;
    private final ModelMapper modelMapper;

    protected ActivityServiceImpl(ActivityRepository repo, ModelMapper modelMapper) {
        this.repo = repo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ActivityViewDto> getAll() {
        return repo.getAllActivityBy();
    }

    @Override
    public ActivityViewDto getById(Long id) {
        return repo.getById(id);
    }

    @Override
    public void create(ActivityDto activityDto) {
        Activity entity = modelMapper.map(activityDto, Activity.class);
        repo.save(entity);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void update(Long id, ActivityDto activityDto) {
        Activity activity = findById(id, repo);
        modelMapper.map(activityDto, activity);
        repo.save(activity);
    }
}