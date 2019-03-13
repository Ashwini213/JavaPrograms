package com.bridgelabz.algorithmProUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class AlgotithmProgUtil {

	public static Scanner scanner=new Scanner(System.in);
	public static int getInt() {
		return scanner.nextInt();
	}
	public static String getstring() {
		return scanner.nextLine();
	}
	public static double getDouble() {
		return scanner.nextDouble();
	}
	
//AnagramChar
	public static void anagramChar(String str1, String str2) {
		String s1=str1.replaceAll("\\s", " ");
		String s2=str2.replaceAll("\\\\s", " ");
		boolean status=true;
		if(s1.length()!=s2.length()) {
			status=false;
		}
		else
		{
		char[] ArrayS1=s1.toLowerCase().toCharArray();
		char[] ArrayS2=s2.toLowerCase().toCharArray();
		Arrays.sort(ArrayS1);
		Arrays.sort(ArrayS2);

		status=Arrays.equals(ArrayS1,ArrayS2);       

		}
		if(status) {
			System.out.println(s1+ " and " +s2+ " are anagrams ");
		}
		else {
			System.out.println(s1+ " and " +s2+ " are not anagrams");
		}	
	}
	
	//primeAnagrams
	public static void primeAnagrams() {
ArrayList<Integer>li=new ArrayList<Integer>();
System.out.println();
boolean b;
for(int j=2;j<1000;j++) {
	b=true;
	for(int i=2;i<j/2;i++) {
		if(j%i==0) {
			b=false;
			break;
		}	
		}
		if(b)
			li.add(j);
	}
	for(int i=0;i<li.size();i++) {
		for(int a=i+1;a<li.size();a++) {
if(anagramInt(li.get(i),li.get(a))) {
	System.out.println(li.get(i)+" "+li.get(a));
}
	}
	}
}
//
	private static boolean anagramInt(Integer n1, Integer n2) {
		int[] n1count=count(n1);
		int[] n2count=count(n2);
		for(int i=0;i<n2count.length;i++) {
			if(n1count[i]!=n2count[i]) {
				return false;
			}
		}
		return true;
		
	}
	//
	private static int[] count(int n) {
		int[] count=new int[10];
		int temp=n;
		while(temp!=0) {
			int r=temp%10;
			count[r]++;
			temp=temp/10;
		}
		
		return count;
	}
	//
	public static void primePalindrome() {
System.out.println();
boolean b;
for(int j=2;j<1000;j++) {
	b=true;
	for(int i=2;i<j/2;i++) {
		if(j%i==0) {
			b=false;
			break;
		}	
		}
		if(b && isPalindrome(j)) {
			System.out.println(j+" ");
		}
	}
	}
//
	private static boolean isPalindrome(int j) {
int temp = j;
int sum = 0;
while(temp!=0) {
	int r=temp%10;
	sum=sum*10+r;
	temp=temp/10;
}
if (sum==j) {
	return true;
}
return false;
	}
}

