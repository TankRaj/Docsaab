package com.teamd.doctorsaab.doctorsaab.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.teamd.doctorsaab.doctorsaab.R;

/**
 * Created by Tankraj on 6/5/2016.
 */
public class RecyclerViewHolderSpecialists extends RecyclerView.ViewHolder {

    TextView tv1,tv2;
    ImageView imageView;

    public RecyclerViewHolderSpecialists(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.hospital_name);
        tv2= (TextView) itemView.findViewById(R.id.expertise);
        imageView= (ImageView) itemView.findViewById(R.id.ic_specialist);

    }
}
