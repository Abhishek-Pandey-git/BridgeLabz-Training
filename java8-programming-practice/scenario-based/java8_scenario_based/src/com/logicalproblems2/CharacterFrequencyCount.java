package com.logicalproblems2;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Problem 1: Character Frequency Count
 * Input: "banana"
 * Output: {b=1, a=3, n=2}
 */
public class CharacterFrequencyCount {
    
    public static Map<Character, Long> countCharacterFrequency(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                ));
    }
    
    public static void main(String[] args) {
        String input = "banana";
        Map<Character, Long> result = countCharacterFrequency(input);
        
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: " + result);
    }
}
