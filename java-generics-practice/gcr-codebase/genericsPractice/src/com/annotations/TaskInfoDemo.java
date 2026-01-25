package com.annotations;

import java.lang.reflect.Method;

class TaskManager {
    
    @TaskInfo(priority = "HIGH", assignedTo = "John")
    public void implementFeature() {
        System.out.println("Implementing new feature...");
    }
    
    @TaskInfo(priority = "MEDIUM", assignedTo = "Alice")
    public void fixBug() {
        System.out.println("Fixing bug...");
    }
    
    @TaskInfo(priority = "LOW", assignedTo = "Bob")
    public void updateDocumentation() {
        System.out.println("Updating documentation...");
    }
}

public class TaskInfoDemo {
    
    public static void displayTaskInfo(Class<?> cls) {
        Method[] methods = cls.getDeclaredMethods();
        
        System.out.println("Task Information:\n");
        
        for (Method method : methods) {
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo info = method.getAnnotation(TaskInfo.class);
                
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + info.priority());
                System.out.println("Assigned To: " + info.assignedTo());
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        displayTaskInfo(TaskManager.class);
    }
}
