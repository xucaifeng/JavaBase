package com.xcf.multithreads.lock;

/**
 * 
 * @desc   可重入锁
 * 相对来说，可重入就意味着：线程可以进入任何一个它已经拥有的锁所同步着的代码块。
 * 第一个线程执行print()方法，得到了锁，使lockedBy等于当前线程，也就是说，执行的这个方法的线程获得了这个锁，执行add()方法时，同样要先获得锁，
 * 因不满足while循环的条件，也就是不等待，继续进行，将此时的lockedCount变量，也就是当前获得锁的数量加一，当释放了所有的锁，才执行notify()。
 * 如果在执行这个方法时，有第二个线程想要执行这个方法，因为lockedBy不等于第二个线程，导致这个线程进入了循环，也就是等待，不断执行wait()方法。
 * 只有当第一个线程释放了所有的锁，执行了notify()方法，第二个线程才得以跳出循环，继续执行。
 * 这就是可重入锁的特点。
 * @author Caifeng Xu
 * @time   2019年2月25日
 */
public class ReentrantLock {
	
	boolean isLocked = false;
	Thread lockedBy = null;
	int lockedCount = 0;
	
	public synchronized void lock() throws InterruptedException {
		Thread thread = Thread.currentThread();
		while (isLocked && lockedBy != thread) {
			wait();
		}
		
		isLocked = true;
		lockedCount++;
		lockedBy = thread;
	}
	
	
	public synchronized void unlock() {
		if (Thread.currentThread() == this.lockedBy) {
			lockedCount --;
			if (lockedCount == 0) {
				isLocked = false;
				notify();
			}
		}
	}
	
}
