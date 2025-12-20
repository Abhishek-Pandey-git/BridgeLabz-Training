import java.util.Scanner;

// Q6. NumberChecker utility class with perfect, abundant, deficient, and strong number checks
public class NumberCheckerDivisors {
    
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum;
    }
    
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        
        return fact;
    }
    
    public static long sumOfFactorialOfDigits(int number) {
        long sum = 0;
        number = Math.abs(number);
        
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        
        return sum;
    }
    
    public static boolean isPerfect(int number) {
        if (number <= 0) {
            return false;
        }
        
        int sumDivisors = sumOfProperDivisors(number);
        return sumDivisors == number;
    }
    
    public static boolean isAbundant(int number) {
        if (number <= 0) {
            return false;
        }
        
        int sumDivisors = sumOfProperDivisors(number);
        return sumDivisors > number;
    }
    
    public static boolean isDeficient(int number) {
        if (number <= 0) {
            return false;
        }
        
        int sumDivisors = sumOfProperDivisors(number);
        return sumDivisors < number;
    }
    
    public static boolean isStrong(int number) {
        if (number <= 0) {
            return false;
        }
        
        long sumFactorial = sumOfFactorialOfDigits(number);
        return sumFactorial == number;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int sumDivisors = sumOfProperDivisors(number);
        System.out.println("\nSum of proper divisors: " + sumDivisors);
        
        boolean perfect = isPerfect(number);
        System.out.println("Perfect Number: " + (perfect ? "Yes" : "No"));
        
        boolean abundant = isAbundant(number);
        System.out.println("Abundant Number: " + (abundant ? "Yes" : "No"));
        
        boolean deficient = isDeficient(number);
        System.out.println("Deficient Number: " + (deficient ? "Yes" : "No"));
        
        long sumFactorial = sumOfFactorialOfDigits(number);
        System.out.println("\nSum of factorial of digits: " + sumFactorial);
        
        boolean strong = isStrong(number);
     
        System.out.println("Strong Number: " + (strong ? "Yes" : "No"));
        
        input.close();
    }
}
