package fr.simplon.sportlib.dtos;

import fr.simplon.sportlib.entities.Activity;

import java.time.LocalDate;
import java.util.List;

public interface PlaceViewDto {
    Long getId();
    String getPlace();
    String getName();
    String getAddress();
    String getCity();
    String getZipCode();
    String getPhone();
    String getImage();
    LocalDate getDatePlace();
    List<Activity> getActivities();
}
