package com.encapsulationpolymorphisminterfaceandabstractclass;

//abstract vehicle class for ride hailing
public abstract class Q8_RideVehicle {
    
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    
    public Q8_RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    
    //abstract method
    public abstract double calculateFare(double distance);
    
    //concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per km: Rs." + ratePerKm);
    }
    
    //getters and setters
    public String getVehicleId() {
        return vehicleId;
    }
    
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    
    public String getDriverName() {
        return driverName;
    }
    
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    
    public double getRatePerKm() {
        return ratePerKm;
    }
    
    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
}
