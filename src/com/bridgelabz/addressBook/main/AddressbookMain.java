/**
 * 
 */
package com.bridgelabz.addressBook.main;

import java.io.FileNotFoundException;

import com.bridgelabz.addressBook.implementation.addressBookImplementation;
import com.bridgelabz.addressBook.manager.AddressBookManager;
import com.bridgelabz.oopsUtility.OopsUtility;

/**
 * @author all
 *
 */
public class AddressbookMain {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		AddressBookManager addressBook = new addressBookImplementation();
		addressBook.readfile();
		System.out.println("enter your choice");
		int choice = OopsUtility.getInt();

		switch (choice) {

		case 1:
			System.out.println("enter firstname");
			String firstName = OopsUtility.getstring();
			System.out.println("enter lastname");
			String lastName = OopsUtility.getstring();

			System.out.println("enter name of the city");
			String city = OopsUtility.getstring();

			System.out.println("enter name of state");
			String state = OopsUtility.getstring();

			System.out.println("enter your zipcode");
			Long zipCode = OopsUtility.getLong();

			System.out.println("enter your phone number");
			Long phoneNumber = OopsUtility.getLong();

			System.out.println("enter the address");
			String address = OopsUtility.getstring();
			addressBook.addPerson(firstName, lastName, city, state, zipCode, phoneNumber, address);
			addressBook.writeFile();
			System.out.println("information added successfully ");
			break;

		case 2:
			addressBook.deletePerson();
			break;
		case 3:
			addressBook.sortByLastName();
			break;
		case 4:
			addressBook.sortByZipCode();
			break;
		default:
			System.out.println("enter valid input");
		}
		

	}

}