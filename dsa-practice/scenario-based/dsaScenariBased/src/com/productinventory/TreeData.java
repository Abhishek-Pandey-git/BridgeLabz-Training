package com.productinventory;

public class TreeData {
	Product data;
	TreeData left = null;
	TreeData right = null;
	
	public TreeData(Product data) {
		this.data = data;
	}
}
