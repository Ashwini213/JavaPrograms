package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class TaskScheduling {

	public static void main(String[] args) {
System.out.println("Enter the number of tasks tobe completed ");
int task=AlgotithmProgUtil.getInt();
System.out.println("enter the time in minutes to accomplish a task ");
int Minutes = AlgotithmProgUtil.getInt();
System.out.println("Deadline to complete a task is ");
int Deadline = AlgotithmProgUtil.getInt();
for(int i=0;i<task;i++) {
	if(Minutes>Deadline) {
		System.out.println("Task  not completed successfully ");
		System.out.println("Switch to next task ");
}
	else
		System.out.println("Task completed successfully ");
	}
	}
}
