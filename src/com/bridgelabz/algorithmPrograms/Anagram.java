package com.bridgelabz.algorithmPrograms;
import java.util.Scanner;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
public class Anagram {

	public static void main(String[] args) {
		String str1,str2;
		Scanner scanner=new Scanner(System.in);
	System.out.println("enter the first String");
	str1=scanner.nextLine();
	System.out.println("enter the second String");
	str2=scanner.nextLine();
	AlgotithmProgUtil.anagramChar(str1,str2);
	scanner.close();
	}

	
}
