package com.dennisdavydov.mishpahug.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {


    @SerializedName("city")
    @Expose
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

}
