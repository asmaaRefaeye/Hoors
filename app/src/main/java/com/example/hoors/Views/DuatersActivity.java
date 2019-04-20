package com.example.hoors.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hoors.R;

public class DuatersActivity extends AppCompatActivity {

    ImageView duaterImageview;

    TextView duatertitle ,fristduater,secondduater,thirdduater,fourthduater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duaters);

        duaterImageview=findViewById(R.id.duaters_imageview);

        duatertitle =findViewById(R.id.duaterstitle);
        fristduater =findViewById(R.id.fristduater_textview);
        secondduater=findViewById(R.id.secondduater_textview);
        thirdduater=findViewById(R.id.thirdduater_textview);
        fourthduater=findViewById(R.id.forthduater_textview);
    }
}
