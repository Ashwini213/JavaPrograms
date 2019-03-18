package com.bridgelabz.algorithmPrograms;

import java.io.File;
import java.io.IOException;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class SearchAWordInFile {

	public static void main(String[] args) throws IOException {
File file=new File("C:\\Users\\all\\Desktop");
String array[] = AlgotithmProgUtil.fileread(file);
for(String string : array) {
	System.out.println(string);
}
System.out.println("Enter tthe word tobe searched");
String s1=AlgotithmProgUtil.getstring();
int i=AlgotithmProgUtil.binary(array,s1);
if(i<0) {
	System.out.println(" word not found ");
}
else
		System.out.println(" word found ");
}
	}