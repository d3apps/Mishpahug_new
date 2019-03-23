package com.dennisdavydov.mishpahug.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParticipantModel {

    @SerializedName("userId")
    @Expose
    private Integer userId;
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
    private Double rate;
    @SerializedName("numberOfVoters")
    @Expose
    private Integer numberOfVoters;
    @SerializedName("isInvited")
    @Expose
    private Boolean isInvited;

    /**
     * No args constructor for use in serialization
     *
     */
    public ParticipantModel() {
    }

    /**
     *
     * @param confession
     * @param languages
     * @param isInvited
     * @param rate
     * @param foodPreferences
     * @param pictureLink
     * @param age
     * @param userId
     * @param gender
     * @param fullName
     * @param maritalStatus
     * @param numberOfVoters
     */
    public ParticipantModel(Integer userId, String fullName, String confession, String gender, Integer age, List<String> pictureLink, String maritalStatus, List<String> foodPreferences, List<String> languages, Double rate, Integer numberOfVoters, Boolean isInvited) {
        super();
        this.userId = userId;
        this.fullName = fullName;
        this.confession = confession;
        this.gender = gender;
        this.age = age;
        this.pictureLink = pictureLink;
        this.maritalStatus = maritalStatus;
        this.foodPreferences = foodPreferences;
        this.languages = languages;
        this.rate = rate;
        this.numberOfVoters = numberOfVoters;
        this.isInvited = isInvited;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getNumberOfVoters() {
        return numberOfVoters;
    }

    public void setNumberOfVoters(Integer numberOfVoters) {
        this.numberOfVoters = numberOfVoters;
    }

    public Boolean getIsInvited() {
        return isInvited;
    }

    public void setIsInvited(Boolean isInvited) {
        this.isInvited = isInvited;
    }

}
