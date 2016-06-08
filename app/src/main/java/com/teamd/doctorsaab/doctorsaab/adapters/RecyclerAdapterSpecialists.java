package com.teamd.doctorsaab.doctorsaab.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.teamd.doctorsaab.doctorsaab.R;

/**
 * Created by Tankraj on 6/5/2016.
 */
public class RecyclerAdapterSpecialists extends  RecyclerView.Adapter<RecyclerViewHolderSpecialists> {

    String [] name={"Doctor A","Doctor B","Doctor C"," Doctor D"};
    String [] contacts = {"N/A","N/A","N/A","N/A"};
    String [] speciality = {"General","General","General","General" };
    Context context;
    LayoutInflater inflater;
    public RecyclerAdapterSpecialists(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }


    @Override
    public RecyclerViewHolderSpecialists onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.model_specialists, parent, false);

        RecyclerViewHolderSpecialists viewHolder=new RecyclerViewHolderSpecialists(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolderSpecialists holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv2.setText(contacts[position]);
        holder.imageView.setOnClickListener(clickListener);
        holder.imageView.setTag(holder);
    }



    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            RecyclerViewHolderSpecialists vholder = (RecyclerViewHolderSpecialists) v.getTag();
            int position = vholder.getPosition();

            Toast.makeText(context,"This is position "+position,Toast.LENGTH_LONG ).show();

        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }
}
