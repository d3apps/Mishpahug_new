package com.dennisdavydov.mishpahug.models;



import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import java.util.List;

import com.dennisdavydov.mishpahug.Adapters.DBConverter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
///////////////////////////////////////////////////////////////////////////////////////////////
@Entity
@TypeConverters({DBConverter.class})
public class Event {
    @PrimaryKey
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
    @SerializedName("address")
    @Expose
    @Embedded(prefix = "address")
    private Address address;
    @SerializedName("food")
    @Expose
    private List<String> food = null;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("owner")
    @Expose
    @Embedded(prefix = "owner")
    private Owner owner;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}