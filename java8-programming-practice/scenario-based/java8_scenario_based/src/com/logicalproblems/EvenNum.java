package com.logicalproblems;

import java.util.List;

public class EvenNum {
	public static void main(String[] args) {
		List<Integer> lst=List.of(2,5,7,8,10,13);
		lst.stream().filter(c->c%2==0).forEach(System.out::println);
		
	}
}
