package com.logicalproblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
	public static void main(String[] args) {
		List<Integer>lst=List.of(1,2,3,2,4,5,1);
		List<Integer>duplicates=lst.stream().collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>=2).map(Map.Entry::getKey).toList();
		System.out.println(duplicates.toString());
	}
}
