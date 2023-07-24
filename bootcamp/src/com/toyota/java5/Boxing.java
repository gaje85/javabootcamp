package com.toyota.java5;

public class Boxing {

	
	public static void main(String[] args) {
	  Integer count = 10;
	  count++;
	  int res = count + 200;
	  varargsMet(10);
	  
	  varargsMet(10,20,120);
	  
	  varargsMet(10,1,1,1,1,1,1,1,1);
	  
	}
	
	public static void varargsMet(int... i) {
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
	}
}
