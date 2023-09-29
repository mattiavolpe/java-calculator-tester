package org.java.test;

public class Calculator {
	public static float add (float num1, float num2) {
		return num1 + num2;
	}
	
	public static float subtract (float num1, float num2) {
		return num1 - num2;
	}
	
	public static float multiply (float num1, float num2) throws Exception {
		if (num1 * num2 > Float.MAX_VALUE)
			throw new Exception("Result out of range");
		
		return num1 * num2;
	}
	
	public static float divide (float num1, float num2) throws Exception {
		if (num2 == 0)
			throw new Exception("Second number must be 0");

		return num1 / num2;
	}
}
