package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
import java.util.Scanner;
public class IntegerToBinary {
	
public static void main(String[] args) {
		try {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a number");
int[] binary=AlgotithmProgUtil.toBinary(scanner.nextInt());
System.out.println("Binary number is");
AlgotithmProgUtil.showArray(binary);
scanner.close();
AlgotithmProgUtil.swapNibbles(binary);
System.out.println("After Swapping");
AlgotithmProgUtil.showArray(binary);
int swapdecimal=AlgotithmProgUtil.toDecimal(binary);
System.out.println("Decimal convertion of swapped number is " +swapdecimal);
		}
		catch(Exception e) {
			System.out.println("Enter input as integer");
		}
}
}