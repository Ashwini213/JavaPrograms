package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
import java.util.Scanner;
public class IntegerToBinary {
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
	
public static void main(String[] args) {
		try {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a number");
int[] binary=AlgotithmProgUtil.toBinary(scanner.nextInt());
System.out.println("Binary number is");
showArray(binary);
scanner.close();
swapNibbles(binary);
System.out.println("After Swapping");
showArray(binary);
int swapdecimal=AlgotithmProgUtil.toDecimal(binary);
System.out.println("Decimal convertion of swapped number is" +swapdecimal);
		}
		catch(Exception e) {
			System.out.println("Enter input as integer");
		}
}
}