package com.logicalproblems;

import java.util.List;

public class IntlListToStr {
	public static void main(String[] args) {
		List<Integer> lst=List.of(1,2,3);
		List<String> str=lst.stream().map(c->String.valueOf(c)).toList();
		
		System.out.println(str.toString());
	}
}
