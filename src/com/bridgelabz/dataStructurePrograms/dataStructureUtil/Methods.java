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

}
