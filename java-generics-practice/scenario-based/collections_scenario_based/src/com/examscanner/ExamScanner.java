package com.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner<T> {
    private List<String> answerKey;
    private Map<String, Integer> scoreMap;
    private PriorityQueue<Student> rankedStudents;

    public ExamScanner(List<String> answerKey) {
        this.answerKey = answerKey;
        this.scoreMap = new HashMap<>();
        this.rankedStudents = new PriorityQueue<>();
    }

    public void scanAnswerSheets(String filename, T subject) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    if (!isValidFormat(line)) {
                        System.out.println("Invalid format: " + line);
                        continue;
                    }

                    AnswerSheet<T> sheet = parseAnswerSheet(line, subject);
                    int score = calculateScore(sheet);
                    sheet.setScore(score);

                    scoreMap.put(sheet.getStudentName(), score);
                    rankedStudents.add(new Student(sheet.getStudentName(), score));

                } catch (Exception e) {
                    System.out.println("Error processing line");
                }
            }

            reader.close();
            System.out.println("Scanning complete");

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }

    private boolean isValidFormat(String line) {
        Pattern pattern = Pattern.compile("^[A-Za-z\\s]+,(([A-D],)*[A-D])$");
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }

    private AnswerSheet<T> parseAnswerSheet(String line, T subject) {
        String[] parts = line.split(",");
        String name = parts[0].trim();

        List<String> answers = new ArrayList<>();
        for (int i = 1; i < parts.length; i++) {
            answers.add(parts[i].trim());
        }

        return new AnswerSheet<>(name, answers, subject);
    }

    private int calculateScore(AnswerSheet<T> sheet) {
        int score = 0;
        List<String> studentAnswers = sheet.getAnswers();

        for (int i = 0; i < Math.min(studentAnswers.size(), answerKey.size()); i++) {
            if (studentAnswers.get(i).equals(answerKey.get(i))) {
                score++;
            }
        }

        return score;
    }

    public void displayRanking() {
        System.out.println("\n--- Student Rankings ---");
        PriorityQueue<Student> copy = new PriorityQueue<>(rankedStudents);
        int rank = 1;
        
        while (!copy.isEmpty()) {
            Student student = copy.poll();
            System.out.println(rank + ". " + student);
            rank++;
        }
    }

    public void displayScores() {
        System.out.println("\n--- All Scores ---");
        for (String name : scoreMap.keySet()) {
            System.out.println(name + ": " + scoreMap.get(name));
        }
    }
}
