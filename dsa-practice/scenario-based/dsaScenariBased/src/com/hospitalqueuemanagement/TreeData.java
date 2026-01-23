package com.hospitalqueuemanagement;

public class TreeData {
	Patient data;
	TreeData left = null;
	TreeData right = null;
	
	public TreeData(Patient data) {
		this.data = data;
	}
}
