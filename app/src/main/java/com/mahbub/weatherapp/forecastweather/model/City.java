package com.mahbub.weatherapp.forecastweather.model;

/**
 * Created by mahbub on 4/26/2018.
 */

public class City {
    private String cityName;
    private String countryName;
    private double latl;
    private double lonl;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getLatl() {
        return latl;
    }

    public void setLatl(double latl) {
        this.latl = latl;
    }

    public double getLonl() {
        return lonl;
    }

    public void setLonl(double lonl) {
        this.lonl = lonl;
    }
}
