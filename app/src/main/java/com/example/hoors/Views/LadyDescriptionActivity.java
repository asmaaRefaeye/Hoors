package com.example.hoors.Views;

import android.arch.persistence.room.Room;
import android.content.Intent;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hoors.DataBase.LadyDataBase;
import com.example.hoors.Entities.Lady;
import com.example.hoors.R;

public class LadyDescriptionActivity extends AppCompatActivity {
   TextView descriptionTextView;
    Long id;
    String name;

    private ShareActionProvider  shareActionProvider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        descriptionTextView = findViewById(R.id.lady_description_textview);

         id=getIntent().getLongExtra("id",0);
         name=getIntent().getStringExtra("name");
        if(name!=null){
            getSupportActionBar().setTitle(name);
        }
        Log.e("id=",""+id);
        LadyDataBase db= Room.databaseBuilder(this, LadyDataBase.class, "mydb")
                .allowMainThreadQueries()
                .build();
        Lady lady= db.getLAdyDao().getLadyById(id);
        descriptionTextView.setText(lady.description);
       /* Bundle extras = getIntent().getExtras();
        String description = extras.getString("desc");*/


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.description_menu,menu);
        MenuItem item = menu.findItem(R.id.share_menu);
        // Fetch and store ShareActionProvider
        shareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(item);
        Intent intent = new Intent(
                Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,"https://soundcloud.com");
        if (shareActionProvider != null) {
            shareActionProvider.setShareIntent(intent);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {


        if ((item.getItemId()==R.id.save_lady)){
            final LadyDataBase database=Room.databaseBuilder(this,LadyDataBase.class,"mydb")
                    .allowMainThreadQueries()
                    .build();
            final Lady lady= database.getLAdyDao().getLadyById(id);
            lady.isfavourit=true;
            database.getLAdyDao().update(lady);
            Toast.makeText(this, "Item saved succefully", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

}
