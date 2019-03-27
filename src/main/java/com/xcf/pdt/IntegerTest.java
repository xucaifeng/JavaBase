package com.xcf.pdt;

public class IntegerTest {
	
	public static void main(String[] args) {
		
		Integer a = 1;
		int b = 1;
		System.out.println(a==b);
		
		
		Integer c = 128;
		Integer d = 128;
		System.out.println(c==d);
		
		Integer a2 = 127;
		Integer b2 = 127;
		System.out.println(a2==b2);
		
		Integer a3 = new Integer(127);
		Integer b3 = new Integer(127);
		System.out.println(a3==b3);
		System.out.println(a3.equals(b3));
		
		int a4 = 2222;
		int b4 = 2222;
		System.out.println(a4==b4);
		
		int i = 1;
		for (;;) {
			System.out.println("----------"+i);
			i++;
		}
		
	}

}
