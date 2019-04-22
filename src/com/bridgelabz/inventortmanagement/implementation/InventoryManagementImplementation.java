/**
 * 
 */
package com.bridgelabz.inventortmanagement.implementation;

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

import com.bridgelabz.inventortmanagement.manager.InventoryManager;
import com.bridgelabz.inventortmanagement.model.InventoryFactory;
import com.bridgelabz.inventory.model.Inventory;
import com.google.gson.Gson;

/**
 * @author all
 *
 */
public class InventoryManagementImplementation implements InventoryManager {
	private List<Inventory> riceItems;
	private List<Inventory> wheatItems;
	private List<Inventory> pulseItems;

	private Gson gson;

	public InventoryManagementImplementation() {
		fileRead();
		this.gson = new Gson();
	}

	private void fileRead() {
		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader(
					"C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\inventortmanagement\\model\\InventoryManagement.json");
			Object obj = parser.parse(reader);

			JSONObject jsonObject = (JSONObject) obj;
			JSONArray riceArray = (JSONArray) jsonObject.get("rice");
			riceItems = getInventories(riceArray);
			JSONArray wheatArray = (JSONArray) jsonObject.get("wheat");
			wheatItems = getInventories(wheatArray);
			JSONArray pulseArray = (JSONArray) jsonObject.get("pulses");
			pulseItems = getInventories(pulseArray);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private List<Inventory> getInventories(JSONArray array) {
		List<Inventory> inventories = new ArrayList<>();
		for (Object object : array) {
			Inventory inventory = new Inventory((JSONObject) object);
			inventories.add(inventory);
			System.out.println(inventories);
		}
		return inventories;
	}

	public void addInventory(String name, int weight, double price) {
		Inventory inventory = new Inventory(null);
		inventory.setName(name);
		inventory.setWeight(weight);
		inventory.setPrice(price);
		riceItems.add(inventory);
		// wheatItems.add(inventory);
		// pulseItems.add(inventory);
		riceItems.forEach(inventory1 -> System.out.println(inventory1.toString()));
	}

	@Override
	public void calculateInventoryPrice() {
		double totalValueOfRice = getTotalValue(riceItems);
		double totalValueOfWheat = getTotalValue(wheatItems);
		double totalValueOfPulses = getTotalValue(pulseItems);

		System.out.println("Total value of rice is :- " + totalValueOfRice);
		System.out.println("Total value of wheat is :- " + totalValueOfWheat);
		System.out.println("Total value of pulses is :- " + totalValueOfPulses);
		writeInventoryToFile();
		// rice.stream().map(Inventory::getCalculatedValue).reduce(0.0, Double::sum);
	}

	private double getTotalValue(List<Inventory> items) {
		double totalValueOfItem = 0.0;
		for (Inventory inventory : items) {
			totalValueOfItem += inventory.getCalculatedValue();
		}
		return totalValueOfItem;
	}

	private void writeInventoryToFile() {
		try {
			InventoryFactory factory = new InventoryFactory(riceItems, wheatItems, pulseItems);
			String json = gson.toJson(factory);
			FileWriter file = new FileWriter(
					"C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\inventortmanagement\\model\\InventoryManagement.json");
			file.write(json);
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}