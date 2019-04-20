package com.example.hoors.Views;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.hoors.DataBase.LadyDataBase;
import com.example.hoors.Entities.Lady;
import com.example.hoors.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements LadyAdapter.ItemClickListener {

    LadyAdapter adapter ;
    List<Lady> ladyList ;
    LadyDataBase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database=Room.databaseBuilder(this,LadyDataBase.class,"mydb")
                .allowMainThreadQueries()
                .build();

        SharedPreferences sh= getSharedPreferences("myprefs", MODE_PRIVATE); ;
        if (sh.getInt("firsttime", 1)==1) {
            addData();;
            SharedPreferences.Editor editor=sh.edit();
            editor.putInt("firsttime",3).apply();
        }
        ladyList= database.getLAdyDao().getLadies();
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new LadyAdapter(this, ladyList);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);



    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(this ,LadyDescriptionActivity.class);
        intent.putExtra("id",ladyList.get(position).id);
        intent.putExtra("name",ladyList.get(position).name); //member variables starts with small letter !!!
        startActivity(intent);

    }

    public void addData(){

        Lady lady1;
        lady1 =new Lady();
        lady1.Lady(getResources().getString(R.string.lady1),getResources().getString(R.string.lady1_description));
        database.getLAdyDao().insert(lady1);

        Lady lady2;
        lady2 =new Lady();
        lady2.Lady(getResources().getString(R.string.lady2),getResources().getString(R.string.lady2_Description));
        database.getLAdyDao().insert(lady2);

        Lady lady3;
        lady3 =new Lady();
        lady3.Lady(getResources().getString(R.string.lady3),getResources().getString(R.string.lady3_Description));
        database.getLAdyDao().insert(lady3);

        Lady lady4;
        lady4 =new Lady();
        lady4.Lady(getResources().getString(R.string.lady4),getResources().getString(R.string.lady4_description));
        database.getLAdyDao().insert(lady4);

        Lady lady5;
        lady5 =new Lady();
        lady5.Lady(getResources().getString(R.string.lady5),getResources().getString(R.string.lady5_description));
        database.getLAdyDao().insert(lady5);

        Lady lady6;
        lady6 =new Lady();
        lady6.Lady(getResources().getString(R.string.lady6),getResources().getString(R.string.lady6_description));
        database.getLAdyDao().insert(lady6);

        Lady lady7;
        lady7 =new Lady();
        lady7.Lady(getResources().getString(R.string.lady7),getResources().getString(R.string.lady7_description));
        database.getLAdyDao().insert(lady7);


        Lady lady8;
        lady8 =new Lady();
        lady8.Lady(getResources().getString(R.string.lady8),getResources().getString(R.string.lady8_description));
        database.getLAdyDao().insert(lady8);

        Lady lady9;
        lady9 =new Lady();
        lady9.Lady(getResources().getString(R.string.lady9),getResources().getString(R.string.lady9_description));
        database.getLAdyDao().insert(lady9);

        Lady lady10;
        lady10 =new Lady();
        lady10.Lady(getResources().getString(R.string.lady10),getResources().getString(R.string.lady10_description));
        database.getLAdyDao().insert(lady10);

        Lady lady11;
        lady11 =new Lady();
        lady11.Lady(getResources().getString(R.string.lady11),getResources().getString(R.string.lady11_description));
        database.getLAdyDao().insert(lady11);

        Lady lady12;
        lady12 =new Lady();
        lady12.Lady(getResources().getString(R.string.lady12),getResources().getString(R.string.lady12_description));
        database.getLAdyDao().insert(lady12);

        Lady lady13;
        lady13 =new Lady();
        lady13.Lady(getResources().getString(R.string.lady13),getResources().getString(R.string.lady13_description));
        database.getLAdyDao().insert(lady13);

        Lady lady14;
        lady14 =new Lady();
        lady14.Lady(getResources().getString(R.string.lady14),getResources().getString(R.string.lady14_description));
        database.getLAdyDao().insert(lady14);

        Lady lady15;
        lady15 =new Lady();
        lady15.Lady(getResources().getString(R.string.lady15),getResources().getString(R.string.lady15_description));
        database.getLAdyDao().insert(lady15);

        Lady lady16;
        lady16 =new Lady();
        lady16.Lady(getResources().getString(R.string.lady16),getResources().getString(R.string.lady16_description));
        database.getLAdyDao().insert(lady16);

        /* Lady lady1 = new Lady (1,getResources().getString(R.string.lady1),getResources().getString(R.string.lady1_description));
        ladyList.add(lady1);
        Lady lady2 = new Lady(2 ,getResources().getString(R.string.lady2),getResources().getString(R.string.lady2_Description));
        ladyList.add(lady2);
        Lady lady3 = new Lady(3,getResources().getString(R.string.lady3),getResources().getString(R.string.lady3_Description));
        ladyList.add(lady3);
        Lady lady4 = new Lady(4,getResources().getString(R.string.lady4),getResources().getString(R.string.lady4_description));
        ladyList.add(lady4);*/
    }
    @Override
     public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.wives_menu :
                Intent intent = new Intent(this, WivesActivity.class);
                startActivity(intent);
                return true;
            case R.id.dauters_menu :
                Intent duaters_intent = new Intent(this, DuatersActivity.class);
                startActivity(duaters_intent);
                return true;
            case R.id.behaviours_menu :
                Intent behavior_intent = new Intent(this, BehavioursActivity.class);
                startActivity(behavior_intent);
                return true;
            case R.id.cloth_menu :
                Intent cloth_intent = new Intent(this, ClothsDesActivity.class); // whats this activity
                startActivity(cloth_intent);
                return true;
            case R.id.saved_ladies :
                Intent saved_intent = new Intent(this, SavedLady.class); // whats this activity
                startActivity(saved_intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
