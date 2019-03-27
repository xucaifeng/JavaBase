package com.xcf.multithreads.impl;
/**
 * 
 * @desc   通过继承Thread实现多线程
 * @author Caifeng Xu
 * @time   2019年3月9日
 */
public class ThreadTest extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println(1);
		System.out.println("curr thread: "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadTest threadTest = new ThreadTest();
		ThreadTest threadTest2 = new ThreadTest();
		
		threadTest.start();
		threadTest2.start();
		
		Thread thread = new Thread("new thread"){

			@Override
			public void run() {
				System.out.println(2);
				System.out.println("curr thread: "+Thread.currentThread().getName());
			}
			
		};
		thread.start();
		
	}

}
