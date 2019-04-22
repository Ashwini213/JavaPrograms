/**
 * 
 */
package com.bridgelabz.inventory.main;


import com.bridgelabz.inventory.implementation.InventoryImplementation;
import com.bridgelabz.inventory.manager.InventoryInterface;
import com.bridgelabz.oopsUtility.OopsUtility;

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

		InventoryInterface inventaryImp = new InventoryImplementation();
		//inventaryImp.fileRead();
			
			System.out.println("enter 1 to add,enter 2 to calculate,enter 3 to remove ");
			int Choice = OopsUtility.getInt();
			switch (Choice) {
			case 1:
				System.out.println("enter name");
				String name = OopsUtility.getstring();
				System.out.println("enter weight");
				double weight = OopsUtility.getDouble();
				System.out.println("enter price");
				double price = OopsUtility.getDouble();
				inventaryImp.add(name, weight, price);
				break;
			case 2:
				inventaryImp.calculateInventory();
				break;
			case 3:
				System.out.println("enter name to remove: ");
				name = OopsUtility.getstring();
				inventaryImp.remove(name);
				break;
			default:
				System.out.println("Please select valid choice");

			}
		}
	}
