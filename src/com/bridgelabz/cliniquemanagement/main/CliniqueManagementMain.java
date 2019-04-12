/**
 * 
 */
package com.bridgelabz.cliniquemanagement.main;

import java.util.ArrayList;

import com.bridgelabz.cliniquemanagement.model.Docter;

/**
 * @author all
 *
 */
public class CliniqueManagementMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DoctorData data = new Docterdataimpl();
		// List<DoctorData> docters = data.getDocter();
		Docter d = new Docter();
		ArrayList<Docter> array = new ArrayList<Docter>();
		d.addDetails();
		array.add(d);
		for (Docter s : array) {

			System.out.println(s);

		}

	}
}