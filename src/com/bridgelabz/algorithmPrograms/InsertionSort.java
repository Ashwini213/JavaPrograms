package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
public class InsertionSort {

	public static void main(String[] args) {
System.out.println("number of elements tobe sorted are ");
int x=AlgotithmProgUtil.getInt();
int a[]=new int[x];
System.out.println();
System.out.println("Enter "+x+" elements which are tobe sorted");
for(int i=0;i<a.length;i++) {
a[i]=AlgotithmProgUtil.getInt();
}
AlgotithmProgUtil.insertionSort(a);
System.out.println();
System.out.println("Insertion Sorted output is");
for(int k1:a) {
System.out.println(k1+" ");
}
}
}