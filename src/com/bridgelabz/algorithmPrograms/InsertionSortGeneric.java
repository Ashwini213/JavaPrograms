package com.bridgelabz.algorithmPrograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class InsertionSortGeneric<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of elements tobe sorted are");
		int totalElements = AlgotithmProgUtil.getInt();
		//String[] array = new String[totalElements];
		List<String> array=new ArrayList<String>();
		System.out.println(" Enter " + totalElements + " elements which are tobe sorted ");
		for (int input = 0; input < array.size(); input++) {
			array.add( AlgotithmProgUtil.getstring());
		}
		long time_start = System.nanoTime();
		AlgotithmProgUtil.insertionsort(array);
		long time_end = System.nanoTime();
		double result = AlgotithmProgUtil.timeElapse(time_start, time_end);
		System.out.println("elapsed time : " + result);
	}
}