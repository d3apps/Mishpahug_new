package com.dennisdavydov.mishpahug.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.TypeConverters;
import android.arch.persistence.room.Update;

import com.dennisdavydov.mishpahug.Adapters.DBConverter;
import com.dennisdavydov.mishpahug.models.Event;

import java.util.List;
@Dao
@TypeConverters({DBConverter.class})
public interface EventDao {

    @Query("SELECT * FROM event")
    List<Event> getAll();

    @Query("SELECT * FROM event WHERE eventId = :id")
    Event getById(int id);

    @Insert
    void insert(Event event);



    @Update
    void update(Event event);

    @Delete
    void delete(Event event);

}
