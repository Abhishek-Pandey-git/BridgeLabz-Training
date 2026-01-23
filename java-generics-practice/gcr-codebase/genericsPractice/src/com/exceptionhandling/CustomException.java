package com.exceptionhandling;
import java.util.Scanner;
import java.util.InputMismatchException;


//custom exception
class InvalidAgeException extends Exception{
	

	public InvalidAgeException(String message) {
		super(message);
	}
}


public class CustomException {
	
	public static void validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age must be greater then 18");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		try {
			System.out.println("Enter your age");
			int age=input.nextInt();
			validateAge(age);
		}
		catch(InputMismatchException e) {
			System.err.println("Error: The input must be an integer");
		}
		catch(InvalidAgeException e) {
			System.err.println("ERROR: "+e.getMessage());
		}
		catch (Exception e) {
			System.err.println("Error: "+e.getMessage());
		}
		input.close();
	}
}
