package com.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;
    String priority;
    
    public Alert(String type, String message, String priority) {
        this.type = type;
        this.message = message;
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        return "[" + priority + "] " + type + ": " + message;
    }
}

public class NotificationFiltering {
    
    public static void main(String[] args) {
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("MEDICINE", "Time for morning medication", "HIGH"));
        alerts.add(new Alert("APPOINTMENT", "Doctor visit tomorrow at 10 AM", "MEDIUM"));
        alerts.add(new Alert("VITAL_SIGNS", "Blood pressure recorded", "LOW"));
        alerts.add(new Alert("MEDICINE", "Take insulin shot", "HIGH"));
        alerts.add(new Alert("EMERGENCY", "Heart rate abnormal", "CRITICAL"));
        alerts.add(new Alert("APPOINTMENT", "Lab test scheduled", "MEDIUM"));
        alerts.add(new Alert("VITAL_SIGNS", "Temperature normal", "LOW"));
        
        System.out.println("=== Hospital Alert System ===\n");
        
        System.out.println("All Alerts:");
        displayAlerts(alerts, alert -> true);
        
        System.out.println("\n\nHigh Priority Alerts Only:");
        Predicate<Alert> highPriority = alert -> alert.priority.equals("HIGH") || alert.priority.equals("CRITICAL");
        displayAlerts(alerts, highPriority);
        
        System.out.println("\n\nMedicine Alerts Only:");
        Predicate<Alert> medicineOnly = alert -> alert.type.equals("MEDICINE");
        displayAlerts(alerts, medicineOnly);
        
        System.out.println("\n\nCritical or Medicine Alerts:");
        Predicate<Alert> criticalOrMedicine = alert -> 
            alert.priority.equals("CRITICAL") || alert.type.equals("MEDICINE");
        displayAlerts(alerts, criticalOrMedicine);
        
        System.out.println("\n\nNon-Low Priority Alerts:");
        Predicate<Alert> notLowPriority = alert -> !alert.priority.equals("LOW");
        displayAlerts(alerts, notLowPriority);
    }
    
    public static void displayAlerts(List<Alert> alerts, Predicate<Alert> filter) {
        int count = 0;
        for (Alert alert : alerts) {
            if (filter.test(alert)) {
                System.out.println("  " + alert);
                count++;
            }
        }
        System.out.println("  Total: " + count + " alerts");
    }
}
