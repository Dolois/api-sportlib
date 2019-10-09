package fr.simplon.sportlib.services;

import fr.simplon.sportlib.dtos.ActivityDto;
import fr.simplon.sportlib.dtos.ActivityViewDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActivityService {

    /** method signatures and arguments if present */

    List<ActivityViewDto> getAll();

    ActivityViewDto getById(Long id);

    void create(ActivityDto activityDto);

    void update(Long id, ActivityDto activityDto);

    void delete(Long id);
}
