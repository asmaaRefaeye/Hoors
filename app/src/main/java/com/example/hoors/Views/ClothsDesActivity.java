package com.example.hoors.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hoors.R;

public class ClothsDesActivity extends AppCompatActivity {
    TextView clothtitle_textview,clothtext_textview,clothtext_desc_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloths_des);
        clothtitle_textview=findViewById(R.id.clothtitle_textview);
        clothtext_textview=findViewById(R.id.clothtext_textview);
        clothtext_desc_textview=findViewById(R.id.clothtext_desc_textview);
    }
}
