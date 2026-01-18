package com.javagenerics;

public class Electronics extends WarehouseItem{
    private String brand;
    
    public Electronics(String name,double price,int quantity,String brand){
        super(name,price,quantity);
        this.brand=brand;
    }
    
    public String getBrand(){return brand;}
    
    @Override
    public String getCategory(){
        return "Electronics";
    }
    
    @Override
    public String toString(){
        return getName()+" ("+brand+") - $"+getPrice()+" x"+getQuantity();
    }
}
