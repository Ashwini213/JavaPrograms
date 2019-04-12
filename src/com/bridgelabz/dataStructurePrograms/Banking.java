/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
import com.bridgelabz.dataStructurePrograms.dataStructureUtil.Methods;
import com.bridgelabz.dataStructurePrograms.dataStructureUtil.Queue;;

/**
 * @author all
 *
 */
public class Banking {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		int currentBalance = 10000;
		double amount = 0;
		boolean notDone = true;
		Queue<Integer> myqueue = new Queue<Integer>();

		while (myqueue.capacity > 0) {
			myqueue.enque(myqueue.capacity);
			System.out.println();
			System.out.println("------------Banking Cash Counter-----------");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance ");
			System.out.println("4.Exit");
			System.out.println();
			System.out.println("Enter your choice: ");
			int answer = AlgotithmProgUtil.getInt();
			switch (answer) {
			case 1:
				System.out.println("How much do you want to deposit? ");
				amount = AlgotithmProgUtil.getDouble();
				System.out.println(amount);
				currentBalance = Methods.Deposit(amount, currentBalance);
				System.out.println("Your Deposit is: " + amount);
				System.out.println("Your Balance is: " + currentBalance);
				break;
			case 2:
				System.out.println("How much do you want to withdraw? ");
				amount = AlgotithmProgUtil.getDouble();
				System.out.println(amount);
				if (amount > currentBalance) {
					System.out.println("You cannot overdraw your account.Try again.");
					break;
				} else {
					currentBalance = Methods.Withdrawal(amount, currentBalance);
					System.out.println("Your Withdrawal is: " + amount);
					System.out.println("Your Balance is: " + currentBalance);
					break;
				}
			case 3:
				Methods.checkBalance(currentBalance);
				break;
			case 4:
				notDone = false;
				int c = myqueue.deque();
				System.out.println("The Number of People in Queue is: " + c);
				break;
			default:
				System.out.println("Not Valid input, try again.");
				break;
			}
		}
		System.out.println("Thank you and have a nice day!");
	}
}