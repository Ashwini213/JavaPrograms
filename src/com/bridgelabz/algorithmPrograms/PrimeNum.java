package com.bridgelabz.algorithmPrograms;

public class PrimeNum {

	public static void main(String[] args) {
		String primeNumbers = " ";
		for (int input = 1; input < 1000; input++) {
			int counter = 0;
			for (int number = input; number >= 1; number--) {
				if (input % number == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + input + " ";
			}
		}
		System.out.println("prime numbers are:" + primeNumbers);

	}
}