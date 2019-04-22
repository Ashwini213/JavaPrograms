package com.bridgelabz.addressBook.manager;

public interface AddressBookManager {
	public void addPerson(String firstName, String lastName, String city, String state, Long zipCode, Long phoneNumber,
			String address);

	public void readfile();

	public void deletePerson();

	public void sortByZipCode();

	public void sortByLastName();

	public void writeFile();

}