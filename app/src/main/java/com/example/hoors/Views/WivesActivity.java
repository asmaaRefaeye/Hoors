package com.example.hoors.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hoors.R;

public class WivesActivity extends AppCompatActivity {

    TextView wivesTitle ,fristwife ,secondwife ,thirdwife,
    forthwife,fivewife,sixwife,sevenwife,eightwife,
    ninewife,tenwife,elevenwife,twelvewife;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wives);

        wivesTitle= findViewById(R.id.wivestitle);
        fristwife = findViewById(R.id.fristwife_textview);
        secondwife = findViewById(R.id.secondwife_textview);
        thirdwife = findViewById(R.id.thirdwife_textview);
        forthwife = findViewById(R.id.forthwife_textview);
        fivewife = findViewById(R.id.fifewife_textview);
        sixwife = findViewById(R.id.sixwife_textview);
        sevenwife = findViewById(R.id.sevenwife_textview);
        eightwife = findViewById(R.id.eightwife_textview);
        ninewife = findViewById(R.id.ninewife_textview);
        tenwife = findViewById(R.id.tenwife_textview);
        elevenwife = findViewById(R.id.elevenwife_textview);
        twelvewife = findViewById(R.id.twelvewife_textview);

    }
}
