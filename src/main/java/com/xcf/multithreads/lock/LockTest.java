package com.xcf.multithreads.lock;

public class LockTest {

	Lock lock = new Lock();
	
	public void print() throws InterruptedException {
		lock.lock();
		doAdd();
		lock.unlock();
	}

	private void doAdd() throws InterruptedException {
		lock.lock();
		
		System.out.println("--------------doAdd--------------");
		
		lock.unlock();
	}
	
	public static void main(String[] args) throws InterruptedException {
		LockTest lockTest = new LockTest();
		lockTest.print();
	}
}
