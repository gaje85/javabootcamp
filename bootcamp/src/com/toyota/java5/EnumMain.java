package com.toyota.java5;

public class EnumMain {
	
	public static void main(String[] args) {
		String mer = Planets.MERCURY.name();
		System.out.println(mer);
		int index = Planets.EARTH.ordinal();
		System.out.println(index);
	}

}
