package com.scenariobasedquestion.cabbygo;

public class Mini extends Vehicle {
    
    public Mini(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "Mini", 50.0, 15.0);
    }
    
    @Override
    public void displayVehicleInfo() {
        System.out.println("===== MINI VEHICLE =====");
        super.displayVehicleInfo();
        System.out.println("Features: Budget-friendly, suitable for 4 passengers");
        System.out.println();
    }
}
