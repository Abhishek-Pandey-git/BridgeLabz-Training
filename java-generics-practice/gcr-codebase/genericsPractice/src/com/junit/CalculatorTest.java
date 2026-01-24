package com.junit;



//import junit.framework.Assert;


//calculator class
public class CalculatorTest
{
	public int add(int a,int b) {
		return a+b;
	}
	
	public int subtraction(int a,int b) {
		return a-b;
		
	}
	
	public int multiply(int a,int b) {
		return a*b;
		
	
	}
	
	public int divide(int a,int b) {
		if(b==0) {
			throw new IllegalArgumentException("Division by zero not allowed");
		}
		
		return a/b;
	}

}



