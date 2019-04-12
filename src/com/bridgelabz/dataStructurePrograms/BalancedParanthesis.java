/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
import com.bridgelabz.dataStructurePrograms.dataStructureUtil.Methods;
import com.bridgelabz.dataStructurePrograms.dataStructureUtil.StackLinkedList;

/**
 * @author all
 *
 */
public class BalancedParanthesis {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		StackLinkedList stack = new StackLinkedList();
		System.out.println("Enter expression: ");
		String input = AlgotithmProgUtil.getstring();
		char[] character = input.toCharArray();

		if (Methods.areParenthesisBalanced(character))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}