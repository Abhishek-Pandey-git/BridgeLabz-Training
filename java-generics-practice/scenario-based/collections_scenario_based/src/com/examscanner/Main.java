package com.examscanner;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> answerKey = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
        
        ExamScanner<String> scanner = new ExamScanner<>(answerKey);
        
        String filename = "answers.csv";
        
        System.out.println("Scanning answer sheets...");
        scanner.scanAnswerSheets(filename, "Math");
        
        scanner.displayRanking();
    }
}
