package com.encapsulationpolymorphisminterfaceandabstractclass;

//electronics product class
public class Q2_Electronics extends Q2_Product implements Q2_Taxable {
    
    private int warrantyPeriod;
    
    public Q2_Electronics(int productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }
    
    @Override
    public double calculateDiscount() {
        //10% discount on electronics
        return getPrice() * 0.10;
    }
    
    @Override
    public double calculateTax() {
        //18% tax on electronics
        return getPrice() * 0.18;
    }
    
    @Override
    public String getTaxDetails() {
        return "GST 18% on Electronics";
    }
    
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}
