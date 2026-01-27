package com.chatlogparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface MessageFilter<T> {
    boolean accept(T message);
}

class ChatMessage {
    String timestamp;
    String user;
    String message;
    
    public ChatMessage(String timestamp, String user, String message) {
        this.timestamp = timestamp;
        this.user = user;
        this.message = message;
    }
}

public class ChatLogParser {
    
    private static final Pattern LOG_PATTERN = Pattern.compile("\\[(.*?)\\]\\s+(\\w+):\\s+(.*)");
    private static final Set<String> IDLE_KEYWORDS = Set.of("lol", "brb", "haha", "hehe", "ok", "k");
    
    public static void main(String[] args) {
        ChatLogParser parser = new ChatLogParser();
        
        try {
            parser.parseChatLog("chat_log.txt");
        } catch (IOException e) {
            System.out.println("Error reading chat log: " + e.getMessage());
        }
    }
    
    public void parseChatLog(String filename) throws IOException {
        Map<String, List<String>> userMessages = new TreeMap<>();
        List<ChatMessage> allMessages = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                Matcher matcher = LOG_PATTERN.matcher(line);
                
                if (matcher.matches()) {
                    String timestamp = matcher.group(1);
                    String user = matcher.group(2);
                    String message = matcher.group(3);
                    
                    if (!isIdleChat(message)) {
                        ChatMessage chatMessage = new ChatMessage(timestamp, user, message);
                        allMessages.add(chatMessage);
                        
                        userMessages.putIfAbsent(user, new ArrayList<>());
                        userMessages.get(user).add(message);
                    }
                }
            }
        }
        
        displayResults(userMessages, allMessages);
    }
    
    private boolean isIdleChat(String message) {
        String lower = message.toLowerCase();
        for (String keyword : IDLE_KEYWORDS) {
            if (lower.contains(keyword)) {
                return true;
            }
        }
        return false;
    }
    
    private void displayResults(Map<String, List<String>> userMessages, List<ChatMessage> allMessages) {
        System.out.println("=== ChatLog Analysis Report ===\n");
        
        System.out.println("Total Productive Messages: " + allMessages.size());
        System.out.println("\nMessages by User (Alphabetically):\n");
        
        for (Map.Entry<String, List<String>> entry : userMessages.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue().size() + " messages):");
            for (String msg : entry.getValue()) {
                System.out.println("  - " + msg);
            }
            System.out.println();
        }
        
        System.out.println("Most Active User: " + getMostActiveUser(userMessages));
    }
    
    private String getMostActiveUser(Map<String, List<String>> userMessages) {
        String mostActive = "";
        int maxMessages = 0;
        
        for (Map.Entry<String, List<String>> entry : userMessages.entrySet()) {
            if (entry.getValue().size() > maxMessages) {
                maxMessages = entry.getValue().size();
                mostActive = entry.getKey();
            }
        }
        
        return mostActive + " (" + maxMessages + " messages)";
    }
}
