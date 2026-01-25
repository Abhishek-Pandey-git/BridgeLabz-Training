package com.annotations;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class MathService {
    
    @CacheResult
    public int factorial(int n) {
        System.out.println("Computing factorial of " + n + "...");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    @CacheResult
    public int fibonacci(int n) {
        System.out.println("Computing fibonacci of " + n + "...");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        if (n <= 1) return n;
        
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}

public class CacheResultDemo {
    
    private static Map<String, Object> cache = new HashMap<>();
    
    public static Object invokeWithCache(Object obj, String methodName, Object... args) {
        try {
            Class<?>[] paramTypes = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                paramTypes[i] = args[i].getClass();
                if (paramTypes[i] == Integer.class) {
                    paramTypes[i] = int.class;
                }
            }
            
            Method method = obj.getClass().getMethod(methodName, paramTypes);
            
            if (method.isAnnotationPresent(CacheResult.class)) {
                String cacheKey = methodName + "_" + args[0];
                
                if (cache.containsKey(cacheKey)) {
                    System.out.println("Returning cached result for " + methodName + "(" + args[0] + ")");
                    return cache.get(cacheKey);
                }
                
                Object result = method.invoke(obj, args);
                cache.put(cacheKey, result);
                return result;
            } else {
                return method.invoke(obj, args);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    public static void main(String[] args) {
        MathService math = new MathService();
        
        System.out.println("First call to factorial(5):");
        long start = System.currentTimeMillis();
        Object result1 = invokeWithCache(math, "factorial", 5);
        long end = System.currentTimeMillis();
        System.out.println("Result: " + result1);
        System.out.println("Time: " + (end - start) + "ms\n");
        
        System.out.println("Second call to factorial(5):");
        start = System.currentTimeMillis();
        Object result2 = invokeWithCache(math, "factorial", 5);
        end = System.currentTimeMillis();
        System.out.println("Result: " + result2);
        System.out.println("Time: " + (end - start) + "ms\n");
        
        System.out.println("First call to fibonacci(10):");
        start = System.currentTimeMillis();
        Object result3 = invokeWithCache(math, "fibonacci", 10);
        end = System.currentTimeMillis();
        System.out.println("Result: " + result3);
        System.out.println("Time: " + (end - start) + "ms\n");
        
        System.out.println("Second call to fibonacci(10):");
        start = System.currentTimeMillis();
        Object result4 = invokeWithCache(math, "fibonacci", 10);
        end = System.currentTimeMillis();
        System.out.println("Result: " + result4);
        System.out.println("Time: " + (end - start) + "ms");
    }
}
