package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

//food delivery system demo
public class Q6_FoodDeliveryDemo {
    
    public static void main(String[] args) {
        
        //creating order list
        ArrayList<Q6_FoodItem> orderItems = new ArrayList<>();
        
        //adding veg items
        Q6_VegItem item1 = new Q6_VegItem("Paneer Tikka", 250, 2, false);
        Q6_VegItem item2 = new Q6_VegItem("Veg Biryani", 180, 1, true);
        Q6_VegItem item3 = new Q6_VegItem("Dal Makhani", 150, 2, false);
        
        //adding non veg items
        Q6_NonVegItem item4 = new Q6_NonVegItem("Chicken Curry", 300, 1, "Chicken");
        Q6_NonVegItem item5 = new Q6_NonVegItem("Fish Fry", 350, 2, "Fish");
        
        orderItems.add(item1);
        orderItems.add(item2);
        orderItems.add(item3);
        orderItems.add(item4);
        orderItems.add(item5);
        
        System.out.println("Online Food Delivery System");
        System.out.println("===========================");
        System.out.println("");
        
        double totalBill = 0;
        
        //processing order using polymorphism
        for(int i=0; i<orderItems.size(); i++) {
            Q6_FoodItem item = orderItems.get(i);
            item.getItemDetails();
            
            double itemTotal = item.calculateTotalPrice();
            System.out.println("Item Total: Rs." + itemTotal);
            
            //checking discount
            if(item instanceof Q6_Discountable) {
                Q6_Discountable disc = (Q6_Discountable)item;
                double discount = disc.applyDiscount();
                System.out.println("Discount: Rs." + discount);
                System.out.println(disc.getDiscountDetails());
                itemTotal = itemTotal - discount;
            }
            
            System.out.println("Final Amount: Rs." + itemTotal);
            totalBill = totalBill + itemTotal;
            System.out.println("-------------------");
        }
        
        System.out.println("Total Bill: Rs." + totalBill);
    }
}
