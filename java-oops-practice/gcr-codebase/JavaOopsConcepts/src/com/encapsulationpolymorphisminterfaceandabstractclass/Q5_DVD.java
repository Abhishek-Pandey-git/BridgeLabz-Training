package com.encapsulationpolymorphisminterfaceandabstractclass;

//dvd class
public class Q5_DVD extends Q5_LibraryItem implements Q5_Reservable {
    
    private boolean isAvailable;
    private String reservedBy;
    
    public Q5_DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
        this.reservedBy = null;
    }
    
    @Override
    public int getLoanDuration() {
        //dvds can be borrowed for 3 days only
        return 3;
    }
    
    @Override
    public void reserveItem(String borrowerName) {
        if(isAvailable) {
            isAvailable = false;
            reservedBy = borrowerName;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD not available");
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
