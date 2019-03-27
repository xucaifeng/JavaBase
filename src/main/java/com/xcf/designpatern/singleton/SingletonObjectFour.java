package com.xcf.designpatern.singleton;

/**
 * 4、双检锁/双重校验锁（DCL，即 double-checked locking）
 * 
 * 是否 Lazy 初始化：是
 * 
 * 是否多线程安全：是
 * 
 * 实现难度：较复杂
 * 
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * 
 * getInstance() 的性能对应用程序很关键。
 * @desc
 * @author Caifeng Xu
 * @time   2019年3月5日
 */
public class SingletonObjectFour {

	private volatile static SingletonObjectFour singleton;

	private SingletonObjectFour() {
	}

	public static SingletonObjectFour getSingleton() {
		if (singleton == null) {
			synchronized (SingletonObjectFour.class) {
				if (singleton == null) {
					singleton = new SingletonObjectFour();
				}
			}
		}
		return singleton;
	}

}
