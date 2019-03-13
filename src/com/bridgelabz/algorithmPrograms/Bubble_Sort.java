package com.bridgelabz.algorithmPrograms;
import java.util.Scanner;


public class Bubble_Sort {

	public static void main(String[] args) {
int i=0;
int j=0;
int temp=0;
Scanner scanner=new Scanner(System.in);
System.out.println("Number of elements tobe sorted are");
int x=scanner.nextInt();
int a[]=new int[x];
System.out.println();
System.out.println(" Enter the value of "+x);
for(i=0;i<a.length;i++) {
	a[i]=scanner.nextInt();
}
for(i=0;i<a.length;i++) {
	for(j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
		    a[j]=temp;
	scanner.close();
		}
	}
}
System.out.println();
System.out.println("Bubble Sorted output is");
	for(i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	}
}
