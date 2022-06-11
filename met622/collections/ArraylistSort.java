package edu.bu.met622.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistSort {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,7,5,8,3);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 1)); // 0
		System.out.println(Collections.binarySearch(list, 19)); // something negative
		/* 
		ArrayList<String> a = new ArrayList();
		a.add("a");
		a.add("c");
		a.add("v");
		a.add(44);
		
		Iterator it = a.listIterator();
		while (it.hasNext()) {
			String x = it.next().toString();
			System.out.println("---->"+x );
		}
		*/
		
	}
}