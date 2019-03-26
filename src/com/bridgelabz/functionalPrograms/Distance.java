package com.bridgelabz.functionalPrograms;

import com.bridgelabz.functionalProgUtil.FunctionalProgUtil;

public class Distance {

	public static void main(String[] args) {
		System.out.println("enter the value of x");
		int x = FunctionalProgUtil.getInt();
		System.out.println("enter the value of y");
		int y = FunctionalProgUtil.getInt();
		FunctionalProgUtil.distance(x, y);
		}
}
