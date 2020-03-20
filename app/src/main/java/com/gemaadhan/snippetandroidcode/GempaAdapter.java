package com.gemaadhan.snippetandroidcode;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.net.SocketImpl;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

        Gempa currentGempa = getItem(position);
        TextView magTextView = (TextView) listItemView.findViewById(R.id.list_item_mag);
        int magcolor = getMagColor(currentGempa.getmMag());

        GradientDrawable circlemag = (GradientDrawable) magTextView.getBackground();
        int magColor = getMagColor(currentGempa.getmMag());
        circlemag.setColor(magColor);

        magTextView.setText(getmMagString(currentGempa.getmMag()));


        TextView distanceTextView = (TextView) listItemView.findViewById(R.id.list_item_distance);
        TextView countryTextView = (TextView) listItemView.findViewById(R.id.list_item_country);

        String[] sepataredCity = currentGempa.getmCityName().split("of");
        if (currentGempa.getmCityName().contains("of")) {
            distanceTextView.setText(sepataredCity[0]);
            countryTextView.setText(sepataredCity[1].trim());
        } else {
            distanceTextView.setText(R.string.add_text_1);
            countryTextView.setText(currentGempa.getmCityName());
        }


        Date dateObject = new Date(currentGempa.getmTime());
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.list_item_date);
        String formattedDate = formatDate(dateObject);
        dateTextView.setText(formattedDate);

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.list_item_time);
        String formattedTime = formatTime(dateObject);
        timeTextView.setText(formattedTime);

        return listItemView;

    }

    private int getMagColor(Double getmMag) {
        int angkaBulatDariMag = (int) Math.floor(getmMag);
        int magColorResouceID;
        switch (angkaBulatDariMag) {
            case 0:
            case 1:
                magColorResouceID = R.color.magnitude1;
                break;
            case 2:
                magColorResouceID = R.color.magnitude2;
                break;
            case 3:
                magColorResouceID = R.color.magnitude3;
                break;
            case 4:
                magColorResouceID = R.color.magnitude4;
                break;
            case 5:
                magColorResouceID = R.color.magnitude5;
                break;
            case 6:
                magColorResouceID = R.color.magnitude6;
                break;
            case 7:
                magColorResouceID = R.color.magnitude7;
                break;
            case 8:
                magColorResouceID = R.color.magnitude8;
                break;
            case 9:
                magColorResouceID = R.color.magnitude9;
                break;
            default:
                magColorResouceID = R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext(), magColorResouceID);
    }


    private String getmMagString(Double getmMag) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(getmMag);
    }


    private String formatDate(Date dateobject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateobject);
    }

    private String formatTime(Date dateobject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateobject);
    }


}
