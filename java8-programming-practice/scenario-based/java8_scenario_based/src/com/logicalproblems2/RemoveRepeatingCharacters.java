package com.logicalproblems2;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Problem 6: Remove Repeating Characters (Keep Only Unique Once)
 * Input: "aabbccdde"
 * Output: "e"
 */
public class RemoveRepeatingCharacters {
    
    public static String keepOnlyUniqueOnes(String input) {
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                ));
        
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> frequencyMap.get(c) == 1)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
    
    public static void main(String[] args) {
        String input = "aabbccdde";
        String result = keepOnlyUniqueOnes(input);
        
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + result + "\"");
    }
}
