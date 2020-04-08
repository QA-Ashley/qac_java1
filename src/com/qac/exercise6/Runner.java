package com.qac.exercise6;
import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		Collection c = new Collection();

//		int[] numbers = c.oneToHundred();
//		
//		for (int i : numbers) {
//			System.out.println(i);
//		}
		
		ArrayList<Integer> nums = c.numToList();
		
//		for (int i = 0; i < nums.size(); i++) {
//			System.out.println(nums.get(i));
//		}
		
		c.listIterate(nums);
	}
}
