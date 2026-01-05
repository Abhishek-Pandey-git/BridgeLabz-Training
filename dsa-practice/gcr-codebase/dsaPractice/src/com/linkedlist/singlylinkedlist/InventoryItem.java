package com.linkedlist.singlylinkedlist;

/**
 * Represents an inventory item with name, ID, quantity, and price.
 */
public class InventoryItem {
    private final String itemName;
    private final int itemId;
    private int quantity;
    private final double price;

    public InventoryItem(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "ID: " + itemId + ", Name: " + itemName 
                + ", Qty: " + quantity + ", Price: $" + price 
                + ", Total: $" + getTotalValue();
    }
}
