package com.javagenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineMarketplace {
    
    //generic method to apply discount
    public static <T extends Product<?>> void applyDiscount(T product,double percentage){
        double originalPrice=product.getPrice();
        double discountAmount=originalPrice*(percentage/100);
        double newPrice=originalPrice-discountAmount;
        product.setPrice(newPrice);
        System.out.println("Discount applied! New price: $"+String.format("%.2f",newPrice));
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Product<?>> catalog=new ArrayList<>();
        
        while(true){
            System.out.println("\n--- Online Marketplace ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add Clothing");
            System.out.println("3. Add Gadget");
            System.out.println("4. View Catalog");
            System.out.println("5. Apply Discount");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            
            int choice=sc.nextInt();
            sc.nextLine();
            
            if(choice==1){
                System.out.print("Book name: ");
                String name=sc.nextLine();
                System.out.print("Price: ");
                double price=sc.nextDouble();
                Product<BookCategory> book=new Product<>(name,price,new BookCategory());
                catalog.add(book);
                System.out.println("Book added to catalog");
            }
            else if(choice==2){
                System.out.print("Clothing name: ");
                String name=sc.nextLine();
                System.out.print("Price: ");
                double price=sc.nextDouble();
                Product<ClothingCategory> clothing=new Product<>(name,price,new ClothingCategory());
                catalog.add(clothing);
                System.out.println("Clothing added to catalog");
            }
            else if(choice==3){
                System.out.print("Gadget name: ");
                String name=sc.nextLine();
                System.out.print("Price: ");
                double price=sc.nextDouble();
                Product<GadgetCategory> gadget=new Product<>(name,price,new GadgetCategory());
                catalog.add(gadget);
                System.out.println("Gadget added to catalog");
            }
            else if(choice==4){
                System.out.println("\n=== Product Catalog ===");
                if(catalog.isEmpty()){
                    System.out.println("No products in catalog");
                }else{
                    for(int i=0;i<catalog.size();i++){
                        System.out.println((i+1)+". "+catalog.get(i));
                    }
                }
            }
            else if(choice==5){
                if(catalog.isEmpty()){
                    System.out.println("No products available");
                    continue;
                }
                System.out.println("Select product index:");
                for(int i=0;i<catalog.size();i++){
                    System.out.println((i+1)+". "+catalog.get(i).getName());
                }
                int idx=sc.nextInt()-1;
                if(idx>=0 && idx<catalog.size()){
                    System.out.print("Discount percentage: ");
                    double discount=sc.nextDouble();
                    applyDiscount(catalog.get(idx),discount);
                }else{
                    System.out.println("Invalid index");
                }
            }
            else if(choice==6){
                System.out.println("Exiting marketplace...");
                break;
            }
        }
        sc.close();
    }
}
