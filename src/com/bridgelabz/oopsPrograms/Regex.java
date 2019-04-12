/**
 * 
 */
package com.bridgelabz.oopsPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.oopsUtility.OopsUtility;

/**
 * @author all
 *
 */
public class Regex {
	public static void main(String[] args) throws FileNotFoundException {
		File str = new File("C:\\Users\\all\\Desktop\\ash\\Regex.txt");
		FileReader f = new FileReader(str);
		@SuppressWarnings("resource")
		BufferedReader read = new BufferedReader(f);
		String line = "";
		String word = "";
		try {
			while ((word = read.readLine()) != null) {
				line = word;
			}
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Please enter the first name");
		String firstName = OopsUtility.getstring();
		System.out.println("Please enter the last name");
		String lastName = OopsUtility.getstring();
		String fullName = firstName + " " + lastName;
		System.out.println("Please enter your 10 digit phone number");
		String phoneNum = OopsUtility.getstring();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String formattedDate = dateFormat.format(date);
		String message = OopsUtility.replace(firstName, fullName, phoneNum, formattedDate, line);

		System.out.println(message);
		Date dates = new Date();
		DateFormat fDate = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(fDate.format(dates));

	}
}