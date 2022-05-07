package com.xpanxion.myapp.student0;

public class Item {

    //
    // Data Members
    //

    private float price;
    private int quantity;
    private String description;

    //
    // Constructors
    //

    Item() {
    }

    Item(float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    //
    // Accessors
    //

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    //
    // Public Methods
    //

    public float calculateTotal() {
        return this.price * this.quantity;
    }

    //
    // Overrides
    //

    //
    // Private Methods
    //
}
