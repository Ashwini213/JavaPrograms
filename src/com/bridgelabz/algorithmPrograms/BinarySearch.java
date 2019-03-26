package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class BinarySearch<T> {

	public static void main(String[] args) {

		System.out.println("How many numbers tobe entered");
		int totalElements = Integer.parseInt(args[0]);
		String[] array = new String[totalElements];
		System.out.println("Enter " + totalElements + " numbers");
		for (int input = 0; input < totalElements; input++) {
			array[input] = AlgotithmProgUtil.getstring();
		}
		AlgotithmProgUtil.sort(array);
		System.out.println("Enter the value to be find");
		String key = AlgotithmProgUtil.getstring();
		AlgotithmProgUtil.search(array, key);
	}
}