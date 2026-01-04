package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

//demo class for ecommerce platform
public class Q2_EcommercePlatformDemo {
    
    public static void main(String[] args) {
        
        //creating product list
        ArrayList<Q2_Product> products = new ArrayList<>();
        
        //adding electronics
        Q2_Electronics laptop = new Q2_Electronics(1001, "Dell Laptop", 50000, 24);
        Q2_Electronics phone = new Q2_Electronics(1002, "Samsung Phone", 25000, 12);
        
        //adding clothing
        Q2_Clothing shirt = new Q2_Clothing(2001, "Blue Shirt", 1500, "M");
        Q2_Clothing jeans = new Q2_Clothing(2002, "Denim Jeans", 2000, "L");
        
        //adding groceries
        Q2_Groceries rice = new Q2_Groceries(3001, "Basmati Rice", 500, "31-12-2026");
        Q2_Groceries oil = new Q2_Groceries(3002, "Sunflower Oil", 200, "30-06-2026");
        
        products.add(laptop);
        products.add(phone);
        products.add(shirt);
        products.add(jeans);
        products.add(rice);
        products.add(oil);
        
        //displaying products using polymorphism
        System.out.println("E-Commerce Platform - Product Listing");
        System.out.println("======================================");
        
        for(int i=0; i<products.size(); i++) {
            Q2_Product p = products.get(i);
            System.out.println("Product ID: " + p.getProductId());
            System.out.println("Name: " + p.getName());
            System.out.println("Price: Rs." + p.getPrice());
            System.out.println("Discount: Rs." + p.calculateDiscount());
            
            double tax = 0;
            //checking if product is taxable
            if(p instanceof Q2_Taxable) {
                Q2_Taxable t = (Q2_Taxable)p;
                tax = t.calculateTax();
                System.out.println("Tax: Rs." + tax);
                System.out.println("Tax Type: " + t.getTaxDetails());
            }
            
            //calculating final price
            double finalPrice = p.getPrice() + tax - p.calculateDiscount();
            System.out.println("Final Price: Rs." + finalPrice);
            System.out.println("-------------------");
        }
    }
}
