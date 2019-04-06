package com.dennisdavydov.mishpahug.Adapters;

import android.arch.persistence.room.TypeConverter;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.dennisdavydov.mishpahug.models.Address;
import com.dennisdavydov.mishpahug.models.Owner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DBConverter {
    @RequiresApi(api = Build.VERSION_CODES.N)
    @TypeConverter
    public String fromFood(List<String> food) {
        return food.stream().collect(Collectors.joining(","));
    }

    @TypeConverter
    public List<String> food(String data) {
        return Arrays.asList(data.split(","));
    }
/////////////////////////////////////////////////////////

//////////////////////////////////////////////////
}
