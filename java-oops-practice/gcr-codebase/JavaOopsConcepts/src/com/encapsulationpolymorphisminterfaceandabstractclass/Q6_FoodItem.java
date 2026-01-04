package com.encapsulationpolymorphisminterfaceandabstractclass;

//abstract food item class
public abstract class Q6_FoodItem {
    
    private String itemName;
    private double price;
    private int quantity;
    
    public Q6_FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
    //abstract method
    public abstract double calculateTotalPrice();
    
    //concrete method
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity: " + quantity);
    }
    
    //getters setters
    public String getItemName() {
        return itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
