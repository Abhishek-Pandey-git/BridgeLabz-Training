package com.encapsulationpolymorphisminterfaceandabstractclass;

//car for ride hailing
public class Q8_RideCar extends Q8_RideVehicle implements Q8_GPS {
    
    private String currentLocation;
    
    public Q8_RideCar(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }
    
    @Override
    public double calculateFare(double distance) {
        //base fare plus distance charge
        double baseFare = 50;
        return baseFare + (distance * getRatePerKm());
    }
    
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
    
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Car location updated to: " + newLocation);
    }
}
