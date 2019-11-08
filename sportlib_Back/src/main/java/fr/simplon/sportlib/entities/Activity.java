package fr.simplon.sportlib.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="t_activity")
public class Activity extends AbstractEntity {

    @Column(nullable = false, length = 255)
    private String activity;

    @Column(nullable = false, length = 10)
    private String day;

    @Column(nullable = false)
    private String startTime;

    @Column(nullable = false, length = 5)
    private String endTime;

    @Column(nullable = false)
    private LocalDate dateActivity;

    /** The place. */
    @ManyToOne
    @JoinColumn(name="place_id")
    @JsonIgnore
    private Place place;

    /**
     * Instantiates a new Activity.
     */
    public Activity() {}

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public LocalDate getDateActivity() {
        return dateActivity;
    }

    public void setDateActivity(LocalDate dateActivity) {
        this.dateActivity = dateActivity;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}