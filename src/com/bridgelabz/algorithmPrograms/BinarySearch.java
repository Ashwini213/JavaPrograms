package com.bridgelabz.algorithmPrograms;

public class BinarySearch {

	public static void main(String[] args) {
		int c,first,last,middle,N,search,array[];
		N=Integer.parseInt(args[0]);
		array=new int[N];
		System.out.println("Enter " +N+ " numbers");
		for(c=0;c<N;c++) {
			array[c]=Integer.parseInt(args[1]);
		}
		System.out.println("Enter the values tobe find");
		search=Integer.parseInt(args[2]);
		first=0;
		last=N-1;
		middle=(first+last)/2;
		
		while(first<=last) {
			if(array[middle]<(search)) {
				first=middle+1;
				}
				else if (array[middle]==search) {
					System.out.println("Element found at location" + (middle+1));
					break;
				}
				else 
					last=middle-1;
				
					middle=(first+last)/2;
			}
		if(first>last) {
			System.out.println(search+ " is not present ");
		}
	}
	} 