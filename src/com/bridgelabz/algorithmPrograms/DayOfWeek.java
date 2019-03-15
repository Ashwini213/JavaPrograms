package com.bridgelabz.algorithmPrograms;
import java.util.Scanner;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
public class DayOfWeek {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter number of months");
int month=scanner.nextInt();

System.out.println("enter number of days");
int day=scanner.nextInt();

System.out.println("enter number of years");
int year=scanner.nextInt();

AlgotithmProgUtil.dayofwek(month,year,day);

scanner.close();
	}

}
