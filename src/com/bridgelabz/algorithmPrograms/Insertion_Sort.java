package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
import java.util.Scanner;
public class Insertion_Sort {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
System.out.println("number of elements tobe sorted are ");
int x=scanner.nextInt();
int a[]=new int[x];
System.out.println();
System.out.println("Enter "+x+" elements which are tobe sorted");
for(int i=0;i<a.length;i++) {
a[i]=scanner.nextInt();
}
AlgotithmProgUtil.insertionSort(a);
System.out.println();
scanner.close();
System.out.println("Insertion Sorted output is");
for(int k1:a) {
	System.out.println(k1+" ");

}
}

	}
	


