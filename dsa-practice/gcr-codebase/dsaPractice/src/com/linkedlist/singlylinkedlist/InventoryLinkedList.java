package com.linkedlist.singlylinkedlist;

/**
 * Singly linked list for inventory management with sorting capabilities.
 */
public class InventoryLinkedList {
    private Node head;

    private static class Node {
        private final InventoryItem data;
        private Node next;

        private Node(InventoryItem data) {
            this.data = data;
        }
    }

    public void addAtBeginning(InventoryItem item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(InventoryItem item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean insertAtPosition(InventoryItem item, int position) {
        if (position <= 0) return false;
        if (position == 1) {
            addAtBeginning(item);
            return true;
        }
        Node current = head;
        int index = 1;
        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }
        if (current == null) return false;
        Node newNode = new Node(item);
        newNode.next = current.next;
        current.next = newNode;
        return true;
    }

    public boolean removeByItemId(int itemId) {
        if (head == null) return false;
        if (head.data.getItemId() == itemId) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.getItemId() == itemId) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean updateQuantityById(int itemId, int newQuantity) {
        InventoryItem item = searchById(itemId);
        if (item != null) {
            item.setQuantity(newQuantity);
            return true;
        }
        return false;
    }

    public InventoryItem searchById(int itemId) {
        Node current = head;
        while (current != null) {
            if (current.data.getItemId() == itemId) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public InventoryItem searchByName(String itemName) {
        Node current = head;
        while (current != null) {
            if (current.data.getItemName().equalsIgnoreCase(itemName)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public double calculateTotalValue() {
        double total = 0;
        Node current = head;
        while (current != null) {
            total += current.data.getTotalValue();
            current = current.next;
        }
        return total;
    }

    public void sortByName(boolean ascending) {
        if (head == null || head.next == null) return;
        head = mergeSort(head, true, ascending);
    }

    public void sortByPrice(boolean ascending) {
        if (head == null || head.next == null) return;
        head = mergeSort(head, false, ascending);
    }

    // Merge sort implementation
    private Node mergeSort(Node h, boolean byName, boolean ascending) {
        if (h == null || h.next == null) return h;
        
        Node middle = getMiddle(h);
        Node nextOfMiddle = middle.next;
        middle.next = null;
        
        Node left = mergeSort(h, byName, ascending);
        Node right = mergeSort(nextOfMiddle, byName, ascending);
        
        return sortedMerge(left, right, byName, ascending);
    }

    private Node getMiddle(Node h) {
        if (h == null) return h;
        Node slow = h, fast = h.next;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    private Node sortedMerge(Node a, Node b, boolean byName, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;
        
        Node result;
        boolean condition;
        
        if (byName) {
            int comparison = a.data.getItemName().compareToIgnoreCase(b.data.getItemName());
            condition = ascending ? comparison <= 0 : comparison > 0;
        } else {
            condition = ascending ? a.data.getPrice() <= b.data.getPrice() 
                                  : a.data.getPrice() > b.data.getPrice();
        }
        
        if (condition) {
            result = a;
            result.next = sortedMerge(a.next, b, byName, ascending);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, byName, ascending);
        }
        
        return result;
    }

    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Node current = head;
        System.out.println("Current Inventory:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Total Inventory Value: $" + calculateTotalValue());
    }

    public boolean isEmpty() {
        return head == null;
    }
}
