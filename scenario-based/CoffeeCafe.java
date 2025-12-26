import java.util.Scanner;

public class CoffeeCafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coffeeType;
        int quantity;
        double price = 0.0;
        double totalBill;
        double gst;
        double finalBill;
        double gstRate = 0.18;
        
        System.out.println("Welcome to Ravi's Coffee Cafe");
        System.out.println("Espresso - Rs.120");
        System.out.println("Cappuccino - Rs.150");
        System.out.println("Latte - Rs.180");
        System.out.println("Americano - Rs.100");
        System.out.println("Mocha - Rs.200");
        System.out.println("Type 'exit' to quit");
        System.out.println();
        
        while (true) {
            System.out.print("Enter coffee type: ");
            coffeeType = scanner.nextLine();
            
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting!");
                break;
            }
            
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 120.0;
                    break;
                case "cappuccino":
                    price = 150.0;
                    break;
                case "latte":
                    price = 180.0;
                    break;
                case "americano":
                    price = 100.0;
                    break;
                case "mocha":
                    price = 200.0;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    System.out.println();
                    continue;
            }
            
            System.out.print("Enter quantity: ");
            quantity = scanner.nextInt();
            scanner.nextLine();
            
            totalBill = price * quantity;
            gst = totalBill * gstRate;
            finalBill = totalBill + gst;
            
            System.out.println();
            System.out.println("Coffee: " + coffeeType);
            System.out.println("Price: Rs." + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Subtotal: Rs." + totalBill);
            System.out.println("GST (18%): Rs." + gst);
            System.out.println("Total Bill: Rs." + finalBill);
            System.out.println();
        }
        
        scanner.close();
    }
}
