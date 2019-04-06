package com.dennisdavydov.mishpahug.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.TypeConverters;

import com.dennisdavydov.mishpahug.Adapters.DBConverter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Entity
@TypeConverters({DBConverter.class})
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
