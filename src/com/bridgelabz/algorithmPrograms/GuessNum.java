package com.bridgelabz.algorithmPrograms;
import java.util.Scanner;
public class GuessNum {
	static int find() {
		int low=0,mid,high=127;
		Scanner scanner=new Scanner(System.in);

		while(low!=high) {
			mid=(low+high)/2;
			System.out.println("Enter 1 if number between " +low+ " and " + mid+ " Enter 2 if number between " +(mid+1)+ "and" +high);
		int c=scanner.nextInt();
		mid=(low+high)/2;
		if(c==1) 
			high=mid;
			
		else
			low=mid+1;
	}
		System.out.println(low);
		scanner.close();
		return low;
	}
	public static void main(String[] args) {
System.out.println("guess a number between 0 and 127");
find();
}
	}


