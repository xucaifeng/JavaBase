package com.xcf.algorithm.sort;
/**
 * 
 * @desc
 * @author Caifeng Xu
 * @time   2019年3月6日
 */
public class FastSortTest {
	
	public static void main(String[] args) {
		
		int[] a = {12,20,5,16,15,1,30,45,23,9};
		int start = 0;
		int end = a.length-1;
		
		sort(a, start, end);
		
		
		
	}

	private static void sort(int[] a, int start, int end) {
		while (end > start) {
			
			while (end > start && a[end] >= a[start]) {
				end--;
			}
			if (a[end] < a[start]) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			
			while(end > start && a[start] < a[end]) {
				start++;
			}
//			if (a[start] > ) {
//				
//			}
			
		}
	}

}
