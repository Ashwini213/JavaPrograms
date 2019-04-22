/**
 * 
 */
package com.bridgelabz.inventortmanagement.main;

import com.bridgelabz.inventortmanagement.implementation.InventoryManagementImplementation;
import com.bridgelabz.inventortmanagement.manager.InventoryManager;

/**
 * @author all
 *
 */
public class InventoryManagementMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryManager object = new InventoryManagementImplementation();
		object.calculateInventoryPrice();
	}

}
