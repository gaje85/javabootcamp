package com.toyota.junit;

public class Calculator {
	
	public int add(int i,int j) {
		if(i > 10)
			return i+j;
		if(i < 9 ) {
			return i - j;
		}
		return 0;
	}
	
	public int sub(int i, int j) {
		return i - j;
	}

}
