package com.logicalproblems2;

import java.util.stream.Collectors;

/**
 * Problem 9: Keep Only Digits
 * Input: "orderId=AB123XZ9"
 * Output: "1239"
 */
public class KeepOnlyDigits {
    
    public static String keepOnlyDigits(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isDigit)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
    
    public static void main(String[] args) {
        String input = "orderId=AB123XZ9";
        String result = keepOnlyDigits(input);
        
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + result + "\"");
    }
}
