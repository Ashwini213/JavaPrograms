package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class InsertionSortGeneric<T> {
	public static <T extends Comparable <T>> T[] sort(T[] a){

	int i;
	for(i=1;i<a.length;++i) {
		for(int j=i;j>0;--j) {
            if(a[j-1].compareTo(a[j])>0) 
            {
            	T temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
	}
		}
	}
	
	 for(int k=0;k<a.length;k++) {
  	   System.out.println(a[k]);
     }
	return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of elements tobe sorted are");
		int x=AlgotithmProgUtil.getInt();
		String[] a=new String[x];
		System.out.println(" Enter " +x+ " elements which are tobe sorted ");
		for( int i=0;i<a.length;i++) {
		  a[i]=AlgotithmProgUtil.getstring();
		}
		long time_start=System.nanoTime();
		sort(a);
		long time_end = System.nanoTime();
		  double result=AlgotithmProgUtil.watch(time_start, time_end);
		  System.out.println("elapsed time : " +result);
		  }
	}


