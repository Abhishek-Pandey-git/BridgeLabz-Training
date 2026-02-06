package com.logicalproblems2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Problem 3: First Non-Repeating Character
 * Input: "stress"
 * Output: t
 */
public class FirstNonRepeatingCharacter {
    
    public static Character findFirstNonRepeating(String input) {
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                    Function.identity(),
                    LinkedHashMap::new,
                    Collectors.counting()
                ));
        
        return frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
    
    public static void main(String[] args) {
        String input = "stress";
        Character result = findFirstNonRepeating(input);
        
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: " + result);
    }
}
