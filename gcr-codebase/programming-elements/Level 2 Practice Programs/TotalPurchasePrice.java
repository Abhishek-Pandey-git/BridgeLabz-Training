import java.util.Scanner;

// Program to calculate total purchase price
public class TotalPurchasePrice {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter unit price (in INR): ");
        double unitPrice = scanner.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        
        // Calculate total price
        double totalPrice = unitPrice * quantity;
        
        // Display result
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f%n", 
                         totalPrice, quantity, unitPrice);
        
        scanner.close();
    }
}
