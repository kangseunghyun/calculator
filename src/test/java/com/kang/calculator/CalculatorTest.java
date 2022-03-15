package com.kang.calculator;

import static org.junit.Assert.*;

import org.junit.Test;




public class CalculatorTest {

	
	@Test
	public void testAdd() {
		assertEquals(3, Calculator.add(1, 2));
	}
	
	
	@Test
	public void testSubtract() {
		assertEquals(2, Calculator.subtract(4, 2));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(2, Calculator.multi(1, 2));
	}
	
	@Test
	public void testDivide() {
		
		
		assertEquals(1, Calculator.div(2, 2));
	}
	
	


}
