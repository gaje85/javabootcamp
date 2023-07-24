package com.toyato.training;

import java.io.Serializable;

public class Car implements Serializable{
	
	int speed = 10;
	transient String model = "BMW";
	
	public Car() {
		System.out.println("empty cons in car");
	}
	public Car(int speed) {
		this.speed = speed;
		//System.out.println("1 args cons in car");
			
	}
	public void start() {
		
	}
	public void accelerate () {
		
	}
	
	public void accelerate(int speed) {}
	public void accelerate(int speed,int increment ) {}
	public void accelerate(String model,int speed) {}
	public void accelerate(int speed,String model) {}
	public void accelerate(int speed,double oilVolume) {}
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		//if(speed > 0)
		this.speed = speed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void brake() {
		speed = 0;
		System.out.println("Car brake");
	}
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		System.out.println(car1.model);
		System.out.println(car1.speed);
		
	}
	@Override
	public String toString() {
		return speed+"";
	}

}
