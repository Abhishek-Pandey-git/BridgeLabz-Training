package com.logicalproblems;

public class CountWords {
	public static void main(String[] args) {
		String str="Hello how are you?";
		
		long count=str.chars().mapToObj(c->(char)c).filter(c->c.equals(' ')).count();
		System.out.println(count+1);
		
	}
}
