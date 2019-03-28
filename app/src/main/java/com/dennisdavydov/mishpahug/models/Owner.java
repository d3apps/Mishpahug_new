package com.dennisdavydov.mishpahug.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Owner {
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("confession")
    @Expose
    private String confession;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("pictureLink")
    @Expose
    private List<String> pictureLink = null;
    @SerializedName("maritalStatus")
    @Expose
    private String maritalStatus;
    @SerializedName("foodPreferences")
    @Expose
    private List<String> foodPreferences = null;
    @SerializedName("languages")
    @Expose
    private List<String> languages = null;
    @SerializedName("rate")
    @Expose
    private Float rate;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getConfession() {
        return confession;
    }

    public void setConfession(String confession) {
        this.confession = confession;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(List<String> pictureLink) {
        this.pictureLink = pictureLink;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public List<String> getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(List<String> foodPreferences) {
        this.foodPreferences = foodPreferences;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }
}
