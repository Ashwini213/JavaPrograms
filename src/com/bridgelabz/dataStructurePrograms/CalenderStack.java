/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructurePrograms.dataStructureUtil.QueueLinkedList;
import com.bridgelabz.dataStructurePrograms.dataStructureUtil.StackLinkedList;

/**
 * @author all
 *
 */
public class CalenderStack {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && Calendar.isLeapYear(year)) {
			days[month] = 29;
		}
		System.out.println("\t\t " + months[month] + " " + year);
		System.out.println("Sunday Monday Tuesday Wednesday Thursday Friday Saturday");
		int dayofWeek = Calendar.day(month, 1, year);
		StackLinkedList<QueueLinkedList<Integer>> stack = new StackLinkedList<>();
		QueueLinkedList<Integer> refqueue = new QueueLinkedList<>();
		for (int i = 1; i <= days[month]; i++) {
			refqueue.insert(i);
			if (((i + dayofWeek) % 7 == 0 || i == days[month])) {
				stack.push(refqueue);
				refqueue = new QueueLinkedList<Integer>();
				continue;
			}
		}
		for (int i = 0; i < dayofWeek; i++)
			System.out.print("\t");
		int size = stack.getSize();
		StackLinkedList<QueueLinkedList<Integer>> stackNew = new StackLinkedList<>();

		for (int i = 0; i < size; i++) {
			stackNew.push(stack.pop());
		}

		for (int i = 0; i < size; i++) {
			QueueLinkedList<Integer> week = stackNew.pop();
			for (int j = 0; j < week.getSize(); j++) {
				System.out.print(week.remove() + "\t");
			}
			System.out.println();
		}
	}
}