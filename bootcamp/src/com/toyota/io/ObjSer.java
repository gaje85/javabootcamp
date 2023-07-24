package com.toyota.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.toyato.training.Car;

public class ObjSer {
	
	public static void main(String[] args) {
		ObjSer os = new ObjSer();
		os.serialize();
		os.deserialize();
	}

	private void deserialize() {
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:/med/car.ser");
			ois = new ObjectInputStream(fis);
			Car car = (Car)ois.readObject();
			System.out.println(car.getModel() + " , "+car.getSpeed());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)
					fis.close();
				if(ois != null)
					ois.close();
			} catch (Exception e2) {
				e2.printStackTrace();			}
		}
	}

	private void serialize() {
		Car car = new Car();
		car.setModel("Toyota");
		car.setSpeed(100);
		
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("c:/med/car.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(car);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null)
					fos.close();
				if(oos != null)
					oos.close();
			} catch (Exception e2) {
				e2.printStackTrace();			}
		}
		
		
	}

}
