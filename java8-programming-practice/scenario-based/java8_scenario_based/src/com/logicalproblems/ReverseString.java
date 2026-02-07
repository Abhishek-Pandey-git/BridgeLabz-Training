package com.logicalproblems;

import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
	public static void main(String[] args) {
		List<String> str=List.of("java","api");
		List<String> reversedStrings=str.stream().map(s->{StringBuilder s1=new StringBuilder(s);
		return s1.reverse().toString();}).collect(Collectors.toList());
		
		System.out.println(reversedStrings.toString());
	}
}
