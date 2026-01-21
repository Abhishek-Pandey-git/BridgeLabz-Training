package com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Rotate list elements by given positions
public class RotateList {

    public static <T> void rotateList(List<T> list, int positions) {
        if (list.isEmpty()) return;
        
        int size = list.size();
        positions = positions % size; // handle positions > size
        
        if (positions < 0) {
            positions = size + positions; // handle negative positions
        }
        
        // Rotate by moving first 'positions' elements to end
        for (int i = 0; i < positions; i++) {
            T first = list.remove(0);
            list.add(first);
        }
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
        
        System.out.print("Enter rotation positions: ");
        int positions = sc.nextInt();
        
        System.out.println("Original List: " + list);
        rotateList(list, positions);
        System.out.println("Rotated List: " + list);
        
        sc.close();
    }
}
