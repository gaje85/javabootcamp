package com.toyato.training;

public class Taxi extends Car{
	
	public Taxi() {
		//super();
		System.out.println("Taxi empty cons ");
	}
	
	public Taxi(int i) {
		this();
		//super(i);
		System.out.println("1 arg cons ");
	}
	@Override
	public void brake() {
		//super.brake();
		System.out.println("additonal taxi brake");
	}
	
	public static void main(String[] args) {
		Taxi taxi = new Taxi(10);
		
	}

}
