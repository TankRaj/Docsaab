package com.teamd.doctorsaab.doctorsaab.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.teamd.doctorsaab.doctorsaab.R;

public class RecyclerViewHolderTipsTricks extends RecyclerView.ViewHolder {

    TextView tv1,tv2;

    public RecyclerViewHolderTipsTricks(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.tips_name);

    }
}
