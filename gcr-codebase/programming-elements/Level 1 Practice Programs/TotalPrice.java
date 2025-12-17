import java.util.Scanner;
// program to calculate total price by taking amount and quantity
public class TotalPrice{
	public static void main(String[] args){
		double price;
		int quantity;
		// Taking input
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the price of one item: ");
		price=input.nextDouble();
		System.out.println("Enter the quantity of item: ");
		quantity=input.nextInt();
		
		double totalprice=price*quantity;
		System.out.println("The total purchase price is INR "+totalprice+" if the quantity is "+quantity+" and unit price is INR "+price);
		input.close();
		 
		
		
	}
}