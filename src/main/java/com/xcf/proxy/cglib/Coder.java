package com.xcf.proxy.cglib;

public class Coder {
	
	public Integer commonFunc(String funcName, int index) {
		System.out.println("第"+index+"个方法，名为"+funcName);
		return 1;
	}

}
