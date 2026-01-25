package com.reflections;

import java.lang.reflect.Method;

class TestClass {
    public void fastMethod() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
    }
    
    public void slowMethod() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

public class MethodExecutionTiming {
    
    public static void measureExecutionTime(Object obj, String methodName) {
        try {
            Class<?> cls = obj.getClass();
            Method method = cls.getMethod(methodName);
            
            long startTime = System.nanoTime();
            
            method.invoke(obj);
            
            long endTime = System.nanoTime();
            
            long duration = endTime - startTime;
            
            System.out.println("Method: " + methodName);
            System.out.println("Execution time: " + duration + " nanoseconds");
            System.out.println("Execution time: " + (duration / 1000000.0) + " milliseconds\n");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        TestClass test = new TestClass();
        
        measureExecutionTime(test, "fastMethod");
        measureExecutionTime(test, "slowMethod");
    }
}
