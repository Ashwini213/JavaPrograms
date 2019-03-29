/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import java.io.*;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

/**
 * @author all
 *
 */
public class FileRead {
	public static void main(String[] args) throws Exception {
		CustomLinkedList<Object> list = new CustomLinkedList<>();
		try {
			File file = new File("C:\\Users\\all\\Desktop\\ash\\file.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			System.out.println("Enter the word tobe searched");
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}

				String[] parts = line.split(" ");
				for (String part : parts) {
					System.out.println(part);
				}
				System.out.println();
			}

			String string2 = AlgotithmProgUtil.getstring();
			String array[] = AlgotithmProgUtil.fileread(file);

			int input = AlgotithmProgUtil.binary(array, string2);
			if (input < 0) {
				System.out.println(" word not found ");
				list.add(list);
				list.display();

			} else {
				System.out.println(" word found ");
				list.deleteAfter(string2);

				list.display();

			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
	}

	public static void writeDataToFile(int input) {
		try {
			File file = new File("C:\\Users\\all\\Desktop\\ash\\file.txt");
			file.createNewFile();
			FileWriter fw = new FileWriter(file);
			fw.write(input);
			fw.close();
		} catch (IOException e) {
		}
	}
}
