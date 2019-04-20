/**
 * 
 */
package com.bridgelabz.stockaccount.model;

/**
 * @author all
 *
 */
public class StockAccount {
	private String stockCompany;
	private double noOfShares;
	private double sharePrice;
	private String currentDateTime;
	public String getStockCompany() {
		return stockCompany;
	}
	public void setStockCompany(String stockCompany) {
		this.stockCompany = stockCompany;
	}
	public double getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(double noOfShares) {
		this.noOfShares = noOfShares;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	public String getCurrentDateTime() {
		return currentDateTime;
	}
	public void setCurrentDateTime(String currentDateTime) {
		this.currentDateTime = currentDateTime;
	}
	@Override
	public String toString() {
		return "StockAccount [stockCompany=" + stockCompany + ", noOfShares=" + noOfShares + ", sharePrice="
				+ sharePrice + ", currentDateTime=" + currentDateTime + "]";
	}
}
