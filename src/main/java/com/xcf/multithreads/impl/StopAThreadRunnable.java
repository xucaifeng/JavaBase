package com.xcf.multithreads.impl;

/**
 * 
 * @desc Stopping a Java Thread requires some preparation of your thread implementation code. 
 * The Java Thread class contains a stop() method, but it is deprecated. The original stop() 
 * method would not provide any guarantees about in what state the thread was stopped. 
 * That means, that all Java objects the thread had access to during execution would be left 
 * in an unknown state. If other threads in your application also has access to the same objects, 
 * your application could fail unexpectedly and unpredictably.
 * 
 * Instead of calling the stop() method you will have to implement your thread code so it can be stopped. 
 * Here is an example of a class that implements Runnable which contains an extra method called doStop() 
 * which signals to the Runnable to stop. The Runnable will check this signal and stop when it is ready to do so.
 * 
 * @author Caifeng Xu
 * @time   2019年3月27日
 */
public class StopAThreadRunnable implements Runnable {

	private boolean doStop = false;
	
	public synchronized void doStop() {
		this.doStop = true;
	}
	
	private synchronized boolean keepRunning() {
		return this.doStop == false;
	}
	
	@Override
	public void run() {
		
		while (keepRunning()) {
			System.out.println("cur thread running: "+Thread.currentThread().getName());
			try {
				Thread.sleep(3*1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	
	public static void main(String[] args) {
		StopAThreadRunnable stopAThreadRunnable = new StopAThreadRunnable();
		new Thread(stopAThreadRunnable).start();;
		
		try {
			System.out.println("thread sleep 1s: "+Thread.currentThread().getName());
			Thread.sleep(1*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		stopAThreadRunnable.doStop();
	}
	
}
