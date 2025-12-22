import java.util.Scanner;

public class PalindromeChecker {
    
    // Logic 1: using loop
    public static boolean isPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while(start < end) {
            if(text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    // Logic 2: using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if(start >= end) {
            return true;
        }
        
        if(text.charAt(start) != text.charAt(end)) {
            return false;
        }
        
        return isPalindromeRecursive(text, start+1, end-1);
    }
    
    // reverse string using charAt
    public static char[] reverseString(String text) {
        int len = text.length();
        char[] reversed = new char[len];
        
        for(int i=0; i<len; i++) {
            reversed[i] = text.charAt(len - 1 - i);
        }
        
        return reversed;
    }
    
    // Logic 3: using character array
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        
        for(int i = 0; i<original.length; i++) {
            if(original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Palindrome Checker");
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        // check using all three methods
        boolean result1 = isPalindromeLoop(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length()-1);
        boolean result3 = isPalindromeArray(text);
        
        System.out.println("\nResults:");
        System.out.println("Using Loop: " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Recursion: " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Array: " + (result3 ? "Palindrome" : "Not Palindrome"));
        
        input.close();
    }
}
