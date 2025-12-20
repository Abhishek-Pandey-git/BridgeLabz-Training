import java.util.Scanner;

// Q4. NumberChecker utility class with palindrome and array comparison methods
public class NumberCheckerPalindrome {
    
    public static int countDigits(int number) {
        number = Math.abs(number);
        
        if (number == 0) {
            return 1;
        }
        
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    
    public static int[] storeDigits(int number) {
        number = Math.abs(number);
        
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        
        int index = digitCount - 1;
        while (number > 0) {
            digits[index] = number % 10;
            number /= 10;
            index--;
        }
        
        return digits;
    }
    
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        
        return reversed;
    }
    
    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigitsArray(digits);
        return compareArrays(digits, reversed);
    }
    
    public static boolean isDuckNumber(int[] digits) {
        if (digits[0] == 0) {
            return false;
        }
        
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        
        return false;
    }
    
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Count digits
        int digitCount = countDigits(number);
        System.out.println("\nNumber of digits: " + digitCount);
        
        // Store digits in array
        int[] digits = storeDigits(number);
        System.out.print("Original digits array: ");
        printArray(digits);
        System.out.println();
        
        // Reverse the digits array
        int[] reversedDigits = reverseDigitsArray(digits);
        System.out.print("Reversed digits array: ");
        printArray(reversedDigits);
        System.out.println();
        
        // Compare original and reversed arrays
        boolean areEqual = compareArrays(digits, reversedDigits);
        System.out.println("Arrays equal: " + (areEqual ? "Yes" : "No"));
        
        // Check if palindrome
        boolean isPalin = isPalindrome(digits);
        System.out.println("Palindrome: " + (isPalin ? "Yes" : "No"));
        
        // Check if duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Duck Number: " + (isDuck ? "Yes" : "No"));
        
        // Additional test: Compare with another number
        System.out.print("\nEnter another number to compare: ");
        int number2 = input.nextInt();
        int[] digits2 = storeDigits(number2);
        
        System.out.print("Second number digits: ");
        printArray(digits2);
        System.out.println();
        
        boolean numbersEqual = compareArrays(digits, digits2);
        System.out.println("Both numbers equal: " + (numbersEqual ? "Yes" : "No"));
        
        input.close();
    }
}
