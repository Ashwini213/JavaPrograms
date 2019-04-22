/**
 * 
 */
package com.bridgelabz.cliniquemanagement.docterdataimpl;

import java.io.File;

import com.bridgelabz.cliniquemanagement.data.DoctorData;
import com.bridgelabz.oopsUtility.OopsUtility;

/**
 * @author all
 *
 */
public class DocterManagement {
	String originfile = "C:\\Users\\all\\eclipse-workspace\\functionalPrograms\\src\\com\\bridgelabz\\cliniquemanagement\\model\\docter.json";
	DoctorData object = new Docterdataimpl();

	@SuppressWarnings("unused")
	public void doctorDetails() {
		int ch = 0;
		do {
			System.out.println(" 1:Do you want to add Doctor");
			System.out.println(" 2:Do you want to search Doctor");
			System.out.println(" 3:Do you want to know famous doctor in the clinic");
			// System.out.println(" 4:Do you want to know most famous specialist in
			// clinic");
			int option = OopsUtility.getInt();
			switch (option) {
			case 1: {
				object.addDoctor();
				File file = new File(originfile);
				break;
			}
			case 2: {
				object.searchDoctor();
				break;
			}

			default:
				System.out.println("PLs eneter the proper choice");
				break;
			}
			ch++;
		} while (ch > 50);

	}
}
