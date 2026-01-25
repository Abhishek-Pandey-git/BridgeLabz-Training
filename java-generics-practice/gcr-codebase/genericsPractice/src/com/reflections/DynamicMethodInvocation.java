package com.reflections;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            MathOperations math = new MathOperations();
            
            System.out.print("Enter method name (add/subtract/multiply): ");
            String methodName = sc.nextLine();
            
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            
            Class<?> cls = math.getClass();
            Method method = cls.getMethod(methodName, int.class, int.class);
            
            Object result = method.invoke(math, num1, num2);
            
            System.out.println("Result: " + result);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        sc.close();
    }
}
