package com.teamd.doctorsaab.doctorsaab.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.teamd.doctorsaab.doctorsaab.R;
import com.teamd.doctorsaab.doctorsaab.activities.HospitalDetailActivity;
import com.teamd.doctorsaab.doctorsaab.helpers.Random;

/**
 * Created by TankRaj on 10/26/2015.
 */
public class RecyclerAdapterTipsTricks extends RecyclerView.Adapter<RecyclerViewHolderTipsTricks> {

    String[] name = {"How to get rid of annoying blakheads?", "How to cure dog bites?",
                      "How to get rid of annoying blakheads?", "How to cure dog bites?",
                      "How to get rid of annoying blakheads?", "How to cure dog bites?",
                      "How to get rid of annoying blakheads?","How to cure dog bites?"};
    Context context;
    LayoutInflater inflater;

    public RecyclerAdapterTipsTricks(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public RecyclerViewHolderTipsTricks onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.model_tipstricks, parent, false);

        RecyclerViewHolderTipsTricks viewHolder = new RecyclerViewHolderTipsTricks(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolderTipsTricks holder, int position) {

        holder.tv1.setText(name[position]);
        Glide.with(holder.imageView.getContext())
                .load(Random.getRandomTankDrawable())
                .fitCenter()
                .into(holder.imageView);;
        holder.tv1.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
    }


    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent1 = new Intent(context, HospitalDetailActivity.class);
            context.startActivity(intent1);


//            RecyclerViewHolderHospital vholder = (RecyclerViewHolderHospital) v.getTag();
//            int position = vholder.getPosition();

        }
    };


    @Override
    public int getItemCount() {
        return name.length;
    }
}
