package com.logicalproblems;

import java.util.Comparator;
import java.util.List;

public class FindMax {
	public static void main(String[] args) {
		List<Integer> lst=List.of(10,25,3,99,45);
		lst.stream().mapToInt(a->a).max().ifPresent(System.out::println);
	}
}
