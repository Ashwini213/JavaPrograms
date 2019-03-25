package com.bridgelabz.functionalPrograms;

import com.bridgelabz.functionalProgUtil.FunctionalProgUtil;
public class Leap_year {
public static void main(String[] args) {
System.out.println("Enter the year tobe checked");

int Year=FunctionalProgUtil.getInt();
FunctionalProgUtil.yearLeap(Year);
}
}
