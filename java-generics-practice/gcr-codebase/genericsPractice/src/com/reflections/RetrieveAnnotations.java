package com.reflections;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "John Doe")
class Book {
    private String title;
    
    public Book(String title) {
        this.title = title;
    }
}

public class RetrieveAnnotations {
    public static void main(String[] args) {
        try {
            Class<?> cls = Book.class;
            
            if (cls.isAnnotationPresent(Author.class)) {
                Author author = cls.getAnnotation(Author.class);
                System.out.println("Author: " + author.name());
            } else {
                System.out.println("No annotation found");
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
