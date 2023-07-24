package com.toyota.java5;

public class StringExample {
	
	public static void main(String[] args) {
		String one = "Good";
		String two = new String("Good");
		String three = "Good";
		
		
		System.out.println(one == three);
		System.out.println(one.equals(three));
		// Strings are immutable 
		one = one + "bad";
		
		// StringBuffer are mutuable 
		
		StringBuffer sb = new StringBuffer("one");
		sb.append("two");
		
		StringBuilder builder = new StringBuilder("one");
		builder.append("two");
		
		
		
	}

}
