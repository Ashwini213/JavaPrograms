/**
 * 
 */
package com.bridgelabz.companyshare.main;

import java.util.LinkedList;

import com.bridgelabz.companyshare.implementation.CompanyShareImplementation;
import com.bridgelabz.companyshare.manager.CompanyShareInterface;
import com.bridgelabz.companyshare.model.CompanyShare;
import com.bridgelabz.oopsUtility.OopsUtility;

/**
 * @author all
 *
 */
public class CompanyShareMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyShareInterface ref = new CompanyShareImplementation();
		LinkedList<CompanyShare> shares = new LinkedList<>();
		ref.fileRead();
		ref.add();
		System.out.println("enter the name you want to delet");
		String name = OopsUtility.getstring();
		ref.remove(name);
		ref.writeFile();
	}

}
