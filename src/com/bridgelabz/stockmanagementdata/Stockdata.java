/**
 * 
 */
package com.bridgelabz.stockmanagementdata;

/**
 * @author all
 *
 */
public interface Stockdata {
	public void fileRead();

	public void writeFile();

	public void add(String name, long share, double price);

	public void calculateStock();
}
