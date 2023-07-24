package com.toyota.java8;
// java 8 interface 
@FunctionalInterface
public interface Travel {
	
	public int getSpeed();
	
	public default int getNum() {
		return 100;
	}
	
	public static int getMerchant() {
		return 200;
	}

}
