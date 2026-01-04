package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

//vehicle rental system demo
public class Q3_VehicleRentalDemo {
    
    public static void main(String[] args) {
        
        //creating list of vehicles
        ArrayList<Q3_Vehicle> vehicles = new ArrayList<>();
        
        //adding cars
        Q3_Car car1 = new Q3_Car("KA01AB1234", 1500, "CAR-INS-001");
        Q3_Car car2 = new Q3_Car("KA02CD5678", 2000, "CAR-INS-002");
        
        //adding bikes
        Q3_Bike bike1 = new Q3_Bike("KA03EF9012", 500, "BIKE-INS-001");
        Q3_Bike bike2 = new Q3_Bike("KA04GH3456", 600, "BIKE-INS-002");
        
        //adding trucks
        Q3_Truck truck1 = new Q3_Truck("KA05IJ7890", 3000, "TRUCK-INS-001");
        
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(bike1);
        vehicles.add(bike2);
        vehicles.add(truck1);
        
        int rentalDays = 7;
        
        System.out.println("Vehicle Rental System");
        System.out.println("====================");
        System.out.println("Rental Period: " + rentalDays + " days");
        System.out.println("");
        
        //using polymorphism to process vehicles
        for(int i=0; i<vehicles.size(); i++) {
            Q3_Vehicle v = vehicles.get(i);
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Type: " + v.getType());
            System.out.println("Daily Rental Rate: Rs." + v.getRentalRate());
            System.out.println("Total Rental Cost: Rs." + v.calculateRentalCost(rentalDays));
            
            //checking insurance
            if(v instanceof Q3_Insurable) {
                Q3_Insurable ins = (Q3_Insurable)v;
                System.out.println("Insurance Cost: Rs." + ins.calculateInsurance());
                System.out.println(ins.getInsuranceDetails());
            }
            System.out.println("-------------------");
        }
    }
}
