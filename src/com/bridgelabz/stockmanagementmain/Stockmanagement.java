/**
 * 
 */
package com.bridgelabz.stockmanagementmain;

import java.util.Scanner;

import com.bridgelabz.stockmanagementdata.Stockdata;
import com.bridgelabz.stockmanagementimplimentation.Stockimpl;

/**
 * @author all
 *
 */
public class Stockmanagement {
	public static void main(String[] args) {

		Stockdata stockImp = new Stockimpl();
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