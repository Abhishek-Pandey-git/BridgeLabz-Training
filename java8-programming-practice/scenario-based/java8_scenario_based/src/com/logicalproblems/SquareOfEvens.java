package com.logicalproblems;

import java.util.List;

public class SquareOfEvens {
	public static void main(String[] args) {
		List<Integer>list=List.of(1,2,3,4,5);
		int squaredSum=list.stream().filter(c->c%2==0).map(c->c*c).mapToInt(c->c).sum();
		System.out.println(squaredSum);
	}
}
