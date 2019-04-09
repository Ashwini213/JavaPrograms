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
public class PrimeNoin2D {
	public static void main(String[] args) {
		List<List<Integer>> outterlist = new ArrayList<List<Integer>>();
		List<Integer> innerlist = new ArrayList<Integer>();
		System.out.println("prime number of the range 0 to 1000");
		int m = 2;
		int n = 100;

		for (int i = 1; i <= 10; i++) {
			innerlist = primeNumbers(m, n);
			outterlist.add(innerlist);
			System.out.print("prime no between " + m + " and " + n);
			System.out.println(innerlist);
			m += 100;
			n += 100;
		}
	}

	public static ArrayList<Integer> primeNumbers(int m, int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
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
				list.add(i);
		}
		return list;
	}
}