package com.flashdealz;

import java.util.ArrayList;
public class SortByDiscount {
	private static ArrayList<Product> products=new ArrayList<Product>();
	private static boolean sorted=false;
	
	public static void  addToProducts(String name,double price, double discountPercentage)
	{
		Product product=new Product(name,price,discountPercentage);
		products.add(product);
		sorted=false;
		
	}
	
	//partitioning using hoare's algorithm
	private static int partitioning(int low,int high) {
		int i=0;
		int j=high;
		
		//forming pivot and element
		int mid=low+(high-low)/2;
		double pivot=products.get(mid).discountPercentage;
		
		while(i<=j) {
			while(products.get(i).discountPercentage>pivot) {
				i++;
			}
			while(products.get(j).discountPercentage<pivot) {
				j--;
			}
			
			if(i<=j) {
				Product temp=products.get(i);
				products.set(i, products.get(j));
				products.set(j,temp);
			}
		}
		
		return j;
	}
	
	private static void quickSort(int low,int high) {
		if(low<=high) {
			return;
		}
		
		int partition=partitioning(low,high);
		
		quickSort(low,partition);
		quickSort(partition+1,high);
	}
	
	
	
	//printing the sorted products. if already sorted then no need to sort again. 
	public static void printSorted() {
		if(sorted==false) {
			quickSort(0,products.size()-1);
			sorted=true;
		}
		System.out.printf("%-20s %-10s %-10s","Product Name","Price","Discount");
		System.out.println();
		for(Product product:products) {
			System.out.printf("%-20s %-10f %-10f",product.name,product.price,product.discountPercentage);
			System.out.println();
		}
	}
}
