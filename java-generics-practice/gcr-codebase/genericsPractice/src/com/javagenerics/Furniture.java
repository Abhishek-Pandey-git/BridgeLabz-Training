package com.javagenerics;

public class Furniture extends WarehouseItem{
    private String material;
    
    public Furniture(String name,double price,int quantity,String material){
        super(name,price,quantity);
        this.material=material;
    }
    
    public String getMaterial(){return material;}
    
    @Override
    public String getCategory(){
        return "Furniture";
    }
    
    @Override
    public String toString(){
        return getName()+" ("+material+") - $"+getPrice()+" x"+getQuantity();
    }
}
