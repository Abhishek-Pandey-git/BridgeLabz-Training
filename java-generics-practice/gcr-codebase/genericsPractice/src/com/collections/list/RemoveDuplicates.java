package com.collections.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

// Remove duplicates while preserving order
public class RemoveDuplicates {

    public static <T> List<T> removeDuplicates(List<T> list) {
        // LinkedHashSet maintains insertion order and removes duplicates
        LinkedHashSet<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        System.out.println("Original List: " + list);
        
        List<Integer> uniqueList = removeDuplicates(list);
        System.out.println("List after removing duplicates: " + uniqueList);
        
        sc.close();
    }
}
