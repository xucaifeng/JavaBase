package com.xcf.grammar.keywords;

public class FinalTest {
	
	

	public static void main(String[] args) {
		
		final int[] array = {1, 2, 3, 4, 5, 6};
		System.out.println(array);
		array[3] = 13;
		
		System.out.println(array);
		
	}
}
