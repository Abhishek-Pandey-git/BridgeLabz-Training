package com.dealtracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Deal {
    String dealCode;
    LocalDate validTill;
    int discountPercentage;
    double minimumPurchase;
    
    public Deal(String dealCode, LocalDate validTill, int discountPercentage, double minimumPurchase) {
        this.dealCode = dealCode;
        this.validTill = validTill;
        this.discountPercentage = discountPercentage;
        this.minimumPurchase = minimumPurchase;
    }
}

public class DealTracker {
    
    private static final Pattern DATE_PATTERN = Pattern.compile("(\\d{2})-(\\d{2})-(\\d{4})");
    private static final Pattern PERCENTAGE_PATTERN = Pattern.compile("(\\d+)%");
    private static final Pattern FIELD_PATTERN = Pattern.compile("(\\w+):\\s*(.*)");
    
    public static void main(String[] args) {
        DealTracker tracker = new DealTracker();
        tracker.loadDeals("deals");
    }
    
    public void loadDeals(String directoryPath) {
        Map<String, Deal> validDeals = new HashMap<>();
        Set<String> dealCodes = new HashSet<>();
        
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory not found: " + directoryPath);
            return;
        }
        
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));
        if (files == null) return;
        
        for (File file : files) {
            try {
                Deal deal = parseDealFile(file);
                if (deal != null && !dealCodes.contains(deal.dealCode)) {
                    if (deal.validTill.isAfter(LocalDate.now())) {
                        validDeals.put(deal.dealCode, deal);
                        dealCodes.add(deal.dealCode);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + file.getName());
            }
        }
        
        displayResults(validDeals);
    }
    
    private Deal parseDealFile(File file) throws IOException {
        Map<String, String> fields = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                Matcher matcher = FIELD_PATTERN.matcher(line);
                if (matcher.matches()) {
                    String key = matcher.group(1).toLowerCase();
                    String value = matcher.group(2).trim();
                    fields.put(key, value);
                }
            }
        }
        
        if (!fields.containsKey("dealcode") || !fields.containsKey("validtill")) {
            return null;
        }
        
        String dealCode = fields.get("dealcode");
        LocalDate validTill = parseDate(fields.get("validtill"));
        int discount = parseDiscount(fields.getOrDefault("discount", "0%"));
        double minPurchase = Double.parseDouble(fields.getOrDefault("minimumpurchase", "0"));
        
        return new Deal(dealCode, validTill, discount, minPurchase);
    }
    
    private LocalDate parseDate(String dateStr) {
        Matcher matcher = DATE_PATTERN.matcher(dateStr);
        if (matcher.find()) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                return LocalDate.parse(dateStr, formatter);
            } catch (Exception e) {
                return LocalDate.now().minusDays(1);
            }
        }
        return LocalDate.now().minusDays(1);
    }
    
    private int parseDiscount(String discountStr) {
        Matcher matcher = PERCENTAGE_PATTERN.matcher(discountStr);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 0;
    }
    
    private void displayResults(Map<String, Deal> validDeals) {
        System.out.println("=== Active Deals ===\n");
        System.out.println("Total Valid Deals: " + validDeals.size() + "\n");
        
        List<Deal> sortedDeals = new ArrayList<>(validDeals.values());
        sortedDeals.sort((d1, d2) -> Integer.compare(d2.discountPercentage, d1.discountPercentage));
        
        System.out.println("Deals sorted by Discount:");
        for (Deal deal : sortedDeals) {
            System.out.println("\nDeal Code: " + deal.dealCode);
            System.out.println("Discount: " + deal.discountPercentage + "%");
            System.out.println("Valid Till: " + deal.validTill);
            System.out.println("Min Purchase: ₹" + deal.minimumPurchase);
        }
        
        if (!sortedDeals.isEmpty()) {
            System.out.println("\n\nBest Deal: " + sortedDeals.get(0).dealCode + 
                             " (" + sortedDeals.get(0).discountPercentage + "% off)");
        }
    }
}
