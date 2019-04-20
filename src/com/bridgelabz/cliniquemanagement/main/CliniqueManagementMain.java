/**
 * 
 */
package com.bridgelabz.cliniquemanagement.main;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.cliniquemanagement.docterdataimpl.ManagementDetail;
import com.bridgelabz.cliniquemanagement.model.Docter;
import com.bridgelabz.cliniquemanagement.model.Patient;
import com.bridgelabz.oopsUtility.OopsUtility;

/**
 * @author all
 *
 */
public class CliniqueManagementMain {
	public static final String File_Name = "docter.json";
	String originfile = "";
	List<Docter> doctorlist1 = new ArrayList<Docter>();
	List<Patient> patientlist1 = new ArrayList<Patient>();
	Patient patient = new Patient();
	Docter doctor = new Docter();
	int ch = 0;

	public static void main(String[] args) {
		System.out.println("-----Welcome to Clinical Management------");
		System.out.println("Do you want Details of ");
		do {
		System.out.println("1: Add Doctor");
	    System.out.println("2: Add Patient");
	    System.out.println("3: Take Appointment");
	    System.out.println("4: Search Doctor");
	    System.out.println("5: Search patient");
	    System.out.println("6: Exit from the clinic");
	    int choice=OopsUtility.getInt();
	    switch (choice)
	    {
	    
	    
	    case 1:
	    	ManagementDetail.addDoctor();
         	break;
	    
	    case 2:
	    
	    	 ManagementDetail.addPatient();
	    	break;
	    
	    case 3:
	    
	    	
	    	ManagementDetail.takeAppointment();	
	    	break;
	
	    }
}
	}