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
		int choice=AlgotithmProgUtil.getInt();
		System.out.println("How many numbers tobe entered");
		int N=AlgotithmProgUtil.getInt();
		String[] a=new String[N];
		System.out.println("Enter " +N+ " numbers");
		for(int c=0;c<N;c++) {
			a[c]=AlgotithmProgUtil.getstring();
		}
		switch(choice)
		{
		case 1:
			System.out.println("Perform binary search");
			System.out.println("Sorted array:");
			AlgotithmProgUtil.sort(a);
			System.out.println("Enter the value to be find");
			String key=AlgotithmProgUtil.getstring();
			AlgotithmProgUtil.search(a, key);
			break;
		case 2:
			System.out.println("Perform bubble sort");
			System.out.println("Sorted array is:");
			long time_start=System.nanoTime();
			AlgotithmProgUtil.sort(a);
			long time_end = System.nanoTime();
			double result=AlgotithmProgUtil.watch(time_start, time_end);
			System.out.println("elapsed time : " +result);
			break;
		case 3:
			System.out.println("Perform insertion sort");
			System.out.println("Sorted array:");
			time_start=System.nanoTime();
			AlgotithmProgUtil.insertionsort(a);
			time_end = System.nanoTime();
			result=AlgotithmProgUtil.watch(time_start, time_end);
			  System.out.println("elapsed time : " +result);
			break;

		default:
			break;
		}
		}
}
