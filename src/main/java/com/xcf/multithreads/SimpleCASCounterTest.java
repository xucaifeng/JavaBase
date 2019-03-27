package com.xcf.multithreads;

public class SimpleCASCounterTest {
	
	public static void main(String[] args) {
		SimpleCASCounter simpleCASCounter = new SimpleCASCounter();
		
		int s = simpleCASCounter.increment();
		
		System.out.println(s);
	}

}
