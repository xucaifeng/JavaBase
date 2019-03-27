package com.xcf.proxy.cglib;

import com.xcf.maven.ClassLocationUtils;

public class CglibTest {
	
	public static void main(String[] args) {
		
		Coder target = new Coder();
		
		Coder proxy = (Coder) new ProxyFactory(target).getProxyInstance();
		Integer res = proxy.commonFunc("sayHello", 2);
		
		System.out.println(res);
	}

}
