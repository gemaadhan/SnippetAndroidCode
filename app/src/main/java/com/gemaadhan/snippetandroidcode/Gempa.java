package com.gemaadhan.snippetandroidcode;

import android.text.format.DateFormat;

import java.util.Calendar;
import java.util.Locale;

public class Gempa {
    private Double mMag;
    private String mCityName;
    private long mTime;

    public Gempa(Double mMag, String mCityName, long mTime) {
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

    public long getmTime() {
        return mTime;
    }

    public void setmMag(Double mMag) {
        this.mMag = mMag;
    }

    public void setmCityName(String mCityName) {
        this.mCityName = mCityName;
    }

    public void setmTime(long mTime) {
        this.mTime = mTime;
    }


}