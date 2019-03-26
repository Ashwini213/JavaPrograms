package com.bridgelabz.functionalPrograms;

import com.bridgelabz.functionalProgUtil.FunctionalProgUtil;

public class Coupan_Number {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		int n = FunctionalProgUtil.getInt();
		int count = FunctionalProgUtil.number(n);
		System.out.println(count);
	}

}
