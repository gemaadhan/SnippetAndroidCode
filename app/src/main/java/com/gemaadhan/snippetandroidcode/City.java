package com.gemaadhan.snippetandroidcode;

import android.text.format.DateFormat;

import java.util.Calendar;
import java.util.Locale;

public class City {
    private String mMag;
    private String mCityName;
    private String mTime;

    public City(String mMag, String mCityName, String mTime) {
        this.mMag = mMag;
        this.mCityName = mCityName;
        this.mTime = mTime;
    }

    public String getmMag() {
        return mMag;
    }

    public String getmCityName() {
        return mCityName;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmMag(String mMag) {
        this.mMag = mMag;
    }

    public void setmCityName(String mCityName) {
        this.mCityName = mCityName;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

}
