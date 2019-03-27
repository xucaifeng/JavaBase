package com.xcf.multithreads.lock;

/**
 * 
 * @desc   不可重入锁
 * 当调用print()方法时，获得了锁，这时就无法再调用doAdd()方法，这时必须先释放锁才能调用，所以称这种锁为不可重入锁，也叫自旋锁
 * @author Caifeng Xu
 * @time   2019年2月25日
 */
public class Lock {
	
	private boolean isLocked = false;
	
	public synchronized void lock() throws InterruptedException {
		while (isLocked) {
			wait();
		}
		isLocked = true;
	}
	
	public synchronized void unlock() {
		isLocked = false;
		notify();
	}
	
}
