package com.foodfest;

// Food stall with daily footfall count
public class Stall {
    private String stallName;
    private int footfall;
    
    public Stall(String stallName, int footfall) {
        this.stallName = stallName;
        this.footfall = footfall;
    }
    
    public String getStallName() {
        return stallName;
    }
    
    public int getFootfall() {
        return footfall;
    }
    
    @Override
    public String toString() {
        return stallName + ": " + footfall + " visitors";
    }
}
