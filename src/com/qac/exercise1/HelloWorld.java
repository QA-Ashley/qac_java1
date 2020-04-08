package com.qac.exercise1;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld");
		HelloWorld hello = new HelloWorld();
		System.out.println(hello.hi());
		hello.outputString("Hello all!");
	}

	public String hi() {
		return "HelloWorld";
	}

	public void outputString(String a) {
		System.out.println(a);
	}
}
