package fr.formation.sportlib.business.dtos;

import javax.persistence.Column;
import javax.validation.constraints.*;
import java.time.LocalDate;

public class PlaceDto {

    /** The name. */
    @NotBlank
    @Size(min = 1, max = 100)
    private String name;

    /** The address. */
    @NotBlank
    @Size(min = 1, max = 100)
    private String address;

    /** The city. */
    @NotBlank
    @Size(min = 1, max = 100)
    private String city;

    /** The zip code. */
    @NotBlank
    @Size(min = 1, max = 5)
    private String zipCode;

    /** The phone. */
    @NotBlank
    @Size(min = 1, max = 10)
    private String phone;

    /** The image. */
    @NotBlank
    @Size(min = 1, max = 200)
    private String image;

    /** The date place. */
    @NotNull
    @PastOrPresent
    @Future
    private LocalDate datePlace;

    public PlaceDto() {}

    /**
     *
     * @param name
     * @param address
     * @param city
     * @param zipCode
     * @param phone
     * @param image
     * @param datePlace
     */
    public PlaceDto(String name, String address, String city, String zipCode,
                    String phone, String image, LocalDate datePlace) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.phone = phone;
        this.image = image;
        this.datePlace = datePlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getDatePlace() {
        return datePlace;
    }

    public void setDatePlace(LocalDate datePlace) {
        this.datePlace = datePlace;
    }
}
