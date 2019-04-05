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
		long time_start = System.nanoTime();

		AlgotithmProgUtil.mergeSort(array);

		for (String output : array) {
			System.out.println(output);
			long time_end = System.nanoTime();
			double result = AlgotithmProgUtil.timeElapse(time_start, time_end);
			System.out.println("elapsed time : " + result);
		}
	}
}
