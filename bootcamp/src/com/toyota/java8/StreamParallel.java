package com.toyota.java8;

import java.util.Arrays;
import java.util.List;

public class StreamParallel {
	
	
	public StreamParallel() {
		
		String[] str = {"one","two","three","four","five"};
		List<String> list = Arrays.asList(str);
		
		long count = list.stream().parallel().filter((s) -> true)
					.map(this::callSlowMethod)
					.count();
	}
	
	
	public int callSlowMethod(String s) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread()+"in "+s.length());
		return s.length();
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		StreamParallel sp = new StreamParallel();
		long end = System.currentTimeMillis();
		System.out.println((end - start));
		
	}

}
