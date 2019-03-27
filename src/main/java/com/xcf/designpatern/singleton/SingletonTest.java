package com.xcf.designpatern.singleton;


/**
 * 
 * @desc   单例模式
 * 
 * <p> 单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
 * 
 * <p>意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 
 * <p>主要解决：一个全局使用的类频繁地创建与销毁。
 * 
 * <p>何时使用：当您想控制实例数目，节省系统资源的时候。
 * 
 * <p>如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
 * 
 * <p>关键代码：构造函数是私有的。
 *
 * @author Caifeng Xu
 * @time   2019年3月5日
 */
public class SingletonTest {
	
	public static void main(String[] args) {
		
		SingleObject singleObj = SingleObject.getInstance();
		singleObj.showMessage();
	
	}

}
