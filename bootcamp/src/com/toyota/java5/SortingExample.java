package com.toyota.java5;

import java.util.Arrays;
import java.util.Comparator;

import com.toyato.training.Car;

public class SortingExample {
	
	public static void main(String[] args) {
		Car car1 = new Car(100);
		Car car2 = new Car(20);
		Car car3 = new Car(110);
		Car car4 = new Car(30);
		Car car5 = new Car(10);
		
		Car cars[] = {car1,car2,car3,car4,car5};
		
		// before JDK 1.3 
		Comparator<Car> comparator = new Comparator<Car>() {
			
			@Override
			public int compare(Car car1, Car car2) {
				if(car1.getSpeed() > car2.getSpeed()) {
					return -1;
				}
				if(car1.getSpeed() == car2.getSpeed()) {
					return 0;
				}
				return 1;
			}
		};
		
		Comparator<Car> secondComparator = new Comparator<Car>() {
			
			@Override
			public int compare(Car car1, Car car2) {
			    return Integer.compare(car1.getSpeed(), car2.getSpeed());
			 
			}
		};
		
		Arrays.sort(cars, comparator);
		
		System.out.println(Arrays.toString(cars));
		
Arrays.sort(cars, (carOne,CarTwo) -> Integer.compare(carOne.getSpeed(),CarTwo.getSpeed()));
		
		
	}

}
