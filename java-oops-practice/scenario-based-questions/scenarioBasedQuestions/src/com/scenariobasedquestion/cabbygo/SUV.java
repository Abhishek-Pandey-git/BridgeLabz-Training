package com.scenariobasedquestion.cabbygo;

public class SUV extends Vehicle {
    
    public SUV(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "SUV", 120.0, 25.0);
    }
    
    @Override
    public void displayVehicleInfo() {
        System.out.println("===== SUV VEHICLE =====");
        super.displayVehicleInfo();
        System.out.println("Features: Spacious and premium, suitable for 7 passengers");
        System.out.println();
    }
}
