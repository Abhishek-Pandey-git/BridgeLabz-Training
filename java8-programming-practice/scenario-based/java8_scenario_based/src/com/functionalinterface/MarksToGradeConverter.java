package com.functionalinterface;

import java.util.function.Function;

public class MarksToGradeConverter {
    public static void main(String[] args) {
        // Function to convert marks to grade
        Function<Integer, String> getGrade = marks -> {
            if (marks >= 90) return "A";
            else if (marks >= 75) return "B";
            else if (marks >= 60) return "C";
            else return "F";
        };
        
        System.out.println("Marks 95: Grade " + getGrade.apply(95));
        System.out.println("Marks 80: Grade " + getGrade.apply(80));
        System.out.println("Marks 65: Grade " + getGrade.apply(65));
    }
}
