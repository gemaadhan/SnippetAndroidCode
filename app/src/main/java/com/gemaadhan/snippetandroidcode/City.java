package com.gemaadhan.snippetandroidcode;

import android.text.format.DateFormat;

import java.util.Calendar;
import java.util.Locale;

public class City {
    private Double mMag;
    private String mCityName;
    private int mTime;

    public City(Double mMag, String mCityName, int mTime) {
        this.mMag = mMag;
        this.mCityName = mCityName;
        this.mTime = mTime;
    }

    public Double getmMag() {
        return mMag;
    }

    public String getmCityName() {
        return mCityName;
    }

    public int getmTime() {
        return mTime;
    }

    public void setmMag(Double mMag) {
        this.mMag = mMag;
    }

    public void setmCityName(String mCityName) {
        this.mCityName = mCityName;
    }

    public void setmTime(int mTime) {
        this.mTime = mTime;
    }

    //Convert Double mMag into String
    public String getmMagString() {
        return Double.toString(mMag);
    }
    //Convert Unix mTIme into String
    public String getmTimeString() {
        Calendar cal = Calendar.getInstance(Locale.ENGLISH);
        cal.setTimeInMillis(mTime);
        String date = DateFormat.format("dd MMMM yyyy", cal).toString();
        return date;
    }
}
