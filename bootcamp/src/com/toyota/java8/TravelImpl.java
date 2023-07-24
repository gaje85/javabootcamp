package com.toyota.java8;

public class TravelImpl  {

	public TravelImpl() {
	   Travel travel = new Travel() {
		
		@Override
		public int getSpeed() {
			return 100;
		}
	};
	
	// Lambda Expression 
	  Travel travelLambda = () -> 100;
	  Travel travelLambdaOne = () -> {
		return 100;  
	  };
	  
	   int i = 100;
	  
	  Owner owner = (location,number) -> {
		  int k = i + 10;
		return location + number;  
	  };
	  owner.getOwnerName("chennai", 100);
	  
	  System.out.println(owner.getClass().getName());
	
	}
	
	
	
	public static void main(String[] args) {
		TravelImpl Travel = new TravelImpl();
		
	}
}
