package com.example.hoors.Entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity (tableName = "items")

public class Lady {
    @PrimaryKey
    @NonNull
   public Long  id ;
   public String name;
   public String description;

    public boolean isfavourit = false;

    public void lady(){

    }

    public void Lady(String name, String description) {
        this.name = name;
        this.description = description;
    }
}



