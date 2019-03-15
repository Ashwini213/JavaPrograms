package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class Search_Sort_Stopwatch {
static int[] a;
	public static void main(String[] args) {
long Time_Start=System.currentTimeMillis();
System.out.println("Input is");
String str=AlgotithmProgUtil.getstring();
AlgotithmProgUtil.insertionSort(str);
AlgotithmProgUtil.bubbleSort(str);
long Time_End=System.currentTimeMillis();
long time_elapsed=AlgotithmProgUtil.watch(Time_Start,Time_End);
System.out.println("Execution time is "+time_elapsed);
	}

}
