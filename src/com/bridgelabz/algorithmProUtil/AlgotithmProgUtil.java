package com.bridgelabz.algorithmProUtil;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
		String s1=str1.replaceAll("\\s", "");
		String s2=str2.replaceAll("\\s", "");

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
ArrayList<Integer>list=new ArrayList<Integer>();
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
			list.add(j);
	}
	for(int i=0;i<list.size();i++) {
		for(int a=i+1;a<list.size();a++) {
if(anagramInt(list.get(i),list.get(a))) {
	System.out.println(list.get(i)+" "+list.get(a));
}
	}
	}
}
//
public static boolean anagramInt(Integer n1, Integer n2) {
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
public static int[] count(int n) {
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
	public static boolean isPalindrome(int j) {
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
//bubbleSort
public static void bubbleSort(int[] a) {
  
    for(int i=0;i<a.length;i++) {
       for( int j=i+1;j<a.length;j++) {
          if(a[i]>a[j]) {
            int temp = a[i];
              a[i]=a[j];
              a[j]=temp;
           scanner.close();
          }
      }
    }
		}
public static void bubbleSort(String a) {
	char[] array=a.toCharArray();
	char temp;
	int i=0,j=0;
	if(array[i]>array[j]) {
        temp = array[i];
          array[i]=array[j];
          array[j]=temp;
}
}
public static String[] bubbleSort(String[] a) {
	  
    for(int i=0;i<a.length;i++) {
       for( int j=i+1;j<a.length;j++) {
          if(a[i].compareToIgnoreCase(a[j])>0) {
            String temp = a[i];
              a[i]=a[j];
              a[j]=temp;
           scanner.close();
          }
      }
    }	
return a;
}
//insertion sort
public static void insertionSort(int[] a) {
	int temp,i,w;
	for(i=0;i<a.length;i++) {
		for(int j=0;j<=i;j++) {
            if(a[j]>a[i]) 
            {
	          temp=a[j];
	           a[j]=a[i];
	          for(w=i;w>j+1;w--)
	          {
		         a[w]=a[w-1];
	          }
		a[w]=temp;
	}
		}
	}
	}
//
public static void insertionSort(String a) {
	char[] array=a.toCharArray();
	char temp;
	int i=0,j=0,w;
	for(i=0;i<a.length();i++) {
		for(j=0;j<=i;j++) {
		if(array[j]>array[i])
			 {
			temp=array[j];
			array[j]=array[i];
			 for(w=i;w>j+1;w--)
	          {
		         array[w]=array[w-1];
	          }
		array[w]=temp;
	
	}
		}
	}
	}
public static long watch(long time_Start, long time_End) {
	long time=(time_Start-time_End )/1000;
	return time;
}
public static int binary(String[] a, String s1) {
	int high=a.length-1,low=0,mid;
	bubbleSort(a);
	while(low<=high) {
		mid=(low+high)/2;
		if(s1.equalsIgnoreCase(a[mid])) {
			return mid;
		}
		else if(a[mid].compareToIgnoreCase(s1)<0){
			low=mid+1;
		}
		else {
			high=mid+1;
		}
	}
	return -1;
	
}
public static double sqrt(double c) {
	double t=c;
	double epsilon=1e-15;
	while(Math.abs(t-c/t) >epsilon*t) {
		t=((c/t+t))/2;
	}
	return t;
	}
//temp_Convertion
public static void temp_Convertion() {
	double fahrenheit,celsius;
   int a=scanner.nextInt();
	switch(a) {
	case 1: 
		System.out.println("enter the temparature in fahrenheit");
	fahrenheit=scanner.nextDouble();
	fahrenheit=(fahrenheit*9/5)+32;
	System.out.println("temperature in celsius is "+fahrenheit);
	break;
	case 2: 
		System.out.println("enter the temparature in celsius");
	celsius=scanner.nextDouble();
	celsius=(celsius-32)*5/9;
	System.out.println("temperature in fahrenheit is "+celsius);
	scanner.close();
	break;
}
}
public static void monthlyPayments(double P,double R,double Y) {
	    double n=12*Y;
	double r=(R*12)/100;
	double payment=P*r/(1-Math.pow(1+r, -n));
	System.out.println("Monthly Payment is " +payment);
}
public static void dayofwek(int month,int year,int day) {
int y0=year-(14-month)/12;
{
int x=y0+y0/4-y0/100+y0/400;
int m0=month+12*((14-month)/12)-2;
int d0=(day+x+(31*m0)/12)%7;
System.out.println("day which falls on " +month+ " month " +day+ " day " +year+ " year is " +d0);
}
}
//
public static void mergeSort(String[] names) {
	if(names.length>=2) {
		String[] left=new String[names.length/2];
		String[] right=new String[names.length-names.length/2];
		for(int i=0;i<left.length;i++) {
		    left[i]=names[i];	
		}
	    for(int i=0;i<right.length;i++) {
	    	right[i]=names[i+names.length/2];
	    }
	    mergeSort(left);
	    mergeSort(right);
	    merge(names,left,right);
	}
}
//
public static void merge(String[] names, String[] left, String[] right) {
	int a=0;
	int b=0;

	for(int i=0;i<names.length;i++) {
		
		if(b>=right.length || a<left.length && left[a].compareToIgnoreCase(right[b])<0 ) {
			names[i]=left[a];
			a++;
		}
		else {
			names[i]=right[b];	
			b++;
			}
		}
	}
//
public static <T extends Comparable<T>> T maximun(T[] a,T key) {
	int arrayLength=a.length;
	int first=0;
	int last=arrayLength-1;
	int middle=(first+last)/2;
	while(first<=last) {
		if(a[middle].compareTo(key)>0) {
			first=middle+1;
			}
			else if (a[middle]==key) {
				System.out.println("Element found at location"+middle);
				break;
			}
			else
				last=middle-1;
		middle=(first+last)/2;
		}
	if(first>last) {
		System.out.println(key+ " is not present in the last");
		return key;
}
	return key;
}
//
static int i,total;
static int[] notes= {1000,500,100,50,10,5,2,1};
public static void countOfNotes(int amount) {
	
	if(amount/notes[i]!=0) {
		total+=(amount/notes[i]);
		System.out.println(notes[i]+ " rs notes "+amount/notes[i]);
		amount=amount%notes[i];
	}
	i++;
	if(amount==0) {
		System.out.println("number of notes are " +total);
		return;
	}
	countOfNotes(amount);
}
public static int[] toBinary(int d) {
	String bin ="";
	while(d!=0) {
		bin=(d % 2) + bin;
		d /=2;
	}
	while(bin.length() % 4 != 0) {
		bin=0+bin;
	}
	return stringToIntArray(bin) ;
}

public static int toDecimal(int[] binary) {
int dec=0,j=0;
for(int i=binary.length-1;i>=0;i--)
{
	if (binary[i]==1)
	{
		dec=dec+(int) Math.pow(2, j);
	}
j++;
}
	return dec;
}
public static int[] stringToIntArray(String bin) {
	 int[] binary =new int[bin.length()];
	 for(int i=0;i<binary.length;i++) {
		 binary[i]=bin.charAt(i)-48;
	 }
		return binary;
	}
	
	public static int[] swapNibbles(int[] array)
	{
		int temp,j=array.length-4;
		for(int i=0;i<4;i++)
		{
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			j++;
		}
		return array;
		}
	public static boolean powerOf2(int n) 
	{
	int i=0,temp=(int) Math.pow(2, i);
	while(temp<n) 
	{
		if(temp==n) 
		{
			return true;
		}
		i++;
	}
		return false;
	}
	public static void showArray(int[] array) 
	{
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]);
	}
	System.out.println();
	}

//
public static String[] fileread(File f) throws IOException {
	String word = "";
	ArrayList<String> s1 = new ArrayList<String>();
	FileReader fr = new FileReader(f);
	int c;
	while ((c=fr.read()) != -1)
	{
		if (c == 32) {
			s1.add(word);
			word = "";
		}
		else {
			word = word + String.valueOf((char )c);
		}
	}
	fr.close();
	String[] s = new String[s1.size()];
	s1.toArray(s);
	return s;
	}
}