package com.scenariobasedquestion.cabbygo;

public class Sedan extends Vehicle {
    
    public Sedan(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "Sedan", 80.0, 20.0);
    }
    
    @Override
    public void displayVehicleInfo() {
        System.out.println("===== SEDAN VEHICLE =====");
        super.displayVehicleInfo();
        System.out.println("Features: Comfortable, suitable for 5 passengers");
        System.out.println();
    }
}
