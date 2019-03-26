/**
 * 
 */
package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

/**
 * @author all
 *
 */
public class SortSearchGeneric<T> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choice");
		int choice = AlgotithmProgUtil.getInt();
		System.out.println("How many numbers tobe entered");
		int totalElements = AlgotithmProgUtil.getInt();
		String[] array = new String[totalElements];
		System.out.println("Enter " + totalElements + " numbers");
		for (int input = 0; input < totalElements; input++) {
			array[input] = AlgotithmProgUtil.getstring();
		}
		switch (choice) {
		case 1:
			System.out.println("Perform binary search");
			System.out.println("Sorted array:");
			AlgotithmProgUtil.sort(array);
			System.out.println("Enter the value to be find");
			String key = AlgotithmProgUtil.getstring();
			AlgotithmProgUtil.search(array, key);
			break;
		case 2:
			System.out.println("Perform bubble sort");
			System.out.println("Sorted array is:");
			long time_start = System.nanoTime();
			AlgotithmProgUtil.sort(array);
			long time_end = System.nanoTime();
			double result = AlgotithmProgUtil.timeElapse(time_start, time_end);
			System.out.println("elapsed time : " + result);
			break;
		case 3:
			System.out.println("Perform insertion sort");
			System.out.println("Sorted array:");
			time_start = System.nanoTime();
			AlgotithmProgUtil.insertionsort(array);
			time_end = System.nanoTime();
			result = AlgotithmProgUtil.timeElapse(time_start, time_end);
			System.out.println("elapsed time : " + result);
			break;

		default:
			break;
		}
	}
}
