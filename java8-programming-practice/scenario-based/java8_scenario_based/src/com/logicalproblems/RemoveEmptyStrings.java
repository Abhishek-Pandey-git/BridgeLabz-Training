package com.logicalproblems;

import java.util.List;

public class RemoveEmptyStrings {
	public static void main(String[] args) {
		List<String>lst=List.of("java","","spring","","boot");
		lst.stream().filter(str->str.length()>1).forEach(System.out::println);
	}
}
