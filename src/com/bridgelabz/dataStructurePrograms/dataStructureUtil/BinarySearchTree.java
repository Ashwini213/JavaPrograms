/**
 * 
 */
package com.bridgelabz.dataStructurePrograms.dataStructureUtil;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

/**
 * @author all
 *
 */
public class BinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the number of nodes");
		int nodes = AlgotithmProgUtil.getInt();
		int[] Array = new int[nodes];
		for (int i = 0; i < Array.length; i++) {
			System.out.println("Enter the " + i + " th number:");
			Array[i] = AlgotithmProgUtil.getInt();
		}
		double[] numbertimes = new double[Array.length];
		for (int i = 0; i < Array.length; i++) {
			numbertimes[i] = Methods.binaryCount(Array[i]);
		}
		for (int i = 0; i < numbertimes.length; i++) {
			System.out.println("Count of BEST possibilities for " + Array[i] + " nodes is " + numbertimes[i]);
		}
	}

}
