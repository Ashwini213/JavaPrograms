package com.bridgelabz.dataStructurePrograms.dataStructureUtil;

import java.util.Stack;

public class DataStructureUtil {

	// TODO Auto-generated method stub
	public static boolean check(String s) {
		Stack<Object> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				st.push(s.charAt(i));
			} else if (c == ')') {
				st.pop();
			}
		}

		return st.isEmpty();

	}
}
