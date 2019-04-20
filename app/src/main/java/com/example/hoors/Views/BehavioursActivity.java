package com.example.hoors.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hoors.R;

public class BehavioursActivity extends AppCompatActivity {

    TextView destitle_textview,descriptiontext1_textview,
            descriptiontext11_textview,descriptiontext2_textview,
            descriptiontext22_textview,descriptiontext3_textview,
            descriptiontext33_textview,descriptiontext4_textview,
            descriptiontext44_textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behaviours);

        destitle_textview=findViewById(R.id.destitle_textview);
        descriptiontext1_textview=findViewById(R.id.descriptiontext1_textview);
        descriptiontext11_textview=findViewById(R.id.descriptiontext11_textview);
        descriptiontext2_textview=findViewById(R.id.descriptiontext2_textview);
        descriptiontext22_textview=findViewById(R.id.descriptiontext22_textview);
        descriptiontext3_textview=findViewById(R.id.descriptiontext3_textview);
        descriptiontext33_textview=findViewById(R.id.descriptiontext33_textview);
        descriptiontext4_textview=findViewById(R.id.descriptiontext4_textview);
        descriptiontext44_textview=findViewById(R.id.descriptiontext44_textview);
    }
}
