package com.scenariobasedquestion.cabbygo;

public class Ride {
    
    private int rideId;
    private String passengerName;
    private String pickupLocation;
    private String dropLocation;
    private Driver driver;
    private Vehicle vehicle;
    private double fare;
    private boolean isActive;
    
    public Ride(int rideId, String passengerName, String pickupLocation, 
                String dropLocation, Driver driver, Vehicle vehicle) {
        this.rideId = rideId;
        this.passengerName = passengerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.driver = driver;
        this.vehicle = vehicle;
        this.fare = 0.0;
        this.isActive = true;
    }
    
    public int getRideId() {
        return rideId;
    }
    
    public String getPassengerName() {
        return passengerName;
    }
    
    public String getPickupLocation() {
        return pickupLocation;
    }
    
    public String getDropLocation() {
        return dropLocation;
    }
    
    public Driver getDriver() {
        return driver;
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }
    
    public double getFare() {
        return fare;
    }
    
    public void calculateFare(double distance) {
        this.fare = vehicle.calculateFare(distance);
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    public void setActive(boolean active) {
        isActive = active;
    }
    
    public void displayRideDetails() {
        System.out.println("\n===== RIDE DETAILS =====");
        System.out.println("Ride ID: " + rideId);
        System.out.println("Passenger: " + passengerName);
        System.out.println("From: " + pickupLocation);
        System.out.println("To: " + dropLocation);
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
        System.out.println("Driver: " + driver.getName());
        System.out.println("Driver Rating: " + driver.getRating());
        System.out.println("Fare: Rs. " + fare);
        System.out.println("Status: " + (isActive ? "Active" : "Completed"));
        System.out.println();
    }
}
