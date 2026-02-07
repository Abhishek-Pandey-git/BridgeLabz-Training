package com.logicalproblems;

import java.util.List;

public class SecondHighest {
	public static void main(String[] args) {
		List<Integer> numbers=List.of(5,1,9,3);
		numbers.stream().sorted((a,b)->b-a).skip(1).findFirst().ifPresent(System.out::println);
		
	}
}
