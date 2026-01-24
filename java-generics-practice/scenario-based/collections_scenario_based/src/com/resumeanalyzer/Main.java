package com.resumeanalyzer;

public class Main {
    public static void main(String[] args) {
        ResumeAnalyzer analyzer = new ResumeAnalyzer();
        
        String folderPath = "resumes";
        
        System.out.println("Reading resumes from folder...");
        analyzer.readResumesFromFolder(folderPath);
        
        analyzer.displayResumes();
    }
}
