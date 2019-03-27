package com.xcf.multithreads.lock;

/**
 * 可重入锁测试
 * @desc
 * @author Caifeng Xu
 * @time   2019年2月25日
 */
public class ReentrantLockTest {

	synchronized void setA() throws Exception{
		System.out.println("--------------setA1-------------");
		Thread.sleep(1000);
		System.out.println("--------------setA2-------------");
		setB();
		System.out.println("--------------setA3-------------");
	 }

	synchronized void setB() throws Exception{
		System.out.println("--------------setB1-------------");
		Thread.sleep(1000);
		System.out.println("--------------setB2-------------");
	}
	
	public static void main(String[] args) {
		ReentrantLockTest reentrantLockTest = new ReentrantLockTest();
		try {
			reentrantLockTest.setA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
