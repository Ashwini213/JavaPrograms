package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
public class MonthlyPayment {

	public static void main(String[] args) {
double P,R,Y;
P=Double.parseDouble(args[0]);
R=Double.parseDouble(args[1]);
Y=Double.parseDouble(args[2]);
AlgotithmProgUtil.monthlyPayments(P,R,Y);

	}
}
