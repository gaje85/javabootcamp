package com.toyota.exception;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ExceptionExample {

	public ExceptionExample() {
		FileReader fileReader = null;
		try {
			URL url = new URL("https://www.google.com");
			URLConnection connection = url.openConnection();
			//connection.connect();
		//	fileReader = new FileReader("c:\\med\\te.txt");
			return;
			//int k = 20/0;
		} catch (MalformedURLException e) {
			System.out.println("malformed");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("IO");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("exception");
			e.printStackTrace();
		}finally {
			System.out.println("finally called ");
		}
		
		
	}
	
	public static void main(String[] args) {
		ExceptionExample ee = new ExceptionExample();
		
	}
}
