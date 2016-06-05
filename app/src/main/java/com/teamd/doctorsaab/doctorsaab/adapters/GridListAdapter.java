package com.teamd.doctorsaab.doctorsaab.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.teamd.doctorsaab.doctorsaab.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pandit Ji on 3/1/2016.
 */
public class GridListAdapter extends BaseAdapter {
    private List<Item> items = new ArrayList<Item>();
    private LayoutInflater inflater;

    public GridListAdapter(Context context) {
        inflater = LayoutInflater.from(context);

        items.add(new Item("Chatbot",R.drawable.one));
        items.add(new Item("Hospitals", R.drawable.two));
        items.add(new Item("Specialists", R.drawable.three));
        items.add(new Item("Natural Therapy", R.drawable.four));
        items.add(new Item("Ayurveda", R.drawable.icon_1));
        items.add(new Item("About Us", R.drawable.icon_1));
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return items.get(i).drawableId;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        ImageView picture;
        TextView name;

        if (v == null) {
            v = inflater.inflate(R.layout.item_home, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text, v.findViewById(R.id.text));
        }

        picture = (ImageView) v.getTag(R.id.picture);
        name = (TextView) v.getTag(R.id.text);

        Item item = (Item) getItem(i);

        picture.setImageResource(item.drawableId);
        name.setText(item.name);

        return v;
    }

    public class Item {
        final String name;
        final int drawableId;

        Item(String name, int drawableId) {
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}
