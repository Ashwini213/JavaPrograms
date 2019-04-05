package com.bridgelabz.algorithmPrograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class InsertionSortGeneric<T> {

	public static void main(String[] args) {

		System.out.println("Number of elements tobe sorted are");
		int totalElements = AlgotithmProgUtil.getInt();
		List<String> array = new ArrayList<String>();
		System.out.println(" Enter " + totalElements + " elements which are tobe sorted ");
		for (int input = 0; input < totalElements; input++) {
			array.add(AlgotithmProgUtil.getstring());
		}
		long time_start = System.nanoTime();
		AlgotithmProgUtil.insertionsort(array, totalElements);
		long time_end = System.nanoTime();
		double result = AlgotithmProgUtil.timeElapse(time_start, time_end);
		System.out.println("elapsed time : " + result);
	}
}