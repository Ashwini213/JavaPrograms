package com.bridgelabz.dataStructurePrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
import com.bridgelabz.dataStructurePrograms.dataStructureUtil.CustomLinkedList;

public class UnorderedList {
	@SuppressWarnings({ "resource", "rawtypes" })
	public static void main(String[] args) throws Exception {
		CustomLinkedList<String> list = new CustomLinkedList<String>();
		File file = new File("C:\\Users\\all\\Desktop\\ash\\file.txt");
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];
		String delimitor = " ";
		String string;
		while ((string = bufferreader.readLine()) != null) {
			array = string.split(delimitor);
		}
		for (String k : array) {
			list.addElement(k);
		}
		list.traverse();
		list.get();
		System.out.println("Enter the key value: ");
		String key = AlgotithmProgUtil.getstring();
		CustomLinkedList newList = list.searchKey(list, key);

		newList.traverse();
	}
}