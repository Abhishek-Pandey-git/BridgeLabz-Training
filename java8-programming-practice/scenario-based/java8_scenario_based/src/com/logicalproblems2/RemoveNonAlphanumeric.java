package com.logicalproblems2;

import java.util.stream.Collectors;

/**
 * Problem 7: Remove Non-Alphanumeric Characters
 * Input: "ja@va#8!!"
 * Output: "java8"
 */
public class RemoveNonAlphanumeric {
    
    public static String removeNonAlphanumeric(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetterOrDigit)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
    
    public static void main(String[] args) {
        String input = "ja@va#8!!";
        String result = removeNonAlphanumeric(input);
        
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + result + "\"");
    }
}
