package com.streams;

import java.io.*;

public class PipedStreamCommunication {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);
            
            // Writer thread
            Thread writer = new Thread(() -> {
                try {
                    for (int i = 1; i <= 10; i++) {
                        String message = "Message " + i;
                        pos.write(message.getBytes());
                        System.out.println("Sent: " + message);
                        Thread.sleep(500);
                    }
                    pos.close();
                } catch (IOException | InterruptedException e) {
                    System.out.println("Writer error: " + e.getMessage());
                }
            });
            
            // Reader thread
            Thread reader = new Thread(() -> {
                try {
                    byte[] buffer = new byte[100];
                    int bytesRead;
                    
                    while ((bytesRead = pis.read(buffer)) != -1) {
                        String message = new String(buffer, 0, bytesRead);
                        System.out.println("Received: " + message);
                    }
                    pis.close();
                } catch (IOException e) {
                    System.out.println("Reader error: " + e.getMessage());
                }
            });
            
            writer.start();
            reader.start();
            
            writer.join();
            reader.join();
            
            System.out.println("Communication completed!");
            
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
