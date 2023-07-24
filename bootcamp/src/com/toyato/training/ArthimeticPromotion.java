package com.toyato.training;

public class ArthimeticPromotion {
	
	
	public static void main(String[] args) {
		
		byte b1 = 110;
		byte b2 = 20;
		
		byte b3 = (byte)(b1 + b2);
		// if operands are less than or equal to int then 
		//the result will be represented in int 
		// if any one of the operand is going to long then 
		// result is long 
		// if any one of the operand is float or double then 
		// the result will be double 
		System.out.println(b3);
		
		int a = 20;
		System.out.println(~a);
		
		
		System.out.println( 5 * 3 + 4 - 2 + "Good" + 4 * 2  + 10 +"bad" + 3 + 2 * 3);
		
		
	
		String choice = "chair";
		
		switch (choice) {
			case "table": {
				System.out.println("table ");
				break;
			}
			case "chair": {
				System.out.println("chair ");
				break;
			}
			case "bucket": {
				System.out.println("bucket ");
			}
			default:
		       System.out.println("Default is called ");		
		}
		
		
		
		int i = 1;
		while(i++ < 20) {
			if( i % 4 == 0 ) {
				continue;
			}
			System.out.println(i);
		}
		
	outer:	for( i=0 ; i< 10 ; i++) {
		           if( i == 6 ) {
		        	   continue outer;
		           }
		inner:	for(int j = 0; j < 5 ; j++) {
			         if(j == 3) {
			        	 break outer;
			         }
					System.out.println("i = "+i+" J = "+j);
				}
			}
		
		
		
		
		
		
		
		
		
	}

}
