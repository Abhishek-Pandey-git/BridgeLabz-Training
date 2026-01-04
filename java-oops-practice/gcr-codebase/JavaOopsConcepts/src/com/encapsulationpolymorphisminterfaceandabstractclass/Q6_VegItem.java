package com.encapsulationpolymorphisminterfaceandabstractclass;

//veg item class
public class Q6_VegItem extends Q6_FoodItem implements Q6_Discountable {
    
    private boolean isOrganic;
    
    public Q6_VegItem(String itemName, double price, int quantity, boolean isOrganic) {
        super(itemName, price, quantity);
        this.isOrganic = isOrganic;
    }
    
    @Override
    public double calculateTotalPrice() {
        //simple calculation for veg items
        return getPrice() * getQuantity();
    }
    
    @Override
    public double applyDiscount() {
        //10% discount on veg items
        return calculateTotalPrice() * 0.10;
    }
    
    @Override
    public String getDiscountDetails() {
        return "10% discount on vegetarian items";
    }
    
    public boolean isOrganic() {
        return isOrganic;
    }
    
    public void setOrganic(boolean isOrganic) {
        this.isOrganic = isOrganic;
    }
}
