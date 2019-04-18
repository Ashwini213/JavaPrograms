/**
 * 
 */
package com.bridgelabz.addressbookmodel;

/**
 * @author all
 *
 */
public class AddressBook {
	private String Firstname;
	private String Lastname;
	private String City;
	private long Mobilenumber;
	private Long Zipcode;
	private String State;
	private String Address;


	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Long getZipcode() {
		return Zipcode;
	}

	public void setZipcode(Long zipcode) {
		Zipcode = zipcode;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public long getMobilenumber() {
		return Mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		Mobilenumber = mobilenumber;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	@Override
	public String toString() {
		return "AddressBook [Address=" + Address + ", State=" + State + ", Zipcode=" + Zipcode + ", City=" + City
				+ ", Mobilenumber=" + Mobilenumber + ", Firstname=" + Firstname + ", Lastname=" + Lastname + "]";
	}

}
