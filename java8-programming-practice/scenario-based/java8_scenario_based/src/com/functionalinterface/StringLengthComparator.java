package com.functionalinterface;

import java.util.Comparator;

public class StringLengthComparator {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        
        // Comparator to compare by length
        Comparator<String> lengthComparator = (str1, str2) -> Integer.compare(str1.length(), str2.length());
        
        int result = lengthComparator.compare(s1, s2);
        System.out.println(result == 0 ? "Both strings have same length" : 
                          (result < 0 ? s1 + " is shorter" : s2 + " is shorter"));
    }
}
