package com.linkedlist.circularlinkedlist;

/**
 * Ticket for online reservation system.
 */
public class Ticket {
    private final int ticketId;
    private final String customerName;
    private final String movieName;
    private final String seatNumber;
    private final String bookingTime;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }

    public int getTicketId() { return ticketId; }
    public String getCustomerName() { return customerName; }
    public String getMovieName() { return movieName; }
    public String getSeatNumber() { return seatNumber; }
    public String getBookingTime() { return bookingTime; }

    @Override
    public String toString() {
        return "Ticket[ID:" + ticketId + ", Customer:" + customerName + ", Movie:" + movieName 
                + ", Seat:" + seatNumber + ", Time:" + bookingTime + "]";
    }
}
