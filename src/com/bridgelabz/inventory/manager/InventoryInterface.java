/**
 * 
 */
package com.bridgelabz.inventory.manager;

/**
 * @author all
 *
 */
public interface InventoryInterface {

	public void fileRead();


	public void writeFile();

	public void add(String name, double weight, double price);

	public void remove(String name);

	public void calculateInventory();

}