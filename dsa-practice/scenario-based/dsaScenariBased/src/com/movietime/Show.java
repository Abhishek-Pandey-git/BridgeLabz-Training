package com.movietime;

// Movie show with time slot
public class Show {
    private String movieName;
    private String time;
    private int timeInMinutes; // for easy comparison
    
    public Show(String movieName, String time) {
        this.movieName = movieName;
        this.time = time;
        this.timeInMinutes = convertToMinutes(time);
    }
    
    // Convert time format HH:MM to minutes
    private int convertToMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
    
    public String getMovieName() {
        return movieName;
    }
    
    public String getTime() {
        return time;
    }
    
    public int getTimeInMinutes() {
        return timeInMinutes;
    }
    
    @Override
    public String toString() {
        return movieName + " at " + time;
    }
}
