package com.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Merge Two Maps
 * Merge two maps such that if a key exists in both, sum their values.
 * Example: Map1: {A=1, B=2}, Map2: {B=3, C=4} → Output: {A=1, B=5, C=4}
 */
public class MergeTwoMaps {

    /**
     * Merges two maps by summing values for duplicate keys
     * 
     * @param map1 First map
     * @param map2 Second map
     * @return Merged map with summed values for duplicate keys
     */
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);
        
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        
        return result;
    }

    /**
     * Alternative approach using manual checking
     * 
     * @param map1 First map
     * @param map2 Second map
     * @return Merged map with summed values for duplicate keys
     */
    public static Map<String, Integer> mergeMapsManual(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);
        
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            if (result.containsKey(key)) {
                result.put(key, result.get(key) + value);
            } else {
                result.put(key, value);
            }
        }
        
        return result;
    }

    /**
     * Stream-based approach
     * 
     * @param map1 First map
     * @param map2 Second map
     * @return Merged map with summed values for duplicate keys
     */
    public static Map<String, Integer> mergeMapsStream(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);
        
        map2.forEach((key, value) -> 
            result.merge(key, value, Integer::sum)
        );
        
        return result;
    }

    public static void main(String[] args) {
        // Test case 1: Example from problem
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        System.out.println("Test Case 1:");
        System.out.println("Map1: " + map1);
        System.out.println("Map2: " + map2);
        System.out.println("Output (merge): " + mergeMaps(map1, map2));
        System.out.println("Output (manual): " + mergeMapsManual(map1, map2));
        System.out.println("Output (stream): " + mergeMapsStream(map1, map2));
        System.out.println();

        // Test case 2: No overlapping keys
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("X", 10);
        map3.put("Y", 20);

        Map<String, Integer> map4 = new HashMap<>();
        map4.put("Z", 30);

        System.out.println("Test Case 2: No Overlapping Keys");
        System.out.println("Map1: " + map3);
        System.out.println("Map2: " + map4);
        System.out.println("Output: " + mergeMaps(map3, map4));
        System.out.println();

        // Test case 3: All overlapping keys
        Map<String, Integer> map5 = new HashMap<>();
        map5.put("A", 5);
        map5.put("B", 10);
        map5.put("C", 15);

        Map<String, Integer> map6 = new HashMap<>();
        map6.put("A", 5);
        map6.put("B", 10);
        map6.put("C", 5);

        System.out.println("Test Case 3: All Overlapping Keys");
        System.out.println("Map1: " + map5);
        System.out.println("Map2: " + map6);
        System.out.println("Output: " + mergeMaps(map5, map6));
        System.out.println();

        // Test case 4: One empty map
        Map<String, Integer> map7 = new HashMap<>();
        map7.put("P", 100);

        Map<String, Integer> map8 = new HashMap<>();

        System.out.println("Test Case 4: One Empty Map");
        System.out.println("Map1: " + map7);
        System.out.println("Map2: " + map8);
        System.out.println("Output: " + mergeMaps(map7, map8));
        System.out.println();

        // Test case 5: Multiple overlapping keys
        Map<String, Integer> map9 = new HashMap<>();
        map9.put("Apple", 10);
        map9.put("Banana", 20);
        map9.put("Cherry", 30);

        Map<String, Integer> map10 = new HashMap<>();
        map10.put("Banana", 15);
        map10.put("Cherry", 10);
        map10.put("Date", 25);

        System.out.println("Test Case 5: Multiple Overlapping Keys");
        System.out.println("Map1: " + map9);
        System.out.println("Map2: " + map10);
        System.out.println("Output: " + mergeMaps(map9, map10));
    }
}
