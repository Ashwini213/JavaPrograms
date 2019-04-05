package com.bridgelabz.algorithmProUtil;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author all
 *
 */
public class AlgotithmProgUtil {

	public static Scanner scanner = new Scanner(System.in);

	public static int getInt() {
		return scanner.nextInt();
	}

	public static String getstring() {
		return scanner.next();
	}

	public static double getDouble() {
		return scanner.nextDouble();
	}

	/**
	 * @param str1
	 * @param str2
	 */
	public static void anagramChar(String string1, String string2) {
		String s1 = string1.replaceAll("\\s", "");
		String s2 = string2.replaceAll("\\s", "");

		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);

			status = Arrays.equals(ArrayS1, ArrayS2);

		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams ");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

	/**
	 * @param j2
	 * 
	 */
	public static List<Integer> primeAnagrams() {
		ArrayList<Integer> anagramlist = new ArrayList<Integer>();
		System.out.println();
		boolean b;
		for (int j = 2; j < 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				anagramlist.add(j);
		}
		for (int i = 0; i < anagramlist.size(); i++) {
			for (int a = i + 1; a < anagramlist.size(); a++) {
				if (isanagramInt(anagramlist.get(i), anagramlist.get(a))) {
					System.out.println(anagramlist.get(i) + " " + anagramlist.get(a));
				}
			}
		}
		return anagramlist;
	}

	/**
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static boolean isanagramInt(Integer n1, Integer n2) {
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param n
	 * @return
	 */
	public static int[] count(int n) {
		int[] count = new int[10];
		int temp = n;
		while (temp != 0) {
			int r = temp % 10;
			count[r]++;
			temp = temp / 10;
		}
		return count;
	}

	/**
	 * @return
	 * 
	 */
	public static List<Integer> primePalindrome() {
		System.out.println();
		boolean b;
		List<Integer> palindromeList = new ArrayList<Integer>();
		for (int j = 2; j < 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b && isPalindrome(j)) {
				palindromeList.add(j);
				System.out.println(j + " ");

			}
		}
		return palindromeList;
	}

	/**
	 * @param j
	 * @return
	 */
	public static boolean isPalindrome(int j) {
		int temp = j;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		if (sum == j) {
			return true;
		}
		return false;
	}

	//
	public static List<Integer> anagramPalindrome() {

		List<Integer> anagrams = primeAnagrams();
		List<Integer> palindrome = primePalindrome();
		List<Integer> outputList = new ArrayList<Integer>(anagrams);

		outputList.retainAll(palindrome);
		System.out.println();
		return outputList;
	}

	// bubbleSort
	/**
	 * @param a
	 */
	// BubbleSort
	public static void bubbleSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	/**
	 * @param a
	 */
	public static void bubbleSort(String a) {
		char[] array = a.toCharArray();
		char temp;
		int i = 0, j = 0;
		if (array[i] > array[j]) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	/**
	 * @param a
	 * @return
	 */
	public static String[] bubbleSort(String[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].compareToIgnoreCase(a[j]) > 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					scanner.close();
				}
			}
		}
		return a;
	}
	// for binary search a word in file
	// BUBBLE SORT

	public static <T extends Comparable<T>> void BubbleSort(T[] array) {
		int i;
		int n = array.length;
		for (i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < n; i++) {
			System.out.println(array[i] + " ");
		}
	}

	// for binary search a word in file
	// BINARY SEARCH
	public static <T extends Comparable<T>> void BinarySearch(T[] arr, T key) {

		int low = 0, high = arr.length - 1, mid = 0;
		mid = (low + high) / 2;
		while (low <= high) {
			if (key.compareTo(arr[mid]) > 0)
				low = mid + 1;
			else if (arr[mid].equals(key)) {
				System.out.println("key element found at index " + mid);
				break;
			} else
				high = mid - 1;

			mid = (low + high) / 2;
		}
		if (low > high) {
			System.out.println("key element not found");
		}
	}

	/**
	 * @param a
	 */
	public static void insertionSort(int[] a) {
		int temp, i, w;
		for (i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (a[j] > a[i]) {
					temp = a[j];
					a[j] = a[i];
					for (w = i; w > j + 1; w--) {
						a[w] = a[w - 1];
					}
					a[w] = temp;
				}
			}
		}
	}

	//
	/**
	 * @param a
	 */
	public static void insertionSort(String a) {
		char[] array = a.toCharArray();
		char temp;
		int i = 0, j = 0, w;
		for (i = 0; i < a.length(); i++) {
			for (j = 0; j <= i; j++) {
				if (array[j] > array[i]) {
					temp = array[j];
					array[j] = array[i];
					for (w = i; w > j + 1; w--) {
						array[w] = array[w - 1];
					}
					array[w] = temp;

				}
			}
		}
	}

	/**
	 * @param time_Start
	 * @param time_End
	 * @return
	 */
	public static long timeElapse(long time_Start, long time_End) {
		long time = (time_Start - time_End) / 1000;
		return time;
	}

	// INSERTION SORT FOR INTEGERS
	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		int i = 0, j = 0, w;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j <= i; j++) {
				if (array[j].compareTo(array[i]) > 0) {
					T temp = array[j];
					array[j] = array[i];
					for (w = i; w > j + 1; w--)
						array[w] = array[w - 1];
					array[w] = temp;
				}
			}
		}
		for (T kl : array)
			System.out.println(kl + " ");
		System.out.println(" ");
	}

	/**
	 * @param a
	 * @param s1
	 * @return
	 */
	public static int binary(String[] array, String string1) {
		int highValue = array.length - 1, lowValue = 0, midValue;
		bubbleSort(array);
		while (lowValue <= highValue) {
			midValue = (lowValue + highValue) / 2;
			if (string1.equalsIgnoreCase(array[midValue])) {
				return midValue;
			} else if (array[midValue].compareToIgnoreCase(string1) < 0) {
				lowValue = midValue + 1;
			} else {
				highValue = midValue + 1;
			}
		}
		return -1;

	}

	public static <T extends Comparable<T>> void binarySearch(T[] arr, T key) {
		int highValue = arr.length - 1, lowValue = 0, midValue;
		midValue = (lowValue + highValue) / 2;
		while (lowValue <= highValue) {
			if (key.compareTo(arr[midValue]) > 0)
				lowValue = midValue + 1;
			else if (arr[midValue].equals(key)) {
				System.out.println("element found at" + midValue);
				break;
			} else {
				highValue = midValue - 1;
				midValue = (lowValue + highValue) / 2;

			}
			if (lowValue > highValue) {
				System.out.println("Not found");
			}
		}

	}

	/**
	 * @param c
	 * @return
	 */
	public static double squareRoot(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = ((c / t + t)) / 2;
		}
		return t;
	}

	/**
	 * 
	 */
	public static void temperatureConvertion(double fahrenheit, double celsius) {
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			System.out.println("enter the temparature in fahrenheit");
			fahrenheit = scanner.nextDouble();
			fahrenheit = (fahrenheit * 9 / 5) + 32;
			System.out.println("temperature in celsius is " + fahrenheit);
			break;
		case 2:
			System.out.println("enter the temparature in celsius");
			celsius = scanner.nextDouble();
			celsius = (celsius - 32) * 5 / 9;
			System.out.println("temperature in fahrenheit is " + celsius);
			break;
		}
	}

	/**
	 * @param P
	 * @param R
	 * @param Y
	 */
	public static void monthlyPayments(double Principle, double Rate, double Year) {
		double n = 12 * Year;
		double r = (Rate * 12) / 100;
		double payment = Principle * r / (1 - Math.pow(1 + r, -n));
		System.out.println("Monthly Payment is " + payment);
	}

	/**
	 * @param month
	 * @param year
	 * @param day
	 */
	public static int dayofweek(int Month, int Year, int day) {
		int y0 = Year - (14 - Month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = Month + 12 * ((14 - Month) / 12) - 2;
		int d0 = (day + x + (31 * m0) / 12) % 7;
		System.out.println("day which falls on " + Month + " month " + day + " day " + Year + " year is " + d0);
		return d0;
	}

	//
	/**
	 * @param names
	 */
	public static void mergeSort(String[] names) {
		if (names.length >= 2) {
			String[] leftSideNum = new String[names.length / 2];
			String[] rightSideNum = new String[names.length - names.length / 2];
			for (int i = 0; i < leftSideNum.length; i++) {
				leftSideNum[i] = names[i];
			}
			for (int i = 0; i < rightSideNum.length; i++) {
				rightSideNum[i] = names[i + names.length / 2];
			}
			mergeSort(leftSideNum);
			mergeSort(rightSideNum);
			merge(names, leftSideNum, rightSideNum);
		}
	}

	//
	/**
	 * @param names
	 * @param left
	 * @param right
	 */
	public static void merge(String[] names, String[] leftSideNum, String[] rightSideNum) {
		int a = 0;
		int b = 0;

		for (int i = 0; i < names.length; i++) {

			if (b >= rightSideNum.length
					|| a < leftSideNum.length && leftSideNum[a].compareToIgnoreCase(rightSideNum[b]) < 0) {
				names[i] = leftSideNum[a];
				a++;
			} else {
				names[i] = rightSideNum[b];
				b++;
			}

		}
	}

	//
	/**
	 * @param a
	 * @param key
	 */
	public static <T extends Comparable<T>> void search(T[] array, T key) {
		int arrayLength = array.length;
		int firstElement = 0;
		int lastElement = arrayLength - 1;
		int middleElement = (firstElement + lastElement) / 2;
		while (firstElement <= lastElement) {
			if (key.compareTo(array[middleElement]) > 0) {
				firstElement = middleElement + 1;
			} else if ((array[middleElement]).equals(key)) {
				System.out.println("Element found at location" + middleElement);
				break;
			} else
				lastElement = middleElement - 1;
			middleElement = (firstElement + lastElement) / 2;
		}
		if (firstElement > lastElement) {
			System.out.println(key + " is not present in the last");
		}
	}

	//
	static int i, total;
	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

	/**
	 * @param amount
	 */
	public static void countOfNotes(int amount) {

		if (amount / notes[i] != 0) {
			total += (amount / notes[i]);
			System.out.println(notes[i] + " rs notes " + amount / notes[i]);
			amount = amount % notes[i];
		}
		i++;
		if (amount == 0) {
			System.out.println("number of notes are " + total);
			return;
		}
		countOfNotes(amount);
	}

	/**
	 * @param d
	 * @return
	 */
	public static int[] toBinary(int decimalNum) {
		String binaryNum = "";
		while (decimalNum != 0) {
			binaryNum = (decimalNum % 2) + binaryNum;
			decimalNum /= 2;
		}
		while (binaryNum.length() % 4 != 0) {
			binaryNum = 0 + binaryNum;
		}
		return stringToIntArray(binaryNum);
	}

	/**
	 * @param bin
	 * @return
	 */
	public static int[] stringToIntArray(String binaryNum) {
		int[] binary = new int[binaryNum.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = binaryNum.charAt(i) - 48;
		}
		return binary;
	}

	/**
	 * @param binary
	 * @return
	 */
	public static int toDecimal(int[] binary) {
		int numDecimal = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				numDecimal = numDecimal + (int) Math.pow(2, j);
			}
			j++;
		}
		return numDecimal;

	}

	/**
	 * @param array
	 * @return
	 */
	public static int[] swapNibbles(int[] array) {
		int temp, j = array.length - 4;
		for (int i = 0; i < 4; i++) {
			temp = array[i];

			array[i] = array[j];

			array[j] = temp;
			j++;
		}

		return array;
	}

	/**
	 * @param number
	 * @return
	 */
	public static boolean powerOf2(int number) {
		int input = 0, temp = (int) Math.pow(2, input);
		while (temp < number) {
			if (temp == number) {
				return true;
			}
			input++;
		}
		return false;
	}

	/**
	 * @param array
	 */
	public static void showArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

	//
	/**
	 * @return
	 */
	public static int guessNum(int lowValue, int highValue) {

		while (lowValue != highValue) {
			int midValue = (lowValue + highValue) / 2;
			int input = scanner.nextInt();
			System.out.println("Enter 1 if number between " + lowValue + " and " + midValue
					+ " Enter 2 if number between " + (midValue + 1) + "and" + highValue);
			if (input == 1)
				lowValue = midValue;
			else
				highValue = midValue + 1;
		}
		return lowValue;
	}

	//
	/**
	 * @param f
	 * @return
	 * @throws IOException
	 */
	public static String[] fileread(File f) throws IOException {
		String word = "";
		ArrayList<String> s1 = new ArrayList<String>();
		FileReader fr = new FileReader(f);
		int c;
		while ((c = fr.read()) != -1) {
			if (c == 32) {
				s1.add(word);
				word = "";
			} else {
				word = word + String.valueOf((char) c);
			}
		}
		fr.close();
		String[] s = new String[s1.size()];
		s1.toArray(s);
		return s;
	}

	/**
	 * @param a
	 * @return
	 */
	public static void sort(List<Integer> array, int totalElements) {
		for (int i = 0; i < array.size() - 1; i++) {
			for (int j = 0; j < array.size() - i - 1; j++) {
				if (array.get(j) > array.get(j + 1)) {
					int temp = array.get(j);
					array.set(j, array.get(j + 1));
					array.set(j + 1, temp);
				}
			}
		}
		for (int k : array) {
			System.out.println(k + " ");
		}
	}

	// InsertionSort
	/**
	 * @param totalElements
	 * @param b
	 * @return
	 */
	public static void insertionsort(List<String> array, int totalElements) {

		int i, j, k;
		for (i = 0; i < array.size(); i++) {
			for (j = 0; j <= i; j++) {
				if (array.get(j).compareTo(array.get(i)) > 0) {
					String temp = array.get(j);
					array.set(j, array.get(i));
					for (k = i; k > j + 1; k--) {
						array.set(k, array.get(k - 1));
					}
					array.set(k, temp);
				}
			}
		}

		for (String w : array) {
			System.out.println(w + " ");
			System.out.println(" ");
		}

	}

	public static boolean isLeapYear(int Year) {
		if ((Year % 4 == 0) && (Year % 100 != 0))
			return true;
		if (Year % 400 == 0)
			return true;
		return false;
	}

}