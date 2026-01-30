package com.methodreferences;

import java.util.ArrayList;


//patient class for this
class Patient{
	int id;
	public Patient(int id){
		this.id=id;
	}
}


//hospital pateint details

class HospitalDetails{
	private static ArrayList<Patient> patients=new ArrayList<Patient>();
	
	public static void addPatient(int id) {
		Patient p=new Patient(id);
		patients.add(p);
	}
	
	public static void printPatients() {
		for(Patient p:patients) {
			System.out.println(p.id+" ");
		}
	}
	
	
}

// the printing logic
public class PatientID {
	
	//using consumer for this
	public static void main(String[] args) {
		//adding patients
		HospitalDetails.addPatient(1);
		HospitalDetails.addPatient(2);
		HospitalDetails.addPatient(3);
		HospitalDetails.addPatient(4);
		
		HospitalDetails.addPatient(5);
		Runnable run=HospitalDetails::printPatients;
		
		run.run();
	}

}
