package com.traincompanion;

public class TrainNavigation {
    
    private Compartment head;
    private Compartment current; // where passenger is currently
    
    public TrainNavigation() {
        head = null;
        current = null;
    }
    
    // Add compartment at the end
    public void addCompartment(String name, String service) {
        Compartment newComp = new Compartment(name, service);
        
        if (head == null) {
            head = newComp;
            current = head;
            System.out.println("First compartment added: " + name);
        } else {
            Compartment temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newComp;
            newComp.prev = temp;
            System.out.println("Compartment added: " + name);
        }
    }
    
    // Move to next compartment
    public void moveForward() {
        if (current == null) {
            System.out.println("No compartments available!");
            return;
        }
        
        if (current.next != null) {
            current = current.next;
            System.out.println("Moved forward to: " + current.name);
        } else {
            System.out.println("You're at the last compartment!");
        }
    }
    
    // Move to previous compartment
    public void moveBackward() {
        if (current == null) {
            System.out.println("No compartments available!");
            return;
        }
        
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Moved backward to: " + current.name);
        } else {
            System.out.println("You're at the first compartment!");
        }
    }
    
    // Show current position
    public void showCurrentPosition() {
        if (current == null) {
            System.out.println("No compartments available!");
        } else {
            System.out.println("\nCurrent Position:");
            System.out.println(current);
            
            // Show adjacent compartments
            System.out.println("\nAdjacent Compartments:");
            if (current.prev != null) {
                System.out.println("← Previous: " + current.prev.name + " (" + current.prev.service + ")");
            } else {
                System.out.println("← Previous: None (First compartment)");
            }
            
            if (current.next != null) {
                System.out.println("→ Next: " + current.next.name + " (" + current.next.service + ")");
            } else {
                System.out.println("→ Next: None (Last compartment)");
            }
        }
    }
    
    // Search for a service
    public void searchService(String service) {
        if (head == null) {
            System.out.println("Train has no compartments!");
            return;
        }
        
        System.out.println("\nSearching for service: " + service);
        Compartment temp = head;
        boolean found = false;
        
        while (temp != null) {
            if (temp.service.equalsIgnoreCase(service)) {
                System.out.println("Found! " + temp);
                found = true;
            }
            temp = temp.next;
        }
        
        if (!found) {
            System.out.println("Service not found in any compartment.");
        }
    }
    
    // Display all compartments
    public void displayAllCompartments() {
        if (head == null) {
            System.out.println("No compartments in the train!");
            return;
        }
        
        System.out.println("\n=== All Compartments ===");
        Compartment temp = head;
        int count = 1;
        
        while (temp != null) {
            System.out.println(count + ". " + temp);
            temp = temp.next;
            count++;
        }
    }
    
    // Remove a compartment by name
    public void removeCompartment(String name) {
        if (head == null) {
            System.out.println("No compartments to remove!");
            return;
        }
        
        Compartment temp = head;
        
        while (temp != null && !temp.name.equalsIgnoreCase(name)) {
            temp = temp.next;
        }
        
        if (temp == null) {
            System.out.println("Compartment not found!");
            return;
        }
        
        // If it's the head
        if (temp == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            if (current == temp) {
                current = head;
            }
        } else {
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            }
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
            
            if (current == temp) {
                current = temp.prev;
            }
        }
        
        System.out.println("Compartment removed: " + name);
    }
}
