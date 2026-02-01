package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.*;



//doctor class
class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    public Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }
    
    @Override
	public String toString() {
		return this.name+" "+String.valueOf(this.specialty)+" "+String.valueOf(this.availableOnWeekend);
	}
}


//detail management.

public class HospitalApp {
	 public static void main(String[] args) {

	        ArrayList<Doctor> doctors = new ArrayList<>();

	        // Adding doctors
	        doctors.add(new Doctor("Dr. Smith", "Cardiology", true));
	        doctors.add(new Doctor("Dr. Adams", "Neurology", false));
	        doctors.add(new Doctor("Dr. Brown", "Orthopedics", true));
	        doctors.add(new Doctor("Dr. Taylor", "Dermatology", true));
	        doctors.add(new Doctor("Dr. Wilson", "Pediatrics", false));
	        doctors.add(new Doctor("Dr. Clark", "Neurology", true));
	        doctors.add(new Doctor("Dr. Lewis", "Cardiology", false));
	        doctors.add(new Doctor("Dr. Martin", "General Medicine", true));
	        
	        
	        //putting stream to get results
	        ArrayList<Doctor>availableDoctor=doctors.stream().filter(m->m.availableOnWeekend).sorted((m1,m2)->m1.specialty.compareTo(m2.specialty)).collect(Collectors.toCollection(ArrayList::new));
	        
	        //printing the doctors thus collected
	        for(Doctor d:availableDoctor) {
	        	System.out.println(d);
	        }
	    
	 }

}
