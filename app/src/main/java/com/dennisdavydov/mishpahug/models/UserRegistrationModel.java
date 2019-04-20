package com.dennisdavydov.mishpahug.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserRegistrationModel {

    @SerializedName("confession")
    @Expose
    private List<String> confession = null;
    @SerializedName("gender")
    @Expose
    private List<String> gender = null;
    @SerializedName("maritalStatus")
    @Expose
    private List<String> maritalStatus = null;
    @SerializedName("foodPreferences")
    @Expose
    private List<String> foodPreferences = null;
    @SerializedName("languages")
    @Expose
    private List<String> languages = null;
    @SerializedName("holiday")
    @Expose
    private List<String> holiday = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public UserRegistrationModel() {
    }

    /**
     *
     * @param holiday
     * @param confession
     * @param languages
     * @param foodPreferences
     * @param gender
     * @param maritalStatus
     */
    public UserRegistrationModel(List<String> confession, List<String> gender, List<String> maritalStatus, List<String> foodPreferences, List<String> languages, List<String> holiday) {
        super();
        this.confession = confession;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.foodPreferences = foodPreferences;
        this.languages = languages;
        this.holiday = holiday;
    }

    public List<String> getConfession() {
        return confession;
    }

    public void setConfession(List<String> confession) {
        this.confession = confession;
    }

    public UserRegistrationModel withConfession(List<String> confession) {
        this.confession = confession;
        return this;
    }

    public List<String> getGender() {
        return gender;
    }

    public void setGender(List<String> gender) {
        this.gender = gender;
    }

    public UserRegistrationModel withGender(List<String> gender) {
        this.gender = gender;
        return this;
    }

    public List<String> getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(List<String> maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public UserRegistrationModel withMaritalStatus(List<String> maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public List<String> getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(List<String> foodPreferences) {
        this.foodPreferences = foodPreferences;
    }

    public UserRegistrationModel withFoodPreferences(List<String> foodPreferences) {
        this.foodPreferences = foodPreferences;
        return this;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public UserRegistrationModel withLanguages(List<String> languages) {
        this.languages = languages;
        return this;
    }

    public List<String> getHoliday() {
        return holiday;
    }

    public void setHoliday(List<String> holiday) {
        this.holiday = holiday;
    }

    public UserRegistrationModel withHoliday(List<String> holiday) {
        this.holiday = holiday;
        return this;
    }

}
