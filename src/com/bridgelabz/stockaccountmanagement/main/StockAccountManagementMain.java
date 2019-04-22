/**
 * 
 */
package com.bridgelabz.stockaccountmanagement.main;

import java.util.Scanner;

import com.bridgelabz.stockaccountmanagement.imlementation.StockAccountManagementImplementation;
import com.bridgelabz.stockaccountmanagement.manager.StockAccountManager;


/**
 * @author all
 *
 */
public class StockAccountManagementMain {
	public static void main(String[] args) {

		StockAccountManager stockImp = new StockAccountManagementImplementation();
		{
			Scanner sc = new Scanner(System.in);
			stockImp.fileRead();
			System.out.println("enter name");
			String name = sc.next();
			// inv.setName(name);
			System.out.println("enter number of shares");
			long share = sc.nextLong();
			// inv.setWeight(weight);
			System.out.println("enter price");
			double price = sc.nextDouble();
			// inv.setPrice(price);
			stockImp.add(name, share, price);
			stockImp.calculateStock();
			stockImp.calculateTotalStock();
			stockImp.writeFile();
			sc.close();
		}
	}
}