package com.qac.exercise4;

public class Calc {
	public int calculate(int a, int b, String operator) {
		int answer = 0;

		switch (operator) {
		case "+":
			answer = a + b;
			break;
		case "-":
			answer = a - b;
			break;
		case "/":
			answer = a / b;
			break;
		case "*":
			answer = a * b;
			break;
		default:
			System.out.println("Incorrect operator.");
		}

		return answer;
	}
}
