package com.resumeanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {
    private Map<String, ResumeData> resumeMap;
    private String[] targetKeywords = {"Java", "Python", "Spring"};

    public ResumeAnalyzer() {
        resumeMap = new HashMap<>();
    }

    public void readResumesFromFolder(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files == null) {
            System.out.println("No files found");
            return;
        }

        for (File file : files) {
            if (file.getName().endsWith(".txt")) {
                try {
                    processResume(file);
                } catch (Exception e) {
                    System.out.println("Error reading: " + file.getName());
                }
            }
        }
    }

    private void processResume(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line).append(" ");
        }
        reader.close();

        String text = content.toString();

        String email = extractEmail(text);
        String phone = extractPhone(text);
        String name = extractName(text);

        if (email == null || email.isEmpty()) {
            throw new IOException("Invalid format");
        }

        List<String> foundKeywords = extractKeywords(text);

        ResumeData data = new ResumeData(name, email, phone, foundKeywords);
        resumeMap.put(email, data);
    }

    private String extractEmail(String text) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private String extractPhone(String text) {
        Pattern pattern = Pattern.compile("\\d{10}");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private String extractName(String text) {
        String[] words = text.split(" ");
        if (words.length >= 2) {
            return words[0] + " " + words[1];
        }
        return "Unknown";
    }

    private List<String> extractKeywords(String text) {
        List<String> found = new ArrayList<>();
        for (String keyword : targetKeywords) {
            Pattern pattern = Pattern.compile(keyword, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                found.add(keyword);
            }
        }
        return found;
    }

    public List<ResumeData> getSortedByKeywords() {
        List<ResumeData> list = new ArrayList<>(resumeMap.values());
        list.sort((r1, r2) -> Integer.compare(r2.getKeywordCount(), r1.getKeywordCount()));
        return list;
    }

    public void displayResumes() {
        List<ResumeData> sorted = getSortedByKeywords();
        System.out.println("\n--- Resumes Sorted by Keyword Count ---");
        for (ResumeData resume : sorted) {
            System.out.println(resume);
        }
    }
}
