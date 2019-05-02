package com.bridgelabz.algorithmPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class BinarySearchWord {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\all\\Desktop\\ash\\file.txt");
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] string = new String[50];
		String delimitor = " ";
		String st;
		while ((st = bufferreader.readLine()) != null) {
			string = st.split(delimitor);
		}
		System.out.print("Array elements are: ");
		for (String array : string) {
			if (array != null)
				System.out.print(array + "  ");
		}
		System.out.println("  ");
		System.out.print("Sorted array:");
		AlgotithmProgUtil.BubbleSort(string);
		System.out.println("Enter the key element:");
		String key = AlgotithmProgUtil.getstring();
		AlgotithmProgUtil.BinarySearch(string, key);

	}

}
