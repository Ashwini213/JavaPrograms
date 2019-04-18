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
import com.bridgelabz.inventory.model.Inventory;
import com.bridgelabz.oopsUtility.OopsUtility;
import com.google.gson.Gson;

/**
 * @author all
 *
 */
public class Addressimpl implements Addressinterface {
	JSONArray jsonArray;
	static List<AddressBook> addressDetails = new ArrayList<>();

	JSONObject jobject = new JSONObject();

		public  void readfile() {
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
			}

					for (Object obj1 : addressDetails) {
						AddressBook details = new AddressBook();

						String firstname = (String) ((JSONObject) obj1).get("firstname");
						String lastname = (String) ((JSONObject) obj1).get("lastname");
//						String street = (String) ((JSONObject) obj1).get("street");
						String city = (String) ((JSONObject) obj1).get("city");
						String state = (String) ((JSONObject) obj1).get("state");
						Long zipcode = (Long) ((JSONObject) obj1).get("zipcode");
						Long phonenumber = (Long) ((JSONObject) obj1).get("phonenumber");

						details.setFirstname(firstname);
						details.setLastname(lastname);
						details.setCity(city);
						details.setState(state);
						details.setZipcode(zipcode);
						details.setMobilenumber(phonenumber);
						addressDetails.add(details);
						System.out.println(addressDetails);
						
					}
				
			}
		

		public void addPerson(String firstname, String lastname, String city, String state, Long zipcode,Long phonenumber,String address)
		{
			AddressBook details = new AddressBook();

			details.setFirstname(firstname);
			
			details.setLastname(lastname);
			details.setCity(city);
			details.setState(state);
			details.setZipcode(zipcode);
			details.setMobilenumber(phonenumber);
			details.getMobilenumber();
		details.getAddress();

			addressDetails.add(details);
			addressDetails.forEach(persondetails -> System.out.println(persondetails));

		}

		@Override
		public void deletePerson() {
			{
				System.out.println("Enter whose detail needs to be removed");
				String removekey = OopsUtility.getstring();
				addressDetails.removeIf(address -> address.getFirstname().equals(removekey));
				writeFile();
				System.out.println("Element successfully removed");
			}
		}

		public static void writeFile() {
			Gson gson = new Gson();
			String json = gson.toJson(addressDetails);
			
			try {
				@SuppressWarnings("resource")
				FileWriter file = new FileWriter("C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\addressbookmodel\\Address.json");
				file.write("{\"AddressBook\":" + json + "}");
				file.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		@Override
		public void sortByLastName()
		{
			 addressDetails.sort((AddressBook s1, AddressBook s2)->s1.getLastname().compareTo(s2.getLastname())); 
		      addressDetails.forEach((s)->System.out.println(s));   
		}

		@Override
		public void sortByZipCode() {

			 addressDetails.sort((AddressBook b1, AddressBook b2)->b1.getZipcode().compareTo(b2.getZipcode())); 
		     addressDetails.forEach((s)->System.out.println(s));   
			
		}


		

		

		
		}
