/**
 * 
 */
package com.bridgelabz.cliniquemanagement.docterdataimpl;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.cliniquemanagement.data.PatientData;
import com.bridgelabz.cliniquemanagement.model.Patient;
import com.bridgelabz.oopsUtility.OopsUtility;

/**
 * @author all
 *
 */
public class PatientDataimpl implements PatientData {
	List<Patient> patientlist = new ArrayList<Patient>();
	Patient patient = null;

	public void patientMang() {
		System.out.println("1:Do you want to add Patient");
		System.out.println("2: Do you want to search a Patient");
		int option = OopsUtility.getInt();
		switch (option) {
		case 1: {
			addPatient();
			System.out.println("The Patient is sucessfully added ");
			display();
			break;
		}
		case 2: {
			searchpatient();
			System.out.println();
		}
		default:
			System.out.println("Pls Enter the correct choice");
		}

	}

	public void addPatient() {
		patient = new Patient();
		System.out.println("Enter the Patient id");
		int pid = OopsUtility.getInt();
		patient.setId(pid);
		System.out.println("Enter the Patient name");
		String pname = OopsUtility.getstring();
		patient.setName(pname);
		System.out.println("Enter the Patient age");
		int page = OopsUtility.getInt();
		patient.setAge(page);
		System.out.println("Enter the Phone No");
		int phoneno = OopsUtility.getInt();
		patient.setMobilenum(phoneno);
		patientlist.add(patient);
	}

	public void searchpatient() {
		System.out.println("1: Search Patient by Patient ID");
		System.out.println("2: Search Patient by Phone no");
		int choice = OopsUtility.getInt();
		switch (choice) {
		case 1: {
			searchByID();
			break;
		}
		case 2: {
			searchByPhoneno();
			break;

		}
		default:
			System.out.println("Pls eneter the correct choice");

		}
	}

	public void searchByID() {

		System.out.println("Enter the patient's id to be searched");
		int patid = OopsUtility.getInt();
		try {
			for (Patient patient : patientlist) {
				if (patid == patient.getId()) {
					System.out.println("patient of id " + patid + " is present");
				}
			}
		} catch (Exception e) {
			System.out.println("patient of id " + patid + " is not present");
		}
	}

	public void searchByPhoneno() {
		System.out.println("enter the patient's phone no to be searched");
		int ppn = OopsUtility.getInt();
		try {
			for (Patient patient : patientlist) {
				if (ppn == patient.getMobilenum()) {
					System.out.println("patient of phone number" + ppn + "is present");
				}
			}
		} catch (Exception e) {
			System.out.println("patient of phone number" + ppn + "is not present");
		}
	}

	public void display() {
		if (!patientlist.isEmpty()) {
			for (Patient pd : patientlist) {
				System.out.println("PatientID :" + pd.getId());
				System.out.println("Patient Name :" + pd.getName());
				System.out.println("Patient Age :" + pd.getAge());
				System.out.println("Patient PhoneNo :" + pd.getMobilenum());
				System.out.println("------------------------------");
			}
		} else
			System.out.println("There are No Patient to display");
	}

}
