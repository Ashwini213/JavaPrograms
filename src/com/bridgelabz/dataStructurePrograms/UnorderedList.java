package com.bridgelabz.dataStructurePrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
import com.bridgelabz.dataStructurePrograms.dataStructureUtil.CustomLinkedList;

public class UnorderedList {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws Exception {
		CustomLinkedList<String> list = new CustomLinkedList<String>();
		File file = new File("C:\\Users\\all\\Desktop\\ash\\file.txt");
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];
		String delimitor = " ";
		String st;
		while ((st = bufferreader.readLine()) != null) {
			array = st.split(delimitor);
		}
		for (String k : array) {
			list.addElement(k);
		}
		list.traverse();
		list.get();
		System.out.println("Enter the key value: ");
		String key = AlgotithmProgUtil.getstring();

		CustomLinkedList<String> newList = list.searchKey(list, key);

		FileWriter fw = new FileWriter("C:\\Users\\all\\Desktop\\ash\\file.txt");
		String data = newList.toString();
		fw.write(data);
		// fw.write("Test ");
		fw.close();

		System.out.println("Unordered List -" + data);
	}
}