package com.dennisdavydov.mishpahug;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.dennisdavydov.mishpahug.providers.ApiProvider;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    public static  App instance;
    private  AppDatabase database;
    private static final String BASE_URL = "https://mishpahug-java221-team-a.herokuapp.com";
    private static ApiProvider provider;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
        database= Room.databaseBuilder(this,AppDatabase.class,"eventDB").build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        provider = retrofit.create(ApiProvider.class);

    }

    public static ApiProvider getProvider(){
        return provider;
    }

    public static App getInstance() {
        return instance;
    }

    public AppDatabase getDatabase() {
        return database;
    }
}
