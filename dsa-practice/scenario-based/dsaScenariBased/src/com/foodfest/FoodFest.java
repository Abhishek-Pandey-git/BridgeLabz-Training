package com.foodfest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Food festival organizer using Merge Sort
public class FoodFest {
    
    // Merge two sorted lists
    private List<Stall> merge(List<Stall> left, List<Stall> right) {
        List<Stall> merged = new ArrayList<>();
        int i = 0, j = 0;
        
        // Merge based on footfall count
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getFootfall() <= right.get(j).getFootfall()) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }
        
        // Add remaining elements
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }
        
        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }
        
        return merged;
    }
    
    // Merge sort implementation
    public List<Stall> mergeSort(List<Stall> stalls) {
        if (stalls.size() <= 1) {
            return stalls;
        }
        
        int mid = stalls.size() / 2;
        List<Stall> left = new ArrayList<>(stalls.subList(0, mid));
        List<Stall> right = new ArrayList<>(stalls.subList(mid, stalls.size()));
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        return merge(left, right);
    }
    
    // Combine multiple zone data (already sorted)
    public List<Stall> combineZones(List<List<Stall>> zones) {
        List<Stall> combined = new ArrayList<>();
        
        for (List<Stall> zone : zones) {
            combined = merge(combined, zone);
        }
        
        return combined;
    }
    
    public static void main(String[] args) {
        FoodFest festival = new FoodFest();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of zones: ");
        int numZones = sc.nextInt();
        sc.nextLine();
        
        List<List<Stall>> zones = new ArrayList<>();
        
        // Input stalls for each zone
        for (int z = 0; z < numZones; z++) {
            System.out.println("\n--- Zone " + (z + 1) + " ---");
            System.out.print("Enter number of stalls in this zone: ");
            int numStalls = sc.nextInt();
            sc.nextLine();
            
            List<Stall> zoneStalls = new ArrayList<>();
            for (int i = 0; i < numStalls; i++) {
                System.out.print("Enter stall name: ");
                String name = sc.nextLine();
                System.out.print("Enter footfall count: ");
                int footfall = sc.nextInt();
                sc.nextLine();
                zoneStalls.add(new Stall(name, footfall));
            }
            
            // Sort each zone data
            zoneStalls = festival.mergeSort(zoneStalls);
            zones.add(zoneStalls);
            
            System.out.println("Zone " + (z + 1) + " sorted:");
            for (Stall stall : zoneStalls) {
                System.out.println(stall);
            }
        }
        
        // Combine all zones
        System.out.println("\n=== Combining All Zones ===");
        List<Stall> masterList = festival.combineZones(zones);
        
        System.out.println("\n=== Master Performance List (Sorted) ===");
        for (Stall stall : masterList) {
            System.out.println(stall);
        }
        
        sc.close();
    }
}
