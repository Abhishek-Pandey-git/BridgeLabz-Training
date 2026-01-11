package com.broswerbuddy;

public class StackNode {
    String url;
    StackNode next;
    
    public StackNode(String url) {
        this.url = url;
        this.next = null;
    }
}
