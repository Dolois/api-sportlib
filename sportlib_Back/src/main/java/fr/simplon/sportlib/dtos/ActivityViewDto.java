package fr.simplon.sportlib.dtos;

import java.time.LocalDate;

public interface ActivityViewDto {
    Long getId();
    String getActivity();
    String getDay();
    String getStartTime();
    String getEndTime();
    LocalDate getDateActivity();
}
