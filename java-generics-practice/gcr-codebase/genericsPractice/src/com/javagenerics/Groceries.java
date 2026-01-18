package com.javagenerics;

public class Groceries extends WarehouseItem{
    private String expiryDate;
    
    public Groceries(String name,double price,int quantity,String expiryDate){
        super(name,price,quantity);
        this.expiryDate=expiryDate;
    }
    
    public String getExpiryDate(){return expiryDate;}
    
    @Override
    public String getCategory(){
        return "Groceries";
    }
    
    @Override
    public String toString(){
        return getName()+" - $"+getPrice()+" x"+getQuantity()+" (Expires: "+expiryDate+")";
    }
}
