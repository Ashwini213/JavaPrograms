/**
 * 
 */
package com.bridgelabz.cliniquemanagement.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author all
 *
 */
public class Appointment {
	private String docName;
	private String pName;
	private List<Patient> listOfPatients = new ArrayList<Patient>();

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public List<Patient> getListOfPatients() {
		return listOfPatients;
	}

	public void setListOfPatients(List<Patient> listOfPatients) {
		this.listOfPatients = listOfPatients;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

}