package eventtracker;

import java.lang.reflect.Method;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventTracker {
    
    public static void main(String[] args) {
        EventTracker tracker = new EventTracker();
        tracker.scanAndGenerateLogs(UserService.class);
    }
    
    public void scanAndGenerateLogs(Class<?> serviceClass) {
        System.out.println("=== EventTracker Audit System ===\n");
        System.out.println("Scanning: " + serviceClass.getSimpleName() + "\n");
        
        Method[] methods = serviceClass.getDeclaredMethods();
        StringBuilder jsonLogs = new StringBuilder();
        
        jsonLogs.append("{\n");
        jsonLogs.append("  \"auditLogs\": [\n");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        int auditCount = 0;
        
        for (Method method : methods) {
            if (method.isAnnotationPresent(AuditTrail.class)) {
                AuditTrail audit = method.getAnnotation(AuditTrail.class);
                String timestamp = LocalDateTime.now().format(formatter);
                
                System.out.println("Found @AuditTrail on: " + method.getName());
                System.out.println("  Action: " + audit.action());
                System.out.println("  Level: " + audit.level());
                System.out.println("  Timestamp: " + timestamp);
                System.out.println();
                
                if (auditCount > 0) {
                    jsonLogs.append(",\n");
                }
                
                jsonLogs.append("    {\n");
                jsonLogs.append("      \"methodName\": \"").append(method.getName()).append("\",\n");
                jsonLogs.append("      \"action\": \"").append(audit.action()).append("\",\n");
                jsonLogs.append("      \"level\": \"").append(audit.level()).append("\",\n");
                jsonLogs.append("      \"timestamp\": \"").append(timestamp).append("\",\n");
                jsonLogs.append("      \"className\": \"").append(serviceClass.getSimpleName()).append("\"\n");
                jsonLogs.append("    }");
                
                auditCount++;
            }
        }
        
        jsonLogs.append("\n  ],\n");
        jsonLogs.append("  \"totalEvents\": ").append(auditCount).append("\n");
        jsonLogs.append("}\n");
        
        System.out.println("=== Summary ===");
        System.out.println("Total Auditable Methods: " + auditCount);
        
        generateJSONLog(jsonLogs.toString());
    }
    
    private void generateJSONLog(String content) {
        try (FileWriter writer = new FileWriter("audit_logs.json")) {
            writer.write(content);
            System.out.println("\n=== JSON Logs Generated ===");
            System.out.println("File: audit_logs.json");
            System.out.println("\nLog Content:");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Error writing logs: " + e.getMessage());
        }
    }
}
