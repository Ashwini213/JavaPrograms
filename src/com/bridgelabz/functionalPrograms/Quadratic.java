package com.bridgelabz.functionalPrograms;

import com.bridgelabz.functionalProgUtil.FunctionalProgUtil;

public class Quadratic {

	public static void main(String[] args) {
		System.out.println("enter the value of a");
		double a = FunctionalProgUtil.getDouble();

		System.out.println("enter the value of b");
		double b = FunctionalProgUtil.getDouble();

		System.out.println("enter the value of c");
		double c = FunctionalProgUtil.getDouble();

		FunctionalProgUtil.equationQuadratic(a, b, c);

	}

}
