package com.teamd.doctorsaab.doctorsaab.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.teamd.doctorsaab.doctorsaab.R;
import com.teamd.doctorsaab.doctorsaab.adapters.GridListAdapter;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadToolBar();

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new GridListAdapter(this));


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "my view", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView parent, View v, int position1, long id) {
                switch (position1) {
                    case 0:
                        Intent intent1 = new Intent(getApplicationContext(),ChatBot.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent = new Intent(getApplicationContext(), HospitalsActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }

            }
        });


    }
}