package com.bridgelabz.functionalPrograms;

import com.bridgelabz.functionalProgUtil.FunctionalProgUtil;

public class Array_2D {

	public static void main(String[] args) {
    System.out.println("Enter the value for row");
    int row=FunctionalProgUtil.getInt();
    System.out.println("Enter the value for column");
    int column=FunctionalProgUtil.getInt();
    int[][] matrix=new int[row][column];
	FunctionalProgUtil.inputsOfMatrix(FunctionalProgUtil.scanner,matrix,row,column);
	FunctionalProgUtil.outputMatrix(matrix,row,column);
	}
}

	

	