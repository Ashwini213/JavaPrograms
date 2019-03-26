package com.bridgelabz.algorithmPrograms;

import java.io.File;
import java.nio.file.Paths;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class SearchAWordInFile {

	public static void main(String[] args) {
		String path = Paths.get("C:\\Users\\all\\Desktop\\ash\\file.txt").toString();
		File f = new File(path);
		try {
			String array[] = AlgotithmProgUtil.fileread(f);
			for (String string : array) {
				System.out.println(string);
			}
			System.out.println("Enter the word tobe searched");
			String string1 = AlgotithmProgUtil.getstring();
			int input = AlgotithmProgUtil.binary(array, string1);
			if (input < 0)
				System.out.println(" word not found ");
			else
				System.out.println(" word found ");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
	}
}