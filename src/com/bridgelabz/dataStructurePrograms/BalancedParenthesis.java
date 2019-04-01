/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructurePrograms.dataStructureUtil.StackImplementation;

/**
 * @author all
 *
 */
public class BalancedParenthesis<T> {
	public static boolean check(String s) {
		StackImplementation<String> mystack = new StackImplementation<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				mystack.push(s.charAt(i));
			} else if (c == ')') {
				mystack.pop();
			}
		}
		return mystack.isEmpty();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		String result = (check(s)) ? "Balanced" : "Not balanced";
		System.out.println(result);
	}
}