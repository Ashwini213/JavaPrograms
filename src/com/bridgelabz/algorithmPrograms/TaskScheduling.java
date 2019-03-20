package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
public class TaskScheduling {

	public static void main(String[] args) {
System.out.println("Enter the number of tasks tobe completed ");
int task=AlgotithmProgUtil.getInt();
int[] Minutes = new int [task];

int[] Deadline = new int [task];

for(int i=0;i<Minutes.length;i++) {
		System.out.println("Task " +i+ "time in minutes");
		Minutes[i]=AlgotithmProgUtil.getInt();
		System.out.println("Task" +i+ "deadline");
		Deadline[i]=AlgotithmProgUtil.getInt();		
}
	}
	}

