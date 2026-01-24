package com.travellog;

import java.io.Serializable;

public class Trip implements Serializable {
    private String city;
    private String country;
    private int duration;
    private String description;

    public Trip(String city, String country, int duration, String description) {
        this.city = city;
        this.country = country;
        this.duration = duration;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "City: " + city + ", Country: " + country + ", Duration: " + duration + " days";
    }
}
