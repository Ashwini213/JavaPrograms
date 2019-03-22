package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
public class BinarySearch <T> {

	public static void main(String[] args) {
		
		System.out.println("How many numbers tobe entered");
		int N=Integer.parseInt(args[0]);
		String[] a=new String[N];
		System.out.println("Enter " +N+ " numbers");
		for(int c=0;c<N;c++) {
			a[c]=AlgotithmProgUtil.getstring();
		}
		AlgotithmProgUtil.sort(a);
		System.out.println("Enter the value to be find");
		String key=AlgotithmProgUtil.getstring();
		AlgotithmProgUtil.maximun(a, key);
	}
	} 