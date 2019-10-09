package fr.simplon.sportlib.dtos;

import java.time.LocalDate;

public interface PlaceViewDto {
    Long getId();
    String getPlace();
    String getName();
    String getAddress();
    String getCity();
    String getZipCode();
    LocalDate getDatePlace();
}
