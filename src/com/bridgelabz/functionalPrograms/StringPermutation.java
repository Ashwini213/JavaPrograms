package com.bridgelabz.functionalPrograms;

import com.bridgelabz.functionalProgUtil.FunctionalProgUtil;

public class StringPermutation {

	public static void main(String[] args) {
		String s = "XYZ";
		FunctionalProgUtil.stringPermutationRecurcive(" ", s);
		FunctionalProgUtil.stringPermutationIterative(s);
	}

}
