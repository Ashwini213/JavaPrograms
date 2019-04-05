/**
 * 
 */
package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

/**
 * @author all
 *
 */
public class SortSearchGeneric {

	/**
	 * @param args
	 */
	// TODO Auto-generated method stub
	public static <T> void main(String[] args) {
		System.out.println("Enter your choice");
		int choice = AlgotithmProgUtil.getInt();
		System.out.print("Enter the array size:");
		int n = AlgotithmProgUtil.getInt();
		System.out.println("Enter array elements: ");
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = AlgotithmProgUtil.getstring();
		}

		switch (choice) {
		case 1:
			System.out.println("Perform binary search");
			System.out.println("Sorted array:");
			AlgotithmProgUtil.BubbleSort(arr);
			System.out.println("Enter the key:");
			String key = AlgotithmProgUtil.getstring();
			long starttime = System.nanoTime();
			AlgotithmProgUtil.BinarySearch(arr, key);
			long stoptime = System.nanoTime();
			long elapsed_time = AlgotithmProgUtil.timeElapse(starttime, stoptime);
			System.out.println("The time taken to perform binary search operation is " + elapsed_time + " ns");
			break;
		case 2:
			System.out.println("Perform bubble sort");
			System.out.println("Sorted array is:");
			long startTime = System.nanoTime();
			AlgotithmProgUtil.BubbleSort(arr);
			long stopTime = System.nanoTime();
			long elapsed_time1 = AlgotithmProgUtil.timeElapse(startTime, stopTime);
			System.out.println("The time taken to perform bubble sorts operation is " + elapsed_time1 + " ns");
			break;

		case 3:
			System.out.println("Perform insertion sort");
			System.out.println("Sorted array:");
			long time_Start = System.nanoTime();
			AlgotithmProgUtil.insertionSort(arr);
			long time_End = System.nanoTime();
			long elapsed_time11 = AlgotithmProgUtil.timeElapse(time_Start, time_End);
			System.out.println("The time taken to perform Insertion sort operation is " + elapsed_time11 + " ns");
			break;

		default:
			break;
		}

	}

}
