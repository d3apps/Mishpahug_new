package com.dennisdavydov.mishpahug.providers;

import com.dennisdavydov.mishpahug.models.EventsDescription;
import com.dennisdavydov.mishpahug.models.UserRegistrationModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiProvider {

    @POST("/event/allprogresslist")
    Call<EventsDescription> getEvent(@Query("page") int page, @Query("size") int size);

    @POST("/user/registration")
    Call<UserRegistrationModel> registerNewUser();


}
