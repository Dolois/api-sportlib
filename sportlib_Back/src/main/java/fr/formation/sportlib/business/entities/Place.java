package fr.formation.sportlib.business.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="t_place")
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Place extends AbstractEntity { // place herit of the class AbstractEntity

    /** The place. */
    @Column(nullable = false, length = 100)
    private String place;

    /** The name. */
    @Column(nullable = false, length = 255)
    private String name;

    /** The address. */
    @Column(nullable = false, length = 255)
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
    @Column(nullable = false, length = 255)
    private String image;

    /** The date place. */
    @Column(nullable = false)
    @CreationTimestamp
    private LocalDate datePlace;

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

    public LocalDate getDatePlace() {

        return datePlace;
    }

    public void setDatePlace(LocalDate datePlace) {
        this.datePlace = datePlace;
    }
}
