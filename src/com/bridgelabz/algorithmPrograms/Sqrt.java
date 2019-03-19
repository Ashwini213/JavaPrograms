package com.bridgelabz.algorithmPrograms;
import java.util.Scanner;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class Sqrt {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter a number");
	double c=scanner.nextDouble();
System.out.println("sqrt of" +AlgotithmProgUtil.sqrt(c));

scanner.close();
	}

}