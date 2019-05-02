/**
 * 
 */
package com.bridgelabz.stockaccountmanagement.model;

/**
 * @author all
 *
 */
public class Stock {
	private String name;
	private long share;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getShare() {
		return share;
	}

	public void setShare(long share) {
		this.share = share;
	}

	public double getPrice() {

		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "name  : " + name + "\n" + "share: " + share + "\n" + "price : " + price + "\n";
	}
}
