package com.xcf.designpatern.abstractfactory;

/**
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * @desc
 * @author Caifeng Xu
 * @time   2019年3月5日
 */
public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}

}
