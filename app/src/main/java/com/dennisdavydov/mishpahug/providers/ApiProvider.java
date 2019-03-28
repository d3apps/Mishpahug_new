package com.dennisdavydov.mishpahug.providers;

import com.dennisdavydov.mishpahug.models.EventsDescription;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiProvider {

    @GET("/v2/5c9d172c33000056003f227e")
    Call<EventsDescription> getEvent();


}
