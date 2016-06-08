package com.teamd.doctorsaab.doctorsaab.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.teamd.doctorsaab.doctorsaab.R;

public class RecyclerViewHolderHospital extends RecyclerView.ViewHolder {

    TextView tv1,tv2;
    ImageView imageView;

    public RecyclerViewHolderHospital(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.tips_name);
        tv2= (TextView) itemView.findViewById(R.id.category);
        imageView= (ImageView) itemView.findViewById(R.id.ic_specialist);

    }
}
