/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.functionalProgUtil.FunctionalProgUtil;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

/**
 * @author all
 *
 */
public class Calender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("enter the month");
		int Month = AlgotithmProgUtil.getInt();
		System.out.println("enter the year");
		int Year = AlgotithmProgUtil.getInt();
		String[] months = { "January", "Feburvary", "March", "April", "May", "June", "July", "August", "September",
				"October", "Novevember", "December" };
		int[] days = { 31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 };
		if (Month == 1 && FunctionalProgUtil.yearLeap(Year)) {
			days[Month] = 29;
		}
		int d = AlgotithmProgUtil.dayofweek(Month, Year, 1);
		System.out.println(" " + months[Month] + " " + Year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		for (int i = 0; i < d; i++)
			System.out.println(" ");
		for (int i = 1; i <= days[Month]; i++) {
			System.out.printf("%2d", i);
			if (((i + d) % 7 == 0) || (i == days[Month])) {
				System.out.println(i);
			}
		}
	}
}