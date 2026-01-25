package com.annotations;

import java.util.ArrayList;

public class SuppressWarningsDemo {
    
    @SuppressWarnings("unchecked")
    public static void useRawList() {
        ArrayList list = new ArrayList();
        
        list.add("Hello");
        list.add(123);
        list.add(45.67);
        list.add(true);
        
        System.out.println("Raw list contents: " + list);
        
        for (Object obj : list) {
            System.out.println(obj + " - " + obj.getClass().getSimpleName());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Using ArrayList without generics:");
        useRawList();
    }
}
