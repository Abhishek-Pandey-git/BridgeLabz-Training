package com.logicalproblems;

import java.util.List;

public class StringStartingWithA {
	public static void main(String[] args) {
		List<String>lst=List.of("apple","banana","ant","car");
		lst.stream().filter(str->str.startsWith("a")).forEach(System.out::println);
	}
}
