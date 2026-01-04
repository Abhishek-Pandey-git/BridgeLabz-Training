package com.encapsulationpolymorphisminterfaceandabstractclass;

//clothing product
public class Q2_Clothing extends Q2_Product implements Q2_Taxable {
    
    private String size;
    
    public Q2_Clothing(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }
    
    @Override
    public double calculateDiscount() {
        //20% discount on clothing
        return getPrice() * 0.20;
    }
    
    @Override
    public double calculateTax() {
        //12% tax
        return getPrice() * 0.12;
    }
    
    @Override
    public String getTaxDetails() {
        return "GST 12% on Clothing";
    }
    
    public String getSize() {
        return size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
}
