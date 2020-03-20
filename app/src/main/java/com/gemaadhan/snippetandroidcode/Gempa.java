package com.gemaadhan.snippetandroidcode;

import android.text.format.DateFormat;

import java.util.Calendar;
import java.util.Locale;

public class Gempa {
    private Double mMag;
    private String mCityName;
    private long mTime;
    private String murl;
    public Gempa(Double mMag, String mCityName, long mTime, String murl) {
        this.mMag = mMag;
        this.mCityName = mCityName;
        this.mTime = mTime;
        this.murl = murl;
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

    public String getmUrl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl;
    }
}