package com.bridgelabz;

public class Test {

	public static void main(String[] args) {
		int i=10;
		assert(i<10):method();
		System.out.println("methode 1 executed");
	}
	public static int method() {
		System.out.println("inside method 1");
		 return 100;
	}
}
