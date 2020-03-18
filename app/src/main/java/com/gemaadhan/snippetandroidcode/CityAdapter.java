package com.gemaadhan.snippetandroidcode;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CityAdapter extends ArrayAdapter<City> {

    public static String currentCity;

    public CityAdapter(Activity context, ArrayList<City> City) {
        super(context, 0, City);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        City currentCity  = getItem(position);
        TextView magTextView = (TextView) listItemView.findViewById(R.id.list_item_mag);
        magTextView.setText(currentCity.getmMag());

        TextView cityTextView = (TextView) listItemView.findViewById(R.id.list_item_city);
        cityTextView.setText(currentCity.getmCityName());

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.list_item_time);
        timeTextView.setText(currentCity.getmTime());

        return listItemView;
        
    }
}
