package com.logicalproblems;

import java.util.List;
import java.util.stream.Collectors;

public class JoinWithComma {
	public static void main(String[] args) {
		List<String> str=List.of("Java","Spring","Boot");
		
		String s=str.stream().collect(Collectors.joining(","));
		System.out.println(s);
	}
}
