package com.toyato.training;

public class PassBy {
	
	
	public void metOne() {
		int num = 150;
		metTwo(num);
		System.out.println(num);
		Car car = new Car();
		car.setSpeed(50);
		metThree(car);
		System.out.println(car.getSpeed());
	}
	
	public void metTwo(int num) {
		num += 2;
	}
	public void metThree(Car car) {
		car.setSpeed(100);
	}
	public static void main(String[] args) {
		PassBy passBy = new PassBy();
		passBy.metOne();
	}

}
