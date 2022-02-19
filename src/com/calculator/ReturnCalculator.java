package com.calculator;

public class ReturnCalculator {
	
	public static int multiply(int x, int y) {
		return x*y;
		
	}
	
	public static int add(int x, int y) {
		int total=x+y;
		return total;
	}
	
	public static int division(int x, int y) {
		int total=x/y;
		return total;
		
	}
	public static int subtraction(int x, int y) {
		int total=x-y;
		return total;
	}
	public static void main(String[] args) {
		System.out.println(multiply(2, 2));
		System.out.println(add(10, 10));
		System.out.println(subtraction(20, 10));
		System.out.println(division(10, 5));
	}

}
