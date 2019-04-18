/**
 * 
 */
package com.bridgelabz.addressbookimpl;

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

import com.bridgelabz.addressbookinterface.Addressinterface;
import com.bridgelabz.addressbookmodel.AddressBook;
import com.bridgelabz.oopsUtility.OopsUtility;
import com.google.gson.Gson;

/**
 * @author all
 *
 */
public class Addressimpl implements Addressinterface {
	JSONArray jsonArray;

	List<AddressBook> addressDetails = new ArrayList<>();

	JSONObject jobject = new JSONObject();

	public void readfile() {

		JSONParser parser = new JSONParser();
		{

			try {
				jsonArray = (JSONArray) parser.parse(new FileReader(
						"C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\\\com\\bridgelabz\\addressbookmodel\\Address.json"));
				System.out.println("====>>" + jsonArray);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			} catch (ParseException e) {

				e.printStackTrace();
			}

			System.out.println(jsonArray);
			for (Object obj1 : jsonArray) {
				AddressBook details = new AddressBook();
				jobject = (JSONObject) obj1;
				String firstname = (String) jobject.get("firstname");
				String lastname = (String) jobject.get("lastname");
				String address = (String) jobject.get("address");
				String city = (String) jobject.get("city");
				String state = (String) jobject.get("state");
				Long zipcode = (Long) jobject.get("zipcode");
				Long phonenumber = (Long) jobject.get("phonenumber");

				details.setFirstname(firstname);
				details.setLastname(lastname);
				details.setAddress(address);
				details.setCity(city);
				details.setState(state);
				details.setZipcode(zipcode);
				details.setPhonenumber(phonenumber);
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

		details.setFirstname(firstname);
		details.setLastname(lastname);
		details.setCity(city);
		details.setState(state);
		details.setZipcode(zipcode);
		details.setPhonenumber(phonenumber);
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
					"C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\addressbookmodel\\Address.json");
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
		addressDetails.removeIf(address -> address.getFirstname().equals(removekey));
		writeFile();
		System.out.println("Element successfully removed");
	}

	@Override
	public void sortByLastName() {
		// System.out.println("++++>>>" + addressDetails);
		// addressDetails.forEach(da -> System.out.println(da.getLastname()));
		addressDetails.sort((AddressBook s1, AddressBook s2) -> s1.getLastname().compareTo(s2.getLastname()));
		addressDetails.forEach((s) -> System.out.println(s));
		System.out.println("22===>" + addressDetails);
		writeFile();

	}

	@Override
	public void sortByZipCode() {

		addressDetails.sort((AddressBook b1, AddressBook b2) -> b1.getZipcode().compareTo(b2.getZipcode()));
		addressDetails.forEach((s) -> System.out.println(s));
		writeFile();

	}

}