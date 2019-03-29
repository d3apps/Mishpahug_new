package com.dennisdavydov.mishpahug;

import android.app.Application;

import com.dennisdavydov.mishpahug.providers.ApiProvider;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    private static final String BASE_URL = "http://www.mocky.io/";
    private static ApiProvider provider;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        provider = retrofit.create(ApiProvider.class);

    }

    public static ApiProvider getProvider(){
        return provider;
    }

}
