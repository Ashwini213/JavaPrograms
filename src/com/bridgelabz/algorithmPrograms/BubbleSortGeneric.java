package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class BubbleSortGeneric<T> {

	public static void main(String[] args) {

		System.out.println("Number of elements tobe sorted are");
		int totalElements = AlgotithmProgUtil.getInt();
		String[] array = new String[totalElements];
		System.out.println(" Enter " + totalElements + " elements which are tobe sorted ");
		for (int input = 0; input < array.length; input++) {
			array[input] = AlgotithmProgUtil.getstring();
		}
		long time_start = System.nanoTime();
		AlgotithmProgUtil.sort(array);
		long time_end = System.nanoTime();
		double result = AlgotithmProgUtil.timeElapse(time_start, time_end);
		System.out.println("elapsed time : " + result);
	}
}