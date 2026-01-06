package com.scenariobasedquestion.cabbygo;

public class Vehicle {
    
    private String vehicleNumber;
    private int capacity;
    private String type;
    private double baseFare;
    private double perKmRate;
    
    public Vehicle(String vehicleNumber, int capacity, String type, double baseFare, double perKmRate) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.baseFare = baseFare;
        this.perKmRate = perKmRate;
    }
    
    public double calculateFare(double distance) {
        return this.baseFare + (distance * this.perKmRate);
    }
    
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public String getType() {
        return type;
    }
    
    public double getBaseFare() {
        return baseFare;
    }
    
    public double getPerKmRate() {
        return perKmRate;
    }
    
    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Capacity: " + capacity + " passengers");
        System.out.println("Type: " + type);
        System.out.println("Base Fare: Rs. " + baseFare);
        System.out.println("Rate per KM: Rs. " + perKmRate);
    }
}
