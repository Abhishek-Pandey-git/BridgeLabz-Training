package com.encapsulationpolymorphisminterfaceandabstractclass;

//book class
public class Q5_Book extends Q5_LibraryItem implements Q5_Reservable {
    
    private boolean isAvailable;
    private String reservedBy;
    
    public Q5_Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
        this.reservedBy = null;
    }
    
    @Override
    public int getLoanDuration() {
        //books can be borrowed for 14 days
        return 14;
    }
    
    @Override
    public void reserveItem(String borrowerName) {
        if(isAvailable) {
            isAvailable = false;
            reservedBy = borrowerName;
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book already reserved");
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
