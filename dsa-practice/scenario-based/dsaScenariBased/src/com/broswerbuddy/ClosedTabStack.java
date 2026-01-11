package com.broswerbuddy;

public class ClosedTabStack {
    StackNode top;
    
    public ClosedTabStack() {
        this.top = null;
    }
    
    public void push(String url) {
        StackNode newNode = new StackNode(url);
        newNode.next = top;
        top = newNode;
    }
    
    public String pop() {
        if (top == null) {
            return null;
        }
        String url = top.url;
        top = top.next;
        return url;
    }
    
    public boolean isEmpty() {
        return top == null;
    }
}
