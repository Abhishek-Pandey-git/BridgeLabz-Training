package com.encapsulationpolymorphisminterfaceandabstractclass;

//abstract vehicle class for rental system
public abstract class Q3_Vehicle {
    
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    
    public Q3_Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    
    //abstract method
    public abstract double calculateRentalCost(int days);
    
    //getters setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public double getRentalRate() {
        return rentalRate;
    }
    
    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}
