package com.bridgelabz.functionalPrograms;
import java.util.List;
import java.util.ArrayList;


import com.bridgelabz.functionalProgUtil.FunctionalProgUtil;

public class StringPermutation {



	public static void main(String[] args) {
String s="XYZ";
int len=s.length();
FunctionalProgUtil.stringPermutationIterative(s);
String startAlphabet = s.substring(0);
String endAlphabet = s.substring(len);
FunctionalProgUtil.stringPermutationRecurcive(startAlphabet,endAlphabet);

	}

}

