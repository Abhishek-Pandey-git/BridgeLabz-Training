package com.ambulance;

public class CircularRoute {
    HospitalUnit head;
    
    public CircularRoute() {
        this.head = null;
    }
    
    public void addUnit(String name) {
        HospitalUnit newUnit = new HospitalUnit(name);
        
        if (head == null) {
            head = newUnit;
            head.next = head;
        } else {
            HospitalUnit temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newUnit;
            newUnit.next = head;
        }
        
        System.out.println("Added unit: " + name);
    }
    
    public String findAvailableUnit() {
        if (head == null) {
            return "No units available";
        }
        
        HospitalUnit temp = head;
        do {
            if (temp.isAvailable) {
                return temp.name;
            }
            temp = temp.next;
        } while (temp != head);
        
        return "All units are busy";
    }
    
    public void setUnitStatus(String name, boolean status) {
        if (head == null) {
            System.out.println("No units in system");
            return;
        }
        
        HospitalUnit temp = head;
        do {
            if (temp.name.equals(name)) {
                temp.isAvailable = status;
                System.out.println(name + " is now " + (status ? "available" : "busy"));
                return;
            }
            temp = temp.next;
        } while (temp != head);
        
        System.out.println("Unit not found: " + name);
    }
    
    public void removeUnit(String name) {
        if (head == null) {
            System.out.println("No units to remove");
            return;
        }
        
        if (head.name.equals(name) && head.next == head) {
            head = null;
            System.out.println("Removed unit: " + name);
            return;
        }
        
        HospitalUnit temp = head;
        HospitalUnit prev = null;
        
        do {
            prev = temp;
            temp = temp.next;
        } while (temp != head && !temp.name.equals(name));
        
        if (temp.name.equals(name)) {
            if (temp == head) {
                HospitalUnit last = head;
                while (last.next != head) {
                    last = last.next;
                }
                head = head.next;
                last.next = head;
            } else {
                prev.next = temp.next;
            }
            System.out.println("Removed unit: " + name);
        } else {
            System.out.println("Unit not found: " + name);
        }
    }
    
    public void displayRoute() {
        if (head == null) {
            System.out.println("No units in route");
            return;
        }
        
        System.out.println("\n=== Hospital Route ===");
        HospitalUnit temp = head;
        do {
            String status = temp.isAvailable ? "Available" : "Busy";
            System.out.println(temp.name + " - " + status);
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Route circles back to " + head.name + ")");
    }
}
