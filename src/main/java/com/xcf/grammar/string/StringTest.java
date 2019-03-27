package com.xcf.grammar.string;

import java.util.HashMap;
import java.util.Map;

public class StringTest {
	
	public static void main(String[] args) {
		
		String a = "a";
		System.out.println(a);
		System.out.println(a.hashCode());
		System.out.println(a.getBytes());
		a = "b";
		System.out.println(a.hashCode());
		System.out.println(a.getBytes());
		
		Integer b = 10;
		System.out.println(b.hashCode());
		b = 11;
		System.out.println(b.hashCode());
		
		String str1 = "aaa";
		String str2 = "aaa";
		String str3 = new String("aaa");
		String str4 = new String("aaa");
		
		System.out.println("----------------------------2");
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str1.getBytes());
		System.out.println(str2.getBytes());
		
		System.out.println("----------------------------3");
		Map<String, Integer> map = new HashMap<>();
		String f = new String("abc");
		String g = "abc";
		map.put(f, 1);
		map.put(g, 1);
		System.out.println("size: "+map.size());
		
		Map<Object, Integer> map2 = new HashMap<>();
		map2.put(new Test(2), 1);
		map2.put(new Test(2), 1);
		System.out.println("map2 size: "+map2.size());
		
		System.out.println("----------------------------4");
		String ab = "ab";
		ab = ab + null;
		System.out.println(ab);
	}
	
	private static class Test {
		int i = 0;

		public Test(int i) {
			super();
			this.i = i;
		}

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
	}
	

}
