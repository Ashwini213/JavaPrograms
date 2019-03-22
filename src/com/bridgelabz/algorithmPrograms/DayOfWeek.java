package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class DayOfWeek {

	public static void main(String[] args) {
System.out.println("enter number of months");
int month=AlgotithmProgUtil.getInt();

System.out.println("enter number of days");
int day=AlgotithmProgUtil.getInt();

System.out.println("enter number of years");
int year=AlgotithmProgUtil.getInt();

AlgotithmProgUtil.dayofwek(month,year,day);
}

}
