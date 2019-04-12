/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.dataStructurePrograms.dataStructureUtil.Methods;
import com.bridgelabz.dataStructurePrograms.dataStructureUtil.StackLinkedList;

/**
 * @author all
 *
 */
public class PrimeAnagramStack {
	public static void main(String[] args) {
		StackLinkedList<Integer> st = new StackLinkedList<>();

		List<Integer> list1 = new ArrayList<Integer>();

		list1 = Methods.primeNum(0, 1000);

		for (int i = 0; i < list1.size(); i++) {
			for (int j = i + 1; j < list1.size(); j++) {
				if (Methods.Anagram(String.valueOf(list1.get(i)), String.valueOf(list1.get(j)))) {
					st.push(list1.get(i));
					st.push(list1.get(j));
				}
			}
		}
		System.out.println("Printing the elements in reverse order using pop function of stack");

		while (!st.isEmpty()) {

			System.out.println(st.pop() + " " + st.pop());
		}
	}
}