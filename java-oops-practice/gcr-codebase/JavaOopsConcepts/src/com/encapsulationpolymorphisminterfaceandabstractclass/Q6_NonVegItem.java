package com.encapsulationpolymorphisminterfaceandabstractclass;

//non veg item class
public class Q6_NonVegItem extends Q6_FoodItem implements Q6_Discountable {
    
    private String meatType;
    
    public Q6_NonVegItem(String itemName, double price, int quantity, String meatType) {
        super(itemName, price, quantity);
        this.meatType = meatType;
    }
    
    @Override
    public double calculateTotalPrice() {
        //additional charge for non veg
        double extraCharge = getPrice() * 0.15;
        return (getPrice() + extraCharge) * getQuantity();
    }
    
    @Override
    public double applyDiscount() {
        //5% discount on non veg items
        return calculateTotalPrice() * 0.05;
    }
    
    @Override
    public String getDiscountDetails() {
        return "5% discount on non-vegetarian items";
    }
    
    public String getMeatType() {
        return meatType;
    }
    
    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }
}
