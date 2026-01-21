package com.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the Key with the Highest Value
 * Given a Map<String, Integer>, find the key with the maximum value.
 * Example: Input: {A=10, B=20, C=15} → Output: B
 */
public class FindKeyWithMaxValue {

    /**
     * Finds the key with the maximum value in the map
     * 
     * @param map The input map with String keys and Integer values
     * @return The key with the maximum value, or null if map is empty
     */
    public static String findKeyWithMaxValue(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    /**
     * Alternative approach using Java Streams
     * 
     * @param map The input map with String keys and Integer values
     * @return The key with the maximum value, or null if map is empty
     */
    public static String findKeyWithMaxValueStream(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        return map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public static void main(String[] args) {
        // Test case 1: Example from problem
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 10);
        map1.put("B", 20);
        map1.put("C", 15);

        System.out.println("Test Case 1:");
        System.out.println("Input: " + map1);
        System.out.println("Output (Iterative): " + findKeyWithMaxValue(map1));
        System.out.println("Output (Stream): " + findKeyWithMaxValueStream(map1));
        System.out.println();

        // Test case 2: Single entry
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("X", 100);

        System.out.println("Test Case 2:");
        System.out.println("Input: " + map2);
        System.out.println("Output (Iterative): " + findKeyWithMaxValue(map2));
        System.out.println("Output (Stream): " + findKeyWithMaxValueStream(map2));
        System.out.println();

        // Test case 3: Multiple entries
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("Apple", 50);
        map3.put("Banana", 75);
        map3.put("Cherry", 30);
        map3.put("Date", 90);
        map3.put("Elderberry", 45);

        System.out.println("Test Case 3:");
        System.out.println("Input: " + map3);
        System.out.println("Output (Iterative): " + findKeyWithMaxValue(map3));
        System.out.println("Output (Stream): " + findKeyWithMaxValueStream(map3));
        System.out.println();

        // Test case 4: Negative values
        Map<String, Integer> map4 = new HashMap<>();
        map4.put("P", -10);
        map4.put("Q", -5);
        map4.put("R", -20);

        System.out.println("Test Case 4:");
        System.out.println("Input: " + map4);
        System.out.println("Output (Iterative): " + findKeyWithMaxValue(map4));
        System.out.println("Output (Stream): " + findKeyWithMaxValueStream(map4));
        System.out.println();

        // Test case 5: Empty map
        Map<String, Integer> map5 = new HashMap<>();

        System.out.println("Test Case 5:");
        System.out.println("Input: " + map5);
        System.out.println("Output (Iterative): " + findKeyWithMaxValue(map5));
        System.out.println("Output (Stream): " + findKeyWithMaxValueStream(map5));
    }
}
