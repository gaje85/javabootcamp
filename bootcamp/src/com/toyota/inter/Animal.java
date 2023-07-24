package com.toyota.inter;

public abstract class Animal implements Travel,Owner{
	
	

}
class Dog extends Vehicle{
	@Override
	public int getSpeed() {
		return 80;
	}
	@Override
	public String getOwnerName() {
		return "DogOne";
	}
}
class Cat extends Vehicle{
	@Override
	public int getSpeed() {
		return 60;
	}
	@Override
	public String getOwnerName() {
		return "CatOne";
	}
}
class Tiger extends Vehicle{
	@Override
	public int getSpeed() {
		return 30;
	}
	@Override
	public String getOwnerName() {
		return "TigerOne";
	}
}