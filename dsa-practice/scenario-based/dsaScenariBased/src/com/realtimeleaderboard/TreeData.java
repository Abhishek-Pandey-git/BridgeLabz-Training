package com.realtimeleaderboard;

public class TreeData {
	Player data;
	TreeData left = null;
	TreeData right = null;
	
	public TreeData(Player data) {
		this.data = data;
	}
}
