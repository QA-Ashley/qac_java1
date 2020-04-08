package com.qac.exercise5;

public class RunNumbers {
	String units[] = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
//	String teens[] = { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
//			"nineteen" };
//	String tens[] = { "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
//	int teen = 0;

	public void OneToTen() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public void HundredToThousand() {
		for (int i = 100; i <= 1000; i++) {
			System.out.println(i);
		}
	}

	public void OneToTenWords() {
		for (int i = 0; i < 10; i++) {
			System.out.println(units[i]);
		}
	}

//	public void OneToHundredWords() {
//		for (int i = 0; i < 100; i++) {
//			switch(i) {
//			case < 11:
//				break;
//			case > 20 & < 30:
//				break;
//			
//			}
//			if (i < 11) {
//				System.out.println(units[i]);
//			} else if (i < 20) {
//				System.out.println(teens[teen]);
//				teen++;
//			} else if (i > 20) {
//				
//			}
//		}
//	}
}

//•	Has a method that prints out the numbers between 1 and 10
//•	Has a method that prints out the numbers between 100 and 999
//•	Has a method that prints out the numbers between 1 and 10 in words. 
//•	As above but the numbers 1 and 100.
//•	As above but the numbers 1 and 1000.
