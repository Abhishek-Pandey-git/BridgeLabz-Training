package com.annotations;

import java.lang.reflect.Method;

class Calculator {
    
    @LogExecutionTime
    public void fastMethod() {
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum += i;
        }
    }
    
    @LogExecutionTime
    public void slowMethod() {
        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += i;
        }
    }
    
    @LogExecutionTime
    public void verySlowMethod() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LogExecutionTimeDemo {
    
    public static void executeWithLogging(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                
                method.invoke(obj);
                
                long endTime = System.nanoTime();
                long duration = endTime - startTime;
                
                System.out.println("Method: " + methodName);
                System.out.println("Execution time: " + duration + " nanoseconds");
                System.out.println("Execution time: " + (duration / 1000000.0) + " milliseconds\n");
            } else {
                method.invoke(obj);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Comparing execution times:\n");
        
        executeWithLogging(calc, "fastMethod");
        executeWithLogging(calc, "slowMethod");
        executeWithLogging(calc, "verySlowMethod");
    }
}
