package com.xcf.multithreads.lock;

/**
 * 
 * @desc   不可重入锁测试类
 * @author Caifeng Xu
 * @time   2019年4月12日
 */
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
