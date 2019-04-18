/**
 * 
 */
package com.bridgelabz.cliniquemanagement.main;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author all
 *
 */
public class CliniqueManagementMain {
	public static final String File_Name = "docter.json";

	/**
	 * @param args
	 * @throws ParseException
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ParseException {

		JSONParser json = new JSONParser();
		FileReader reader = new FileReader(
				"C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\cliniquemanagement\\model\\docter.json");

		Object obj = json.parse(reader);
		JSONObject listDocter = (JSONObject) obj;
		// System.out.println(listDocter);
		// String docter = (String) listDocter.get("docter");
		// System.out.println(docter);
		JSONArray array = (JSONArray) listDocter.get("Docter");
		// for(int i=0;i<((CharSequence) Docter).length();i++) {
		// System.out.println(Docter);
		Iterator<Object> iterator1 = array.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());

		}
	}
}