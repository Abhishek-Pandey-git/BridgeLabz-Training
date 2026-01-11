package com.ambulance;

public class AmbulanceRoute {
    public static void main(String[] args) {
        CircularRoute route = new CircularRoute();
        
        System.out.println("=== Setting Up Hospital Units ===");
        route.addUnit("Emergency");
        route.addUnit("Radiology");
        route.addUnit("Surgery");
        route.addUnit("ICU");
        
        route.displayRoute();
        
        System.out.println("\n=== Patient 1 Arriving ===");
        String unit = route.findAvailableUnit();
        System.out.println("Directing patient to: " + unit);
        route.setUnitStatus(unit, false);
        
        System.out.println("\n=== Patient 2 Arriving ===");
        unit = route.findAvailableUnit();
        System.out.println("Directing patient to: " + unit);
        route.setUnitStatus(unit, false);
        
        route.displayRoute();
        
        System.out.println("\n=== Emergency Unit Available Again ===");
        route.setUnitStatus("Emergency", true);
        
        route.displayRoute();
        
        System.out.println("\n=== Patient 3 Arriving ===");
        unit = route.findAvailableUnit();
        System.out.println("Directing patient to: " + unit);
        
        System.out.println("\n=== Radiology Under Maintenance ===");
        route.removeUnit("Radiology");
        
        route.displayRoute();
        
        System.out.println("\n=== Finding Available Unit After Maintenance ===");
        unit = route.findAvailableUnit();
        System.out.println("Directing patient to: " + unit);
    }
}
