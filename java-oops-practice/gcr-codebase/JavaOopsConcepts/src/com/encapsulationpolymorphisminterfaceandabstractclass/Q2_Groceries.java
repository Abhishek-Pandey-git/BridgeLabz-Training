package com.encapsulationpolymorphisminterfaceandabstractclass;

//groceries class
public class Q2_Groceries extends Q2_Product {
    
    private String expiryDate;
    
    public Q2_Groceries(int productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }
    
    @Override
    public double calculateDiscount() {
        //5% discount on groceries
        return getPrice() * 0.05;
    }
    
    public String getExpiryDate() {
        return expiryDate;
    }
    
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
