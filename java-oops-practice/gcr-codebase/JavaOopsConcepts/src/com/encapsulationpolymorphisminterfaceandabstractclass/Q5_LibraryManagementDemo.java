package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

//library management demo
public class Q5_LibraryManagementDemo {
    
    public static void main(String[] args) {
        
        //creating list of library items
        ArrayList<Q5_LibraryItem> items = new ArrayList<>();
        
        //adding books
        Q5_Book book1 = new Q5_Book(101, "Java Programming", "Herbert Schildt");
        Q5_Book book2 = new Q5_Book(102, "Clean Code", "Robert Martin");
        
        //adding magazines
        Q5_Magazine mag1 = new Q5_Magazine(201, "Tech Monthly", "Various Authors");
        Q5_Magazine mag2 = new Q5_Magazine(202, "Science Today", "Editorial Team");
        
        //adding dvds
        Q5_DVD dvd1 = new Q5_DVD(301, "Java Tutorial", "Oracle");
        Q5_DVD dvd2 = new Q5_DVD(302, "Python Basics", "Python Foundation");
        
        items.add(book1);
        items.add(book2);
        items.add(mag1);
        items.add(mag2);
        items.add(dvd1);
        items.add(dvd2);
        
        System.out.println("Library Management System");
        System.out.println("=========================");
        
        //using polymorphism
        for(int i=0; i<items.size(); i++) {
            Q5_LibraryItem item = items.get(i);
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            
            //checking reservation
            if(item instanceof Q5_Reservable) {
                Q5_Reservable res = (Q5_Reservable)item;
                System.out.println("Available: " + res.checkAvailability());
                
                //trying to reserve first 3 items
                if(i < 3) {
                    res.reserveItem("Member" + (i+1));
                }
            }
            System.out.println("-------------------");
        }
    }
}
