package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class SearchSortStopwatch {
static int[] s1;
	public static void main(String[] args) {
long Time_Start=System.currentTimeMillis();
System.out.println("Input is");
String str=AlgotithmProgUtil.getstring();
AlgotithmProgUtil.insertionSort(str);
AlgotithmProgUtil.bubbleSort(str);
//AlgotithmProgUtil.binary(s1, str);

long Time_End=System.currentTimeMillis();
long time_elapsed=AlgotithmProgUtil.watch(Time_Start,Time_End);
System.out.println("Execution time is "+time_elapsed);
	}

}
