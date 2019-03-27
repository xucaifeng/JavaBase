package com.xcf.proxy.statical;

public class CoderTest {
	
	
	public static void main(String[] args) {
		ICoder coderImpl = new CoderImpl();
		ICoder codeImplProxy = new CoderImplProxy(coderImpl);
		
		codeImplProxy.commonFunc();
	}

}
