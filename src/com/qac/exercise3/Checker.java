package com.qac.exercise3;

public class Checker {
	public boolean check(String a) {
		boolean matches;

		if (a.equals("Hello")) {
			matches = true;
		} else {
			matches = false;
		}
		return matches;
	}

	public boolean checkTwo(String a, String b) {
		boolean matches;
		
		if (a.equals(b)) {
			matches = true;
		} else {
			matches = false;
		}
		return matches;
	}
}
