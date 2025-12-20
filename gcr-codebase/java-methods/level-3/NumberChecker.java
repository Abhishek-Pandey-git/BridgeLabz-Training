import java.util.Scanner;

// Q2. NumberChecker utility class with various number checking methods
public class NumberChecker {
    
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
    
    public static boolean isArmstrongNumber(int[] digits) {
        int sum = 0;
        int power = digits.length;
        
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], power);
        }
        
        int originalNumber = 0;
        for (int i = 0; i < digits.length; i++) {
            originalNumber = originalNumber * 10 + digits[i];
        }
        
        return sum == originalNumber;
    }
    
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        return new int[]{largest, secondLargest};
    }
    
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        
        return new int[]{smallest, secondSmallest};
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int digitCount = countDigits(number);
        System.out.println("\nNumber of digits: " + digitCount);
        
        int[] digits = storeDigits(number);
        System.out.print("Digits array: [");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if (i < digits.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Check if duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Duck Number: " + (isDuck ? "Yes" : "No"));
        
        // Check if Armstrong number
        boolean isArmstrong = isArmstrongNumber(digits);
        System.out.println("Armstrong Number: " + (isArmstrong ? "Yes" : "No"));
        
        // Find largest and second largest digit
        int[] largestDigits = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestDigits[0]);
        if (largestDigits[1] != Integer.MIN_VALUE) {
            System.out.println("Second largest digit: " + largestDigits[1]);
        } else {
            System.out.println("Second largest digit: Not found");
        }
        
        // Find smallest and second smallest digit
        int[] smallestDigits = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestDigits[0]);
        if (smallestDigits[1] != Integer.MAX_VALUE) {
            System.out.println("Second smallest digit: " + smallestDigits[1]);
        } else {
            System.out.println("Second smallest digit: Not found");
        }
        
        input.close();
    }
}

