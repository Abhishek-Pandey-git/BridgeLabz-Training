package com.scenariobasedquestion.cabbygo;

import java.util.ArrayList;
import java.util.List;

public class RideService implements IRideService {
    
    private List<Ride> activeRides;
    private List<Ride> completedRides;
    private List<Driver> availableDrivers;
    private int rideCounter;
    
    public RideService() {
        this.activeRides = new ArrayList<>();
        this.completedRides = new ArrayList<>();
        this.availableDrivers = new ArrayList<>();
        this.rideCounter = 1000;
    }
    
    public void addDriver(Driver driver) {
        if (driver != null && driver.isAvailable()) {
            availableDrivers.add(driver);
            System.out.println("Driver " + driver.getName() + " added to the system.");
        }
    }
    
    private Driver findAvailableDriver() {
        for (Driver driver : availableDrivers) {
            if (driver.isAvailable()) {
                return driver;
            }
        }
        return null;
    }
    
    private Vehicle createVehicle(String vehicleType) {
        switch(vehicleType.toLowerCase()) {
            case "mini":
                return new Mini("MH-" + (int)(Math.random() * 10000), 4);
            case "sedan":
                return new Sedan("MH-" + (int)(Math.random() * 10000), 5);
            case "suv":
                return new SUV("MH-" + (int)(Math.random() * 10000), 7);
            default:
                System.out.println("Invalid vehicle type. Using Sedan as default.");
                return new Sedan("MH-" + (int)(Math.random() * 10000), 5);
        }
    }
    
    // Implementation of bookRide method from IRideService
    @Override
    public boolean bookRide(String passenger, String pickupLocation, String dropLocation, String vehicleType) {
        Driver driver = findAvailableDriver();
        
        if (driver == null) {
            System.out.println("Sorry! No drivers available at the moment.");
            return false;
        }
        
        Vehicle vehicle = createVehicle(vehicleType);
        int rideId = rideCounter++;
        Ride ride = new Ride(rideId, passenger, pickupLocation, dropLocation, driver, vehicle);
        driver.setAvailable(false);
        activeRides.add(ride);
        
        System.out.println("\n===== RIDE BOOKED SUCCESSFULLY =====");
        System.out.println("Ride ID: " + rideId);
        System.out.println("Passenger: " + passenger);
        System.out.println("Driver: " + driver.getName());
        System.out.println("Driver Phone: " + driver.getPhoneNumber());
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
        System.out.println("Pickup: " + pickupLocation);
        System.out.println("Drop: " + dropLocation);
        System.out.println();
        
        return true;
    }
    
    @Override
    public double endRide(int rideId, double distance, double passengerRating) {
        Ride ride = null;
        for (Ride r : activeRides) {
            if (r.getRideId() == rideId) {
                ride = r;
                break;
            }
        }
        
        if (ride == null) {
            System.out.println("Ride with ID " + rideId + " not found.");
            return 0.0;
        }
        
        ride.calculateFare(distance);
        double fare = ride.getFare();
        Driver driver = ride.getDriver();
        driver.updateRating(passengerRating);
        driver.setAvailable(true);
        ride.setActive(false);
        activeRides.remove(ride);
        completedRides.add(ride);
        
        System.out.println("\n===== RIDE COMPLETED =====");
        System.out.println("Ride ID: " + rideId);
        System.out.println("Distance Traveled: " + distance + " km");
        System.out.println("Fare Amount: Rs. " + fare);
        System.out.println("Passenger Rating: " + passengerRating + "/5.0");
        System.out.println("Driver: " + driver.getName());
        System.out.println("Driver Updated Rating: " + driver.getRating() + "/5.0");
        System.out.println();
        
        return fare;
    }
    
    public void displayActiveRides() {
        if (activeRides.isEmpty()) {
            System.out.println("No active rides at the moment.");
            return;
        }
        System.out.println("\n===== ACTIVE RIDES =====");
        for (Ride ride : activeRides) {
            ride.displayRideDetails();
        }
    }
    
    public void displayCompletedRides() {
        if (completedRides.isEmpty()) {
            System.out.println("No completed rides yet.");
            return;
        }
        System.out.println("\n===== COMPLETED RIDES =====");
        for (Ride ride : completedRides) {
            ride.displayRideDetails();
        }
    }
}
