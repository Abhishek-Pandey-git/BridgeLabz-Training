package com.flashdealz;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//taking input
		System.out.println("Enter total products; ");
		int count=input.nextInt();
		
		//taking input
		for(int i=0;i<count;i++) {
			System.out.println("Enter the name of product: ");
			String name=input.next();
			System.out.println("Enter the proce of the product");
			double price=input.nextDouble();
			
			System.out.println("Enter discount percentage: ");
			double dc=input.nextDouble();
			
			SortByDiscount.addToProducts(name, price, dc);
			}
		
		System.out.println("Final Products list: ");
		SortByDiscount.printSorted();
	}

}
