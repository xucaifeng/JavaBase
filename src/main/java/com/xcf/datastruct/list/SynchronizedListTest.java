package com.xcf.datastruct.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 线程安全的list
 * @desc
 * @author Caifeng Xu
 * @time   2019年3月12日
 */
public class SynchronizedListTest {
	
	public static void main(String[] args) {
		
		List<Object> syncArrayList = Collections.synchronizedList(new ArrayList<>());
		syncArrayList.add(1);
		
		
		
	}

}
