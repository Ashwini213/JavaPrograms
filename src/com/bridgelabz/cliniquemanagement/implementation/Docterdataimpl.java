/**
 * 
 */
package com.bridgelabz.cliniquemanagement.docterdataimpl;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.cliniquemanagement.data.DoctorData;
import com.bridgelabz.cliniquemanagement.model.Docter;
import com.bridgelabz.oopsUtility.OopsUtility;

/**
 * @author all
 *
 */
public class Docterdataimpl implements DoctorData

{
	@Override
	public List<DoctorData> getDocter() {

		return null;
	}

	List<Docter> doctorlist = new ArrayList<Docter>();
	Docter doctor = new Docter();

	public void addDoctor() {

		doctor = new Docter();
		System.out.println("Enter the Doctor Name");
		String dname = OopsUtility.getstring();
		doctor.setName(dname);

		System.out.println("Enter the Doctor ID");
		int did = OopsUtility.getInt();
		doctor.setId(did);

		System.out.println("Enter the Doctor Specalization");
		String dspecial = OopsUtility.getstring();
		doctor.setSpecalization(dspecial);

		System.out.println("Enter the Doctor Availability");
		String davl = OopsUtility.getstring();
		doctor.setAvalability(davl);

	}

	public void searchDoctor() {
		System.out.println("How do you want to search Doctor By");
		System.out.println("1: Search Doctor By Doctor id");
		System.out.println("2: Search Doctor By Name");
		System.out.println("3: Search Doctor By Specialization");
		System.out.println("4: Search Doctor By Availabilty");
		int choice = OopsUtility.getInt();
		switch (choice) {
		case 1: {
			searchByName();
			break;
		}
		case 2: {
			searchById();
			break;
		}
		case 3: {
			searchBySpecialization();
			break;

		}
		case 4: {
			searchByAvailability();
			break;
		}
		default:
			System.out.println("Pls enter the correct choice");
		}
	}

	public void searchByName() {
		System.out.println("Enter the doctor's name to be searched");
		String docName = OopsUtility.getstring();
		try {
			for (Docter doctor : doctorlist) {
				if (docName.equals(doctor.getName())) {
					System.out.println("entered " + docName + " is present");
				}
			}
		} catch (Exception e) {
			System.out.println("entered " + docName + " not found");
		}
	}

	public void searchById() {

		System.out.println("Enter the doctor's id to be searched");
		int docid = OopsUtility.getInt();
		try {
			for (Docter doctor : doctorlist) {
				if (docid == doctor.getId()) {
					System.out.println("Doctor of id " + docid + " is present");
				}
			}
		} catch (Exception e) {
			System.out.println("Doctor of id " + docid + " is not present");
		}
	}

	public void searchBySpecialization() {
		System.out.println("Enter the doctor's specialization to be searched");
		String docspec = OopsUtility.getstring();
		try {
			for (Docter doctor : doctorlist) {
				if (docspec.equals(doctor.getSpecalization())) {
					System.out.println("Doctor of the " + docspec + " specialization is present");
				}
			}
		} catch (Exception e) {
			System.out.println("Doctor of the " + docspec + " specialization is not present");
		}
	}

	public void searchByAvailability() {
		System.out.println("Enter when you need the doctor (eg: am/pm)");
		String docavl = OopsUtility.getstring();
		try {
			for (Docter doctor : doctorlist) {
				if (docavl.equals(doctor.getAvalability())) {
					System.out.println(doctor.getName() + " of id " + doctor.getId() + " is available");
				}
			}
		} catch (Exception e) {
			System.out.println("No doctors are available at this hour");
		}
	}
}