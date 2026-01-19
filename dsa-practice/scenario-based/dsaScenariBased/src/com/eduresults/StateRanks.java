package com.eduresults;

import java.util.ArrayList;

// class for storing all ranks 
public class StateRanks {
	private static ArrayList<Double> finalRanks=new ArrayList<>();
	
	public static void makeFinalList(ArrayList<Double> district) {
		
		if(finalRanks.isEmpty()) {
			finalRanks=district;
			return;
		}
		//temporary list to store combined marks for now
		ArrayList<Double> temp=new ArrayList<>();
		
		int i=0; int j=0;
		
		// merging
		while(i<finalRanks.size() && j<district.size()) {
			
			
			if(finalRanks.get(i)>=district.get(j)) {
				temp.add(finalRanks.get(i));
				i++;
				
			}
			else {
				temp.add(district.get(j));
				j++;
				
			}
		}
		
		//if either finalRnks or district was not traversed properly
		
		while(i<finalRanks.size()) {
			temp.add(finalRanks.get(i));
			i++;
			
		}
		
		while(j<district.size()) {
			temp.add(district.get(j));
			j++;
			
		}
		
		// swapping the values as total
		finalRanks=temp;
		
	}
	//printing marks
	
	public static void showMarks() {
		if(finalRanks.isEmpty()) {
			System.out.print("The list is empty");
			return;
		}
		for(double ele:finalRanks) {
			System.out.print(ele+" ");
		}
	}
}
