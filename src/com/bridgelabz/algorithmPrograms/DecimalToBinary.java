package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println(" Enter a decimal number");
		int decimalValue = AlgotithmProgUtil.getInt();
		String binaryNum = "";
		while (decimalValue != 0) {
			binaryNum = (decimalValue % 2) + binaryNum;
			decimalValue /= 2;
		}

		System.out.println(binaryNum);
	}
}
