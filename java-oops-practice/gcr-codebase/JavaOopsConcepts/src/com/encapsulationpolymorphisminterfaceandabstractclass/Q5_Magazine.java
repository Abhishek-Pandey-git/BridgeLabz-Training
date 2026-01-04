package com.encapsulationpolymorphisminterfaceandabstractclass;

//magazine class
public class Q5_Magazine extends Q5_LibraryItem implements Q5_Reservable {
    
    private boolean isAvailable;
    private String reservedBy;
    
    public Q5_Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
        this.reservedBy = null;
    }
    
    @Override
    public int getLoanDuration() {
        //magazines can be borrowed for 7 days
        return 7;
    }
    
    @Override
    public void reserveItem(String borrowerName) {
        if(isAvailable) {
            isAvailable = false;
            reservedBy = borrowerName;
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine not available");
        }
    }
    
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
    
    public String getReservedBy() {
        return reservedBy;
    }
}
