package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of string");
		int totalNum = AlgotithmProgUtil.getInt();

		String[] array = new String[totalNum];
		System.out.println("Enter the strings");
		for (int input = 0; input < array.length; input++) {
			array[input] = AlgotithmProgUtil.getstring();
		}
		AlgotithmProgUtil.mergeSort(array);
		for (String output : array) {
			System.out.println(output);
		}
	}
}
