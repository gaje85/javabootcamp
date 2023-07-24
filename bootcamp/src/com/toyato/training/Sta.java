package com.toyato.training;

public class Sta {
	
	static int count = 0;
	final int finalVarible = 10;
	
	static {
		count++;
		System.out.println("first static block "+count);
	}
	public Sta() {
		count++;
		System.out.println("cons "+count);
	}
	public static void increment() {
		count++;
		System.out.println("increment static () "+count);
		
	}
	
	public void instanceMethod() {
		count++;
		System.out.println("instanceMethod () "+count);
	
	}
	static {
		count++;
		System.out.println("second static block "+count);
	
	}
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		Sta.count++;
		Sta sta = new Sta();
		sta.count++;
		sta.increment();
	//	sta.finalVarible++;
		Sta.increment();
		System.out.println("count = "+count);
		final Car car1 = new Car();
		car1.setSpeed(100);
		
		int a[] = new int[4];
		//int k = a[4];
		
		Car cars[] = {new Car(),new Car(),new Car()};
		
		// Row major Arrays 
		int arr[][] = new int[4][];
		
		
		
	}
	
	static {
		count++;
		System.out.println("third static block "+count);
	
	}
	
	

}
