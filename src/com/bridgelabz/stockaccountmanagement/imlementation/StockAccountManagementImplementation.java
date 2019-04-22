/**
 * 
 */
package com.bridgelabz.stockaccountmanagement.imlementation;

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

import com.bridgelabz.stockaccountmanagement.manager.StockAccountManager;
import com.bridgelabz.stockaccountmanagement.model.Stock;
import com.google.gson.Gson;

/**
 * @author all
 *
 */
public class StockAccountManagementImplementation implements StockAccountManager {
	JSONArray jsonArray;
	List<Stock> stocklist = new ArrayList<>();

	JSONObject jobject = new JSONObject();

	@Override
	public void fileRead() {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		{

			try {
				jsonArray = (JSONArray) parser.parse(new FileReader(
						"C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\stockmanagementmodel\\Stock.json"));
				System.out.println("====>>" + jsonArray);
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

			for (Object obj : jsonArray) {
				Stock management = new Stock();

				jobject = (JSONObject) obj;
				String name = (String) jobject.get("name");
				double price = ((Double) jobject.get("price")).doubleValue();
				long share = ((Long) jobject.get("share")).longValue();
				management.setShare(share);
				management.setName(name);

				management.setPrice(price);
				stocklist.add(management);

				System.out.println(management.toString());

			}
		}
	}

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		String json = gson.toJson(stocklist);
		System.out.println("xyz" + json);
		System.out.println("===>" + stocklist);

		try (FileWriter file = new FileWriter(
				"C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\stockmanagementmodel\\Stock.json")) {
			file.write(json);
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n JSON Object " + json);
	}

	@Override
	public void add(String name, long share, double price) {
		// TODO Auto-generated method stub
		Stock stock = new Stock();
		stock.setName(name);
		stock.setPrice(price);
		stock.setShare(share);
		stocklist.add(stock);
		stocklist.forEach(stock1 -> System.out.println(stock1.toString()));

	}

	@Override
	public void calculateStock() {
		// TODO Auto-generated method stub
		stocklist.forEach(stock -> System.out
				.println(" Total price of " + stock.getName() + " is " + (stock.getPrice() * stock.getShare())));

	}
	
	public void calculateTotalStock() {
		double sum=0;
		for(Stock stock: stocklist) {
			sum=sum+(stock.getPrice()*stock.getShare());
		}
		System.out.println("Total value is " + sum);
	}

}