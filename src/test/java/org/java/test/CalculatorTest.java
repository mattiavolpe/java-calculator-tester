package org.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	@DisplayName("Test add operation")
	public void checkAdd() throws Exception {
		assertEquals(10f + 15f, Calculator.add(10f, 15f));
	}
	
	@Test
	@DisplayName("Test subtract operation")
	public void checkSubtract() {
		assertEquals(15f - 10f, Calculator.subtract(15f, 10f));
	}
	
	@Test
	@DisplayName("Test multiply operation")
	public void checkMultiply() throws Exception {
		assertEquals(10f * 15f, Calculator.multiply(10f, 15f));
	}
	
	@Test
	@DisplayName("Test multiply operation out of range")
	public void checkMultiplyIsOutOfRange() throws Exception {
		assertThrows(Exception.class,
				() -> Calculator.multiply(Float.MAX_VALUE, 2f),
				"Must throw an Exception if the result is out of range");
	}
	
	@Test
	@DisplayName("Test divide operation")
	public void checkDivide() throws Exception {
		assertEquals(15f / 10f, Calculator.divide(15f, 10f));
	}
	
	@Test
	@DisplayName("Test division by 0")
	public void checkDivisionByZero() {
		assertThrows(Exception.class,
				() -> Calculator.divide(10, 0),
				"Must throw an Exception if the second argument is 0");
	}
}
