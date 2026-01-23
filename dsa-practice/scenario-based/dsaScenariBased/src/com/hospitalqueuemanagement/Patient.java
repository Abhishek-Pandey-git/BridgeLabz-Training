package com.hospitalqueuemanagement;

//class representing patient

public class Patient {
	int patientId;
	String name;
	String checkInTime;
	
	public Patient(int patientId, String name, String checkInTime) {
		this.patientId = patientId;
		this.name = name;
		this.checkInTime = checkInTime;
	}
}
