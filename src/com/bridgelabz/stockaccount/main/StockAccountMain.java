/**
 * 
 */
package com.bridgelabz.stockaccount.main;

import com.bridgelabz.oopsUtility.OopsUtility;
import com.bridgelabz.stockaccount.implementation.StockAccountImplementation;
import com.bridgelabz.stockaccount.manager.StockAccountService;

/**
 * @author all
 *
 */
public class StockAccountMain {
	public static void main(String[] args) {

		StockAccountService stockImp = new StockAccountImplementation();

		{

			stockImp.createStockAccount();
			System.out.println("Input choice");
			int input = OopsUtility.getInt();
			switch (input) {

			case 1:
				System.out.println("Choose a stock Company you want to buy");
				String StockCompany = OopsUtility.getstring();
				System.out.println("Enter the amount you are buying for:");
				double sharePrice = OopsUtility.getDouble();
				stockImp.buy(StockCompany, sharePrice);
				stockImp.save();
				break;
			case 2:
				System.out.println("Choose a stock Company you want to sell");
				String SellCompany = OopsUtility.getstring();
				System.out.println("Enter the amount you are selling for:");
				double sharePrice1 = OopsUtility.getDouble();
				stockImp.sell(SellCompany, sharePrice1);
				stockImp.save();
				break;
			case 3:
				stockImp.valueOf();
				break;
			case 4:
				stockImp.printReport();
				break;
			}

		}

	}

}
