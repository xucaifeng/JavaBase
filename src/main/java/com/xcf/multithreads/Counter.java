package com.xcf.multithreads;

import java.util.concurrent.CountDownLatch;

public class Counter {

	public static volatile int count = 0;
	
	static CountDownLatch countDownLatch = new CountDownLatch(30);
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(args.length);
		for (int i = 0; i < 30; i++) {
			
			new Thread(){

				@Override
				public void run() {
					
					for (int j = 0; j < 10000; j++) {
						count ++;
					}
					countDownLatch.countDown();
				}
				
			}.start();
		}
		
		countDownLatch.await();
		System.out.println(count);
		
	}
	
	
	
}
