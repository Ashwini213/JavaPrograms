/**
 * 
 */
package com.bridgelabz.oopsUtility;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author all
 *
 */
public class OopsUtility {
	public static Scanner scanner = new Scanner(System.in);

	public static int getInt() {
		return scanner.nextInt();
	}
	public static long getLong() {
		return scanner.nextLong();
	}
	

	public static String getstring() {
		return scanner.next();
	}

	public static double getDouble() {
		return scanner.nextDouble();
	}

	public static String replace(String first, String fullName, String phoneNum, String date, String line) {
		final String REGEX_NAME = "<{2}?\\w+>{2}";
		final String REGEX_FULL_NAME = "<{2}+\\w+ +\\w+>{2}";
		final String REGEX_CONTACT = "x{10}";
		final String REGEX_DATE = "<{2}+\\d{2}+/+\\d{2}+/+\\d{4}+>{2}";
		Pattern p1 = Pattern.compile(REGEX_NAME);
		Matcher m1 = p1.matcher(line);
		line = m1.replaceAll(first);

		Pattern p2 = Pattern.compile(REGEX_FULL_NAME);
		Matcher m2 = p2.matcher(line);
		line = m2.replaceAll(fullName);

		Pattern p3 = Pattern.compile(REGEX_CONTACT);
		Matcher m3 = p3.matcher(line);
		line = m3.replaceAll(phoneNum);

		Pattern p4 = Pattern.compile(REGEX_DATE);
		Matcher m4 = p4.matcher(line);
		line = m4.replaceAll(date);
		return line;
	}
	//deckofcards
	public static <T extends Comparable<T>> T[] sortArray(T str[]) {
        int length = str.length;
        for (int i = 1; i < length; i++) {
            T key = str[i];
            int j = i - 1;
            while (j >= 0 && ((str[j].compareTo(key) > 0))) {
                str[j + 1] = str[j];
                j--;
            }
            str[j + 1] = key;
        }
        return str;
    }
}