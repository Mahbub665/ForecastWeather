package com.mahbub.weatherapp.forecastweather.model;

/**
 * Created by mahbub on 4/26/2018.
 */

public class Weather {

    private int id;
    private String main;
    private String description;
    private String icon;
    private long lastUpeate;



    City city = new City();
    Cloud cloud = new Cloud();
    Humidity humidity = new Humidity();
    Pressure pressure = new Pressure();
    Temperature temperature = new Temperature();
    Wind wind = new Wind();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public long getLastUpeate() {
        return lastUpeate;
    }

    public void setLastUpeate(long lastUpeate) {
        this.lastUpeate = lastUpeate;
    }
}
