package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class DecimalToBinary {

	public static void main(String[] args) {
System.out.println(" Enter a decimal number");
int d=AlgotithmProgUtil.getInt();
String bin ="";
while(d!=0) {
	bin=(d % 2) + bin;
	d /=2;
}

System.out.println(bin);
}
	}
