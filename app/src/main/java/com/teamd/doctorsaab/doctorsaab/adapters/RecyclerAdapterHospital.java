package com.teamd.doctorsaab.doctorsaab.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.teamd.doctorsaab.doctorsaab.R;
import com.teamd.doctorsaab.doctorsaab.activities.HospitalDetailActivity;
import com.teamd.doctorsaab.doctorsaab.activities.HospitalsActivity;
import com.teamd.doctorsaab.doctorsaab.activities.SpecialistsActivity;

/**
 * Created by kundan on 10/26/2015.
 */
public class RecyclerAdapterHospital extends  RecyclerView.Adapter<RecyclerViewHolderHospital> {

    String [] name={"Grandy Hospital","Norvic Hospital","Bir Hospital","Aum Hospital",
            "Falano Hospital","Dhiskano Hospital","My Hospital","Your Hospital","Our Hospital","Best Hospital"};
    String [] contacts = {"01444444","01444444","01444444","01444444","01444444","01444444","01444444","01444444","01444444","01444444"};
    String [] speciality = {"General","General","General","General","General","General","General","General","General","General" };
    Context context;
    LayoutInflater inflater;
    public RecyclerAdapterHospital(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }


    @Override
    public RecyclerViewHolderHospital onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.model_hospital, parent, false);

        RecyclerViewHolderHospital viewHolder=new RecyclerViewHolderHospital(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolderHospital holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv2.setText(contacts[position]);
        holder.imageView.setOnClickListener(clickListener);
        holder.imageView.setTag(holder);
    }



    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent1 = new Intent(context, HospitalDetailActivity.class);
           context. startActivity(intent1);


//            RecyclerViewHolderHospital vholder = (RecyclerViewHolderHospital) v.getTag();
//            int position = vholder.getPosition();

        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }
}
