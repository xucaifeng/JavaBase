package com.xcf.multithreads.lock;

public class SynchronizedTest {
	
	private String str = "abc";
	
	public String updateStr(String newStr) {
		synchronized (str) {
			str = newStr;
		}
		return str;
	}

	public static void main(String[] args) {
		SynchronizedTest synchronizedTest = new SynchronizedTest();
		String retStr = synchronizedTest.updateStr("dddd");
		System.out.println(retStr);
	}
}
