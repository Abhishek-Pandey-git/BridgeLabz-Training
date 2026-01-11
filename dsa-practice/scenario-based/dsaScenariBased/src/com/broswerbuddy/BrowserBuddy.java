package com.broswerbuddy;

public class BrowserBuddy {
    public static void main(String[] args) {
        Browser browser = new Browser();
        
        System.out.println("=== Opening Pages ===");
        browser.openPage("google.com");
        browser.openPage("facebook.com");
        browser.openPage("youtube.com");
        browser.openPage("twitter.com");
        
        System.out.println("\n=== Navigation ===");
        browser.showCurrentPage();
        
        System.out.println("\n--- Going Back ---");
        browser.goBack();
        browser.goBack();
        browser.showCurrentPage();
        
        System.out.println("\n--- Going Forward ---");
        browser.goForward();
        browser.showCurrentPage();
        
        System.out.println("\n=== Closing Tab ===");
        browser.closeTab();
        
        System.out.println("\n=== Opening New Page ===");
        browser.openPage("instagram.com");
        browser.showCurrentPage();
        
        System.out.println("\n=== Reopening Closed Tab ===");
        browser.reopenLastTab();
        browser.showCurrentPage();
    }
}
