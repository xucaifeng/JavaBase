package com.xcf.proxy.dynamic;

public class CoderImpl implements ICoder {

	@Override
	public void commonFunc(String funcName, int index) {
		System.out.println("第"+index+"个方法，名为"+funcName);
	}

}
