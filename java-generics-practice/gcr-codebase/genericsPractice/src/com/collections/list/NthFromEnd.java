package com.collections.list;

import java.util.LinkedList;
import java.util.Scanner;

// Find Nth element from end without calculating size
public class NthFromEnd {

    // Two-pointer approach: fast pointer moves N steps ahead
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (list.isEmpty() || n <= 0) {
            return null;
        }
        
        int fast = 0;
        int slow = 0;
        
        // Move fast pointer N steps ahead
        for (int i = 0; i < n; i++) {
            fast++;
            if (fast >= list.size()) {
                return null; // N is larger than list size
            }
        }
        
        // Move both pointers until fast reaches end
        while (fast < list.size()) {
            fast++;
            slow++;
        }
        
        return list.get(slow);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        
        System.out.print("Enter N (position from end): ");
        int position = sc.nextInt();
        
        System.out.println("LinkedList: " + list);
        
        String result = findNthFromEnd(list, position);
        if (result != null) {
            System.out.println(position + "th element from end: " + result);
        } else {
            System.out.println("Invalid position");
        }
        
        sc.close();
    }
}
