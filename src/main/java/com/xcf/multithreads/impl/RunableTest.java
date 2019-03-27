package com.xcf.multithreads.impl;
/**
 * 通过Runnable接口实现多线程，3种方式：
 * 1、实现runnable，通过new Thread运行
 * 2、匿名实现runnable接口
 * 3、lambda方式实现runnable接口
 * @desc
 * @author Caifeng Xu
 * @time   2019年3月27日
 */
public class RunableTest implements Runnable {

	@Override
	public void run() {
		System.out.println(1);
		try {
			Thread.sleep(1*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("curr thread: "+Thread.currentThread().getName());
	}

	
	public static void main(String[] args) {
		
		RunableTest runableTest = new RunableTest();
		RunableTest runableTest2 = new RunableTest();
		
		// 创建一个新线程运行
		new Thread(runableTest, "new thread 1").start();
		new Thread(runableTest2, "new thread 2").start();
		
		
		// 匿名实现Runnable接口
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(3);
				System.out.println("curr thread: "+Thread.currentThread().getName());
			}
		};
		
		// 使用主线程运行
		runnable.run();
		
		
		// lambda 方式实现runnable
		Runnable runnable2 = () -> {
			System.out.println("lambda runnable running");
			System.out.println("curr thread: "+Thread.currentThread().getName());
		};
		new Thread(runnable2, "lambda runnable thread").start();
	}
}
