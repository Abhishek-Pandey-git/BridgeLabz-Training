package com.scenariobasedquestion.cabbygo;

public class CabbyGoDemo {
    
    public static void main(String[] args) {
        
        RideService rideService = new RideService();
        
        Driver driver1 = new Driver("Rajesh Kumar", "DL-2023-001", "98765-43210");
        Driver driver2 = new Driver("Amit Sharma", "DL-2023-002", "98765-43211");
        Driver driver3 = new Driver("Priya Singh", "DL-2023-003", "98765-43212");
        
        rideService.addDriver(driver1);
        rideService.addDriver(driver2);
        rideService.addDriver(driver3);
        
        System.out.println("\n========== CABBIGO RIDE-HAILING APP ==========\n");
        
        System.out.println("===== AVAILABLE DRIVERS =====");
        driver1.displayDriverInfo();
        System.out.println();
        driver2.displayDriverInfo();
        System.out.println();
        driver3.displayDriverInfo();
        System.out.println();
        
        System.out.println("===== AVAILABLE VEHICLE TYPES =====");
        Mini mini = new Mini("MH-0001", 4);
        Sedan sedan = new Sedan("MH-0002", 5);
        SUV suv = new SUV("MH-0003", 7);
        
        mini.displayVehicleInfo();
        sedan.displayVehicleInfo();
        suv.displayVehicleInfo();
        
        System.out.println("===== BOOKING RIDE 1 =====");
        boolean ride1Booked = rideService.bookRide(
            "Deepak Verma", 
            "Mumbai Airport", 
            "Bandra", 
            "Mini"
        );
        
        System.out.println("===== BOOKING RIDE 2 =====");
        boolean ride2Booked = rideService.bookRide(
            "Neha Gupta", 
            "Dadar Station", 
            "Powai", 
            "Sedan"
        );
        
        System.out.println("===== BOOKING RIDE 3 =====");
        boolean ride3Booked = rideService.bookRide(
            "Arjun Desai", 
            "Colaba", 
            "Thane", 
            "SUV"
        );
        
        rideService.displayActiveRides();
        
        System.out.println("===== COMPLETING RIDE 1 =====");
        double fare1 = rideService.endRide(1000, 15.0, 4.5);
        
        System.out.println("===== COMPLETING RIDE 2 =====");
        double fare2 = rideService.endRide(1001, 22.0, 5.0);
        
        System.out.println("===== COMPLETING RIDE 3 =====");
        double fare3 = rideService.endRide(1002, 35.0, 4.0);
        
        rideService.displayActiveRides();
        rideService.displayCompletedRides();
        
        System.out.println("===== UPDATED DRIVER INFORMATION =====");
        driver1.displayDriverInfo();
        System.out.println();
        driver2.displayDriverInfo();
        System.out.println();
        driver3.displayDriverInfo();
        System.out.println();
        
        // Fare calculation example
        System.out.println("===== FARE CALCULATION EXAMPLE =====");
        System.out.println("Mini: Base Fare Rs.50 + Distance(15km) * Rate(Rs.15) = Rs. " + mini.calculateFare(15));
        System.out.println("Sedan: Base Fare Rs.80 + Distance(22km) * Rate(Rs.20) = Rs. " + sedan.calculateFare(22));
        System.out.println("SUV: Base Fare Rs.120 + Distance(35km) * Rate(Rs.25) = Rs. " + suv.calculateFare(35));
    }
}
