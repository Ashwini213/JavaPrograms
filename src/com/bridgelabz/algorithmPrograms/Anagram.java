package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class Anagram {

	public static void main(String[] args) {
		String string1, string2;
		System.out.println("enter the first String");
		string1 = AlgotithmProgUtil.getstring();
		System.out.println("enter the second String");
		string2 = AlgotithmProgUtil.getstring();
		AlgotithmProgUtil.anagramChar(string1, string2);
	}
}