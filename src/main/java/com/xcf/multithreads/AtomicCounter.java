package com.xcf.multithreads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
	
	private static volatile AtomicInteger num = new AtomicInteger();
	
	static CountDownLatch countDownLatch = new CountDownLatch(30);
	
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 30; i++) {
			new Thread() {

				@Override
				public void run() {
					
					for (int j = 0; j < 10000; j++) {
						num.incrementAndGet();
					}
					countDownLatch.countDown();
				}
				
			}.start();
		}
		countDownLatch.await();
		System.out.println(num);
	}
	

}
