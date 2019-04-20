/**
 * 
 */
package com.bridgelabz.cliniquemanagement.model;

/**
 * @author all
 *
 */
public class Patient {
	private int id;
	private String name;
	private int age;
	private int mobilenum;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(int mobilenum) {
		this.mobilenum = mobilenum;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", mobilenum=" + mobilenum + "]";
	}

}