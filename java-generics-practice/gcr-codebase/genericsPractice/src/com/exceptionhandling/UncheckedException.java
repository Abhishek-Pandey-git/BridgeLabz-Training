package com.exceptionhandling;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UncheckedException {
	public static void division(int a,int b) {
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.err.println("Error: "+e.getMessage());
		}
		catch (Exception e) {
			System.err.println("Error: "+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		try {
			System.out.println("Enter first number");
			int a =input.nextInt();
			System.out.println("Enter second number");
			int b=input.nextInt();
			
			division(a,b);		
		}
		catch(InputMismatchException e) {
			System.err.println("Error: Input does not match. The input must be integer in format");
		}
		
		input.close();
	}
}
