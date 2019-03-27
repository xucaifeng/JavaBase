package com.xcf.multithreads;

public class SimpleCASCounter {
	
	private SimpleCAS simpleCAS;
	
	public int getValue() {
		return simpleCAS.getValue();
	}

	public int increment() {
		int oldValue = simpleCAS.getValue();
		
		for (;;) {
			if (simpleCAS.compareAndSwap(oldValue, oldValue+1)) {
				return simpleCAS.getValue();
			}
		}
	}
	
	
}
