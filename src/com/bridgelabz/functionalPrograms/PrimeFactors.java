package com.bridgelabz.functionalPrograms;

import com.bridgelabz.functionalProgUtil.FunctionalProgUtil;

public class PrimeFactors {

	public static void main(String[] args) {

		System.out.println("enter the value of n");
		int n = FunctionalProgUtil.getInt();
		FunctionalProgUtil.primeFactors(n);
	}
}
