import java.util.Scanner;

// Q5. NumberChecker utility class with prime, neon, spy, automorphic, and buzz number checks
public class NumberCheckerSpecial {
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        if (number == 2) {
            return true;
        }
        
        if (number % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static int sumOfDigits(long number) {
        int sum = 0;
        number = Math.abs(number);
        
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        
        return sum;
    }
    
    public static long productOfDigits(int number) {
        long product = 1;
        number = Math.abs(number);
        
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }
        
        return product;
    }
    
    public static boolean isNeon(int number) {
        long square = (long) number * number;
        int sumOfSquareDigits = sumOfDigits(square);
        
        return sumOfSquareDigits == number;
    }
    
    public static boolean isSpy(int number) {
        int sum = sumOfDigits(number);
        long product = productOfDigits(number);
        
        return sum == product;
    }
    
    public static boolean isAutomorphic(int number) {
        long square = (long) number * number;
        
        int temp = number;
        int digitCount = 0;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }
        
        long divisor = (long) Math.pow(10, digitCount);
        long lastDigits = square % divisor;
        
        return lastDigits == number;
    }
    
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        boolean prime = isPrime(number);
        System.out.println("\nPrime Number: " + (prime ? "Yes" : "No"));
        
        boolean neon = isNeon(number);
        System.out.println("Neon Number: " + (neon ? "Yes" : "No"));
        
        boolean spy = isSpy(number);
        System.out.println("Spy Number: " + (spy ? "Yes" : "No"));
        
        // Check if automorphic number
        boolean automorphic = isAutomorphic(number);
        System.out.println("Automorphic Number: " + (automorphic ? "Yes" : "No"));
        
        // Check if buzz number
        boolean buzz = isBuzz(number);
        System.out.println("Buzz Number: " + (buzz ? "Yes" : "No"));
        
        input.close();
    }
}
