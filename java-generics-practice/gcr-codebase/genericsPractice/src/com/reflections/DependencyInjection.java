package com.reflections;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {
}

class Database {
    public void connect() {
        System.out.println("Database connected");
    }
}

class Logger {
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

class UserService {
    @Inject
    private Database database;
    
    @Inject
    private Logger logger;
    
    public void performAction() {
        if (database != null) {
            database.connect();
        }
        if (logger != null) {
            logger.log("Action performed");
        }
    }
}

public class DependencyInjection {
    
    public static void inject(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            Field[] fields = cls.getDeclaredFields();
            
            for (Field field : fields) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);
                    
                    Class<?> fieldType = field.getType();
                    Object instance = fieldType.getDeclaredConstructor().newInstance();
                    
                    field.set(obj, instance);
                    
                    System.out.println("Injected: " + fieldType.getSimpleName());
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        UserService service = new UserService();
        
        inject(service);
        
        System.out.println("\nTesting service:");
        service.performAction();
    }
}
