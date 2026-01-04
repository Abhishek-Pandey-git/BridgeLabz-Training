package com.encapsulationpolymorphisminterfaceandabstractclass;

//auto for ride hailing
public class Q8_RideAuto extends Q8_RideVehicle implements Q8_GPS {
    
    private String currentLocation;
    
    public Q8_RideAuto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }
    
    @Override
    public double calculateFare(double distance) {
        //auto fare calculation
        double baseFare = 30;
        return baseFare + (distance * getRatePerKm());
    }
    
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
    
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Auto location updated to: " + newLocation);
    }
}
