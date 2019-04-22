/**
 * 
 */
package com.bridgelabz.companyshare.model;

import java.util.List;

/**
 * @author all
 *
 */
public class CompanyShare {
	private String comapanyName;
	private Long noOfShare;
	private double price;
	private List<CompanyShare> list;

	public String getComapanyName() {
		return comapanyName;
	}

	public String setComapanyName(String comapanyName) {
		return this.comapanyName = comapanyName;
	}

	public Long getNoOfShare() {
		return noOfShare;
	}

	public Long setNoOfShare(Long noOfShare) {
		return this.noOfShare = noOfShare;
	}

	public List<CompanyShare> getList() {
		return list;
	}

	public void setList(List<CompanyShare> list) {
		this.list = list;
	}

	

	public double getPrice() {
		return price;
	}

	public double setPrice(double price) {
		return this.price = price;
	}

	@Override
	public String toString() {
		return "CompanyShare [comapanyName=" + comapanyName + ", noOfShare=" + noOfShare + ", price=" + price
				+ ", list=" + list + "]";
	}
	
}