package com.logicalproblems2;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

/**
 * Problem 5: Remove Duplicate Characters
 * Input: "banana"
 * Output: "ban"
 */
public class RemoveDuplicateCharacters {
    
    public static String removeDuplicates(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
    
    public static void main(String[] args) {
        String input = "banana";
        String result = removeDuplicates(input);
        
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + result + "\"");
    }
}
