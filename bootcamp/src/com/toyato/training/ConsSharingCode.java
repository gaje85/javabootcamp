package com.toyato.training;

public class ConsSharingCode {
	
	public ConsSharingCode() {
		
		System.out.println("0 arg cons");
	}
	
	public ConsSharingCode(int one) {
		this();
		System.out.println("1 arg cons");
	}
	public ConsSharingCode(int one,String name) {
		this(one);
		System.out.println("2 arg cons");
	}
	
	public static void main(String[] args) {
		ConsSharingCode cons = new ConsSharingCode(10,"test");
	}

}
