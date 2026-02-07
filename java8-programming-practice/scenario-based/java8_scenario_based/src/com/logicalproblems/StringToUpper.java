package com.logicalproblems;

import java.util.List;

public class StringToUpper {
	public static void main(String[] args) {
		List<String> lst=List.of("java","spring","boot");
		lst.stream().map(str->str.toUpperCase()).forEach(System.out::println);
	}
}
