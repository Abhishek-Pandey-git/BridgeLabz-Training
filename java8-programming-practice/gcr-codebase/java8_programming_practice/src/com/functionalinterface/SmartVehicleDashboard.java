package com.functionalinterface;

interface VehicleDashboard {
    void displaySpeed();
    
    // Default method for battery display
    default void displayBattery() {
        System.out.println("Battery info not available");
    }
}

class PetrolCar implements VehicleDashboard {
    private int speed;
    
    public PetrolCar(int speed) {
        this.speed = speed;
    }
    
    @Override
    public void displaySpeed() {
        System.out.println("Petrol Car Speed: " + speed + " km/h");
    }
}

class ElectricVehicle implements VehicleDashboard {
    private int speed;
    private int batteryPercentage;
    
    public ElectricVehicle(int speed, int batteryPercentage) {
        this.speed = speed;
        this.batteryPercentage = batteryPercentage;
    }
    
    @Override
    public void displaySpeed() {
        System.out.println("Electric Vehicle Speed: " + speed + " km/h");
    }
    
    @Override
    public void displayBattery() {
        System.out.println("Battery Level: " + batteryPercentage + "%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        VehicleDashboard petrolCar = new PetrolCar(80);
        VehicleDashboard electricCar = new ElectricVehicle(100, 85);
        
        System.out.println("Petrol Car Dashboard:");
        petrolCar.displaySpeed();
        petrolCar.displayBattery();
        
        System.out.println("\nElectric Vehicle Dashboard:");
        electricCar.displaySpeed();
        electricCar.displayBattery();
    }
}
