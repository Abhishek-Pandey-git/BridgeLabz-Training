package com.logicalproblems;

import java.util.List;

public class DescendingSort {
	public static void main(String[] args) {
		List<Integer> numbers=List.of(5,1,9,3);
		List<Integer> sorted=numbers.stream().sorted((a,b)->b-a).toList();
		System.out.println(sorted.toString());
	}
}
