package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Number of elements tobe sorted are");
		int tatalElements = AlgotithmProgUtil.getInt();
		int array[] = new int[tatalElements];
		System.out.println();
		System.out.println(" Enter " + tatalElements + " elements which are tobe sorted ");
		for (int input = 0; input < array.length; input++) {
			array[input] = AlgotithmProgUtil.getInt();
		}
		AlgotithmProgUtil.bubbleSort(array);
		System.out.println();
		System.out.println("Bubble Sorted output is");
		for (int output = 0; output < array.length; output++) {
			System.out.println(array[output]);
		}
	}
}