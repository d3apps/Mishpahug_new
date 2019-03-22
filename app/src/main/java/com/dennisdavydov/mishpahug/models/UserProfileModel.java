package com.dennisdavydov.mishpahug.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserProfileModel {

    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("dateOfBirth")
    @Expose
    private String dateOfBirth;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("maritalStatus")
    @Expose
    private String maritalStatus;
    @SerializedName("confession")
    @Expose
    private String confession;
    @SerializedName("pictureLink")
    @Expose
    private List<String> pictureLink = null;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("foodPreferences")
    @Expose
    private List<String> foodPreferences = null;
    @SerializedName("languages")
    @Expose
    private List<String> languages = null;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("rate")
    @Expose
    private Double rate;
    @SerializedName("numberOfVoters")
    @Expose
    private Long numberOfVoters;

    /**
     * No args constructor for use in serialization
     *
     */
    public UserProfileModel() {
    }

    /**
     *
     * @param confession
     * @param dateOfBirth
     * @param languages
     * @param lastName
     * @param rate
     * @param phoneNumber
     * @param foodPreferences
     * @param pictureLink
     * @param description
     * @param gender
     * @param maritalStatus
     * @param firstName
     * @param numberOfVoters
     */
    public UserProfileModel(String firstName, String lastName, String dateOfBirth, String gender, String maritalStatus, String confession, List<String> pictureLink, String phoneNumber, List<String> foodPreferences, List<String> languages, String description, Double rate, Long numberOfVoters) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.confession = confession;
        this.pictureLink = pictureLink;
        this.phoneNumber = phoneNumber;
        this.foodPreferences = foodPreferences;
        this.languages = languages;
        this.description = description;
        this.rate = rate;
        this.numberOfVoters = numberOfVoters;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserProfileModel withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserProfileModel withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public UserProfileModel withDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public UserProfileModel withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public UserProfileModel withMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public String getConfession() {
        return confession;
    }

    public void setConfession(String confession) {
        this.confession = confession;
    }

    public UserProfileModel withConfession(String confession) {
        this.confession = confession;
        return this;
    }

    public List<String> getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(List<String> pictureLink) {
        this.pictureLink = pictureLink;
    }

    public UserProfileModel withPictureLink(List<String> pictureLink) {
        this.pictureLink = pictureLink;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserProfileModel withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public List<String> getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(List<String> foodPreferences) {
        this.foodPreferences = foodPreferences;
    }

    public UserProfileModel withFoodPreferences(List<String> foodPreferences) {
        this.foodPreferences = foodPreferences;
        return this;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public UserProfileModel withLanguages(List<String> languages) {
        this.languages = languages;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserProfileModel withDescription(String description) {
        this.description = description;
        return this;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public UserProfileModel withRate(Double rate) {
        this.rate = rate;
        return this;
    }

    public Long getNumberOfVoters() {
        return numberOfVoters;
    }

    public void setNumberOfVoters(Long numberOfVoters) {
        this.numberOfVoters = numberOfVoters;
    }

    public UserProfileModel withNumberOfVoters(Long numberOfVoters) {
        this.numberOfVoters = numberOfVoters;
        return this;
    }

}
