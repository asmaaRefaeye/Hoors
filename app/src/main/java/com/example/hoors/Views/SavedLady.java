package com.example.hoors.Views;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.hoors.DataBase.LadyDataBase;
import com.example.hoors.Entities.Lady;
import com.example.hoors.R;

import java.util.List;

public class SavedLady extends AppCompatActivity implements LadyAdapter.ItemClickListener {
    RecyclerView savedRecycler;
    LadyAdapter savedLady_adapter ;
    List<Lady> ladyList ;
    LadyDataBase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_lady);

        savedRecycler = findViewById(R.id.savedlady_recyclerview);
        savedRecycler.setLayoutManager(new LinearLayoutManager(this));

        database= Room.databaseBuilder(this,LadyDataBase.class,"mydb")
                .allowMainThreadQueries()
                .build();

        ladyList= database.getLAdyDao().getSavedLadies();
        Log.e("size",String.valueOf(ladyList.size()));
        savedLady_adapter = new LadyAdapter(this, ladyList);
        savedLady_adapter.setClickListener(this);
        savedRecycler.setAdapter(savedLady_adapter);

    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(this ,LadyDescriptionActivity.class);
        intent.putExtra("id",ladyList.get(position).id);
        intent.putExtra("name",ladyList.get(position).name);
        startActivity(intent);
    }
}
