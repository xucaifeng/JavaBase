package com.xcf.multithreads.impl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 通过实现Callable接口实现多线程，可以获取返回值
 * @desc
 * @author Caifeng Xu
 * @time   2019年3月27日
 */
public class CallableTest implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return 1;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableTest callableTest = new CallableTest();
		FutureTask<Integer> futureTask = new FutureTask<>(callableTest);
		
		Thread t = new Thread(futureTask);
		t.start();
		
		System.out.println(futureTask.get());
		
	}
	
	
}
