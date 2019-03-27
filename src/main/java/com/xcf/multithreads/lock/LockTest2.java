package com.xcf.multithreads.lock;

public class LockTest2 {

	public static void main(String[] args) {
		Lock lock = new Lock();
		System.out.println(lock.hashCode());
		lock.unlock();
	}
	
}
