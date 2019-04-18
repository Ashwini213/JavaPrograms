package com.bridgelabz.addressbookinterface;

public interface Addressinterface {
	public void addPerson(String firstname, String lastname, String city, String state, Long zipcode,Long phonenumber, String address);
public void sortByZipCode();
public void sortByLastName();
public void deletePerson();
public void readfile();
}
