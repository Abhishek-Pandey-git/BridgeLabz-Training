package com.collections.queue;

import java.util.*;
public class BinaryNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//taking input
		
		System.out.println("Enter a number: ");
		int number=input.nextInt();
		
		ArrayList<String> list=new ArrayList<>();
		
		Queue<String> q=new ArrayDeque<>();
		
		q.offer("1");
		
		for(int i=0;i<number;i++) {
			String current=q.poll();
			
			list.add(current);
			
			q.offer(current+"0");
			q.offer(current+"1");
		}
		
		System.out.println("The generated bonary numbers are: "+list.toString());
		input.close();
	}
}
