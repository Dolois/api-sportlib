package fr.simplon.sportlib.dtos;

import javax.persistence.Column;

public class CityDto {

    /** zipCode. */
    @Column(nullable = false, length = 5)
    private String zipCode;

    /** city. */
    @Column(nullable = false)
    private String city;

    /** canton. */
    @Column(nullable = true)
    private String canton;

    /** gps */
    @Column(nullable = false)
    private String gps;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }
}
