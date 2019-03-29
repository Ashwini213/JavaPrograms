/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructurePrograms.Node2;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

/**
 * @author all
 *
 */
public class PalindromeChecker {

	/**
	 * @param args
	 * @return
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node2<Character> utility = new Node2<Character>();

		System.out.println("Enter a String: ");
		String s = AlgotithmProgUtil.getstring();

		// adding each character to the rear of the dequeue
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			utility.addRear(c);
		}
		int flag = 0;

		while (utility.size > 1) {
			if (utility.removeFront() != utility.removeRear()) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}
