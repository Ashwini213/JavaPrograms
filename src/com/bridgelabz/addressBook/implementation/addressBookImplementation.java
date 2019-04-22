/**
 * 
 */
package com.bridgelabz.addressBook.implementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.addressBook.manager.AddressBookManager;
import com.bridgelabz.addressBook.model.AddressBook;
import com.bridgelabz.oopsUtility.OopsUtility;
import com.google.gson.Gson;

/**
 * @author all
 *
 */
public class addressBookImplementation implements AddressBookManager {
	JSONArray jsonData;

	List<AddressBook> addressDetails = new ArrayList<>();

	JSONObject data = new JSONObject();

	public void readfile() {

		JSONParser parser = new JSONParser();
		{

			try {
				jsonData = (JSONArray) parser.parse(new FileReader(
						"C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\addressBook\\model\\AddressBookData.json"));
				System.out.println("====>>" + jsonData);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			} catch (ParseException e) {

				e.printStackTrace();
			}

			System.out.println(jsonData);
			for (Object item : jsonData) {
				AddressBook details = new AddressBook();
				data = (JSONObject) item;
				String firstName = (String) data.get("firstName");
				String lastName = (String) data.get("lastName");
				String address = (String) data.get("address");
				String city = (String) data.get("city");
				String state = (String) data.get("state");
				Long zipCode = (Long) data.get("zipCode");
				Long phoneNumber = (Long) data.get("phoneNumber");

				details.setFirstName(firstName);
				details.setLastName(lastName);
				details.setAddress(address);
				details.setCity(city);
				details.setState(state);
				details.setZipCode(zipCode);
				details.setPhoneNumber(phoneNumber);
				System.out.println(addressDetails.toString());
				System.out.println(addressDetails.toString());

				addressDetails.add(details);
			}
		}
	}

	public void addPerson(String firstname, String lastname, String city, String state, Long zipcode, Long phonenumber,
			String address) {

		System.out.println("______________");
		AddressBook details = new AddressBook();

		details.setFirstName(firstname);
		details.setLastName(lastname);
		details.setCity(city);
		details.setState(state);
		details.setZipCode(zipcode);
		details.setPhoneNumber(phonenumber);
		details.setAddress(address);
		System.out.println(details);

		addressDetails.add(details);
		addressDetails.forEach(persondetails -> System.out.println(persondetails.toString()));
	}

	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(addressDetails);
		System.out.println(json);
		System.out.println(addressDetails);
		try {
			@SuppressWarnings("resource")
			FileWriter file = new FileWriter(
					"C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\addressBook\\model\\AddressBookData.json");
			file.write(json);
			file.flush();
			System.out.println("Successfully copied to JSON object file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deletePerson() {

		System.out.println("Enter whose detail needs to be removed");
		String removekey = OopsUtility.getstring();
		addressDetails.removeIf(address -> address.getFirstName().equals(removekey));
		writeFile();
		System.out.println("Element successfully removed");
	}

	@Override
	public void sortByLastName() {
		// System.out.println("++++>>>" + addressDetails);
		// addressDetails.forEach(da -> System.out.println(da.getLastname()));
		addressDetails.sort((AddressBook s1, AddressBook s2) -> s1.getLastName().compareTo(s2.getLastName()));
		addressDetails.forEach((s) -> System.out.println(s));
		System.out.println("22===>" + addressDetails);
		writeFile();

	}

	@Override
	public void sortByZipCode() {

		addressDetails.sort((AddressBook b1, AddressBook b2) -> b1.getZipCode().compareTo(b2.getZipCode()));
		addressDetails.forEach((s) -> System.out.println(s));
		writeFile();

	}

}