package com.toyota.exception;

public class UseCustomException {
	
	public UseCustomException() {
		
	}
	
	public void callException(int num) throws CustomException{
		if(num > 10)
			throw new CustomException("num greater than 10");
		
		if(num < 10)
			throw new CustomException("num less than 10");
		
	}
	
	public static void main(String[] args) {
		UseCustomException use = new UseCustomException();
		try {
			use.callException(10);
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}

}
