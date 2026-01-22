package com.musicLibrary;

public class TreeData {
	Track data;
	TreeData left = null;
	TreeData right = null;
	
	public TreeData(Track data) {
		this.data = data;
	}
}
