package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of string");
		int s = AlgotithmProgUtil.getInt();

		String[] a = new String[s];
		System.out.println("Enter the strings");
		for (int i = 0; i < a.length; i++) {
			a[i] = AlgotithmProgUtil.getstring();
		}
		AlgotithmProgUtil.mergeSort(a);
		for (String n : a) {
			System.out.println(n);
		}
		}
}
