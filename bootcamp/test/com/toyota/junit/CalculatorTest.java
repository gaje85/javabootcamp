package com.toyota.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	Calculator calculator = null;
	// Test Fixtures 
	@BeforeEach
	public void setup() {
		calculator = new Calculator();
		System.out.println("Before each");
	}
	
	@AfterEach
	public void tearDown() {
		calculator = null;
		System.out.println("after each ");
	}
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before All");
	}

	@AfterAll
	public static void afterClass() {
		System.out.println("After All");
	}
	@Test
	public void testAdd() {
		System.out.println("test add called ");
		int result = calculator.add(100, 10);
		
		assertEquals(110, result);
		
        result = calculator.add(8, 2);
		
		assertEquals(6, result);
	}
	
	@Test
	public void testSub() {
		System.out.println("test sub called ");
		
		int result = calculator.sub(100, 10);
		
		assertEquals(90, result);
	}
	
}
