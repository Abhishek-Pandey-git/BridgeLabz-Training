package com.javagenerics;

public abstract class WarehouseItem {
    private String name;
    private double price;
    private int quantity;
    
    public WarehouseItem(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getQuantity(){return quantity;}
    
    public void setQuantity(int quantity){this.quantity=quantity;}
    
    public abstract String getCategory();
}
