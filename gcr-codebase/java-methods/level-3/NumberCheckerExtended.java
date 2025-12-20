import java.util.Scanner;

// Q3. Extended NumberChecker utility class with digit analysis methods
public class NumberCheckerExtended {
    
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
    
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }
    
    public static double findSumOfSquares(int[] digits) {
        double sumOfSquares = 0;
        for (int i = 0; i < digits.length; i++) {
            sumOfSquares += Math.pow(digits[i], 2);
        }
        return sumOfSquares;
    }
    
    public static boolean isHarshadNumber(int[] digits) {
        int originalNumber = 0;
        for (int i = 0; i < digits.length; i++) {
            originalNumber = originalNumber * 10 + digits[i];
        }
        
        int sumOfDigits = findSumOfDigits(digits);
        
        return originalNumber % sumOfDigits == 0;
    }
    
    public static int[][] findDigitFrequency(int[] digits) {
        int[] frequency = new int[10];
        
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }
        
        int uniqueCount = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }
        
        int[][] digitFrequency = new int[uniqueCount][2];
        int index = 0;
        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                digitFrequency[index][0] = i;
                digitFrequency[index][1] = frequency[i];
                index++;
            }
        }
        
        return digitFrequency;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int digitCount = countDigits(number);
        System.out.println("\nNumber of digits: " + digitCount);
        
        // Store digits in array
        int[] digits = storeDigits(number);
        System.out.print("Digits array: [");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if (i < digits.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Find sum of digits
        int sumOfDigits = findSumOfDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);
        
        // Find sum of squares of digits
        double sumOfSquares = findSumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + (int)sumOfSquares);
        
        // Check if Harshad number
        boolean isHarshad = isHarshadNumber(digits);
        System.out.println("Harshad Number: " + (isHarshad ? "Yes" : "No"));
        
        // Find digit frequency
        int[][] digitFrequency = findDigitFrequency(digits);
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < digitFrequency.length; i++) {
            System.out.println("Digit " + digitFrequency[i][0] + ": " + digitFrequency[i][1] + " times");
        }
        
        input.close();
    }
}
