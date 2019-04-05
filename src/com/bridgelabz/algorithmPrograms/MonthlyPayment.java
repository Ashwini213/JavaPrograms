package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class MonthlyPayment {

	public static void main(String[] args) {
		double Principle = Double.parseDouble(args[0]);
		double Rate = Double.parseDouble(args[1]);
		double Year = Double.parseDouble(args[2]);
		AlgotithmProgUtil.monthlyPayments(Principle, Rate, Year);
	}
}