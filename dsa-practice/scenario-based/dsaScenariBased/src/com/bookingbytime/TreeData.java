package com.bookingbytime;

public class TreeData {
	Event data;
	TreeData left = null;
	TreeData right = null;
	
	public TreeData(Event data) {
		this.data = data;
	}
}
