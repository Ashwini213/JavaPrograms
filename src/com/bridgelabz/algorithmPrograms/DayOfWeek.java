package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class DayOfWeek {

	public static void main(String[] args) {
		System.out.println("enter number of months");
		int Month = AlgotithmProgUtil.getInt();

		System.out.println("enter number of days");
		int day = AlgotithmProgUtil.getInt();

		System.out.println("enter number of years");
		int Year = AlgotithmProgUtil.getInt();

		AlgotithmProgUtil.dayofweek(Month, Year, day);
	}
}