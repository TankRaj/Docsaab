package com.teamd.doctorsaab.doctorsaab.activities;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;

import com.teamd.doctorsaab.doctorsaab.R;

public class HospitalDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_detail);
//        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
//        collapsingToolbarLayout.setTitle("My Hospital");
//        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.BLACK);
//        collapsingToolbarLayout.setExpandedTitleColor(Color.BLACK);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("My Hospital");
        collapsingToolbar.setCollapsedTitleTextColor(Color.BLACK);
        collapsingToolbar.setExpandedTitleColor(Color.BLACK);
        
//        loadToolBar();
//        setSupportActionBar((CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar));
//        toolbar.setTitleTextColor(Color.BLACK);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setBackgroundDrawable(
//                new ColorDrawable(Color.rgb(0, 0, 0)));
//        getSupportActionBar().setTitle(Html
//                .fromHtml("<font color='#000000'> My Hospital </font>"));
    }
}
