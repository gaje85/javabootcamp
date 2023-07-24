package com.toyota.exception;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

	public ReflectionExample() {
		try {
			
			Class cls = Class.forName("com.toyato.training.Car");
			Constructor cons[] = cls.getDeclaredConstructors();
			Field fields[] = cls.getDeclaredFields();
			Method met[] = cls.getDeclaredMethods();
			
			for (int i = 0; i < cons.length; i++) {
				System.out.println(cons[i]);
			}
			
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i]);
			}
			Object obj = cls.newInstance();
			
			for (int i = 0; i < met.length; i++) {
				
				System.out.println(met[i]);
				if(met[i].getName().indexOf("brake") != -1) {
					met[i].invoke(obj);
				}
			}
		
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		ReflectionExample re = new ReflectionExample();
		
	}
}
