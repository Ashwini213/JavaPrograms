/**
 * 
 */
package com.bridgelabz.inventortmanagement.main;

import com.bridgelabz.inventortmanagement.iinventory.InventoryManager;
import com.bridgelabz.inventortmanagement.implimentation.InventoryManagementImpl;

/**
 * @author all
 *
 */
public class InventoryManagement {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryManager imp = new InventoryManagementImpl();
		imp.calculateInventoryPrice();
	}
}