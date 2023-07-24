package com.toyota.inter;
// if a class implements an interface then 
//that class should implement all the abstract methods
//in the interface failing to do then the class will
//be abstract class 
public abstract class Vehicle implements Travel,Owner{
	
	

}
class Bus extends Vehicle{
	@Override
	public int getSpeed() {
		return 80;
	}

	@Override
	public String getOwnerName() {
		return "BusOne";
	}
}
class Truck extends Vehicle{
	@Override
	public int getSpeed() {
		return 60;
	}
	@Override
	public String getOwnerName() {
		return "TruckOne";
	}
}
class Cycle extends Vehicle{
	@Override
	public int getSpeed() {
		return 30;
	}
	@Override
	public String getOwnerName() {
		return "cycleOne";
	}
}