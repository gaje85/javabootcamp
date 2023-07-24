package com.toyota.java5;

import java.util.List;

public class GenericsClass<R,S> {
	
	
	public GenericsClass() {
		
	}
	
	public void getC(R r) {
		
	}
	
	public void getTest(S s) {
		
	}
	
public static void main(String[] args) {
	GenericsClass<Long, String> gc = new GenericsClass<Long,String>();
	
	GenericsClass<List,Integer> gc1 = new GenericsClass<List,Integer>();
	
}
}
