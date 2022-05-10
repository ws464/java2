package com.xpanxion.myapp.student0;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public final class ShoppingCart {

    //
    // Data Members
    //

    private final double SALES_TAX = 10.0 / 100;
    private final double SHIPPING_CHARGE_THRESHOLD = 10.00; // Orders over this dollar amount ship for free.

    private float total;
    private float shippingCharge;
    private boolean isShippingCharged;
    private final ArrayList<Item> items;

    //
    // Constructors
    //

    ShoppingCart() {
        this.items = new ArrayList<>();
    }

    ShoppingCart(float shippingCharge) {
        this.shippingCharge = shippingCharge;
        this.items = new ArrayList<>();
    }

    //
    // Accessors
    //

    public String getTotal() {
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(total);
    }

    public boolean isShippingCharged() {
        return isShippingCharged;
    }

    public float getShippingCharge() {
        return shippingCharge;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    //
    // Public Methods
    //

    public void addItem(Item i) {
        items.add(i);
    }

    public void calculateTotal() {
        float tempTotal = 0;
        for (Item i: items) {
            tempTotal += i.calculateTotal();
        }
        tempTotal += (tempTotal * SALES_TAX);
        if (tempTotal < SHIPPING_CHARGE_THRESHOLD) {
            tempTotal += shippingCharge;
            isShippingCharged = true;
        }
        this.total = tempTotal;
    }

    public Invoice shipOrder(String name, String address, String city, String state, int zip) {
        return new Invoice(name, address, city, state, zip, this);
    }
}
