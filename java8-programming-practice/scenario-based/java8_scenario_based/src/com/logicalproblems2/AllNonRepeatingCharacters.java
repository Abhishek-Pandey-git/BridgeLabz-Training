package com.logicalproblems2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Problem 4: All Non-Repeating Characters
 * Input: "programming"
 * Output: p o g r a i n (only chars with count = 1)
 */
public class AllNonRepeatingCharacters {
    
    public static List<Character> findAllNonRepeating(String input) {
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
                .collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        String input = "programming";
        List<Character> result = findAllNonRepeating(input);
        
        System.out.println("Input: \"" + input + "\"");
        System.out.print("Output: ");
        result.forEach(c -> System.out.print(c + " "));
        System.out.println();
    }
}
