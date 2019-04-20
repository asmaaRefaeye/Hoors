package com.example.hoors.DataBase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.hoors.Entities.Lady;

import java.util.List;

@Dao
public interface LadyDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insert(Lady... items);

    @Delete
    public void delete(Lady item);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    public void update(Lady... items);

    @Query("SELECT * FROM items ")
    public List<Lady> getLadies();

    @Query("SELECT * FROM items WHERE id = :id")
    public Lady getLadyById(Long id);

    @Query("SELECT * FROM items WHERE isfavourit=1")
    public List<Lady> getSavedLadies();

}
