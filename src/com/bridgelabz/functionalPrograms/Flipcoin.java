package com.bridgelabz.functionalPrograms;


import com.bridgelabz.functionalProgUtil.FunctionalProgUtil;

public class Flipcoin {

	public static void main(String[] args) {
		System.out.println("enter the nuumber of flips");
		int flips=FunctionalProgUtil.getInt();

		 FunctionalProgUtil.toss(flips);
		 
	}
}

	

