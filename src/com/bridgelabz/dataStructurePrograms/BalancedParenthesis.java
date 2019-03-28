/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructurePrograms.dataStructureUtil.DataStructureUtil;

/**
 * @author all
 *
 */
public class BalancedParenthesis<T> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		String result = (DataStructureUtil.check(s)) ? "Balanced" : "Not balanced";
		System.out.println(result);

	}

}