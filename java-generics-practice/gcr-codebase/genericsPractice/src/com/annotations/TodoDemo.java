package com.annotations;

import java.lang.reflect.Method;

class ProjectManager {
    
    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void setupAuthentication() {
        System.out.println("Authentication setup pending");
    }
    
    @Todo(task = "Add database connection pooling", assignedTo = "Bob")
    public void configureDatabasePool() {
        System.out.println("Database pool configuration pending");
    }
    
    @Todo(task = "Write unit tests for payment module", assignedTo = "Charlie", priority = "LOW")
    public void testPaymentModule() {
        System.out.println("Unit tests pending");
    }
    
    @Todo(task = "Optimize query performance", assignedTo = "David", priority = "HIGH")
    public void optimizeQueries() {
        System.out.println("Query optimization pending");
    }
    
    public void completedFeature() {
        System.out.println("This feature is already completed");
    }
}

public class TodoDemo {
    
    public static void main(String[] args) {
        displayPendingTasks();
    }
    
    public static void displayPendingTasks() {
        Class<ProjectManager> clazz = ProjectManager.class;
        
        System.out.println("Pending Tasks in Project:");
        System.out.println("==========================\n");
        
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println();
            }
        }
    }
}
