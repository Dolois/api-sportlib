package fr.formation.sportlib.business.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Activity {

    @Column(nullable = false, length = 100)
    private String activity;

    @Column(nullable = false, length = 10)
    private String day;

    @Column(nullable = false, length = 5)
    private float startTime;

    @Column(nullable = false, length = 5)
    private float endTime;

    @Column(nullable = false)
    private LocalDate dateActivity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Place place;

    /**
     * Instantiates a new Activity.
     */
    public Activity() {}

    /**
     * @return activity
     */
    public String getActivity() {
        return activity;
    }

    /**
     * @param activity
     */
    public void setActivity(String activity) {
        this.activity = activity;
    }

    /**
     * @return jour
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return startTime
     */
    public float getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(float startTime) {
        this.startTime = startTime;
    }

    /**
     * @return endTime
     */
    public float getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(float endTime) {
        this.endTime = endTime;
    }

    /**
     * @return dateActivity
     */
    public LocalDate getDateActivity() {
        return dateActivity;
    }

    /**
     * @param dateActivity
     */
    public void setDateActivity(LocalDate dateActivity) {
        this.dateActivity = dateActivity;
    }

    /**
     * @return place
     */
    public Place getPlace() {
        return place;
    }

    /**
     * @param place
     */
    public void setPlace(Place place) {
        this.place = place;
    }
}
