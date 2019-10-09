package fr.simplon.sportlib.dtos;

import javax.validation.constraints.NotNull;

public class PlaceCreateDto {

    String zipCode;
    String city;
    String canton;

    @NotNull
    private String gps;
}
