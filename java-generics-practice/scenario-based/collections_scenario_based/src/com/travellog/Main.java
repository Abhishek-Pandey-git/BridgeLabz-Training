package com.travellog;

public class Main {
    public static void main(String[] args) {
        TravelLog log = new TravelLog();
        
        Trip trip1 = new Trip("Paris", "France", 7, "Amazing city");
        Trip trip2 = new Trip("Tokyo", "Japan", 4, "Great food");
        Trip trip3 = new Trip("Paris", "France", 6, "Second visit");
        Trip trip4 = new Trip("London", "UK", 3, "Rainy weather");
        Trip trip5 = new Trip("Dubai", "UAE", 8, "Luxury trip");

        String filename = "trips.dat";
        
        log.saveTrip(trip1, filename);
        log.saveTrip(trip2, filename);
        log.saveTrip(trip3, filename);
        log.saveTrip(trip4, filename);
        log.saveTrip(trip5, filename);

        log.loadTrips(filename);
        
        log.displaySummary();
        
        System.out.println("\nSearching for 'Paris': " + log.searchCities("Paris"));
    }
}
