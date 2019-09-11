package fr.formation.sportlib.business.dtos;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.validation.constraints.*;
import java.time.LocalDate;

public class PlaceDto {

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


}
