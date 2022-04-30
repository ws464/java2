package com.xpanxion.myapp.student0;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public final class ShoppingCart {

    //
    // Data Members
    //

    private float total;
    private final ArrayList<Item> items;

    //
    // Constructors
    //

    ShoppingCart() {
        items = new ArrayList<>();
    }

    //
    // Accessors
    //

    public String getTotal() {
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(total);
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
        this.total = tempTotal;
    }
}
