package com.toyato.training;

public abstract class AbsClass {
	
	public abstract void getCus();

	public void findD() {
		System.out.println("find d");
	}
	
	
}

class AbsSubClass  extends AbsClass{

	//@Override
	public void getCus() {
		System.out.println("get cus () called ");
		//AbsClass absClass = new AbsClass();
		
	}
	
	
	
	
}
