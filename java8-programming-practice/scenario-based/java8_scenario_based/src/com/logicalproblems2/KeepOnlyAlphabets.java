package com.logicalproblems2;

import java.util.stream.Collectors;

/**
 * Problem 8: Keep Only Alphabets
 * Input: "java8stream2025"
 * Output: "javastream"
 */
public class KeepOnlyAlphabets {
    
    public static String keepOnlyAlphabets(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
    
    public static void main(String[] args) {
        String input = "java8stream2025";
        String result = keepOnlyAlphabets(input);
        
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + result + "\"");
    }
}
