package com.collections.set;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class EqualSets {
	
	
	//checking set equality
	
	public static boolean isEqual(Set<Integer>st1,Set<Integer>st2) {
		return (st1.size()==st2.size()) && st1.containsAll(st2);
	}
	
	public static void main(String[] args) {
		//instantiating scanner
		
		Scanner input=new Scanner(System.in);
		
		Set<Integer> st1=new HashSet<>(Set.of(1,2,3,4,5));
		
		Set<Integer> st2=new HashSet<>(Set.of(1,4,3,2,5));
		
		if(isEqual(st1, st2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		input.close();
	}
}
