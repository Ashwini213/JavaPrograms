/**
 * 
 */
package com.bridgelabz.inventory.main;

import java.util.Scanner;

import com.bridgelabz.inventory.data.InventoryInterface;
import com.bridgelabz.inventory.implimentation.InventoryImpl;

/**
 * @author all
 *
 */
public class InventoryMain {

	/**
	 * @param args
	 * @throws ParseException
	 * @throws IOException
	 */

	public static void main(String[] args) {

		InventoryInterface inventaryImp = new InventoryImpl();
		{
			Scanner sc = new Scanner(System.in);
			inventaryImp.fileRead();
			System.out.println("enter name");
			String name = sc.next();
			// inv.setName(name);
			System.out.println("enter weight");
			int weight = sc.nextInt();
			// inv.setWeight(weight);
			System.out.println("enter price");
			double price = sc.nextDouble();
			// inv.setPrice(price);
			inventaryImp.add(name, weight, price);
			inventaryImp.calculateInventory();
			inventaryImp.writeFile();
			inventaryImp.remove(name);
			sc.close();
		}

	}
}