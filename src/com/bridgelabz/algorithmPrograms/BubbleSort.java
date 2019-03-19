package com.bridgelabz.algorithmPrograms;

import java.util.Scanner;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;


public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Number of elements tobe sorted are");
		  int x=scanner.nextInt();
		  int a[]=new int[x];
		  System.out.println();
		  System.out.println(" Enter " +x+ " elements which are tobe sorted ");
		  for( int i=0;i<a.length;i++) {
		    a[i]=scanner.nextInt();
		    }
AlgotithmProgUtil.bubbleSort(a);
scanner.close();
System.out.println();
System.out.println("Bubble Sorted output is");
for(int i=0;i<a.length;i++) {
System.out.println(a[i]);
}
	}
}
