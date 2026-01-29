package com.functionalinterface;

// Interface for rental vehicles
interface RentalVehicle {
    void rent(String customerName);
    void returnVehicle();
}

// Car implementation
class Car implements RentalVehicle {
    private String model;
    private String currentCustomer;
    
    public Car(String model) {
        this.model = model;
    }
    
    @Override
    public void rent(String customerName) {
        this.currentCustomer = customerName;
        System.out.println("Car " + model + " rented to " + customerName);
    }
    
    @Override
    public void returnVehicle() {
        System.out.println("Car " + model + " returned by " + currentCustomer);
        this.currentCustomer = null;
    }
}

// Bike implementation
class Bike implements RentalVehicle {
    private String type;
    private String currentCustomer;
    
    public Bike(String type) {
        this.type = type;
    }
    
    @Override
    public void rent(String customerName) {
        this.currentCustomer = customerName;
        System.out.println("Bike " + type + " rented to " + customerName);
    }
    
    @Override
    public void returnVehicle() {
        System.out.println("Bike " + type + " returned by " + currentCustomer);
        this.currentCustomer = null;
    }
}

// Bus implementation
class Bus implements RentalVehicle {
    private int seatingCapacity;
    private String currentCustomer;
    
    public Bus(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
    
    @Override
    public void rent(String customerName) {
        this.currentCustomer = customerName;
        System.out.println("Bus with " + seatingCapacity + " seats rented to " + customerName);
    }
    
    @Override
    public void returnVehicle() {
        System.out.println("Bus with " + seatingCapacity + " seats returned by " + currentCustomer);
        this.currentCustomer = null;
    }
}

public class MultiVehicleRental {
    public static void main(String[] args) {
        RentalVehicle car = new Car("Honda City");
        RentalVehicle bike = new Bike("Royal Enfield");
        RentalVehicle bus = new Bus(50);
        
        // Rent vehicles
        car.rent("John");
        bike.rent("Alice");
        bus.rent("Corporate Tours");
        
        System.out.println();
        
        // Return vehicles
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
