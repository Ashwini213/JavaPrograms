/**
 * 
 */
package com.bridgelabz.stockaccountmanagement.manager;

/**
 * @author all
 *
 */
public interface StockAccountManager {
	public void fileRead();

	public void writeFile();

	public void add(String name, long share, double price);

	public void calculateStock();
	public void calculateTotalStock();
}
