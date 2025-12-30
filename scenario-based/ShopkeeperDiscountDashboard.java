import java.util.Scanner;

public class ShopkeeperDiscountDashboard {

    // Discount rate constants
    public static final double DISCOUNT_20 = 0.20;
    public static final double DISCOUNT_10 = 0.10;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Welcome Screen
        System.out.println("==============================================");
        System.out.println("        SHOPKEEPER'S DISCOUNT DASHBOARD        ");
        System.out.println("==============================================");

        // Input number of items
        System.out.print("Enter number of items purchased: ");
        int itemCount = input.nextInt();

        double totalBill = 0.0;

        // Table Header
        System.out.println("\n---------------- ITEM DETAILS ----------------");
        System.out.printf("%-10s %-15s%n", "Item No", "Price");
        System.out.println("----------------------------------------------");

        // Input item prices using for-loop
        for (int i = 1; i <= itemCount; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = input.nextDouble();
            totalBill += price;

            System.out.printf("%-10d %-15.2f%n", i, price);
        }

        System.out.println("----------------------------------------------");

        double discountAmount = 0.0;
        String discountType = "No Discount";

        // Discount logic using if-else
        if (totalBill >= 5000) {
            discountAmount = totalBill * DISCOUNT_20;
            discountType = "20% Discount";
        } else if (totalBill >= 3000) {
            discountAmount = totalBill * DISCOUNT_10;
            discountType = "10% Discount";
        }

        double finalAmount = totalBill - discountAmount;

        // Bill Summary
        System.out.println("\n================ BILL SUMMARY ================");
        System.out.printf("%-25s : %.2f%n", "Total Bill Amount", totalBill);
        System.out.printf("%-25s : %s%n", "Discount Applied", discountType);
        System.out.printf("%-25s : %.2f%n", "Discount Amount", discountAmount);
        System.out.println("----------------------------------------------");
        System.out.printf("%-25s : %.2f%n", "Amount Payable", finalAmount);
        System.out.println("==============================================");

        // Exit Message
        System.out.println("\nThank you for shopping with us!");

        input.close();
    }
}
