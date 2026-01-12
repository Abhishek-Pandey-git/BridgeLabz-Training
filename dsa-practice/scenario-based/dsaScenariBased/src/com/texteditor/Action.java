package com.texteditor;

public class Action {
    String type; // "insert", "delete", "format"
    String content;
    int position;
    
    public Action(String type, String content, int position) {
        this.type = type;
        this.content = content;
        this.position = position;
    }
    
    @Override
    public String toString() {
        return type + " - '" + content + "' at position " + position;
    }
}
