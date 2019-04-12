/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
import com.bridgelabz.dataStructurePrograms.dataStructureUtil.CustomLinkedList;
import com.bridgelabz.dataStructurePrograms.dataStructureUtil.Methods;

/**
 * @author all
 *
 */

public class TestOrderedList {

	public static void main(String[] args) throws IOException {
		CustomLinkedList<String> list = new CustomLinkedList<String>();
		File file = new File("C:\\Users\\all\\Desktop\\ash\\file.txt");
		@SuppressWarnings("resource")
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];

		String st;
		while ((st = bufferreader.readLine()) != null) {
			array = st.split(" ");
		}
		Methods.bubbleSort(array);
		for (String k : array) {
			list.addElement(k);
		}

		list.get();
		list.traverse();
		System.out.println("Enter the key value: ");
		String key = AlgotithmProgUtil.getstring();

		CustomLinkedList<String> newList = list.searchKey(list, key);

		FileWriter fw = null;

		fw = new FileWriter("C:\\Users\\all\\Desktop\\ash\\file.txt");

		String data = newList.toString();

		fw.write(data);
		fw.close();

		System.out.println("ordered List -" + data);

	}
}