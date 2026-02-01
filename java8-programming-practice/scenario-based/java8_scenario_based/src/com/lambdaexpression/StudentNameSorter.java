package com.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class StudentNameSorter {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Zara", "Alice", "Bob", "John", "Emma");
        
        System.out.println("Before sorting: " + students);
        
        // Lambda to sort by name
        students.sort((s1, s2) -> s1.compareTo(s2));
        
        System.out.println("After sorting: " + students);
    }
}
