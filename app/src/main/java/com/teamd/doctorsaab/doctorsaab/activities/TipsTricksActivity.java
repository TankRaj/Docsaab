package com.teamd.doctorsaab.doctorsaab.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.teamd.doctorsaab.doctorsaab.R;
import com.teamd.doctorsaab.doctorsaab.adapters.RecyclerAdapterHospital;
import com.teamd.doctorsaab.doctorsaab.adapters.RecyclerAdapterTipsTricks;

public class TipsTricksActivity extends BaseActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipstricks);

        loadToolBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tips And Tricks");


        recyclerView= (RecyclerView) findViewById(R.id.recycler_tips);

        RecyclerAdapterTipsTricks adapter=new RecyclerAdapterTipsTricks(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
