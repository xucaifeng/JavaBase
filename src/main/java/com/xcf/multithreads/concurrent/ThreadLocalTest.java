package com.xcf.multithreads.concurrent;

public class ThreadLocalTest {
	
	ThreadLocal<Long> longLocal = new ThreadLocal<Long>();
	ThreadLocal<String> stringLocal = new ThreadLocal<String>();
	
	public void set() {
		longLocal.set(Thread.currentThread().getId());
		stringLocal.set(Thread.currentThread().getName());
	}

	public long getLong() {
		return longLocal.get();
	}
	
	public String getString() {
		return stringLocal.get();
	}
	
	public static void main(String[] args) throws InterruptedException {
		final ThreadLocalTest threadLocalTest = new ThreadLocalTest();
		
		threadLocalTest.set();
		
		System.out.println(threadLocalTest.getLong());
		System.out.println(threadLocalTest.getString());
		
		Thread thread1 = new Thread() {

			@Override
			public void run() {
				threadLocalTest.set();
				System.out.println(threadLocalTest.getLong());
				System.out.println(threadLocalTest.getString());
			}
			
		};
		
		thread1.start();
		thread1.join();
		
		
	}
}
