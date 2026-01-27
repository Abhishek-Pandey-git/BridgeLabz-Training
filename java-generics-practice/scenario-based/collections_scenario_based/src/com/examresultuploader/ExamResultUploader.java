package com.examresultuploader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

class InvalidFormatException extends Exception {
    public InvalidFormatException(String message) {
        super(message);
    }
}

class StudentResult {
    int rollNo;
    String name;
    String subject;
    int marks;
    
    public StudentResult(int rollNo, String name, String subject, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }
}

public class ExamResultUploader {
    
    private static final Pattern MARKS_PATTERN = Pattern.compile("\\d+");
    
    public static void main(String[] args) {
        ExamResultUploader uploader = new ExamResultUploader();
        
        try {
            uploader.processResults("exam_results.csv");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    public void processResults(String filename) throws IOException {
        List<StudentResult> results = new ArrayList<>();
        Map<String, List<Integer>> subjectMarks = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine(); // skip header
            
            while ((line = br.readLine()) != null) {
                try {
                    StudentResult result = parseLine(line);
                    results.add(result);
                    
                    subjectMarks.putIfAbsent(result.subject, new ArrayList<>());
                    subjectMarks.get(result.subject).add(result.marks);
                    
                } catch (InvalidFormatException e) {
                    System.out.println("Skipping invalid line: " + e.getMessage());
                }
            }
        }
        
        displayResults(results, subjectMarks);
    }
    
    private StudentResult parseLine(String line) throws InvalidFormatException {
        String[] parts = line.split(",");
        
        if (parts.length != 4) {
            throw new InvalidFormatException("Missing fields in: " + line);
        }
        
        try {
            int rollNo = Integer.parseInt(parts[0].trim());
            String name = parts[1].trim();
            String subject = parts[2].trim();
            String marksStr = parts[3].trim();
            
            if (!MARKS_PATTERN.matcher(marksStr).matches()) {
                throw new InvalidFormatException("Invalid marks format: " + marksStr);
            }
            
            int marks = Integer.parseInt(marksStr);
            
            if (marks < 0 || marks > 100) {
                throw new InvalidFormatException("Marks out of range: " + marks);
            }
            
            return new StudentResult(rollNo, name, subject, marks);
            
        } catch (NumberFormatException e) {
            throw new InvalidFormatException("Invalid number format in: " + line);
        }
    }
    
    private void displayResults(List<StudentResult> results, Map<String, List<Integer>> subjectMarks) {
        System.out.println("=== Exam Results Report ===\n");
        System.out.println("Total Records Processed: " + results.size() + "\n");
        
        System.out.println("Top Scorer by Subject:");
        for (Map.Entry<String, List<Integer>> entry : subjectMarks.entrySet()) {
            String subject = entry.getKey();
            List<Integer> marks = entry.getValue();
            
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            pq.addAll(marks);
            
            int topScore = pq.poll();
            
            for (StudentResult result : results) {
                if (result.subject.equals(subject) && result.marks == topScore) {
                    System.out.println(subject + ": " + result.name + " (Roll: " + result.rollNo + ") - " + topScore + " marks");
                    break;
                }
            }
        }
        
        System.out.println("\n\nSubject-wise Average:");
        for (Map.Entry<String, List<Integer>> entry : subjectMarks.entrySet()) {
            String subject = entry.getKey();
            List<Integer> marks = entry.getValue();
            double average = marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            System.out.println(subject + ": " + String.format("%.2f", average));
        }
    }
}
