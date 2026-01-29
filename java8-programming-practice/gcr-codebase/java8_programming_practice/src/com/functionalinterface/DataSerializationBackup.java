package com.functionalinterface;

import java.io.*;

class UserProfile implements Serializable {
    private String username;
    private String email;
    
    public UserProfile(String username, String email) {
        this.username = username;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "UserProfile{username='" + username + "', email='" + email + "'}";
    }
}

class AppSettings implements Serializable {
    private String theme;
    private boolean notifications;
    
    public AppSettings(String theme, boolean notifications) {
        this.theme = theme;
        this.notifications = notifications;
    }
    
    @Override
    public String toString() {
        return "AppSettings{theme='" + theme + "', notifications=" + notifications + "}";
    }
}

public class DataSerializationBackup {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("john_doe", "john@example.com");
        AppSettings settings = new AppSettings("dark", true);
        
        // Backup data
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("backup.dat"))) {
            oos.writeObject(user);
            oos.writeObject(settings);
            System.out.println("Backup created successfully");
        } catch (IOException e) {
            System.out.println("Backup failed: " + e.getMessage());
        }
        
        // Restore data
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("backup.dat"))) {
            UserProfile restoredUser = (UserProfile) ois.readObject();
            AppSettings restoredSettings = (AppSettings) ois.readObject();
            System.out.println("Restored: " + restoredUser);
            System.out.println("Restored: " + restoredSettings);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Restore failed: " + e.getMessage());
        }
    }
}
