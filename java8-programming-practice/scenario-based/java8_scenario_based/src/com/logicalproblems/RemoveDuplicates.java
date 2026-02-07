package com.logicalproblems;

import java.util.List;

public class RemoveDuplicates {
public static void main(String[] args) {
	List<Integer>lst=List.of(1,2,2,3,4,4,5);
	
	List<Integer> uniqueNumbers=lst.stream().distinct().toList();
	System.out.println(uniqueNumbers.toString());
}
}
