package com.teamd.doctorsaab.doctorsaab.activities;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.teamd.doctorsaab.doctorsaab.R;

/**
 * Created by hereshem on 4/11/16.
 */
public class gitBaseActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }

    public void loadToolBar(){
        try {
            setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }catch(Exception e){}
    }
}
