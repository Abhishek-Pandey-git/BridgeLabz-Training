package com.logicalproblems2;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Problem 10: Count Each Character Except Spaces
 * Input: "java stream"
 * Output: frequency map without space
 */
public class CountCharactersExceptSpaces {
    
    public static Map<Character, Long> countCharactersExceptSpaces(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                ));
    }
    
    public static void main(String[] args) {
        String input = "java stream";
        Map<Character, Long> result = countCharactersExceptSpaces(input);
        
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: " + result);
    }
}
