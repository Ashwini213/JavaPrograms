/**
 * 
 */
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;
import com.bridgelabz.dataStructurePrograms.dataStructureUtil.DataStructureUtil.CashCounterLogic;


/**
 * @author all
 *
 */
public class Banking {
	public static void main(String args[]) {
		CashCounterLogic q = new CashCounterLogic();
			
		
		int ch = 0;
		do {
			System.out.println();
			System.out.println("------------Banking Cash Counter-----------");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Number of people in the Queue ");
			System.out.println("4.Exit");
			System.out.println();
			System.out.println("Enter your choice: ");
			int choice = AlgotithmProgUtil.getInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the amount you want to Deposit");
				q.insert(AlgotithmProgUtil.getInt());
				q.display();
				break;
			case 2:
				System.out.println("Enter the amount you want to Withdraw ");
				AlgotithmProgUtil.getInt();
				q.remove();
				System.out.println(" Your Available Balance is: ");
				q.display();
				break;
			case 3:
				int j = q.getSize();
				System.out.println("The Number of People in Queue is: " + j);
			case 4:
				System.exit(0);
			default:
				System.out.println("You entered wrong choice");
				break;
			}
		} while (ch < 5);
	}
}
