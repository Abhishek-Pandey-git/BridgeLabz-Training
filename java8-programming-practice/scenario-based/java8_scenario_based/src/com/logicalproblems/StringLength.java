package com.logicalproblems;

import java.util.List;
import java.util.stream.Collectors;

public class StringLength {
	public static void main(String[] args) {
		List<String> lst=List.of("cat","elephant","dog");
		List<Integer> lengths=lst.stream().map(c->c.length()).collect(Collectors.toList());
		System.out.println(lengths.toString());
		
	}
}
