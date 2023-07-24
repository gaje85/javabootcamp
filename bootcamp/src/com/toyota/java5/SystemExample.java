package com.toyota.java5;

public class SystemExample {

	public static void measure() {
		long start = System.nanoTime();
		int total = 0;
		for(int i=0;i<1000000;i++) {
			total += i;
		}
		long end = System.nanoTime();
		System.out.println((end - start)+ " msecs total = "+total );
		
		int one[] = {1,2,3,5,3};
		int two[] = new int[one.length];
		
		System.arraycopy(one, 0, two, 0, one.length);
		
		for(int i=0;i<two.length;i++) {
			System.out.println(two[i]);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		measure();
	}
}
