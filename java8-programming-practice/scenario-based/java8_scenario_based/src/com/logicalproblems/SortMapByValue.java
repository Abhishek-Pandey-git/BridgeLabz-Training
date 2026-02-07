package com.logicalproblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {
	public static void main(String[] args) {
		Map<String, Integer> input = Map.of(
		        "A", 3,
		        "B", 1,
		        "C", 2
		);
		
		Map<String,Integer> sorted=input.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (c1,c2)->c1,LinkedHashMap::new));
		System.out.println(sorted.toString());
	}
}
