package com.logicalproblems;

import java.util.List;

public class FlattenList {
	public static void main(String[] args) {
		List<List<Integer>> list =
		        List.of(
		                List.of(1, 2),
		                List.of(3, 4),
		                List.of(5)
		        );
		
		List<Integer> flatList=list.stream().flatMap(List::stream).toList();
		System.out.println(flatList.toString());

	}
}
