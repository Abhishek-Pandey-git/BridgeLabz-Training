import java.util.Scanner;

// Program to calculate university fee with user input
public class UniversityFeeDiscountWithInput {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student fee: ");
        double fee = input.nextDouble();
        
        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();
        
        // Calculate discount amount and final fee
        double discountAmount = (fee * discountPercent) / 100;
        double finalFee = fee - discountAmount;
        
        System.out.println("The discount amount is INR " + discountAmount + 
                         " and final discounted fee is INR " + finalFee);
        
        input.close();
    }
}
