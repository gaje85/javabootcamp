package com.toyota.util;

import java.util.StringTokenizer;

public class Tokenizer {

	
	public static void main(String[] args) {
		String s = "this is, a example , one";
		StringTokenizer st = new StringTokenizer(s,",");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		String tokenizedStr[] = s.split(",");
	}
}
