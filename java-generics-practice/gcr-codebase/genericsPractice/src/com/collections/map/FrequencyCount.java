package com.collections.map;

import java.util.Scanner;
import java.util.HashMap;import java.util.Map;
public class FrequencyCount {

	public static void main(String[] args) {
		HashMap<String,Integer> freq=new HashMap<>();
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter any string: ");
		String str=input.nextLine();
		
		//converting to array for proper traversal
		
		String[] strArray=str.split(" ");
		for(int i=0;i<strArray.length;i++) {
			if(!freq.containsKey(strArray[i])) {
				freq.put(strArray[i],1);
				continue;
			}
			
			int value=freq.get(strArray[i]);
			freq.put(strArray[i], value+1);
			
		}
		
		//printing all freqs
		
		
		System.out.printf("%-10s %-10d","Word","Count");
		for(Map.Entry<String,Integer>entry: freq.entrySet()) {
			System.out.printf("%-10s %-10d",entry.getKey(),entry.getValue());
			System.out.println();
		}
		
		input.close();
	}

}
