/**
 * 
 */
package com.bridgelabz.inventory.implementation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.inventory.manager.InventoryInterface;
import com.bridgelabz.inventory.model.Inventory;
import com.bridgelabz.oopsUtility.FileOperation;
import com.google.gson.Gson;

public class InventoryImplementation implements InventoryInterface {
	JSONArray jsonArray;
	List<Inventory> inventories = new ArrayList<>();

	JSONObject jobject = new JSONObject();

	public InventoryImplementation() {
		this.fileRead();
	}

	private void fileRead() {
		JSONParser parser = new JSONParser();
		{

			try {
				String path = "C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\inventory\\model\\Inventory.json";
				jsonArray = (JSONArray) parser.parse(FileOperation.readFile(path));
				System.out.println(jsonArray);
				for (Object obj : jsonArray) {
					Inventory inventory = new Inventory();

					jobject = (JSONObject) obj;
					String name = (String) jobject.get("name");
					double price = ((Double) jobject.get("price")).doubleValue();
					double weight = ((Double) jobject.get("weight")).doubleValue();
					inventory.setWeight(weight); // setWeight(weight);
					inventory.setName(name);

					inventory.setPrice(price);

					inventories.add(inventory);

					System.out.println(inventory.toString());
				}
			} catch (IOException | ParseException e) {

				e.printStackTrace();
			}
		}
	}

	public void calculateInventory() {
		inventories.forEach(inventory -> System.out.println(
				"Total price of " + inventory.getName() + "is" + (inventory.getPrice() * inventory.getWeight())));
		writeFile();
	}

	private void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(inventories);

		try (FileWriter file = new FileWriter(
				"C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\inventory\\model\\Inventory.json")) {
			file.write(json);
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n JSON Object " + json);
	}

	@Override
	public void add(String name, double weight, double price) {
		Inventory inventory = new Inventory();
		inventory.setName(name);
		inventory.setPrice(price);
		inventory.setWeight(weight);
		inventories.add(inventory);
		inventories.forEach(inventory1 -> System.out.println(inventory1.toString()));
		writeFile();

	}

	@Override
	public void remove(String name) {

		System.out.println("enter the name you wan to delete");
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();

		inventories.removeIf(inventory2 -> inventory2.getName().equals(name1));
		System.out.println(inventories);
		System.out.println("removed successfully");
		writeFile();
		sc.close();
	}
}