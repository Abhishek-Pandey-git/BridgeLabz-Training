package com.broswerbuddy;

public class TabNode {
    String url;
    TabNode prev;
    TabNode next;
    
    public TabNode(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
