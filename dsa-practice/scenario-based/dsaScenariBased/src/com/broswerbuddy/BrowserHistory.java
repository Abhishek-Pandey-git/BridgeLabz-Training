package com.broswerbuddy;

public class BrowserHistory {
    TabNode current;
    
    public BrowserHistory() {
        this.current = null;
    }
    
    public void visit(String url) {
        TabNode newNode = new TabNode(url);
        
        if (current == null) {
            current = newNode;
        } else {
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        
        System.out.println("Visited: " + url);
    }
    
    public void back() {
        if (current == null || current.prev == null) {
            System.out.println("No previous page!");
            return;
        }
        
        current = current.prev;
        System.out.println("Back to: " + current.url);
    }
    
    public void forward() {
        if (current == null || current.next == null) {
            System.out.println("No next page!");
            return;
        }
        
        current = current.next;
        System.out.println("Forward to: " + current.url);
    }
    
    public String getCurrentUrl() {
        if (current == null) {
            return "No page loaded";
        }
        return current.url;
    }
}
