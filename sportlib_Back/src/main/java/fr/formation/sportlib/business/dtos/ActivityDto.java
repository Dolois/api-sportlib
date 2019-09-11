package fr.formation.sportlib.business.dtos;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class ActivityDto {

    private Long id;

    @NotBlank
    @Size(min = 1, max = 100)
    private String activity;

    @NotBlank
    @Size(min = 1, max = 10)
    private String day;

    @NotBlank
    @Size(min = 1, max = 5)
    private float startTime;

    @NotBlank
    @Size(min = 1, max = 5)
    private float endTime;

    @NotBlank
    private LocalDate dateActivity;

    public ActivityDto() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public float getStartTime() {
        return startTime;
    }

    public void setStartTime(float startTime) {
        this.startTime = startTime;
    }

    public float getEndTime() {
        return endTime;
    }

    public void setEndTime(float endTime) {
        this.endTime = endTime;
    }

    public LocalDate getDateActivity() {
        return dateActivity;
    }

    public void setDateActivity(LocalDate dateActivity) {
        this.dateActivity = dateActivity;
    }
}
