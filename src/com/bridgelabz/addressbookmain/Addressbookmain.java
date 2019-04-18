/**
 * 
 */
package com.bridgelabz.addressbookmain;

import java.io.FileNotFoundException;

import com.bridgelabz.addressbookimpl.Addressimpl;
import com.bridgelabz.addressbookinterface.Addressinterface;
import com.bridgelabz.oopsUtility.OopsUtility;

/**
 * @author all
 *
 */
public class Addressbookmain {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Addressinterface addressimpl = new Addressimpl();
		addressimpl.readfile();
		System.out.println("enter your choice");
		int choice = OopsUtility.getInt();

		

		switch (choice) {

		case 1:
			System.out.println("enter firstname");
			String Firstname = OopsUtility.getstring();
			System.out.println("enter lastname");
			String Lastname = OopsUtility.getstring();

			System.out.println("enter name of the city");
			String City = OopsUtility.getstring();

			System.out.println("enter name of state");
			String State = OopsUtility.getstring();

			System.out.println("enter your zipcode");
			Long Zipcode = OopsUtility.getLong();

			System.out.println("enter your phonenumber");
			Long Phonenumber = OopsUtility.getLong();
			
			System.out.println("enter the address");
			 String Address=OopsUtility.getstring();
			
			addressimpl.addPerson(Firstname, Lastname, City, State, Zipcode, Phonenumber,Address);
			
			Addressimpl.writeFile();
			break;
		case 2:
			addressimpl.deletePerson();
			break;
		case 3:
			addressimpl.sortByLastName();
			break;
		case 4:
			addressimpl.sortByZipCode();
			break;
		default:
			System.out.println("enter valid input");
		}

	}

}
