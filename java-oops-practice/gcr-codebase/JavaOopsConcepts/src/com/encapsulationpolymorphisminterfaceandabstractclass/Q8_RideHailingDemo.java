package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

//ride hailing application demo
public class Q8_RideHailingDemo {
    
    public static void main(String[] args) {
        
        //creating list of vehicles
        ArrayList<Q8_RideVehicle> vehicles = new ArrayList<>();
        
        //adding cars
        Q8_RideCar car1 = new Q8_RideCar("CAR001", "Ramesh Kumar", 12);
        car1.updateLocation("MG Road");
        
        Q8_RideCar car2 = new Q8_RideCar("CAR002", "Suresh Patel", 15);
        car2.updateLocation("Koramangala");
        
        //adding bikes
        Q8_RideBike bike1 = new Q8_RideBike("BIKE001", "Vijay Singh", 8);
        bike1.updateLocation("Indiranagar");
        
        Q8_RideBike bike2 = new Q8_RideBike("BIKE002", "Rahul Sharma", 7);
        bike2.updateLocation("Whitefield");
        
        //adding autos
        Q8_RideAuto auto1 = new Q8_RideAuto("AUTO001", "Mohan Das", 10);
        auto1.updateLocation("Jayanagar");
        
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(bike1);
        vehicles.add(bike2);
        vehicles.add(auto1);
        
        double rideDistance = 15.5;
        
        System.out.println("Ride Hailing Application");
        System.out.println("========================");
        System.out.println("Ride Distance: " + rideDistance + " km");
        System.out.println("");
        
        //using polymorphism to calculate fares
        for(int i=0; i<vehicles.size(); i++) {
            Q8_RideVehicle v = vehicles.get(i);
            v.getVehicleDetails();
            
            //checking gps location
            if(v instanceof Q8_GPS) {
                Q8_GPS gps = (Q8_GPS)v;
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }
            
            double fare = v.calculateFare(rideDistance);
            System.out.println("Total Fare: Rs." + fare);
            System.out.println("-------------------");
        }
    }
}
