/**
 * 
 */
package com.bridgelabz.dataStructurePrograms.dataStructureUtil;

import java.util.*;

/**
 * @author all
 *
 */
public class Methods {
	public static double binaryCount(double n) {
		double c = binomialCoeff(2 * n, n);
		double count = c / (n + 1);
		return count;
	}

	public static double binomialCoeff(double n, double k) {
		int res = 1;
		if (k > n - k)
			k = n - k;
		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}

	/**
	 * to find prime number which are anagram
	 * 
	 * @param primeList
	 *            is list of integers
	 * @return set of integers
	 */
	public static Set<Integer> primeAnagram(List<Integer> primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i + 1; j < primeList.size(); j++) {
				if (isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return primeAnagram;
	}

	/**
	 * Static function to check if the two strings are anagram or not.
	 * 
	 * @param str1
	 *            the string to be checked for anagram
	 * @param str2
	 *            the string to be checked for anagram
	 * @return true if the strings are anagram else false
	 */
	public static boolean isAnagram(String word, String anagram) {
		boolean isAnagram = false;
		if (word != null && anagram != null && word.length() == anagram.length()) {
			char[] arr = word.toCharArray();
			StringBuilder temp = new StringBuilder(anagram);
			// int wordLength = FunctionalUtility.readInteger();
			for (char ch : arr) {
				int index = temp.indexOf("" + ch);
				if (index != -1) {
					temp.deleteCharAt(index);
				}
			}
			isAnagram = temp.toString().isEmpty();
		}
		return isAnagram;
	}

	/**
	 * to find prime numbers which are anagram and store in stack
	 * 
	 * @param primeList
	 *            is list of integers
	 * @return stack of integers
	 */
	@SuppressWarnings("rawtypes")
	public static Stack primeAnagram1(List<Integer> primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i + 1; j < primeList.size(); j++) {
				if (isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return (Stack) primeAnagram;
	}

	/**
	 * to find prime numbers which are anagram and store in queue
	 * 
	 * @param primeList
	 *            is list of integers
	 * @return queue of integers
	 */
	@SuppressWarnings("rawtypes")
	public static Queue primeAnagram2(List<Integer> primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i + 1; j < primeList.size(); j++) {
				if (isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return (Queue) primeAnagram;
	}

	public static boolean Anagram(String str1, String str2) {
		char[] array1 = str1.toCharArray();
		char temp1, temp2;
		char[] array2 = str2.toCharArray();
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 != len2) {
			return false;
		} else {
			for (int i = 0; i < len1; i++) {
				for (int j = 0; j < len1 - 1; j++) {
					if (array1[j] > array1[j + 1]) {
						temp1 = array1[j];
						array1[j] = array1[j + 1];
						array1[j + 1] = temp1;
					}
				}
			}
			for (int i = 0; i < len2; i++) {
				for (int j = 0; j < len2 - 1; j++) {
					if (array2[j] > array2[j + 1]) {
						temp2 = array2[j];
						array2[j] = array2[j + 1];
						array2[j + 1] = temp2;
					}
				}
			}
			str1 = String.valueOf(array1);
			str2 = String.valueOf(array2);
			if (str1.equals(str2))
				return true;
			else
				return false;
		}
	}

	public static List<Integer> primeNum2D(int m, int n) {
		List<Integer> lst = new ArrayList<Integer>();
		int temp;

		// swapping of bounds if the given lower bound is greater than upper bound
		if (m > n) {
			temp = m;
			m = n;
			n = temp;
		}
		int flag = 1;
		// try all the possible values from lower bound to upper bound
		// if the number has the factor then it must be checked within lower bound
		for (int i = m; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				// If the number is divisible by any of the number then
				// initializing flag to zero and break
				// else flag is initialized to one
				if (i % j == 0) {
					flag = 0;
					break;
				} else
					flag = 1;
			}
			// If the number is prime which is indicated by the flag,
			// then adds the number into an ArrayList.
			if (flag == 1)
				lst.add(i);
		}
		return lst;
	}

	public static int Deposit(double amount, int curBalance) {
		curBalance += amount;
		return curBalance;
	}

	public static int Withdrawal(double amount, int curBalance) {
		curBalance -= amount;
		return curBalance;
	}

	public static void checkBalance(int curBalance) {
		System.out.println("Your current balance is: " + curBalance);
	}

	public static List<Integer> anagramPrime(List<Integer> new_lst) {
		List<Integer> listOfAnagrams = new ArrayList<Integer>();
		for (int i = 0; i < new_lst.size(); i++) {
			for (int j = i + 1; j < new_lst.size(); j++) {
				if (Anagram(String.valueOf(new_lst.get(i)), String.valueOf(new_lst.get(j)))) {
					listOfAnagrams.add(new_lst.get(i));
					listOfAnagrams.add(new_lst.get(j));
					System.out.println(new_lst.get(i) + "  " + new_lst.get(j));
				}
			}
		}
		return listOfAnagrams;
	}

	/**
	 * Function that prints the list of prime numbers that are anagram
	 * 
	 * @param list
	 *            of prime numbers that anagram
	 */
	public static void printPrimeAndAnagram(List<List<Integer>> list) {
		List<Integer> aList = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			aList = list.get(i);
			if (i == 0) {
				System.out.println("Numbers which are prime and anagram are:" + aList.size());
				System.out.println();
				for (int j = 0; j < aList.size(); j++) {
					System.out.print(aList.get(j) + " ");
				}
			} else {
				System.out.println("Numbers which are prime but not anagram are:" + aList.size());
				System.out.println();
				for (int j = 1; j < aList.size(); j++) {
					System.out.print(aList.get(j) + " ");
				}
			}
			System.out.println();
		}
	}
}