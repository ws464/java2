package com.xpanxion.myapp.student0;

import java.text.NumberFormat;

public class Invoice {

    //
    // Data members
    //

    private final int zip;
    private final String name;
    private final String city;
    private final String state;
    private final String address;
    private final NumberFormat formatter;
    private final ShoppingCart shoppingCart;

    //
    // Constructors
    //

    public Invoice(String name, String address, String city, String state, int zip, ShoppingCart shoppingCart) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.shoppingCart = shoppingCart;
        this.formatter = NumberFormat.getCurrencyInstance();
    }

    //
    // Overrides
    //

    @Override
    public String toString() {
        var address = createShipToAddress();
        var items = createItems();
        var summary = createSummary();
        return address + items + summary;
    }

    //
    // Private methods
    //

    private String createShipToAddress() {
        var retval = "";
        retval = "Ship to:\n";
        retval += "\t" + name + "\n";
        retval += "\t" + address + "\n";
        retval += "\t" + city + ", " + state + " " + zip + "\n\n";
        return retval;
    }

    private String createItems() {
        var retval = "Items\n-----\n";
        for (Item i : shoppingCart.getItems()) {
            retval += (i.getDescription() + "\t" + formatter.format(i.getPrice()) + "\t" + "(" + i.getQuantity() + ")" + "\t" + formatter.format(i.getPrice())) + "\n";
        }
        retval += "\n";
        return retval;
    }

    private String createSummary() {
        var retval = "Shipping: Free\n\n";
        if (shoppingCart.isShippingCharged()) {
            retval = "Shipping: " + formatter.format(shoppingCart.getShippingCharge()) + "\n\n";
        }
        retval += "Total Cost\n----------\n" + shoppingCart.getTotal();
        return retval;
    }
}
