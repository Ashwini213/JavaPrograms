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

public static int binarySearch(int[] a,int n) {
	int high=a.length-1,low=0,mid;
	
	return 0;
	
}
	

public static long watch(long time_Start, long time_End) {
	long time=(time_Start-time_End )/1000;
	return time;
}

public static double sqrt(double c) {
	double t=c;
	double epsilon=1e-15;
	while(Math.abs(t-c/t)>epsilon*t) {
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
public static void monthlyPayments() {
	float P=scanner.nextFloat();
	int Y=scanner.nextInt();
	float R=scanner.nextFloat();
    int n=12*Y;
	double r=(R*12)/100;
	double payment;
	payment=P*r/(1-Math.pow(1+r, -n));
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
}



