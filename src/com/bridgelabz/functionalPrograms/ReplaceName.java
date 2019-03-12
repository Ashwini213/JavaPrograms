package com.bridgelabz.functionalPrograms;

import com.bridgelabz.functionalProgUtil.FunctionalProgUtil;

public class ReplaceName {
	static String str; 

	public static void main(String[] args) {
		String sentance="Hello <<username>> , How are you?";
		System.out.println(" Original String: " +sentance);
	System.out.println("Enter the original name tobe replaced with username");
	String userName=FunctionalProgUtil.getstring();
	System.out.println(FunctionalProgUtil.replaceName(sentance,userName));

	
	}

}
