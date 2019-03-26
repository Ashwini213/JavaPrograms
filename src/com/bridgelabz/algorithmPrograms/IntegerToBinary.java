package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class IntegerToBinary {

	public static void main(String[] args) {
		try {
			System.out.println("Enter a number");
			int[] binary = AlgotithmProgUtil.toBinary(AlgotithmProgUtil.getInt());
			System.out.println("Binary number is");
			AlgotithmProgUtil.showArray(binary);
			AlgotithmProgUtil.swapNibbles(binary);
			System.out.println("After Swapping");
			AlgotithmProgUtil.showArray(binary);
			int swapdecimal = AlgotithmProgUtil.toDecimal(binary);
			System.out.println(AlgotithmProgUtil.toDecimal(binary));
			AlgotithmProgUtil.powerOf2(swapdecimal);
			System.out.println();
			System.out.println("Decimal convertion of swapped number is " + swapdecimal);
		} catch (Exception e) {
			System.out.println("Enter input as integer");
		}
	}
}