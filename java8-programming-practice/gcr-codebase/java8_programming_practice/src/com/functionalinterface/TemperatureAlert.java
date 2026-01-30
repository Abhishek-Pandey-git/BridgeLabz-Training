package com.functionalinterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlert {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Predicate<Double> temperatureAlert=temp->temp>37;
		System.out.println("Enter the temperature");
		double temp=input.nextDouble();
		
		//checking percentage
		if(temperatureAlert.test(temp)) {
			System.out.println("Temperature is dangerous");
		}
		else {
			System.out.println("Temperature is not dangerous");
		}
		
		input.close();
	}
}
