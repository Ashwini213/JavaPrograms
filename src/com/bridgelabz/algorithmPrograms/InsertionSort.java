package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("number of elements tobe sorted are ");
		int totalElements = AlgotithmProgUtil.getInt();
		int array[] = new int[totalElements];
		System.out.println();
		System.out.println("Enter " + totalElements + " elements which are tobe sorted");
		for (int input = 0; input < array.length; input++) {
			array[input] = AlgotithmProgUtil.getInt();
		}
		AlgotithmProgUtil.insertionSort(array);
		System.out.println();
		System.out.println("Insertion Sorted output is");
		for (int output : array) {
			System.out.println(output + " ");
		}
	}
}