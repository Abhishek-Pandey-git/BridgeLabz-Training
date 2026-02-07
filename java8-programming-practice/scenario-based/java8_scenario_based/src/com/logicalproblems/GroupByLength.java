package com.logicalproblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
	public static void main(String[] args) {
		List<String> str=List.of("a","bb","ccc","dd");
		Map<Integer, List<String>> grpByLength=str.stream().collect(Collectors.groupingBy((s)->s.length()));
		System.out.println(grpByLength.toString());
	}
}
