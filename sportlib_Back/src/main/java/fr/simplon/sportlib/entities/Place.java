package fr.simplon.sportlib.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="t_place")
public class Place extends AbstractEntity {

    /** The place. */
    @Column(nullable = false)
    private String place;

    /** The name. */
    @Column(nullable = false)
    private String name;

    /** The address. */
    @Column(nullable = false)
    private String address;

    /** The city. */
    @Column(nullable = false)
    private String city;

    /** The zip code. */
    @Column(nullable = false, length = 5)
    private String zipCode;

    /** The phone. */
    @Column(nullable = false, length = 10)
    private String phone;

    /** The image. */
    @Column(nullable = false)
    private String image;

    /** The overtures */
    @Column(nullable = false)
    private String overture;

    /** The date place. */
    @Column(nullable = false)
    private LocalDate datePlace;

    /** The activities. */
    @OneToMany(mappedBy = "place")
    private List<Activity> activities;

    /**
     * Instantiates a new place.
     */
    public Place() {}

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
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

    public String getOverture() {
        return overture;
    }

    public void setOverture(String overture) {
        this.overture = overture;
    }

    public LocalDate getDatePlace() {
        return datePlace;
    }

    public void setDatePlace(LocalDate datePlace) {
        this.datePlace = datePlace;
    }

    /**
     * Gets the activities.
     *
     * @return the activities
     */
    public List<Activity> getActivities() {
        return activities;
    }

    /**
     * Sets the activities.
     *
     * @param activities the new activities
     */
    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
