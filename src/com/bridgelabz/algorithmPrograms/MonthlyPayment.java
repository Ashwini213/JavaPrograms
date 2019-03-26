package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class MonthlyPayment {

	public static void main(String[] args) {
		double Principle, Rate, Year;
		Principle = Double.parseDouble(args[0]);
		Rate = Double.parseDouble(args[1]);
		Year = Double.parseDouble(args[2]);
		AlgotithmProgUtil.monthlyPayments(Principle, Rate, Year);
	}
}