package com.qac.scanner;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		System.out.println("What is your age?");
		int age = scan.nextInt();
		
		System.out.println("Hi " + name + " and you are "
				 + age + " years old.");
		scan.close();
		
		
	}
}
