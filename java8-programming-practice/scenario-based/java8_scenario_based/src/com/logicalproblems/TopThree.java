package com.logicalproblems;

import java.util.List;

public class TopThree {
	public static void main(String[] args) {
		List<Integer> num=List.of(10,90,30,70,50);
		num.stream().sorted((a,b)->b-a).limit(3).forEach(System.out::println);
	}
}
