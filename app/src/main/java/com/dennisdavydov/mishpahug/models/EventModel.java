package com.dennisdavydov.mishpahug.models;



import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventModel {

    @SerializedName("eventId")
    @Expose
    private Integer eventId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("holiday")
    @Expose
    private String holiday;
    @SerializedName("confession")
    @Expose
    private String confession;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("food")
    @Expose
    private List<String> food = null;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("participants")
    @Expose
    private List<ParticipantModel> participants = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public EventModel() {
    }

    /**
     *
     * @param confession
     * @param holiday
     * @param duration
     * @param time
     * @param title
     * @param eventId
     * @param status
     * @param description
     * @param food
     * @param date
     * @param participants
     */
    public EventModel(Integer eventId, String title, String holiday, String confession, String date, String time, Integer duration, List<String> food, String description, String status, List<ParticipantModel> participants) {
        super();
        this.eventId = eventId;
        this.title = title;
        this.holiday = holiday;
        this.confession = confession;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.food = food;
        this.description = description;
        this.status = status;
        this.participants = participants;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    public String getConfession() {
        return confession;
    }

    public void setConfession(String confession) {
        this.confession = confession;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<String> getFood() {
        return food;
    }

    public void setFood(List<String> food) {
        this.food = food;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ParticipantModel> getParticipants() {
        return participants;
    }

    public void setParticipants(List<ParticipantModel> participants) {
        this.participants = participants;
    }

}