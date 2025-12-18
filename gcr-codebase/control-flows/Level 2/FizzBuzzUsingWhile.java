import java.util.Scanner;

public class FizzBuzzUsingWhile {
    public static void main(String[] args) {
        int number;
        
        Scanner input = new Scanner(System.in);
        
        // Taking input from user
        System.out.println("Enter the Number: ");
        number = input.nextInt();
        
        // Finding if the number is a positive number or not
        if (number > 0) {
            // Iterating till number from 1
            int i = 1;
            while (i <= number) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("The number must be positive");
        }
        
        input.close();
    }
}
