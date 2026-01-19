package com.eduresults;

import java.util.Scanner;
import java.util.Collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//making the choice for district
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 1 for entering marks\t\tEnter 0 for exiting the program");
		int choice=input.nextInt();
		
		
		
		while(true) {
			if(choice==0) {
				System.out.println("Thankyou for your time!!!");
				break;
			}
			else if(choice==1){
				System.out.println("Enter the number of students in your district: ");
				int size=input.nextInt();
				
				//list to store marks
				ArrayList<Double> marks=new ArrayList<>();
				
				//taking input
				for(int i=0;i<size;i++) {
					System.out.println("Enter marks of "+(i+1)+"student marks");
					double mark=input.nextDouble();
					marks.add(mark);
				}
				
				//sorting the marks list in desc order
				Collections.sort(marks,Collections.reverseOrder());
				
				
				//putting the marks in the ranks;
				StateRanks.makeFinalList(marks);
				System.out.println("Current status of list: ");
				StateRanks.showMarks();
				System.out.println();
				
				
			}
			else {
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("Enter 1 for entering marks\t\tEnter 0 for exiting the program");
			choice=input.nextInt();
			
			
		}
		
		//final list show;
		System.out.println("Final status of list: ");
		StateRanks.showMarks();
		input.close();
		

	}

}
