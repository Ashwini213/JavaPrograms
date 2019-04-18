/**
 * 
 */
package com.bridgelabz.addressbookmodel;

/**
 * @author all
 *
 */
public class AddressBook {
	private String firstname;
	private String lastname;
	private String city;
	private long phonenumber;
	private Long zipcode;
	private String state;
	private String address;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public Long getZipcode() {
		return zipcode;
	}

	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "[firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + ", mobilenumber="
				+phonenumber + ", zipcode=" + zipcode + ", state=" + state + ", address=" + address + "]";
	}
}
