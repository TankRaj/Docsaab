package com.teamd.doctorsaab.doctorsaab.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.teamd.doctorsaab.doctorsaab.R;
import com.teamd.doctorsaab.doctorsaab.adapters.RecyclerAdapterHospital;

/**
 * Created by Tankraj on 5/8/2016.
 */
public class HospitalsActivity extends BaseActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);
        loadToolBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Hospitals");


        recyclerView= (RecyclerView) findViewById(R.id.recycler_specialists);

        RecyclerAdapterHospital adapter=new RecyclerAdapterHospital(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
