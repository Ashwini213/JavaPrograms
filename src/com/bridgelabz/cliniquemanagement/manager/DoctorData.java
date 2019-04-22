/**
 * 
 */
package com.bridgelabz.cliniquemanagement.data;

import java.util.List;


/**
 * @author all
 *
 */
public interface DoctorData {
 public List<DoctorData> getDocter();
 public void addDoctor();
 public void searchDoctor();
 public void searchByName();
 public void searchById();
 public void searchBySpecialization();
 public void searchByAvailability();
}
