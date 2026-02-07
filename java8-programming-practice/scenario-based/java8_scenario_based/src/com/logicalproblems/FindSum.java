package com.logicalproblems;

import java.util.List;
import java.util.stream.Collectors;

public class FindSum {
	public static void main(String[] args) {
		List<Integer> lst= List.of(1,2,3,4,5);
		int total=lst.stream().mapToInt(c->c).sum();
		System.out.println(total);
	}
}
