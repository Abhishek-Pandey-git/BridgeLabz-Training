package com.logicalproblems;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceOfWords {
	public static void main(String[] args) {
		String str="java is java and java is fast";
		
		Map<String , Long> wordFreq=Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(wordFreq.toString());
	}
}
