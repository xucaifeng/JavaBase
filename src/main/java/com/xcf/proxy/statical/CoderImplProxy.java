package com.xcf.proxy.statical;

public class CoderImplProxy implements ICoder {
	// 目标对象接口
	private ICoder iCoder;
	public CoderImplProxy(ICoder iCoder) {
		super();
		this.iCoder = iCoder;
	}

	@Override
	public void commonFunc() {
		iCoder.commonFunc();
		
		System.out.println("-----specificFunc-----");
	}

	
}
