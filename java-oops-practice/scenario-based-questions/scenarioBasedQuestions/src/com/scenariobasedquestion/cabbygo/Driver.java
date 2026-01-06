package com.scenariobasedquestion.cabbygo;

public class Driver {
    
    private String name;
    private String licenseNumber;
    private double rating;
    private String phoneNumber;
    private boolean isAvailable;
    
    public Driver(String name, String licenseNumber, String phoneNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.phoneNumber = phoneNumber;
        this.rating = 5.0;
        this.isAvailable = true;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLicenseNumber() {
        return licenseNumber;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public double getRating() {
        return rating;
    }
    
    public void setRating(double rating) {
        if (rating >= 1.0 && rating <= 5.0) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating. Rating must be between 1.0 and 5.0");
        }
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    
    public void updateRating(double newRating) {
        this.rating = (this.rating + newRating) / 2.0;
    }
    
    public void displayDriverInfo() {
        System.out.println("Driver Name: " + name);
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Rating: " + rating + "/5.0");
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}
