package com.toyota.inter;
// A interface reference can refer a implementation 
// object 
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		Travel travelOne = new Bus();
		
		Travel travelTwo = new Cat();
		
		getSpeed(new Cat());
		getSpeed(new Dog());
		getSpeed(new Tiger());
		getSpeed(new Bus());
		getSpeed(new Truck());
		getSpeed(new Cycle());
		
		
		Owner ownerOne = new Bus();
		Owner ownerTwo = new Cat();
		
		
		Tiger tiger = new Tiger();
		Owner ownerThree  = tiger;
		Travel travelThree = tiger;
		
		ownerThree.getOwnerName();
		travelThree.getSpeed();
		
		
		
		
		
		
		
		
		
	}
	public static int getSpeed(Travel travel) {
		return travel.getSpeed();
	}

}
