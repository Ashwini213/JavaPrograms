/**
 * 
 */
package com.bridgelabz.companyshare.implementation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.companyshare.iinterface.CompanyShareInterface;
import com.bridgelabz.companyshare.model.CompanyShare;
import com.bridgelabz.oopsUtility.CustomLinkedList;
import com.bridgelabz.oopsUtility.OopsUtility;
import com.google.gson.Gson;

/**
 * @author all
 *
 */
public class CompanyShareImpl implements CompanyShareInterface {
	JSONArray jsonArray;
	CompanyShare shares = new CompanyShare();

	List<CompanyShare> list = new ArrayList<>();
	CustomLinkedList<CompanyShare> linkedList = new CustomLinkedList<>();
	JSONObject jobject = new JSONObject();

	@Override
	public void fileRead() {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		FileReader fr;
		try {
			fr = new FileReader(
					"C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\stockmanagementmodel\\Stock.json");
			jsonArray = (JSONArray) parser.parse(fr);
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		for (Object obj : jsonArray) {
			CompanyShare comShare = new CompanyShare();
			jobject = (JSONObject) obj;
			String name = (String) jobject.get("name");
			Long noOfShare = (Long) jobject.get("share");

			comShare.setComapanyName(name);
			comShare.setNoOfShare(noOfShare);
			linkedList.add(comShare);
			 list.add(comShare);
		}
		// comshare.setList();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("linked  list before adding:");
		linkedList.printList();
		CompanyShare share = new CompanyShare();
		System.out.println("enter company name to add");
		String name = OopsUtility.getstring();
		System.out.println("enter the number of share");
		Long noOfShare = OopsUtility.getLong();
		String name1 = share.setComapanyName(name);
		Long noshare = share.setNoOfShare(noOfShare);
		linkedList.add(share);
		System.out.println("linked  list after adding:");
		linkedList.printList();
		System.out.println(linkedList.size());
	}

	@Override
	public void remove(String name) {

		System.out.println("Linked List" + new Gson().toJson(linkedList));

		for (CompanyShare share : linkedList) {
			if (share != null && share.getComapanyName().equals(name)) {
				linkedList.remove(share);
			}

		}
		System.out.println("removed");
		System.out.println("linked  list after removing:");
		linkedList.printList();
	}

	@Override
	public void writeFile() {
		Gson gson = new Gson();
		System.out.println("list to be written into file");
		linkedList.printList();
		String g = gson.toJson(linkedList);
		System.out.println("writing into file");
		System.out.println("content" + g);

		try {
			FileWriter file = new FileWriter(
					"C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\stockmanagementmodel\\Stock.json");
			file.write(g);
			file.flush();
			System.out.println("written into file");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}