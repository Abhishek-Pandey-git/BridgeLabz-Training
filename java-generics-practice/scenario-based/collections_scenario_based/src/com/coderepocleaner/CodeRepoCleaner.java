package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class CodeRepoCleaner {
    private Map<String, List<File>> categorizedFiles;
    private Set<String> validFiles;
    private List<Path> allJavaFiles;

    public CodeRepoCleaner() {
        categorizedFiles = new HashMap<>();
        categorizedFiles.put("Valid", new ArrayList<>());
        categorizedFiles.put("Warnings", new ArrayList<>());
        categorizedFiles.put("Errors", new ArrayList<>());
        validFiles = new HashSet<>();
        allJavaFiles = new ArrayList<>();
    }

    public void scanFolder(String folderPath) {
        try {
            Path start = Paths.get(folderPath);
            Files.walk(start)
                .filter(path -> path.toString().endsWith(".java"))
                .forEach(path -> {
                    allJavaFiles.add(path);
                    analyzeFile(path.toFile());
                });
        } catch (Exception e) {
            System.out.println("Error scanning folder");
        }
    }

    private void analyzeFile(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String line;
            boolean hasWarning = false;
            boolean hasError = false;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");

                if (checkUnusedImport(line)) {
                    hasWarning = true;
                }

                if (checkBadMethodName(line)) {
                    hasError = true;
                }
            }

            reader.close();

            if (hasError) {
                categorizedFiles.get("Errors").add(file);
            } else if (hasWarning) {
                categorizedFiles.get("Warnings").add(file);
            } else {
                categorizedFiles.get("Valid").add(file);
                validFiles.add(file.getName());
            }

        } catch (Exception e) {
            categorizedFiles.get("Errors").add(file);
        }
    }

    private boolean checkUnusedImport(String line) {
        if (line.trim().startsWith("import") && line.contains("java.awt")) {
            return true;
        }
        return false;
    }

    private boolean checkBadMethodName(String line) {
        Pattern pattern = Pattern.compile("public\\s+\\w+\\s+([A-Z][a-zA-Z0-9_]*)\\s*\\(");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public void filterBySize(long minSize) {
        System.out.println("\nFiles larger than " + minSize + " bytes:");
        for (Path path : allJavaFiles) {
            try {
                long size = Files.size(path);
                if (size > minSize) {
                    System.out.println(path.getFileName() + " - " + size + " bytes");
                }
            } catch (Exception e) {
                System.out.println("Error checking size");
            }
        }
    }

    public void displaySummary() {
        System.out.println("\n--- Code Repository Summary ---");
        System.out.println("Total Java files: " + allJavaFiles.size());
        System.out.println("Valid files: " + categorizedFiles.get("Valid").size());
        System.out.println("Files with warnings: " + categorizedFiles.get("Warnings").size());
        System.out.println("Files with errors: " + categorizedFiles.get("Errors").size());
    }

    public void displayCategory(String category) {
        System.out.println("\n--- " + category + " Files ---");
        List<File> files = categorizedFiles.get(category);
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
