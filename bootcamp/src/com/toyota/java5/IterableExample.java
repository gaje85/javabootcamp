package com.toyota.java5;

import java.util.Arrays;
import java.util.Iterator;

public class IterableExample implements Iterable<String>{
     String s[] = {"one","two","three"};
     int index = 0;
	@Override
	public Iterator<String> iterator() {
		return Arrays.asList(s).iterator();
		
	}
	
	public static void main(String[] args) {
		
		IterableExample ie = new IterableExample();
		for (String string : ie) {
			System.out.println(string);
		}
		
	}
	

}
