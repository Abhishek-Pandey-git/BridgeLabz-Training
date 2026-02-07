package com.logicalproblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByEvenAndOdd {
	public static void main(String[] args) {
		List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9);
		Map<Boolean,List<Integer>> evenOdd=numbers.stream().collect(Collectors.partitioningBy(i->i%2==0));
		System.out.println("Even: "+evenOdd.get(evenOdd));
		
	}
}
