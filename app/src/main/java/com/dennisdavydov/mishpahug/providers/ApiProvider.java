package com.dennisdavydov.mishpahug.providers;

import com.dennisdavydov.mishpahug.models.EventsDescription;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiProvider {

    @GET("v2/5c9d83ae330000b12c3f2350")
    Call<EventsDescription> getEvent();

    //@Query("page") int page, @Query("size") int size


}
