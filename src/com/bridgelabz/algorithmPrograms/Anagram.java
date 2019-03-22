package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
public class Anagram {

	public static void main(String[] args) {
		String str1,str2;
	System.out.println("enter the first String");
	str1=AlgotithmProgUtil.getstring();
	System.out.println("enter the second String");
	str2=AlgotithmProgUtil.getstring();
	AlgotithmProgUtil.anagramChar(str1,str2);
	}
}
