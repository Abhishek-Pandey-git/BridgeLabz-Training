package com.collectors;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCounter {
	public static void main(String[] args) {
		String paragraph = "Java streams make data processing easy and streams make code readable";
		
		Map<String,Long> freq=Arrays.stream(paragraph.split(" ")).collect(Collectors.groupingBy(word->word,Collectors.counting()));
		System.out.println(freq.toString());
	}
}
