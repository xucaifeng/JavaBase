package com.xcf.proxy.dynamic;

public class CoderTest {
	
	
	public static void main(String[] args) {
		CoderProxyFactory coderProxyFactory = new CoderProxyFactory();
		ICoder coderImpl = (ICoder) coderProxyFactory.newProxyInstance(new CoderImpl());  
		
		coderImpl.commonFunc("sayHello", 2);
	}
	
}
