package com.xcf.multithreads.lock;

import java.util.concurrent.CountDownLatch;

/**
 * 
 * @desc   synchronized 锁加在对象上
 * @author Caifeng Xu
 * @time   2019年3月26日
 */
public class SynchronizedTest2 {
	
	private int sum1 = 0;
	private int sum2 = 0;

	private Integer sum1Lock = new Integer(1);
    private Integer sum2Lock = new Integer(2);
    
    public void add (int val1, int val2) {
    	synchronized (this.sum1Lock) { // 锁加在对象上，而非实例，可以使不同的线程同时修改sum1 和 sum2；注：因sum1和sum2不是对象，所以不能对sum1和sum2加锁
    		System.out.println("start1");
    		try {
				Thread.sleep(13L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.sum1 += val1;
			System.out.println("end1");
		}
    	
    	synchronized (this.sum2Lock) {
    		System.out.println("start2");
    		try {
				Thread.sleep(17L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.sum2 += val2;
			System.out.println("end2");
		}
    }
    
    
    public static void main(String[] args) {
		
    	SynchronizedTest2 synchronizedTest2 = new SynchronizedTest2();
    	
    	int threadNum = 10;
    	CountDownLatch countDownLatch = new CountDownLatch(threadNum);
    	int count = 0;
    	while(count < threadNum) {
    		Thread thread = new Thread(){
    			
    			@Override
    			public void run() {
    				
    				synchronizedTest2.add(1, 1);
    				
    				countDownLatch.countDown();
    			}
    			
    		};
    		thread.start();
    		count ++;
    	}
    	// 阻塞至所有线程执行完毕
    	try {
			countDownLatch.await();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
    	System.out.println("sum1: "+synchronizedTest2.sum1);
    	System.out.println("sum2: "+synchronizedTest2.sum2);
    	
	}
    
    
}
