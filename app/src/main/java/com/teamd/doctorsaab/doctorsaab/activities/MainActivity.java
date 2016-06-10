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



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView parent, View v, int position1, long id) {
                switch (position1) {
                    case 0:
                        Intent intent0 = new Intent(getApplicationContext(),ChatBot.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), HospitalsActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), SpecialistsActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), TipsTricksActivity.class);
                        startActivity(intent3);
                        break;
                    default:
                        break;
                }

            }
        });


    }
}