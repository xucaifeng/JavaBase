package com.xcf.multithreads.impl;

public class JoinMethodTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadTest trTest = new ThreadTest();
		ThreadTest trTest2 = new ThreadTest();
		
		trTest.start();
		trTest.join();
		trTest2.start();
		trTest2.join();
		
		System.out.println("---main---");
		
	}

}
