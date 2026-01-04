package com.encapsulationpolymorphisminterfaceandabstractclass;

//bike for ride hailing
public class Q8_RideBike extends Q8_RideVehicle implements Q8_GPS {
    
    private String currentLocation;
    
    public Q8_RideBike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }
    
    @Override
    public double calculateFare(double distance) {
        //cheaper base fare for bike
        double baseFare = 20;
        return baseFare + (distance * getRatePerKm());
    }
    
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
    
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Bike location updated to: " + newLocation);
    }
}
