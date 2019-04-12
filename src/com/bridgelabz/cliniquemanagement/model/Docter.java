/**
 * 
 */
package com.bridgelabz.cliniquemanagement.model;

import com.bridgelabz.oopsUtility.OopsUtility;

/**
 * @author all
 *
 */
public class Docter {
	private int id;
	private String name;
	private String specalization;
	private String avalability;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecalization() {
		return specalization;
	}

	public void setSpecalization(String specalization) {
		this.specalization = specalization;
	}

	public String getAvalability() {
		return avalability;
	}

	public void setAvalability(String avalability) {
		this.avalability = avalability;
	}

	public String toString() {

		return "Docter[id is " + id + " name is " + name + " specalization is  " + specalization + " avalability is " + avalability
				+ "]";

	}

	public void addDetails() {

		System.out.println("Enter Details");
		System.out.println("enter id of docter");
		id = OopsUtility.getInt();
		System.out.println();

		System.out.println("enter name of the docter");
		name = OopsUtility.getstring();
		System.out.println();

		System.out.println("enter specalization  of the docter");
		specalization = OopsUtility.getstring();
		System.out.println();

		System.out.println("enter avalability of the docter");
		avalability = OopsUtility.getstring();
		System.out.println();
	}
}