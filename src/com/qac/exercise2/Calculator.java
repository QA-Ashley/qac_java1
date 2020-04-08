package com.qac.exercise2;

public class Calculator {
	public static void main(String[] args) {
		Calc calc = new Calc();

		System.out.println(calc.add(5, 5));
		System.out.println(calc.subtract(10, 5));
		System.out.println(calc.divide(60, 6));
		System.out.println(calc.multiply(10, 9));
	}
}
