package com.collections.map;
import  java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class InvertMap {

	public static void main(String[] args) {
		Map<String, Integer> freq=new HashMap<>();
		
		
		
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
		
		System.out.printf("%-10s %-10s","Word","Count");
		System.out.println();
		for(Map.Entry<String,Integer>entry: freq.entrySet()) {
			System.out.printf("%-10s %-10d",entry.getKey(),entry.getValue());
			System.out.println();
		}
		
		System.out.println();
		
		//inverted the map
		
		Map<Integer,ArrayList<String>> inverted=new HashMap<>();
		
		
		//loop to traverse the original map and then work with it to invert by storing it in another map;
		for(Map.Entry<String,Integer>entry: freq.entrySet()) {
			if(!inverted.containsKey(entry.getValue())) {
				inverted.put(entry.getValue(),new ArrayList<>());
				inverted.get(entry.getValue()).add(entry.getKey());
				continue;
			}
			inverted.get(entry.getValue()).add(entry.getKey());
			
		}
		
		System.out.printf("%-10s %-10s","Count","Word");
		System.out.println();
		for(Map.Entry<Integer,ArrayList<String>>entry: inverted.entrySet()) {
			System.out.printf("%-10s %-10s",entry.getKey(),entry.getValue().toString());
			System.out.println();
		}
		input.close();
	}

}
