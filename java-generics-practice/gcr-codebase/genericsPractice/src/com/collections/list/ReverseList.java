package com.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Reverse list without using built-in reverse methods
public class ReverseList {

    // Reverse using two pointers approach
    public static <T> void reverseList(List<T> list) {
        int left = 0;
        int right = list.size() - 1;
        
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        // Test with ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        
        System.out.println("Original ArrayList: " + arrayList);
        reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);
        
        // Test with LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        reverseList(linkedList);
        System.out.println("Reversed again (LinkedList): " + linkedList);
        
        sc.close();
    }
}
