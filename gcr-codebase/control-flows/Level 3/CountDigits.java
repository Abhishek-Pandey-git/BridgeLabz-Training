import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int count = 0;
        int tempNumber = Math.abs(number);
        
        // Count digits by removing last digit in each iteration
        if (tempNumber == 0) {
            count = 1;
        } else {
            while (tempNumber != 0) {
                tempNumber = tempNumber / 10;
                count++;
            }
        }
        
        System.out.println("Number of digits: " + count);
        
        scanner.close();
    }
}
