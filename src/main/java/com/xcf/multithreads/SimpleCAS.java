package com.xcf.multithreads;

public class SimpleCAS {
	
	private volatile int value;
	
	public synchronized int getValue() {
		return value;
	}
	
	public synchronized boolean compareAndSwap(int expect, int update) {
		int oldValue = value;
		if (oldValue == expect) {
			value = update;
			return true;
		} else {
			return false;
		}
	}
	
}
