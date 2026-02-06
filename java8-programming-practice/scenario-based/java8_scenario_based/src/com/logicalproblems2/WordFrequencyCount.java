package com.logicalproblems2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Problem 2: Word Frequency Count
 * Input: "java is java and java is fast"
 * Output: {java=3, is=2, and=1, fast=1}
 */
public class WordFrequencyCount {
    
    public static Map<String, Long> countWordFrequency(String input) {
        return Arrays.stream(input.split("\\s+"))
                .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                ));
    }
    
    public static void main(String[] args) {
        String input = "java is java and java is fast";
        Map<String, Long> result = countWordFrequency(input);
        
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: " + result);
    }
}
