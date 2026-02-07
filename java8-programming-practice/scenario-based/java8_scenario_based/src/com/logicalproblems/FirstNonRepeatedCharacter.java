package com.logicalproblems;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String str="stress";
		
		str.chars().mapToObj(a->(char)a).filter(a->str.indexOf(a)==str.lastIndexOf(a)).findFirst().ifPresentOrElse(System.out::println,()->System.out.println("No such characters"));
	}
}
