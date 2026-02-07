package com.logicalproblems;

public class CountVowels {
	public static void main(String[] args) {
		String str="programming";
		long count=str.chars().mapToObj(c->(char)c).filter(c->"aeiou".indexOf(c)!=-1).count();
		System.out.println(count);
	}
}
