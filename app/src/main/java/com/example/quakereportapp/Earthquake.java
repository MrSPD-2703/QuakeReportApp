package com.example.quakereportapp;

public class Earthquake {

    // @param magnitude earth quake magnitude
    private String magnitude;

    // @param city location of earthquake
    private String location;

    // @param date , the  date of the earthquake
    private String date;
    private String murl;


    public Earthquake(String magnitude, String location, String date, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.date = date;
        this.murl = url;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return murl;
    }


}