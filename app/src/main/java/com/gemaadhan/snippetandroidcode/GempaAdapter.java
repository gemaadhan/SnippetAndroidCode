package com.gemaadhan.snippetandroidcode;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GempaAdapter extends ArrayAdapter<Gempa> {


    public GempaAdapter(Activity context, ArrayList<Gempa> Gempa) {
        super(context, 0, Gempa);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Gempa currentGempa  = getItem(position);
        TextView magTextView = (TextView) listItemView.findViewById(R.id.list_item_mag);

        magTextView.setText(getmMagString(currentGempa.getmMag()));

        TextView cityTextView = (TextView) listItemView.findViewById(R.id.list_item_city);
        cityTextView.setText(currentGempa.getmCityName());

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.list_item_time);
        timeTextView.setText(currentGempa.getmTime());

        return listItemView;
        
    }

    public String getmMagString(Double getmMag){
        return getmMag.toString();
    }


}
