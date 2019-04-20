/**
 * 
 */
package com.bridgelabz.inventory.model;

import org.json.simple.JSONObject;

/**
 * @author all
 *
 */
public class Inventory {
	private String name;
	private double weight;
	private double price;

	public Inventory(JSONObject object) {
		this.name = (String) object.get("name");
		this.weight = (double) object.get("weight");
		this.price = (double) object.get("price");

	}

	public Inventory() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCalculatedValue() {
		// TODO Auto-generated method stub
		return (price * weight);
	}

	@Override
	public String toString() {
		return "Inventory [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}

}