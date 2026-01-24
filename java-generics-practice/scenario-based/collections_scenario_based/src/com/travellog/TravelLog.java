package com.travellog;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLog {
    private List<Trip> trips;

    public TravelLog() {
        trips = new ArrayList<>();
    }

    public void saveTrip(Trip trip, String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(trip);
            oos.close();
            fos.close();
            System.out.println("Trip saved");
        } catch (Exception e) {
            System.out.println("Error saving trip");
        }
    }

    public void loadTrips(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            while (true) {
                try {
                    Trip trip = (Trip) ois.readObject();
                    trips.add(trip);
                } catch (EOFException e) {
                    break;
                }
            }
            
            ois.close();
            fis.close();
            System.out.println("Trips loaded: " + trips.size());
        } catch (Exception e) {
            System.out.println("Error loading trips");
        }
    }

    public List<Trip> searchCities(String cityName) {
        List<Trip> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(cityName, Pattern.CASE_INSENSITIVE);
        
        for (Trip trip : trips) {
            Matcher matcher = pattern.matcher(trip.getCity());
            if (matcher.find()) {
                result.add(trip);
            }
        }
        return result;
    }

    public List<Trip> getTripsLongerThan(int days) {
        List<Trip> result = new ArrayList<>();
        for (Trip trip : trips) {
            if (trip.getDuration() > days) {
                result.add(trip);
            }
        }
        return result;
    }

    public Set<String> getUniqueCountries() {
        Set<String> countries = new HashSet<>();
        for (Trip trip : trips) {
            countries.add(trip.getCountry());
        }
        return countries;
    }

    public List<String> getTop3Cities() {
        Map<String, Integer> cityCount = new HashMap<>();
        
        for (Trip trip : trips) {
            String city = trip.getCity();
            cityCount.put(city, cityCount.getOrDefault(city, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(cityCount.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        List<String> top3 = new ArrayList<>();
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            top3.add(list.get(i).getKey());
        }
        
        return top3;
    }

    public void displaySummary() {
        System.out.println("\n--- Travel Summary ---");
        System.out.println("Total Trips: " + trips.size());
        System.out.println("Unique Countries: " + getUniqueCountries());
        System.out.println("Top 3 Cities: " + getTop3Cities());
        System.out.println("Trips > 5 days: " + getTripsLongerThan(5).size());
    }
}
