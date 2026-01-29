package com.functionalinterface;

// Vehicle Rental Interface
interface RentalVehicle {
    void rent(String customerName);
    void returnVehicle();
}

// Car implementation
class Car implements RentalVehicle {
    private String model;
    private boolean isRented;
    
    public Car(String model) {
        this.model = model;
        this.isRented = false;
    }
    
    @Override
    public void rent(String customerName) {
        if (!isRented) {
            isRented = true;
            System.out.println("Car " + model + " rented to " + customerName);
        } else {
            System.out.println("Car " + model + " is already rented");
        }
    }
    
    @Override
    public void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println("Car " + model + " returned successfully");
        } else {
            System.out.println("Car " + model + " was not rented");
        }
    }
}

// Bike implementation
class Bike implements RentalVehicle {
    private String type;
    private boolean isRented;
    
    public Bike(String type) {
        this.type = type;
        this.isRented = false;
    }
    
    @Override
    public void rent(String customerName) {
        if (!isRented) {
            isRented = true;
            System.out.println("Bike " + type + " rented to " + customerName);
        } else {
            System.out.println("Bike " + type + " is already rented");
        }
    }
    
    @Override
    public void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println("Bike " + type + " returned successfully");
        } else {
            System.out.println("Bike " + type + " was not rented");
        }
    }
}

// Bus implementation
class Bus implements RentalVehicle {
    private int capacity;
    private boolean isRented;
    
    public Bus(int capacity) {
        this.capacity = capacity;
        this.isRented = false;
    }
    
    @Override
    public void rent(String customerName) {
        if (!isRented) {
            isRented = true;
            System.out.println("Bus (Capacity: " + capacity + ") rented to " + customerName);
        } else {
            System.out.println("Bus is already rented");
        }
    }
    
    @Override
    public void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println("Bus returned successfully");
        } else {
            System.out.println("Bus was not rented");
        }
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        RentalVehicle car = new Car("Honda City");
        RentalVehicle bike = new Bike("Royal Enfield");
        RentalVehicle bus = new Bus(50);
        
        // Rent vehicles
        car.rent("John");
        bike.rent("Alice");
        bus.rent("Tour Company");
        
        System.out.println();
        
        // Return vehicles
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
