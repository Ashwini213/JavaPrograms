package com.bridgelabz.functionalPrograms;

import com.bridgelabz.functionalProgUtil.FunctionalProgUtil;

public class Gambler {

	public static void main(String[] args) {
		System.out.println("enter the value of stake");
		int stake = FunctionalProgUtil.getInt();
		System.out.println("enter the value of trails");

		int trails = FunctionalProgUtil.getInt();
		System.out.println("enter the value of goals");

		int goals = FunctionalProgUtil.getInt();
		FunctionalProgUtil.gambler(stake, goals, trails);

	}

}
