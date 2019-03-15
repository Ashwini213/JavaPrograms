package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class MergeSort {

	public static void main(String[] args) {
String[] str1= {};
String[] str2= {};
String[] names= new String[str1.length];
mergeSort(names);
merge(names,str1,str2);
	}

	

	private static void mergeSort(String[] names) {
		if(names.length>2) {
			String[] left=new String[names.length/2];
			String[] right=new String[names.length-names.length/2];
			for(int i=0;i<left.length;i++) {
			    left[i]=names[i];	
			}
		    for(int i=0;i<right.length;i++) {
		    	right[i]=names[i+names.length/2];
		    }
		    mergeSort(left);
		    mergeSort(right);
		    merge(names,left,right);
		}
	}
	private static void merge(String[] names, String[] left, String[] right) {
		int a=0;
		int b=0;
		for(int i=0;i<names.length;i++) {
			if(b>=right.length || a<left.length) {
				names[i]=left[a];
				a++;
			}
				else {
				names[i]=right[b];	
				b++;
				}
			}
		}
	}


