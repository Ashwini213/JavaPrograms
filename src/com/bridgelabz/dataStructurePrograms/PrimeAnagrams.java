/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author all
 *
 */
public class PrimeAnagrams {
	public static List<Integer> primeAnagrams() {
		ArrayList<Integer> anagramlist = new ArrayList<Integer>();
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
					System.out.print(anagramlist.get(i) + " " + anagramlist.get(a));
					System.out.print("\t");
				}
			}
		}
		return anagramlist;
	}

	public static List<Integer> notprimeAnagrams() {
		ArrayList<Integer> notanagramlist = new ArrayList<Integer>();
		boolean isPrime;
		for (int j = 2; j < 1000; j++) {
			isPrime = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i != 0) {
					isPrime = true;
					break;
				}
			}
			if (isPrime)
				notanagramlist.add(j);
		}
		for (int i = 0; i < notanagramlist.size(); i++) {
			for (int a = i + 1; a < notanagramlist.size(); a++) {
				if (isanagramInt(notanagramlist.get(i), notanagramlist.get(a))) {
					System.out.print(notanagramlist.get(i) + " " + notanagramlist.get(a));
					System.out.print("\t");
				}
			}
		}
		return notanagramlist;
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
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime numbers which are Anagrams are");
		primeAnagrams();
		System.out.println("Prime numbers which are not Anagrams are");
		notprimeAnagrams();
	}
}