package com.qac.exercise6;

import java.util.ArrayList;

public class Collection {
	public int[] oneToHundred() {
		int[] nums = new int[101];
		for (int i = 1; i < nums.length;i++) {
			nums[i] = i;
		}
		return nums;
	}
	public ArrayList<Integer> numToList() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 100;i <= 999;i++) {
			numbers.add(i);
		}
		return numbers;
	}
	public void listIterate(ArrayList<Integer> a) {
		for (int i = 0; i < a.size();i++) {
			System.out.println(a.get(i)*10);
		}
	}
}