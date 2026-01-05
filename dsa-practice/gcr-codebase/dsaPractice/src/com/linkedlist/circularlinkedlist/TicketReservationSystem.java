package com.linkedlist.circularlinkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Ticket reservation system using circular linked list.
 */
public class TicketReservationSystem {
    private Node head;

    private static class Node {
        Ticket data;
        Node next;
        Node(Ticket data) { this.data = data; }
    }

    public void addTicket(Ticket ticket) {
        Node newNode = new Node(ticket);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node last = head;
            while (last.next != head) last = last.next;
            last.next = newNode;
            newNode.next = head;
        }
    }

    public boolean removeTicket(int ticketId) {
        if (head == null) return false;
        
        if (head.data.getTicketId() == ticketId) {
            if (head == head.next) {
                head = null;
            } else {
                Node last = head;
                while (last.next != head) last = last.next;
                last.next = head.next;
                head = head.next;
            }
            return true;
        }
        
        Node prev = head;
        Node temp = head.next;
        while (temp != head) {
            if (temp.data.getTicketId() == ticketId) {
                prev.next = temp.next;
                return true;
            }
            prev = temp;
            temp = temp.next;
        }
        return false;
    }

    public List<Ticket> searchByCustomer(String customerName) {
        List<Ticket> results = new ArrayList<>();
        if (head == null) return results;
        
        Node temp = head;
        do {
            if (temp.data.getCustomerName().equalsIgnoreCase(customerName)) {
                results.add(temp.data);
            }
            temp = temp.next;
        } while (temp != head);
        
        return results;
    }

    public List<Ticket> searchByMovie(String movieName) {
        List<Ticket> results = new ArrayList<>();
        if (head == null) return results;
        
        Node temp = head;
        do {
            if (temp.data.getMovieName().equalsIgnoreCase(movieName)) {
                results.add(temp.data);
            }
            temp = temp.next;
        } while (temp != head);
        
        return results;
    }

    public int getTotalTickets() {
        if (head == null) return 0;
        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public void displayAllTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Node temp = head;
        System.out.println("All Booked Tickets:");
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
        System.out.println("Total: " + getTotalTickets() + " tickets");
    }

    public boolean isEmpty() {
        return head == null;
    }
}
