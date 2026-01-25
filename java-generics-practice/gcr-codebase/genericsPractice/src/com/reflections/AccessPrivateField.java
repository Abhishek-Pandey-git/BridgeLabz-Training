package com.reflections;

import java.lang.reflect.Field;

class Person {
    private int age;
    
    public Person() {
        this.age = 0;
    }
}

public class AccessPrivateField {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            
            Class<?> cls = person.getClass();
            Field field = cls.getDeclaredField("age");
            
            field.setAccessible(true);
            
            System.out.println("Original age: " + field.get(person));
            
            field.set(person, 25);
            
            System.out.println("Modified age: " + field.get(person));
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
