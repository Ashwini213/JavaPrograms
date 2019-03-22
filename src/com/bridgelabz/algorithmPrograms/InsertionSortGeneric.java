package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
public class InsertionSortGeneric<T> {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of elements tobe sorted are");
		int x=AlgotithmProgUtil.getInt();
		String[] b=new String[x];
		System.out.println(" Enter " +x+ " elements which are tobe sorted ");
		for( int i=0;i<b.length;i++) {
		  b[i]=AlgotithmProgUtil.getstring();
		}
		long time_start=System.nanoTime();
		AlgotithmProgUtil.insertionsort(b);
		long time_end = System.nanoTime();
		  double result=AlgotithmProgUtil.watch(time_start, time_end);
		  System.out.println("elapsed time : " +result);
		  }
	}