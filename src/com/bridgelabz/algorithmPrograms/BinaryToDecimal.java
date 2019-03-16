package com.bridgelabz.algorithmPrograms;
import java.util.Scanner;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class BinaryToDecimal {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a binary number ");
int number=AlgotithmProgUtil.getInt();
int decimalNum=0,count=0;;
while(number!=0) {
	int temp=number%10;
	decimalNum+=temp*Math.pow(2, count);
	number=number/10;
	count++;
}
System.out.println(decimalNum);
scanner.close();
	}

}
