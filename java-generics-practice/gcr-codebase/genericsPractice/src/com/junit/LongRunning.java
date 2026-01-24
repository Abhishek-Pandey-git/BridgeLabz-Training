package com.junit;

public class LongRunning {
	public void longRunningTask() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("Hello");
	}
}
