package com.productinventory;

import java.util.ArrayDeque;

//class to manage product inventory
public class InventoryManager {
	private static TreeData root = null;
	
	//method to add the product
	public static void addProduct(String sku, String name, double price) {
		Product product = new Product(sku, name, price);
		
		TreeData newNode = new TreeData(product);
		
		//checking if the root is null and add current node there only
		if(root == null) {
			root = newNode;
			return;
		}
		
		TreeData node = root;
		
		//traversing the tree
		while(true) {
			
			//if current is smaller than new node
			if(newNode.data.sku.compareTo(node.data.sku) > 0) {
				if(node.right == null) {
					node.right = newNode;
					return;
				}
				node = node.right;
			}
			
			//if current is greater then the new node
			else if(node.data.sku.compareTo(newNode.data.sku) > 0) {
				if(node.left == null) {
					node.left = newNode;
					return;
				}
				node = node.left;
			}
			else {
				System.out.println("Product with this SKU already exists");
				return;
			}
		}
		
	}
	
	
	//METHOD TO SEARCH A PRODUCT BY SKU
	public static Product searchProduct(String sku) {
		TreeData node = root;
		
		while(node != null) {
			if(sku.equals(node.data.sku)) {
				return node.data;
			}
			else if(sku.compareTo(node.data.sku) < 0) {
				node = node.left;
			}
			else {
				node = node.right;
			}
		}
		
		return null; // Product not found
	}
	
	
	//METHOD TO UPDATE PRODUCT PRICE BY SKU
	public static void updatePrice(String sku, double newPrice) {
		TreeData node = root;
		
		while(node != null) {
			if(sku.equals(node.data.sku)) {
				node.data.price = newPrice;
				System.out.println("Price updated successfully");
				return;
			}
			else if(sku.compareTo(node.data.sku) < 0) {
				node = node.left;
			}
			else {
				node = node.right;
			}
		}
		
		System.out.println("Product not found");
	}
	
	
	//SHOWING PRODUCTS IN SORTED SKU ORDER - INORDER TRAVERSAL
	
	public static void showProducts() {
		
		///stack for traversal
		
		ArrayDeque<TreeData> stack = new ArrayDeque<>();
		TreeData node = root;
		
		System.out.printf("%-15s %-30s %-10s", "SKU", "Product Name", "Price");
		System.out.println();
		System.out.println("─────────────────────────────────────────────────────────");
		
		while(node != null || !stack.isEmpty()) {
			while(node != null) {
				stack.push(node);
				node = node.left;
			}
			
			TreeData current = stack.pop();
			System.out.printf("%-15s %-30s $%-10.2f", current.data.sku, current.data.name, current.data.price);
			System.out.println();
			
			node = current.right;
		}
		
	}
}
