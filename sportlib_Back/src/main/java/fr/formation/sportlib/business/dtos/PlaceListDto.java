package fr.formation.sportlib.business.dtos;

import java.util.List;

public class PlaceListDto {

    // Additional properties
    private List<PlaceDto> places;

    public PlaceListDto() {}

    public List<PlaceDto> getPlaces() {
        return places;
    }

    public void setPlaces(List<PlaceDto> places) {
        this.places = places;
    }
}
