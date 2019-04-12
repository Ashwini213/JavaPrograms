/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.dataStructurePrograms.dataStructureUtil.Methods;

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
			innerlist = Methods.primeNumbers(m, n);
			outterlist.add(innerlist);
			System.out.print("prime no between " + m + " and " + n);
			System.out.println(innerlist);
			m += 100;
			n += 100;
		}
	}
}