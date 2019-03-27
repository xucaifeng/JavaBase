package com.xcf.designpatern.factorymethod;

public class FactoryPatternTest {
	
	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape("CIRCLE");
		shape.draw();
		
		shape = shapeFactory.getShape("RECTANGLE");
		shape.draw();
	}

}
