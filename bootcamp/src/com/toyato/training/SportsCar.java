package com.toyato.training;

import java.util.Iterator;

public class SportsCar extends Car{
	
	int speed = 20;
	public SportsCar() {
		
	}
	
	@Override
	public void brake() {
		//super.brake();
		System.out.println("additonal sportscar brake");
	}

	public static void main(String[] args) {
		SportsCar sportsCar = new SportsCar();
		sportsCar.brake();
		
		// A super type reference can refer a sub type object
		
		Car c = new SportsCar();
		
		System.out.println(c.speed);
		c.brake();
		
		int speed = ((SportsCar)c).speed;
		System.out.println(speed);
		
		System.out.println(c instanceof Taxi);
			
		
		System.out.println(sportsCar instanceof SportsCar); 
			

		System.out.println(sportsCar instanceof Car); 
		Taxi taxi = new Taxi();
		//Taxi tt = new SportsCar();
		//brake(c);
		//brake(sportsCar);
		//brake(taxi);
		
		Car cArr[] = {new Car(),new SportsCar(),new Taxi()};
	    for (int i = 0; i < cArr.length; i++) {
			brake(cArr[i]);
		}
		
	}
	
	public static void brake(Car c) {
		c.brake();
	}
	
	
}
