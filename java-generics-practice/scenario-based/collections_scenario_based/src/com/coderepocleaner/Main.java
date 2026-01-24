package com.coderepocleaner;

public class Main {
    public static void main(String[] args) {
        CodeRepoCleaner cleaner = new CodeRepoCleaner();
        
        String repoPath = "src";
        
        System.out.println("Scanning repository...");
        cleaner.scanFolder(repoPath);
        
        cleaner.displaySummary();
        cleaner.displayCategory("Errors");
        
        cleaner.filterBySize(1000);
    }
}
