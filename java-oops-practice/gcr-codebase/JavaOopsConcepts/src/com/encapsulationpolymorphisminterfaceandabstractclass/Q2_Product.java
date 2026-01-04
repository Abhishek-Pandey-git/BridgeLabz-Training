package com.encapsulationpolymorphisminterfaceandabstractclass;

//abstract product class 
public abstract class Q2_Product {
    
    private int productId;
    private String name;
    private double price;
    
    public Q2_Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    
    //abstract method
    public abstract double calculateDiscount();
    
    //getters and setters
    public int getProductId() {
        return productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}
