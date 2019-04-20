package com.example.hoors.DataBase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.hoors.Entities.Lady;

@Database(entities = {Lady.class},version = 1)

public abstract class LadyDataBase extends RoomDatabase {

    public abstract LadyDAO getLAdyDao();
}
