package fr.formation.sportlib.business.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Place extends AbstractEntity { // place herit of the class AbstractEntity

    /** The place. */
    @Column(nullable = false, length = 100)
    private String place;

    /** The name. */
    @Column(nullable = false, length = 100)
    private String name;

    /** The address. */
    @Column(nullable = false, length = 100)
    private String address;

    /** The city. */
    @Column(nullable = false, length = 100)
    private String city;

    /** The zip code. */
    @Column(nullable = false, length = 5)
    private String zipCode;

    /** The phone. */
    @Column(nullable = false, length = 10)
    private String phone;

    /** The image. */
    @Column(nullable = false, length = 200)
    private String image;

    /** The date place. */
    @Column(nullable = false)
    private LocalDate datePlace;

    /**
     * Instantiates a new place.
     */
    public Place() {}

    public String getPlace() {
        return place;
    }

    /**
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return datePLace
     */
    public LocalDate getDatePlace() {
        return datePlace;
    }

    /**
     * @param datePlace
     */
    public void setDatePlace(LocalDate datePlace) {
        this.datePlace = datePlace;
    }
}
